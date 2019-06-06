package ru.korchinskiy.datamapper;

import ru.korchinskiy.observer.Path;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PathDAOImpl implements PathDAO {
    private Database database;
    private Map<Long, Path> identityMap = new ConcurrentHashMap<>();

    public PathDAOImpl(Database database) {
        this.database = database;
    }

    @Override
    public Path findById(Long id) {
        if (identityMap.containsKey(id))
            return identityMap.get(id);
        return database.read(id);
    }

    @Override
    public List<Path> findAll() {
        List<Path> paths = new ArrayList<>();
        paths = database.readAll();
        return paths;
    }

    @Override
    public void save(Path path) {
        Long id = database.create(path);
        identityMap.put(id, path);
    }

    @Override
    public void update(Path path) {
        database.update(path);
        identityMap.replace(path.getId(), path);
    }

    @Override
    public void delete(Path path) {
        database.delete(path);
        identityMap.remove(path.getId());
    }
}
