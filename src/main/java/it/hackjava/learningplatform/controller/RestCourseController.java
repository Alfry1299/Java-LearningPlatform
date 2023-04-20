package it.hackjava.learningplatform.controller;

import java.util.ArrayList;
import java.util.List;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.hackjava.learningplatform.dto.CourseDTO;
import it.hackjava.learningplatform.dto.CreateCourseDTO;
import it.hackjava.learningplatform.dto.UpdateCourseDTO;
import it.hackjava.learningplatform.service.CourseService;
import it.hackjava.learningplatform.service.CrudService;

@RestController
@RequestMapping("/api/courses")
public class RestCourseController {
    
    @Autowired
    // @Qualifier("courseService")
    private CrudService<CourseDTO , Long , CreateCourseDTO , UpdateCourseDTO> courseService;

    @Autowired
    private CourseService courseServiceImpl;

    @GetMapping
    public List<CourseDTO> get(@RequestParam Map<String , String> params){
        // for(String p: params.keySet()){
        //     System.out.println("KEY:" + p);
        //     System.out.println("VALUE:" + params.get(p));

        // }
        return courseService.readAll();
    }
}
