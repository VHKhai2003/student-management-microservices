package com.vhkhai.student_service.controller;

import com.vhkhai.student_service.entity.Student;
import com.vhkhai.student_service.service.StudentService;
import com.vhkhai.student_service.service.kafka.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    private final KafkaProducerService kafkaProducerService;

    @GetMapping("/{id}")
    public ResponseEntity<?> fetchStudentById(@PathVariable Integer id){
        return studentService.fetchStudentById(id);
    }

    @GetMapping
    public ResponseEntity<?> fetchStudents(){
        return studentService.fetchStudents();
    }

    @PostMapping
    public ResponseEntity<?> createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        kafkaProducerService.sendMessage(message);
        return "Message sent successfully";
    }
}