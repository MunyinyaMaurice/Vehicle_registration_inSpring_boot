/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehicle.S.T_Ass_Project_vehicle.service.impl;




import com.vehicle.S.T_Ass_Project_vehicle.Repository.vehicleRepo;
import com.vehicle.S.T_Ass_Project_vehicle.model.VehicleModel;
import com.vehicle.S.T_Ass_Project_vehicle.service.vehicleInterFace;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author M U N Y I N Y A
 */
@Service
public class vehicleServiceImpl implements vehicleInterFace {
private final vehicleRepo repo;

    public vehicleServiceImpl(vehicleRepo repo) {
        this.repo = repo;
    }

    @Override
    public VehicleModel saveVehicle(VehicleModel vehicle) {
        return repo.save(vehicle);
    }

    @Override
    public List<VehicleModel> retrieveVehicle() {
        return repo.findAll();
    }


    @Override
    public void deleteVehicle(String plateNo) {
        repo.deleteById(plateNo);
    }

    @Override
    public Optional<VehicleModel> getVehicle(String plateNo) {
        return repo.findById(plateNo);
    }
}
