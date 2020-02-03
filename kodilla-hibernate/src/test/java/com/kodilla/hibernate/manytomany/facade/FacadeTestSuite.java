package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    FacadeService facadeService;

    @Before
    public void before() {
        Employee employee1 = new Employee("Steven", "Seagal");
        Employee employee2 = new Employee("Mila", "Kunis");
        Employee employee3 = new Employee("Jared", "Padalecki");
        Employee employee4 = new Employee("Glenn", "Close");

        Company company1 = new Company("Bioware");
        Company company2 = new Company("Santa Monica Studio");
        Company company3 = new Company("Ubisoft");
        Company company4 = new Company("CD Project");

        company1.getEmployees().add(employee1);
        company1.getEmployees().add(employee2);
        company2.getEmployees().add(employee3);
        company3.getEmployees().add(employee1);
        company3.getEmployees().add(employee2);
        company4.getEmployees().add(employee4);

        employee1.getCompanies().add(company1);
        employee1.getCompanies().add(company3);
        employee2.getCompanies().add(company1);
        employee2.getCompanies().add(company3);
        employee3.getCompanies().add(company2);
        employee4.getCompanies().add(company4);

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        companyDao.save(company4);
    }

    @Test
    public void testSearchingCompanyByArg() {
        //When
        List<Company> companyList = companyDao.companyByArg("Bio");
        //Then
        Assert.assertEquals(1, companyList.size());
        Assert.assertEquals("Bioware", companyList.get(0).getName());
    }

    @Test
    public void testSearchingEmployeeByArg() {
        //When
        List<Employee> employeeList = employeeDao.employeeByArg("Pad");
        //Then
        Assert.assertEquals(1, employeeList.size());
        Assert.assertEquals("Padalecki", employeeList.get(0).getLastName());
    }

    @After
    public void cleanUp() {
        employeeDao.deleteAll();
        companyDao.deleteAll();
    }
}
