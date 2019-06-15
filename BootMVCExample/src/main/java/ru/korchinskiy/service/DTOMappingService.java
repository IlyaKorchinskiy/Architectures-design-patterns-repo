package ru.korchinskiy.service;

import ru.korchinskiy.dto.PathDto;
import ru.korchinskiy.entity.Path;

import java.util.List;

public interface DTOMappingService {
    PathDto convertToPathDto(Path path);

    Path convertToPath(PathDto pathDto);

    List<PathDto> convertToPathDtoList(List<Path> pathList);

}
