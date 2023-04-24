package com.vehicle.S.T_Ass_Project_vehicle.Repository;

import com.vehicle.S.T_Ass_Project_vehicle.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vehicleRepo extends JpaRepository<VehicleModel, String> {
}
