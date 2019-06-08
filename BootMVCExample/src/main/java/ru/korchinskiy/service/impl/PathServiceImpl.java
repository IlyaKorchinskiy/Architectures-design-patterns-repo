package ru.korchinskiy.service.impl;

import org.springframework.stereotype.Service;
import ru.korchinskiy.dto.PathDto;
import ru.korchinskiy.entity.Path;
import ru.korchinskiy.repository.PathRepository;
import ru.korchinskiy.service.DTOMappingService;
import ru.korchinskiy.service.PathService;

import java.util.List;

@Service
public class PathServiceImpl implements PathService {
    private PathRepository pathRepository;
    private DTOMappingService dtoMappingService;

    public PathServiceImpl(PathRepository pathRepository, DTOMappingService dtoMappingService) {
        this.pathRepository = pathRepository;
        this.dtoMappingService = dtoMappingService;
    }

    @Override
    public PathDto getPathById(Long id) {
        Path path = pathRepository.findById(id).orElse(null);
        return dtoMappingService.convertToPathDto(path);
    }

    @Override
    public List<PathDto> getAllPaths() {
        List<Path> pathList = (List<Path>) pathRepository.findAll();
        return dtoMappingService.convertToPathDtoList(pathList);
    }

    @Override
    public void savePath(PathDto pathDto) {
        Path path = dtoMappingService.convertToPath(pathDto);
        pathRepository.save(path);
    }

    @Override
    public void updatePath(PathDto pathDto) {

    }

    @Override
    public void deletePath(PathDto pathDto) {

    }
}
