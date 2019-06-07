package ru.korchinskiy.observer;

import java.time.LocalDateTime;

public class Path {
    private Long id;
    private int trainNumber;
    private String fromStation;
    private String toStation;
    private LocalDateTime dateTime;

    public Path(Long id, int trainNumber, String fromStation, String toStation, LocalDateTime dateTime) {
        this.id = id;
        this.trainNumber = trainNumber;
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.dateTime = dateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Path{" +
                "trainNumber=" + trainNumber +
                ", fromStation='" + fromStation + '\'' +
                ", toStation='" + toStation + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
