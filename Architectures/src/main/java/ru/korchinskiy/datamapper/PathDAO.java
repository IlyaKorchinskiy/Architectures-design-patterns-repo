package ru.korchinskiy.datamapper;

import ru.korchinskiy.observer.Path;

import java.util.List;

public interface PathDAO {
    Path findById(Long id);

    List<Path> findAll();

    void save(Path path);

    void update(Path path);

    void delete(Path path);
}
