package com.sketch1.sketch1.service;

import com.sketch1.sketch1.dto.ArticleDto;

import java.util.List;

public interface ArticleService {
    List<ArticleDto> findAllArticle();
    ArticleDto saveArticle(ArticleDto articleDto);
}
