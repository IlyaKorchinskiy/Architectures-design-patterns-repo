package ru.korchinskiy.observer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PathService extends Service {
    private List<Path> paths = new ArrayList<>();

    public List<Path> getPathsByDate(LocalDate date) {
        List<Path> pathsByDate = new ArrayList<>();
        for (Path path : paths) {
            if (path.getDateTime().toLocalDate().equals(date)) {
                pathsByDate.add(path);
            }
        }
        return pathsByDate;
    }

    public void saveNewPath(Path path) {
        paths.add(path);
        notifyObservers();
    }
}
