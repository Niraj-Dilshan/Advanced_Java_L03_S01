import entity.Department;
import entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try{
            et.begin();
            Student stu = new Student();
            stu.setStuId("TG004");
            stu.setStudnetname("Madura");
            stu.setStuDept("TEC002");
            em.persist(stu);
            et.commit();
        }finally{
            if(et.isActive()){
                et.rollback();
            }
            em.close();
            emf.close();
        }
    }
}
