package com.example.EEET2580_Group.Service.Implementation;

import com.example.EEET2580_Group.DTO.SupervisorAccDto;
import com.example.EEET2580_Group.Entity.SupervisorAcc;
import com.example.EEET2580_Group.Repository.SupervisorAccRepository;
import com.example.EEET2580_Group.Service.Interface.SupervisorAccService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SupervisorAccServiceImp implements SupervisorAccService {
    @Autowired
    SupervisorAccRepository supervisorAccRepository;

    public void updateSupervisor(SupervisorAcc oldSupervisor, SupervisorAccDto newSupervisor){
        System.out.println("Inside update supervisor");
        oldSupervisor.setName(newSupervisor.getName());
        oldSupervisor.setContact(newSupervisor.getContact());
        oldSupervisor.setEmail(newSupervisor.getEmail());
        oldSupervisor.setBio(newSupervisor.getBio());
        oldSupervisor.setPassword(newSupervisor.getPassword());
        oldSupervisor.setImageId(newSupervisor.getImageId());
    }
    @Override
    public List<SupervisorAcc> getAllSupervisor() {
        return supervisorAccRepository.getAllSupervisor();
    }

    @Override
    public void updateSupervisorById(Long id, SupervisorAccDto supervisorAccDto) {
        SupervisorAcc supervisorAccToUpdate = supervisorAccRepository.findById(id).get();
        this.updateSupervisor(supervisorAccToUpdate, supervisorAccDto);
        supervisorAccRepository.save(supervisorAccToUpdate);
        System.out.println("Supervisor updated");
    }
    @Override
    public Page<SupervisorAcc> getAllSupervisor (String supervisorName, Pageable page){
        return supervisorName.isEmpty()?supervisorAccRepository.findAll(page):
                supervisorAccRepository.findByName(supervisorName,page);
    }
}
