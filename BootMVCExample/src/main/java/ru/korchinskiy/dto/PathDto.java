package ru.korchinskiy.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PathDto {
    private Long id;
    private int trainNumber;
    private String fromStation;
    private String toStation;
    private String dateTime;
}
