package com.fcwc.fcwc.repository;

import com.fcwc.fcwc.model.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StadiumRepository extends JpaRepository<Stadium, Long> {
    // findAll() method is automatically provided by JpaRepository
}
