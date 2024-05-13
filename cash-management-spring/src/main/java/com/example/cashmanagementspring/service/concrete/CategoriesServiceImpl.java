package com.example.cashmanagementspring.service.concrete;

import com.example.cashmanagementspring.dto.request.CategoriesRequestDto;
import com.example.cashmanagementspring.dto.response.CategoriesResponseDto;
import com.example.cashmanagementspring.repository.CategoriesRepository;
import com.example.cashmanagementspring.service.abstraction.CategoriesService;

public class CategoriesServiceImpl implements CategoriesService {
    private final CategoriesRepository categoriesRepository;

    public CategoriesServiceImpl(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    @Override
    public CategoriesResponseDto addCategory(CategoriesRequestDto categoriesDto) {
        return null;
    }
}
