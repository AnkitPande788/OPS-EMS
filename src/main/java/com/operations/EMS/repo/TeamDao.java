package com.operations.EMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.operations.EMS.entities.Team;

@Repository
public interface TeamDao extends JpaRepository<Team, Long> {

}
