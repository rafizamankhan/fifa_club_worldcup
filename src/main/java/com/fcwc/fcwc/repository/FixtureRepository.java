package com.fcwc.fcwc.repository;

import com.fcwc.fcwc.model.Fixture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FixtureRepository extends JpaRepository<Fixture, Long> {

    List<Fixture> findByMatchId(Long matchId);

}
