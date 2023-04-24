////import com.vehicle.S.T_Ass_Project_vehicle.Application;
////import com.vehicle.S.T_Ass_Project_vehicle.Repository.vehicleRepo;
////import com.vehicle.S.T_Ass_Project_vehicle.model.VehicleModel;
////import com.vehicle.S.T_Ass_Project_vehicle.service.impl.vehicleServiceImpl;
////import org.junit.jupiter.api.BeforeEach;
////import org.junit.jupiter.api.Test;
////import org.mockito.ArgumentCaptor;
////import org.mockito.InjectMocks;
////import org.mockito.Mock;
////import org.mockito.MockitoAnnotations;
////import org.springframework.boot.SpringBootConfiguration;
////import org.springframework.boot.test.context.SpringBootTest;
////
////import static org.junit.jupiter.api.Assertions.assertEquals;
////import static org.mockito.Mockito.verify;
////import static org.mockito.Mockito.when;
////
////@SpringBootTest(classes = Application.class)
////@SpringBootConfiguration
////public class VehicleModelTest {
////
////    @InjectMocks
////    private vehicleServiceImpl vehicleService;
////
////    @Mock
////    private vehicleRepo vehicleRepository;
////
////    @BeforeEach
////    void setUp() {
////        MockitoAnnotations.openMocks(this);
////    }
////@Test
////public void testSave() {
////    VehicleModel vehicle = new VehicleModel();
////    vehicle.setPlateNo("RAG23");
////    vehicle.setName("Collora");
////    vehicle.setModel("Toyota");
////    vehicle.setType("one");
////
////    when(vehicleRepository.save(vehicle)).thenReturn(vehicle);
////
////    VehicleModel savedVehicle = vehicleService.saveVehicle(vehicle);
////
////    // Call the saveVehicle() method of the vehicleService object
////    // with the vehicle object as an argument
////    verify(vehicleService).saveVehicle(vehicle);
////
////    ArgumentCaptor<VehicleModel> captor = ArgumentCaptor.forClass(VehicleModel.class);
////    verify(vehicleRepository).save(captor.capture());
////
////    assertEquals("RAG23", captor.getValue().getPlateNo());
////    assertEquals(vehicle, savedVehicle);
////}
////
////}
////
////
//import com.vehicle.S.T_Ass_Project_vehicle.Application;
//import com.vehicle.S.T_Ass_Project_vehicle.Repository.vehicleRepo;
//import com.vehicle.S.T_Ass_Project_vehicle.model.VehicleModel;
//import com.vehicle.S.T_Ass_Project_vehicle.service.impl.vehicleServiceImpl;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.ArgumentCaptor;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.*;
//
//@SpringBootTest(classes = Application.class)
//@SpringBootConfiguration
//public class VehicleModelTest {
//
//    @InjectMocks
//    private vehicleServiceImpl vehicleService;
//
//    @Mock
//    private vehicleRepo vehicleRepository;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    public void testSave() {
//        VehicleModel vehicle = new VehicleModel();
//        vehicle.setPlateNo("RAG23");
//        vehicle.setName("Collora");
//        vehicle.setModel("Toyota");
//        vehicle.setType("one");
//
//        when(vehicleRepository.save(vehicle)).thenReturn(vehicle);
//
//        VehicleModel savedVehicle = vehicleService.saveVehicle(vehicle);
//
//        verify(vehicleService).saveVehicle(vehicle);
//
//        ArgumentCaptor<VehicleModel> captor = ArgumentCaptor.forClass(VehicleModel.class);
//        verify(vehicleRepository).save(captor.capture());
//
//        assertEquals("RAG23", captor.getValue().getPlateNo());
//        assertEquals(vehicle, savedVehicle);
//    }
//
//    @Test
//    public void testFindById() {
//        VehicleModel vehicle = new VehicleModel();
////        vehicle.setId(1L);
//        vehicle.setPlateNo("RAG23");
//        vehicle.setName("Collora");
//        vehicle.setModel("Toyota");
//        vehicle.setType("one");
//
//        when(vehicleRepository.findById("RAG23")).thenReturn(Optional.of(vehicle));
//
//        VehicleModel foundVehicle = vehicleService.getVehicle("RAG23");
//
//        verify(vehicleRepository).findById("RAG23");
//
//        assertEquals(vehicle, foundVehicle);
//    }
//
//    @Test
//    public void testUpdate() {
//        VehicleModel vehicle = new VehicleModel();
//        vehicle.setPlateNo("RAG23");
//        vehicle.setName("Collora");
//        vehicle.setModel("Toyota");
//        vehicle.setType("one");
//
//        when(vehicleRepository.save(vehicle)).thenReturn(vehicle);
//
//        VehicleModel updatedVehicle = vehicleService.saveVehicle(vehicle);
//
//        verify(vehicleRepository).save(vehicle);
//
//        assertEquals(vehicle, updatedVehicle);
//    }
//
//    @Test
//    public void testDelete() {
//        VehicleModel vehicle = new VehicleModel();
//        vehicle.setPlateNo("RAG23");
//        vehicle.setName("Collora");
//        vehicle.setModel("Toyota");
//        vehicle.setType("one");
//
//        when(vehicleRepository.findById("RAG23")).thenReturn(Optional.of(vehicle));
//
//        vehicleService.deleteVehicle("RAG23");
//
//        verify(vehicleRepository).findById("RAG23");
//        verify(vehicleRepository).delete(vehicle);
//    }
//}
