package ru.korchinskiy.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "path")
public class Path {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "train_number")
    private int trainNumber;

    @Column(name = "from_station")
    private String fromStation;

    @Column(name = "to_station")
    private String toStation;

    @Column(name = "date_time")
    private LocalDateTime dateTime;
}
