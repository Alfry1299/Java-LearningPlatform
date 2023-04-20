package it.hackjava.learningplatform.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.hackjava.learningplatform.dto.CourseDTO;
import it.hackjava.learningplatform.dto.CreateCourseDTO;
import it.hackjava.learningplatform.dto.UpdateCourseDTO;
import it.hackjava.learningplatform.model.Course;
import it.hackjava.learningplatform.repository.CourseRepository;

@Service("courseService")
public class CourseService implements CrudService<CourseDTO , Long , CreateCourseDTO , UpdateCourseDTO> {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ModelMapper mapper;


    @Override
    public List<CourseDTO> read(Map<String, String> params) {
        List<CourseDTO> dtos = new ArrayList<CourseDTO>();
        for (Course c: courseRepository.findAll()) {
            dtos.add(mapper.map(c ,  CourseDTO.class));
        }
        return null;
    }


    @Override
    public List<CourseDTO> readOne(UpdateCourseDTO id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readOne'");
    }

    @Override
    public CourseDTO create(Long createDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public CourseDTO update(CreateCourseDTO createDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public CourseDTO delete(UpdateCourseDTO id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }


    @Override
    public List<CourseDTO> readAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readAll'");
    }
    
}
