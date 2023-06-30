package educationService;

import java.util.List;

public interface InstructorDataObject {
    public void instructorDataObject(String name, int age, String instructorId);

    public default List<Class> getClassesByInstructor(String instructorId) {
        return null;
    }

}