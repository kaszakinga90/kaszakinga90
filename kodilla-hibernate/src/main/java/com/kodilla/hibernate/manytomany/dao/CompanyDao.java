package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query
    List<Company> searchCompanyByName(@Param("SEARCHKEY") String searchKey);

    @Query(nativeQuery = true)
    List<Company> retrieveCompaniesWhichNamesBeginWith(@Param("BEGINWITH") String beginWith);

    @Query
    List<Company> companyByArg(@Param("COMPANY_NAME") String arg);

}