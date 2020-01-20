import java.util.List;
import java.util.stream.Collectors;

public class TestRun {
    public static void main(String[] args) {
        
        List<Student> allStudents = Student.getAllStudents();
        
        List<Student> filtered= allStudents.stream()
                .filter(s->s.getMarks()>=60)
                .collect(Collectors.toList());
        
        System.out.println("All Students : "+allStudents);
        System.out.println("Above 60 : "+filtered);
    }
}
