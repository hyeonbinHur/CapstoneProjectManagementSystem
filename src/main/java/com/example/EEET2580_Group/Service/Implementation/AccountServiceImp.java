package com.example.EEET2580_Group.Service.Implementation;

import com.example.EEET2580_Group.DTO.AccountDto;
import com.example.EEET2580_Group.DTO.GroupDto;
import com.example.EEET2580_Group.Entity.*;
import com.example.EEET2580_Group.Repository.*;
import com.example.EEET2580_Group.Service.Interface.AccountService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AccountServiceImp implements AccountService {
    @Autowired
    private CompanyAccRepository companyAccRepository;
    @Autowired
    private SupervisorAccRepository supervisorAccRepository;
    @Autowired
    private StudentAccRepository studentAccRepository;
    @Autowired
    private AdminAccRepository adminAccRepository;
    @Autowired
    private GroupRepository groupRepository;

    @Override
    public void saveAccount(Account account) {
        if (account instanceof CompanyAcc) {
            companyAccRepository.save((CompanyAcc) account);
        } else if (account instanceof SupervisorAcc) {
            supervisorAccRepository.save((SupervisorAcc) account);
        } else if (account instanceof StudentAcc) {
            studentAccRepository.save((StudentAcc) account);
        }else if (account instanceof AdminAcc) {
            adminAccRepository.save((AdminAcc) account);
        }
    }
    @Override
    public Account getAccountById(Long id, String type) {
        if (type.equals("company")) {
            return companyAccRepository.findById(id).get();
        } else if (type.equals("supervisor")) {
            return supervisorAccRepository.findById(id).get();
        } else if (type.equals("student")) {
            return studentAccRepository.findById(id).get();
        }   else if (type.equals("admin")) {
            return adminAccRepository.findById(id).get();
        }
        return null;
    }
    @Override
    public List<Account> getAllAccounts() {
        System.out.println("getAllAccounts");
        List<Account> accounts = new ArrayList<>();
        accounts.addAll(companyAccRepository.findAll());
        accounts.addAll(supervisorAccRepository.findAll());
        accounts.addAll(studentAccRepository.findAll());
        accounts.addAll(adminAccRepository.findAll());
        return accounts;
    }
    @Override
    public List<StudentAcc> getAllStudentAccounts() {
        System.out.println("getAllStudentAccounts");
        List<StudentAcc> accounts = new ArrayList<>();
        accounts.addAll(studentAccRepository.findAll());
        return accounts;
    }

    @Override
    public List<GroupEntity> getAllGroups() {
        System.out.println("getAllStudentAccounts");
        List<GroupEntity> accounts = new ArrayList<>();
        accounts.addAll(groupRepository.findAll());
        return accounts;
    }
    @Override
    public List<SupervisorAcc> getAllSupervisorAccounts() {
        System.out.println("getAllSupervisorAccounts");
        List<SupervisorAcc> accounts = new ArrayList<>();
        accounts.addAll(supervisorAccRepository.findAll());
        return accounts;
    }
    @Override
    public List<CompanyAcc> getAllCompanyAccounts() {
        System.out.println("getAllCompanyAccounts");
        List<CompanyAcc> accounts = new ArrayList<>();
        accounts.addAll(companyAccRepository.findAll());
        return accounts;
    }
    @Override
    public Account getAccountByUsername(String username, String type) {
        if (type.equals("company")) {
            return companyAccRepository.findByUsername(username);
        } else if (type.equals("supervisor")) {
            return supervisorAccRepository.findByUsername(username);
        } else if (type.equals("student")) {
            return studentAccRepository.findByUsername(username);
        }
        return null;
    }

    @Override
    public boolean isValidUsername(String username){
        if (studentAccRepository.findByUsername(username)!=null
        || companyAccRepository.findByUsername(username)!=null
        || supervisorAccRepository.findByUsername(username)!=null)
            return false;
        return true;
    }


}
