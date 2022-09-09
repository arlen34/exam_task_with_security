package com.example.exam_task_with_security.serviceImple;

import com.example.exam_task_with_security.model.Company;
import com.example.exam_task_with_security.repositoryImpl.repository.CompanyRepository;
import com.example.exam_task_with_security.serviceImple.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository repository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository repository) {
        this.repository = repository;
    }


    @Override
    public void saveCompany(Company company) {
        repository.saveCompany(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return repository.getAllCompanies();
    }

    @Override
    public Company getCompanyById(int id) {
        return repository.getCompanyById(id);
    }

    @Override
    public void updateCompany(int id,Company company) {
        repository.updateCompany(id,company);
    }


    @Override
    public void deleteCompanyById(int id) {
        repository.deleteCompanyById(id);
    }
}
