package com.operations.EMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.operations.EMS.entities.Route;

@Repository
public interface RouteDao extends JpaRepository<Route, Long>{

}
