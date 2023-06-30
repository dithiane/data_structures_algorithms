package educationService;

public class Student {
    private String name;
    private String studentId;

    private String classname;

    public Student(String name, String classname) {
        this.name = name;
        this.classname = classname;
    }

    // Getters and setters for the instance variables

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setAge(String classname) {
        this.classname = classname;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Additional methods specific to a Student can be added here
}
