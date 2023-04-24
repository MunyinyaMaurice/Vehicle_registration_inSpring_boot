package com.vehicle.S.T_Ass_Project_vehicle.Controller;

import com.vehicle.S.T_Ass_Project_vehicle.model.VehicleModel;
import com.vehicle.S.T_Ass_Project_vehicle.service.impl.vehicleServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class vehicleController {
    private final vehicleServiceImpl vehicleService;

    public vehicleController(vehicleServiceImpl vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/")
    public String VehicleHome(){
      return "homePage";
    }
    @GetMapping("/view")
    public String viewVehicle(Model model){
        List<VehicleModel> vehicle=vehicleService.retrieveVehicle();
        model.addAttribute("vehi",vehicle);
        return "homePage";
    }

    @GetMapping("/add")
    public String addVehicle(Model model){
        model.addAttribute("vehi",new VehicleModel());
        return "saveVehicle";
    }
//    @PostMapping("/save")
//    public void saveVehicle(@ModelAttribute("vehi") VehicleModel vehicle, RedirectAttributes redirectAttributes){
//        vehicleService.vehicleService(vehicle);
//        redirectAttributes.addFlashAttribute("vehi", "Vehicle added successfully!");
//    }
@PostMapping("/save")
public String saveVehicle(@ModelAttribute("vehi") VehicleModel thevehicle) {
    VehicleModel vehicle=vehicleService.saveVehicle(thevehicle);
    if (vehicle != null) {
        return "redirect:/";
    }
    return "saveVehicle";

}

    @GetMapping("/edit")
    public String editVehicles(@RequestParam("plateNo") String plateNo, Model model) {
        model.addAttribute("vehi", vehicleService.getVehicle(plateNo));
        return "edit";
    }
    @GetMapping("/delete")
    public String deleteStudent(@RequestParam("plateNo")String plateNo){
        vehicleService.deleteVehicle(plateNo);
        return "redirect:/";
    }
}
