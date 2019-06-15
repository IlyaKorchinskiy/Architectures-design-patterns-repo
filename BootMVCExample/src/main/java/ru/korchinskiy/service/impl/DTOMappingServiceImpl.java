package ru.korchinskiy.service.impl;

import org.springframework.stereotype.Service;
import ru.korchinskiy.dto.PathDto;
import ru.korchinskiy.entity.Path;
import ru.korchinskiy.service.DTOMappingService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class DTOMappingServiceImpl implements DTOMappingService {
    @Override
    public PathDto convertToPathDto(Path path) {
        PathDto pathDto = new PathDto();
        pathDto.setId(path.getId());
        pathDto.setTrainNumber(path.getTrainNumber());
        pathDto.setFromStation(path.getFromStation());
        pathDto.setToStation(path.getToStation());
        pathDto.setDateTime(path.getDateTime().toString());
        return pathDto;
    }

    @Override
    public Path convertToPath(PathDto pathDto) {
        Path path = new Path();
        path.setId(pathDto.getId());
        path.setTrainNumber(pathDto.getTrainNumber());
        path.setFromStation(pathDto.getFromStation());
        path.setToStation(pathDto.getToStation());
        path.setDateTime(LocalDateTime.parse(pathDto.getDateTime()));
        return path;
    }

    @Override
    public List<PathDto> convertToPathDtoList(List<Path> pathList) {
        List<PathDto> pathDtoList = new ArrayList<>();
        for (Path path : pathList) {
            PathDto pathDto = convertToPathDto(path);
            pathDtoList.add(pathDto);
        }
        return pathDtoList;
    }
}
