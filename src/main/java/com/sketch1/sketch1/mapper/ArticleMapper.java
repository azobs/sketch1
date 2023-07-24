package com.sketch1.sketch1.mapper;

import com.sketch1.sketch1.dto.ArticleDto;
import com.sketch1.sketch1.models.Article;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ArticleMapper {

    ArticleDto entityToDto(Article article);
    Article dtoToEntity(ArticleDto articleDto);
    List<ArticleDto> entityToDto(List<Article> articleList);
    List<Article> dtoToEntity(List<ArticleDto> articleDtoList);
    //yes
}
