package ru.korchinskiy.observer;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        Observer scheduleBoard = new ScheduleBoard();
        PathService pathService = new PathService();
        pathService.attach(scheduleBoard);

        pathService.saveNewPath(new Path(1L, 123, "Moscow", "Saint-Petersburg",
                LocalDateTime.of(2019, 5, 28, 12, 54)));

        pathService.saveNewPath(new Path(2L, 456, "Moscow", "Novgorod",
                LocalDateTime.of(2019, 5, 29, 8, 13)));

        pathService.saveNewPath(new Path(1L, 123, "Moscow", "Kazan",
                LocalDateTime.of(2019, 5, 28, 19, 28)));
    }
}
