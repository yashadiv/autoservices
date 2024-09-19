package com.project.AutoSpareService.services;


import com.project.AutoSpareService.Models.Auto;
import com.project.AutoSpareService.repositories.AutoRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class AutoServices {
    private final AutoRepository autoRepository;

    public AutoServices(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    public List<Auto> findAll(){
        return autoRepository.findAll();
    }

    public Auto findOne(int id){
        Optional<Auto> foundAuto = autoRepository.findById(id);
        return foundAuto.orElse(null);
    }

    @Transactional
    public void save(Auto auto){
        autoRepository.save(auto);
    }

    @Transactional
    public void update(int id, Auto upAuto){
        upAuto.setId(id);
        autoRepository.save(upAuto);

    }

    @Transactional
    public void delete(int id){
        autoRepository.deleteById(id);
    }
}
