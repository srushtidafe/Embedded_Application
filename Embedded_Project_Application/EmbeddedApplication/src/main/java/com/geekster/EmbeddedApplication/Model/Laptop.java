package com.geekster.EmbeddedApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Laptop {
    @Id
    private Long laptopId;
    private String laptopName;
    private String laptopBrand;
    private Integer laptopPrice;

    @OneToOne
    @JoinColumn(name = "fk_student_Id")
    private Student student;
}
