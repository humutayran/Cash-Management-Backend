package com.example.cashmanagementspring.service.abstraction;

import com.example.cashmanagementspring.dto.request.CategoriesRequestDto;
import com.example.cashmanagementspring.dto.response.CategoriesResponseDto;

public interface CategoriesService {
    CategoriesResponseDto addCategory(CategoriesRequestDto categoriesDto);
}
