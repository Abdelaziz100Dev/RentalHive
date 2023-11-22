package com.root.rentalheive.repositories;

import com.root.rentalheive.entities.Demand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DemandeRepository extends JpaRepository<Demand, Long> {
    public Demand getDemandById(Long id);
}
