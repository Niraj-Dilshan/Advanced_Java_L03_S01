package entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Department {
    @Id
    @Column(name = "depId")
    private String depId;
    @Basic
    @Column(name = "depName")
    private String depName;
    @OneToMany(mappedBy = "departmentByStuDept")
    private Collection<Student> studentsByDepId;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depId='" + depId + '\'' +
                ", depName='" + depName + '\'' +
                ", studentsByDepId=" + studentsByDepId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (depId != null ? !depId.equals(that.depId) : that.depId != null) return false;
        if (depName != null ? !depName.equals(that.depName) : that.depName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = depId != null ? depId.hashCode() : 0;
        result = 31 * result + (depName != null ? depName.hashCode() : 0);
        return result;
    }

    public Collection<Student> getStudentsByDepId() {
        return studentsByDepId;
    }

    public void setStudentsByDepId(Collection<Student> studentsByDepId) {
        this.studentsByDepId = studentsByDepId;
    }
}
