package com.springDataJPA.Emp;


import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@ToString

@Entity
public class Emp {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String empName;
    private String city;
    private Long number;
}
