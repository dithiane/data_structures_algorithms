package educationService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassDataObject {
    private final List<Class> classes;

    public ClassDataObject() {
        this.classes = new ArrayList<>();
    }

    public void addClass(Class classObj) {
        classes.add(classObj);
    }

    public void markInactive(Class classObj) {
        classObj.setInactive();
    }

    public List<Class> getAllClasses() {
        return classes;
    }
    public List<String> getAllStudentsBySubject(String subject) {
        return Arrays.asList("studentJJ", "studentJH");
    }

    public List<Student> getStudentsInClass(String classId) {
        List<Student> studentsInClass = new ArrayList<>();

        for (Class classObj : classes) {
            if (classObj.getClassId().equals(classId)) {
                studentsInClass.addAll(classObj.getStudents());
            }
        }

        return studentsInClass;
    }

}