package ru.korchinskiy.datamapper;

import ru.korchinskiy.observer.Path;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Database {
    private Map<Long, Path> paths;

    public Database() {
        this.paths = new ConcurrentHashMap<>();
    }

    Path read(Long id) {
        return paths.get(id);
    }

    List<Path> readAll() {
        return (List<Path>) paths.values();
    }

    Long create(Path path) {
        Long newId = Collections.max(paths.keySet()) + 1;
        paths.put(newId, path);
        return newId;
    }

    void update(Path path) {
        paths.replace(path.getId(), path);
    }

    void delete(Path path) {
        paths.remove(path.getId());
    }

}
