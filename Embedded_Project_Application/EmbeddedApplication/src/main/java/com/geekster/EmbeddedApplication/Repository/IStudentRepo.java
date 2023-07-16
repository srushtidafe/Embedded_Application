package com.geekster.EmbeddedApplication.Repository;

import com.geekster.EmbeddedApplication.Model.Book;
import com.geekster.EmbeddedApplication.Model.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student,Long> {


}
