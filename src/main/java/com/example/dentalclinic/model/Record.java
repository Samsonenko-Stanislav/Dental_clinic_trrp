package com.example.dentalclinic.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "records")
@Getter
@Setter
@JsonSerialize
@NoArgsConstructor
public class Record implements Jsonable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "client")
    private  String client;

    @Column(name = "date")

    private String date;

    @Column(name = "time")
    private String time;
    @Column(name = "vacant")

    private boolean vacant;

    @ManyToOne
    @JoinColumn(name="doctor_id")
    @JsonIgnore
    private Doctor doctor;
}
