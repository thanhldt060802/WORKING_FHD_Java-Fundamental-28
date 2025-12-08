import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import entity.Course;
import entity.Enrollment;
import entity.Student;
import mockdata.MockData;

public class Main {

    private static final String[] TASKS = new String[] {
        "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11", "A12",
        "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10", "B11", "B12",
        "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "C11", "C12",
    };

    private static final String CHOOSEN_TASK = "A1";

    public static void main(String[] args) {

        MockData mockData = new MockData(2025L);
        List<Student> students = mockData.students();
        List<Course> courses = mockData.courses();
        List<Enrollment> enrollments = mockData.enrollments(students, courses);
        Task task = new Task(students, courses, enrollments);
        task.showData();

        System.out.println("Choosen task: " + CHOOSEN_TASK);
        if (Arrays.asList(TASKS).contains(CHOOSEN_TASK)) {
            try {
                Method method = task.getClass().getMethod(CHOOSEN_TASK);
                Object result = method.invoke(task);
                print(result);
            } catch (Exception e) {
                throw new RuntimeException("Cannot invoke: " + CHOOSEN_TASK, e);
            }
        } else {
            System.out.println("Invalid CHOOSEN_TASK");
        }

    }

    public static void print(Object data) {
        if (data instanceof Collection<?> dataCollection) {
            for (Object element : dataCollection) {
                System.out.println(element);
            }
        } else if (data instanceof Map<?, ?> dataMap) {
            for (Entry<?, ?> entry : dataMap.entrySet()) {
                if (entry.getValue() instanceof Collection<?> dataCollection) {
                    System.out.println(entry.getKey() + ":");
                    print(dataCollection);
                } else {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
        } else {
            System.out.println(data);
        }
    }

}
