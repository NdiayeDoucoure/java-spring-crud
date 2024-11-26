package com.taysirsoftware.ts_app.repo;

import com.taysirsoftware.ts_app.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
