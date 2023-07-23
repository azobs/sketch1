package com.sketch1.sketch1.mapper;

import com.sketch1.sketch1.dto.ArticleDto;
import com.sketch1.sketch1.models.Article;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArticleMapper {

    ArticleDto entityToDto(Article article);
}
