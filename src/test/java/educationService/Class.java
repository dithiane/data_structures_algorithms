package educationService;

import java.util.Collection;

public class Class {
    private Integer id;
    private final String className;
    private boolean inactive;
    private String semester;

    public Class(String className, String semester) {
        this.className = className;
        this.inactive = false;
        this.semester = semester;
    }

    public String getClassName() {
        return className;
    }

    public boolean isInactive() {
        return inactive;
    }

    public void setInactive() {
        this.inactive = true;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Object getClassId() {
        return id;
    }

    public Collection<? extends Student> getStudents() {
        return null;
    }
}