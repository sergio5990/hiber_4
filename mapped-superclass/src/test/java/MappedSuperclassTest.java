import javax.persistence.EntityManager;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import by.it.entity.Department;
import by.it.entity.Employee;
import by.it.util.EMUtil;

public class MappedSuperclassTest {
    @Test
    public void saveTest() throws InterruptedException {
        Employee employee = new Employee("Yulij", "Exadel", 15200.0);
        Department department = new Department();
        department.setDepartmentName("Crazy Staff");
        department.getEmployees().add(employee);

        EntityManager em = EMUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(department);
        em.persist(employee);
        em.getTransaction().commit();
    }

    @AfterClass
    public static void cleanUp() {
        EMUtil.closeEMFactory();
    }
}
