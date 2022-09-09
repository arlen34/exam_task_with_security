package com.example.exam_task_with_security.repositoryImpl.repository;

import com.example.exam_task_with_security.model.Company;

import java.util.List;

public interface CompanyRepository {


    void saveCompany(Company company);

    List<Company> getAllCompanies();

    Company getCompanyById(int id);

    void updateCompany(int id, Company company);

    void deleteCompanyById(int id);



}
