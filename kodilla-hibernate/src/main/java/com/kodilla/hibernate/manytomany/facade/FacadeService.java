package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FacadeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeProcessingException.class);
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> searchingCompanyByArg(String arg) throws FacadeProcessingException {
        LOGGER.info("Search for company: ");
        List<Company> companies = companyDao.companyByArg(arg);
        if (companies.size() < 1) {
            LOGGER.error(FacadeProcessingException.ERR_COMPANY_NOT_FOUND);
            throw new FacadeProcessingException(FacadeProcessingException.ERR_COMPANY_NOT_FOUND);
        }
        return companies;
    }

    public List<Employee> searchingEmployeeByChar(String arg) throws FacadeProcessingException {
        LOGGER.info("Search for employee: ");
        List<Employee> employees = employeeDao.employeeByArg(arg);
        if (employees.size() < 1) {
            LOGGER.error(FacadeProcessingException.ERR_EMPLOYEE_NOT_FOUND);
            throw new FacadeProcessingException(FacadeProcessingException.ERR_EMPLOYEE_NOT_FOUND);
        }
        return employees;
    }
}