import entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class AppInitializer {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    private static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {
//        createStudent("TG007","Gayan","TEC002");
//        readStudent();
        searchStudent("TG007");
//        updateStudent("TG001","Jayan","TEC001");
//        deleteStudent("TG002");
        resetConnection();
    }

    // Create method
    // Insert a Student
    public static void createStudent(String studentId, String name, String courseId) {
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            Student student = new Student(studentId, name, courseId);
            em.persist(student);
            et.commit();
        } finally {
            if (et.isActive()) {
                et.rollback();
            }
        }
    }

    // Read method
    // Show All Students
    public static void readStudent() {
        List<Student> students = em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Update method
    // Search Student By ID
    public static void searchStudent(String studentId) {
        Student student = null;
        try {
            student = em.find(Student.class, studentId);
            if (student != null) {
                System.out.println("Student ID: " + student.getStuId());
                System.out.println("Name: " + student.getStudentname());
                System.out.println("Course ID: " + student.getStuDept());
            } else {
                System.out.println("Student not found.");
            }
        } finally {
            em.close();
            emf.close();
        }
    }

    // Update method
    // Update Student By ID
    public static void updateStudent(String studentId, String name, String courseId) {
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            Student student = em.find(Student.class, studentId);
            student.setStudentname(name);
            student.setStuDept(courseId);
            em.merge(student);
            et.commit();
        } finally {
            if (et.isActive()) {
                et.rollback();
            }
        }
    }

    // Delete method
    // Delete Student By ID
    public static void deleteStudent(String studentId) {
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            Student student = em.find(Student.class, studentId);
            em.remove(student);
            et.commit();
        } finally {
            if (et.isActive()) {
                et.rollback();
            }
        }
    }

    public static void resetConnection(){
        em.close();
        emf.close();
    }
}
