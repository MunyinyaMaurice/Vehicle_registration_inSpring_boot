/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehicle.S.T_Ass_Project_vehicle.service;


import com.vehicle.S.T_Ass_Project_vehicle.model.VehicleModel;

import java.util.*;

/**
 *
 * @author M U N Y I N Y A
 */
public interface vehicleInterFace{
    public VehicleModel saveVehicle(VehicleModel vehicle);
     public List<VehicleModel> retrieveVehicle();
      public void deleteVehicle(String plateNo);
      public Optional<VehicleModel> getVehicle(String id);
}
