package com.sketch1.sketch1.mapper;

import com.sketch1.sketch1.dtos.ArticleDto;
import com.sketch1.sketch1.models.Article;
import org.mapstruct.Mapper;

@Mapper
public interface ArticleMapper {
    ArticleDto articleToArticleDto(Article art);
}
