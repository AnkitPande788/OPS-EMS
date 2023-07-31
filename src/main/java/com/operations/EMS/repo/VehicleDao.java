package com.operations.EMS.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.operations.EMS.entities.Vehicle;

@Repository
public interface VehicleDao extends JpaRepository<Vehicle, Long> {

	Optional<Vehicle> findByVehicleId(Long id);

}
