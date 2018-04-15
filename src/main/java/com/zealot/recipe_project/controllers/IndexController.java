package com.zealot.recipe_project.controllers;

import com.zealot.recipe_project.domain.Category;
import com.zealot.recipe_project.domain.UnitOfMeasure;
import com.zealot.recipe_project.repositories.CategoryRepository;
import com.zealot.recipe_project.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category Id is : " + categoryOptional.get().getId());
        System.out.println("Unit of measure Id is : " + unitOfMeasureOptional.get().getId());
        return "index";
    }
}
