package com.geekster.EmbeddedApplication.Repository;

import com.geekster.EmbeddedApplication.Model.Book;
import com.geekster.EmbeddedApplication.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends JpaRepository<Laptop,Long> {

}
