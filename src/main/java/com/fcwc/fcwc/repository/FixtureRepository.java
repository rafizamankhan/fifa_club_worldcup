package com.fcwc.fcwc.repository;

import com.fcwc.fcwc.model.Fixture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface FixtureRepository extends JpaRepository<Fixture, Long> {

    @Query("SELECT f FROM Fixture f WHERE DATE(f.matchDatetime) = :date")
    List<Fixture> findByMatchDate(@Param("date") LocalDate date);

}
