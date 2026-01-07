import java.util.Comparator;

public class CompareAgeThenGpa implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        int compareAge = s1.getAge() - s2.getAge();
        if (compareAge != 0) {
            return compareAge;
        }else {
            return Double.compare(s1.getGpa(), s2.getGpa());
        }
    }

    public int compare(Student s1, Student s2, Student s3) {
        return 0;
    }
    
}
