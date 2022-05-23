package com.example.dentalclinic.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "doctors")
@Getter
@Setter
@Builder
@JsonSerialize
@NoArgsConstructor
public class Doctor implements Jsonable{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "spec")
    private String spec;


    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "doctor",
            cascade = CascadeType.PERSIST

    )
    private List<Doctor> records;



}