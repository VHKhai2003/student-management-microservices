package com.vhkhai.school_service.repositories;

import com.vhkhai.school_service.entities.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
