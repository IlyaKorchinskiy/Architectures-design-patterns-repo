package ru.korchinskiy.observer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ScheduleBoard implements Observer {
    private List<Path> todayPaths = new ArrayList<>();

    @Override
    public void update(Service subject) {
        if (subject instanceof PathService) {
            PathService pathService = (PathService) subject;
            todayPaths = pathService.getPathsByDate(LocalDate.now());
            System.out.println(todayPaths);
        }
    }
}
