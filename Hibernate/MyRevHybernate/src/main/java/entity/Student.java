package entity;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @Column(name = "stuId")
    private String stuId;
    @Basic
    @Column(name = "studentname")
    private String studentname;
    @Basic
    @Column(name = "stuDept")
    private String stuDept;
    @ManyToOne
    @JoinColumn(name = "stuDept", referencedColumnName = "depId", nullable = false, insertable = false, updatable = false)
    private Department departmentByStuDept;
    public Student() {
    }
    public Student(String stuId, String studentname, String stuDept) {
        this.stuId = stuId;
        this.studentname = studentname;
        this.stuDept = stuDept;
    }



    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studnetname) {
        this.studentname = studnetname;
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
        if (studentname != null ? !studentname.equals(student.studentname) : student.studentname != null) return false;
        if (stuDept != null ? !stuDept.equals(student.stuDept) : student.stuDept != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stuId != null ? stuId.hashCode() : 0;
        result = 31 * result + (studentname != null ? studentname.hashCode() : 0);
        result = 31 * result + (stuDept != null ? stuDept.hashCode() : 0);
        return result;
    }

    public Department getDepartmentByStuDept() {
        return departmentByStuDept;
    }

    public void setDepartmentByStuDept(Department departmentByStuDept) {
        this.departmentByStuDept = departmentByStuDept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", studnetname='" + studentname + '\'' +
                ", stuDept='" + stuDept + '\'' +
                '}';
    }
}
