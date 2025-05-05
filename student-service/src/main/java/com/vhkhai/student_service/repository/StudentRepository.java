package com.vhkhai.student_service.repository;
import com.vhkhai.student_service.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
