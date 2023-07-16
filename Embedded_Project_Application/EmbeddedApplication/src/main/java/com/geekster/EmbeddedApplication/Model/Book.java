package com.geekster.EmbeddedApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    private Long bookId;

    private String bookTitle;
    private String bookAuthor;
    private String bookDescription;
    private String bookPrice;

    @ManyToOne
    @JoinColumn(name = "fk_student_Id")
    private Student student;
}
