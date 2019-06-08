package ru.korchinskiy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.korchinskiy.dto.PathDto;
import ru.korchinskiy.service.PathService;

import java.util.List;

@Controller("/")
public class PathController {
    private PathService pathService;

    public PathController(PathService pathService) {
        this.pathService = pathService;
    }

    @GetMapping
    public String showPaths(Model model) {
        List<PathDto> paths = pathService.getAllPaths();
        model.addAttribute("paths", paths);
        model.addAttribute("path", new PathDto());
        return "index";
    }

    @PostMapping("/add")
    public String addPath(Model model, @ModelAttribute PathDto pathDto) {
        pathService.savePath(pathDto);
        return "redirect:/";
    }
}
