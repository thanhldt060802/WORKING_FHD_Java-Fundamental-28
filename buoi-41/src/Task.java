import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import entity.Course;
import entity.Enrollment;
import entity.Student;
import entity.DTO.DTO1;
import entity.DTO.DTO2;
import entity.DTO.Pair;
import enumeration.Gender;
import mockdata.MockData;

public class Task implements ITask {

    private List<Student> students;
    private List<Course> courses;
    private List<Enrollment> enrollments;

    public Task() {
        MockData mockData = new MockData(2025L);
        List<Student> students = mockData.students();
        List<Course> courses = mockData.courses();
        List<Enrollment> enrollments = mockData.enrollments(students, courses);

        this.students = students;
        this.courses = courses;
        this.enrollments = enrollments;
    }

    public void showDataset() {
        System.out.println("Mock data - Student:");
        this.students.forEach(
            (student) -> System.out.println(student));
        System.out.println();
        System.out.println("Mock data - Course:");
        this.courses.forEach(
            (course) -> System.out.println(course));
        System.out.println();
        System.out.println("Mock data - Enrollment:");
        this.enrollments.forEach(
            (enrollment) -> System.out.println(enrollment));
        System.out.println();
    }

    public static void print(Object data) {
        if (data instanceof Collection<?> dataCollection) {
            for (Object element : dataCollection) {
                print(element);
            }
        } else if (data instanceof Map<?, ?> dataMap) {
            for (Entry<?, ?> entry : dataMap.entrySet()) {
                if (entry.getValue() instanceof Collection<?> dataCollection) {
                    System.out.println(entry.getKey() + ":");
                    print(dataCollection);
                } else if (entry.getValue() instanceof Map<?, ?> nestedDataMap) {
                    System.out.println(entry.getKey() + ":");
                    print(nestedDataMap);
                } else {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
        } else {
            System.out.println(data);
        }
    }

    @Override
    public List<Student> A1() throws Exception {
        List<Student> result = this.students.stream()
            .filter((student) -> student.getGender() == Gender.FEMALE)
            .collect(Collectors.toList());

        return result;
    }

    @Override
    public List<Student> A2() throws Exception {
        List<Student> result = this.students.stream()
            .filter((student) -> student.getAge() > 22)
            .collect(Collectors.toList());

        return result;
    }

    @Override
    public List<Student> A3() throws Exception {
        List<Student> result = this.students.stream()
            .sorted((s1, s2) -> s1.getAge() - s2.getAge())
            .collect(Collectors.toList());

        return result;
    }

    @Override
    public List<Student> A4() throws Exception {
        List<Student> result = this.students.stream()
            .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
            .collect(Collectors.toList());

        return result;
    }

    @Override
    public List<String> A5() throws Exception {
        List<String> result = this.students.stream()
            .map((student) -> student.getName())
            .collect(Collectors.toList());
        
        return result;
    }

    @Override
    public List<String> A6() throws Exception {
        List<String> result = this.students.stream()
            .map((student) -> student.getClassName())
            .distinct()
            .collect(Collectors.toList());
        
        return result;
    }

    @Override
    public Map<String, List<Student>> A7() throws Exception {
        Map<String, List<Student>> result = this.students.stream()
            .collect(Collectors.groupingBy((student) -> student.getClassName()));
        
        return result;
    }

    @Override
    public Map<Gender, List<Student>> A8() throws Exception {
        Map<Gender, List<Student>> result = this.students.stream()
            .collect(Collectors.groupingBy((student) -> student.getGender()));
        
        return result;
    }

    @Override
    public long A9() throws Exception {
        long result = this.students.stream()
            .filter((student) -> student.getGender() == Gender.FEMALE)
            .count();
        
        return result;
    }

    @Override
    public double A10() throws Exception {
        Long courseId = this.courses.stream()
            .filter((course) -> course.getName().equals("Math"))
            .map((course) -> course.getId())
            .findFirst()
            .orElse(null);
        
        double result = this.enrollments.stream()
            .filter((enrollment) -> enrollment.getCourseId().equals(courseId))
            .mapToDouble((enrollment) -> enrollment.getScore())
            .average()
            .getAsDouble();

        return result;
    }

    @Override
    public List<Student> A11() throws Exception {
        List<Student> result = this.students.stream()
            .filter((student) -> student.getGender() == Gender.FEMALE)
            .sorted((s1, s2) -> s1.getAge() - s2.getAge())
            .collect(Collectors.toList());

        return result;
    }

    @Override
    public List<Long> A12() throws Exception {
        List<Long> result = this.students.stream()
            .filter((student) -> student.getGender() == Gender.MALE)
            .filter((student) -> student.getAge() < 23)
            .map((student) -> student.getId())
            .collect(Collectors.toList());
    
        return result;
    }

    @Override
    public List<Student> B1() throws Exception {
        // Map<Long, Double> gpaMap = this.enrollments.stream()
        //     .collect(Collectors.groupingBy((enrollment) -> enrollment.getStudentId()))
        //     .entrySet().stream()
        //     .collect(Collectors.toMap(
        //         (entry) -> entry.getKey(),
        //         (entry) -> entry.getValue().stream()
        //             .mapToDouble((enrollment) -> enrollment.getScore())
        //             .average()
        //             .getAsDouble()
        //     ));
        
        Map<Long, Double> gpaMap = this.enrollments.stream()
            .collect(Collectors.groupingBy(
                (enrollment) -> enrollment.getStudentId(),
                Collectors.averagingDouble((enrollment) -> enrollment.getScore())
            ));
        
        List<Student> result = this.students.stream()
            .filter((student) -> gpaMap.get(student.getId()) >= 8.0)
            .collect(Collectors.toList());

        return result;
    }

    @Override
    public List<Student> B2() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> B3() throws Exception {
        Map<Long, Double> gpaMap = this.enrollments.stream()
            .collect(Collectors.groupingBy(
                (enrollment) -> enrollment.getStudentId(),
                Collectors.averagingDouble((enrollment) -> enrollment.getScore())
            ));
        
        List<Student> result = this.students.stream()
            .sorted((s1, s2) -> -Double.compare(gpaMap.get(s1.getId()), gpaMap.get(s2.getId())))
            .collect(Collectors.toList());
        
        return result;
    }

    @Override
    public List<Student> B4() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<DTO1> B5() throws Exception {
        Map<Long, Double> gpaMap = this.enrollments.stream()
            .collect(Collectors.groupingBy(
                (enrollment) -> enrollment.getStudentId(),
                Collectors.averagingDouble((enrollment) -> enrollment.getScore())
            ));

        List<DTO1> result = this.students.stream()
            .map((student) -> new DTO1(student.getId(), student.getName(), gpaMap.get(student.getId())))
            .collect(Collectors.toList());

        return result;
    }

    @Override
    public List<DTO2> B6() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Course, List<Enrollment>> B7() throws Exception {
        Map<Long, Course> courseMap = this.courses.stream()
            .collect(Collectors.toMap((course) -> course.getId(), (course) -> course));
        
        Map<Course, List<Enrollment>> result = this.enrollments.stream()
            .collect(Collectors.groupingBy((enrollment) -> courseMap.get(enrollment.getCourseId())));

        return result;
    }

    @Override
    public Map<String, List<Student>> B8() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Student, Double> B9() throws Exception {
        Map<Long, Double> gpaMap = this.enrollments.stream()
            .collect(Collectors.groupingBy(
                (enrollment) -> enrollment.getStudentId(),
                Collectors.averagingDouble((enrollment) -> enrollment.getScore())
            ));

        Map<Student, Double> result = this.students.stream()
            .collect(Collectors.toMap((student) -> student, (student) -> gpaMap.get(student.getId())));
        
        return result;
    }

    @Override
    public Map<Course, Pair<Double>> B10() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<DTO2> B11() throws Exception {
        Map<Long, Student> studentMap = this.students.stream()
            .collect(Collectors.toMap((student) -> student.getId(), (student) -> student));

        Map<Long, Course> courseMap = this.courses.stream()
            .collect(Collectors.toMap((course) -> course.getId(), (course) -> course));
        
        // List<DTO2> result = this.enrollments.stream()
        //     .map((enrollment) -> new DTO2(
        //         enrollment.getStudentId(),
        //         studentMap.get(enrollment.getStudentId()).getName(),
        //         courseMap.get(enrollment.getCourseId()).getName(),
        //         enrollment.getScore()
        //     ))
        //     .sorted((dtoEn1, dtoEn2) -> {
        //         int courseNameComparedResult = dtoEn1.getCourseName().compareTo(dtoEn2.getCourseName());
        //         if (courseNameComparedResult != 0) {
        //             return courseNameComparedResult;
        //         } else {
        //             return -Double.compare(dtoEn1.getCourseScore(), dtoEn2.getCourseScore());
        //         }
        //     })
        //     .collect(Collectors.toList());
        
        List<DTO2> result = this.enrollments.stream()
            .map((enrollment) -> new DTO2(
                enrollment.getStudentId(),
                studentMap.get(enrollment.getStudentId()).getName(),
                courseMap.get(enrollment.getCourseId()).getName(),
                enrollment.getScore()
            ))
            .sorted(Comparator.comparing((DTO2 dtoEn) -> dtoEn.getCourseName()).thenComparing((dtoEn) -> -dtoEn.getCourseScore()))
            .collect(Collectors.toList());
        
        return result;
    }

    @Override
    public Map<Course, List<Student>> B12() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Student, Double> C1() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> C2() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Student, Double> C3() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Student> C4() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Student, List<Course>> C5() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<DTO2> C6() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<String, Map<Gender, List<Student>>> C7() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<Course, Map<String, List<Student>>> C8() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<String, Double> C9() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public List<Course> C10() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<String, List<DTO1>> C11() throws Exception {
        throw new Exception("You must handle this task");
    }

    @Override
    public Map<String, List<DTO1>> C12() throws Exception {
        throw new Exception("You must handle this task");
    }

}