package ru.korchinskiy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.korchinskiy.entity.Path;

@Repository
public interface PathRepository extends CrudRepository<Path, Long> {
}
