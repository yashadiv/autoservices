package com.project.AutoSpareService.repositories;

import com.project.AutoSpareService.Models.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Integer> {

}
