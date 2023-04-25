package entity;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @Column(name = "stuId")
    private String stuId;
    @Basic
    @Column(name = "studnetname")
    private String studnetname;
    @Basic
    @Column(name = "stuDept")
    private String stuDept;
    @ManyToOne
    @JoinColumn(name = "stuDept", referencedColumnName = "depId", nullable = false)
    private Department departmentByStuDept;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStudnetname() {
        return studnetname;
    }

    public void setStudnetname(String studnetname) {
        this.studnetname = studnetname;
    }

    public String getStuDept() {
        return stuDept;
    }

    public void setStuDept(String stuDept) {
        this.stuDept = stuDept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (stuId != null ? !stuId.equals(student.stuId) : student.stuId != null) return false;
        if (studnetname != null ? !studnetname.equals(student.studnetname) : student.studnetname != null) return false;
        if (stuDept != null ? !stuDept.equals(student.stuDept) : student.stuDept != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", studnetname='" + studnetname + '\'' +
                ", stuDept='" + stuDept + '\'' +
                ", departmentByStuDept=" + departmentByStuDept +
                '}';
    }

    @Override
    public int hashCode() {
        int result = stuId != null ? stuId.hashCode() : 0;
        result = 31 * result + (studnetname != null ? studnetname.hashCode() : 0);
        result = 31 * result + (stuDept != null ? stuDept.hashCode() : 0);
        return result;
    }

    public Department getDepartmentByStuDept() {
        return departmentByStuDept;
    }

    public void setDepartmentByStuDept(Department departmentByStuDept) {
        this.departmentByStuDept = departmentByStuDept;
    }
}
