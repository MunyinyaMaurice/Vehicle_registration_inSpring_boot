package com.Exam.GymManagement23991.Controller;

import com.Exam.GymManagement23991.Exception.ResouerceNotFoundException;
import com.Exam.GymManagement23991.Model.GymMember;
import com.Exam.GymManagement23991.Dao.gymRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/23991/gym")
public class gymController {
    @Autowired
    gymRepo repo;
    @GetMapping
    public List<GymMember> gymList(){
      return repo.findAll();
    }
    @PostMapping
    public GymMember saveGym(@RequestBody GymMember gym){
        return repo.save(gym);
    }
    @GetMapping("{id}")
    public ResponseEntity<GymMember> getGymById(@PathVariable Long id){
        GymMember gym= repo.findById(id).orElseThrow(()-> new ResouerceNotFoundException("don't have this id:"+id));
        return ResponseEntity.ok(gym);
    }
//    @GetMapping("{nationalId}")
//    public ResponseEntity<GymMember> getGymByEmail(@PathVariable String nationalId){
//        GymMember gym= repo.findByEmail(nationalId);
//                //.orElseThrow(()-> new ResouerceNotFoundException("don't have this id:"+ email));
//        return ResponseEntity.ok(gym);
//    }
    @PutMapping("{id}")
    public ResponseEntity<GymMember> updateGym(@PathVariable Long id, @RequestBody GymMember gyms){
        GymMember gym= repo.findById(id).orElseThrow(()-> new ResouerceNotFoundException("don't have this id:"+id));
        gym.setNationalId(gyms.getNationalId());
        gym.setName(gyms.getName());
        gym.setEmail(gyms.getEmail());
        gym.setMemberShipType(gyms.getMemberShipType());
        gym.setStartDate(gyms.getStartDate());
        gym.setEndDate(gyms.getEndDate());
        repo.save(gym);
        return ResponseEntity.ok(gym);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteGym(@PathVariable Long id){
        GymMember gym=repo.findById(id)
                .orElseThrow(()-> new ResouerceNotFoundException("don't have this id:"+id));
   repo.delete(gym);
   return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
