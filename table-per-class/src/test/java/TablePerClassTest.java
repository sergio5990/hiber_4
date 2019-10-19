import by.it.entity.Employee;
import by.it.entity.Person;
import by.it.entity.Student;
import by.it.util.EMUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;

public class TablePerClassTest {
    @Test
    public void saveTest() {
        Person person = new Person(null, 25, "Yuli", "Slabko");
        Employee employee = new Employee(null, 25, "Tom", "Soyer", "RedAndBlack", 1200.0);
        Student student = new Student(null, 25, "Tom", "Soyer", "Chemistry", 8.0);

        EntityManager em = EMUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(person);
        em.persist(employee);
        em.persist(student);
        em.getTransaction().commit();

    }

    @AfterClass
    public static void cleanUp() {
        EMUtil.closeEMFactory();
    }
}
