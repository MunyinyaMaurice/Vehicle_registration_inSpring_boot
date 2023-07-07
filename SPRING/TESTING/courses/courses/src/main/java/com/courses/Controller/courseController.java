package com.courses.Controller;

import com.courses.Exception.ResouerceNotFoundException;
import com.courses.Model.Courses;
import com.courses.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/23991/courses")
public class courseController {
    @Autowired
    CourseRepository repo;

    @GetMapping
    public List<Courses> coursesList(){
      return repo.findAll();
    }
    @PostMapping
    public Courses SaveCourse(@RequestBody Courses course){
    return repo.save(course);
    }
    @GetMapping("{id}")
    public ResponseEntity<Courses> findCourseById(@PathVariable long id){
        Courses  courses = repo.findById(id)
                .orElseThrow(()-> new ResouerceNotFoundException("Course id not found:"+ id));
return ResponseEntity.ok(courses);
    }
    @PutMapping("{id}")
    public ResponseEntity<Courses> upadteCourses(@PathVariable long id,@RequestBody Courses course){
        Courses courses=repo.findById(id)
                .orElseThrow(()-> new ResouerceNotFoundException("Course id not found:"+ id));
        courses.setCourseId(course.getCourseId());
        courses.setCourseName(course.getCourseName());
        courses.setCourseCredit(course.getCourseCredit());
        repo.save(courses);
        return ResponseEntity.ok(courses);

    }
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable long id){
        Courses courses=repo.findById(id)
                .orElseThrow(()->new ResouerceNotFoundException("Course id not found:"+ id));
repo.delete(courses);
return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }


}
