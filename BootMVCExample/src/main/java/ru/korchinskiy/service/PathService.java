package ru.korchinskiy.service;

import ru.korchinskiy.dto.PathDto;

import java.util.List;

public interface PathService {
    PathDto getPathById(Long id);

    List<PathDto> getAllPaths();

    void savePath(PathDto pathDto);

    void updatePath(PathDto pathDto);

    void deletePath(PathDto pathDto);
}
