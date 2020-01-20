import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private int marks;
    

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return getName()+" "+getMarks();
    }
    
    public static ArrayList<Student> getAllStudents(){
    
        Map<String,Integer> smap = new HashMap<>();
        smap.put("Student1", 60);
        smap.put("Student2", 68);
        smap.put("Student3", 98);
        smap.put("Student4", 47);
        smap.put("Student5", 78);
        
        ArrayList<Student> slist = new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : smap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            slist.add(new Student(key, value));
        }
        
        return slist;
    }
}
