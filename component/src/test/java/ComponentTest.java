import javax.persistence.EntityManager;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import by.it.entity.Employee;
import by.it.entity.FullName;
import by.it.util.EMUtil;

public class ComponentTest {
    @Test
    public void saveTest() {
        Employee employee = new Employee(null, new FullName("Yulij", "Slabko"), new FullName("Yulij", "Slabko"), "Exadel", 15200.0);

        EntityManager em = EMUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        em.clear();
        Employee employeeFromDb = em.find(Employee.class, 1L);
        Assert.assertEquals(employee.getFullName(), employeeFromDb.getFullName());
    }

    @AfterClass
    public static void cleanUp() {
        EMUtil.closeEMFactory();
    }
}
