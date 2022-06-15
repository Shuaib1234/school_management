package za.ac.cput.service.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.Student;
import za.ac.cput.repository.StudentRepository;
import za.ac.cput.service.StudentService;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository){
        this.repository = repository;
    }

    @Override
    public Student save(Student student) {
        return this.repository.save(student);
    }

    @Override
    public Optional<Student> findById(String s) {
        //return Optional.empty();
        return this.repository.findById(s);
    }

    @Override
    public void delete(Student student) {
        this.repository.delete(student);
    }

    @Override
    public List<Student> findAll() {
        return this.repository.findAll();
    }
}
