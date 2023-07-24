package com.sketch1.sketch1.controller;

import com.sketch1.sketch1.api.ArticleApi;
import com.sketch1.sketch1.dto.ArticleDto;
import com.sketch1.sketch1.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleApiImpl implements ArticleApi {
    private ArticleService articleService;

    @Autowired
    public ArticleApiImpl(ArticleService articleService) {
        this.articleService = articleService;
    }

    @Override
    public ResponseEntity<List<ArticleDto>> getListofArticle() {
        List<ArticleDto> articleDtoList = articleService.findAllArticle();
        return new ResponseEntity<>(articleDtoList, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ArticleDto> saveArticle(ArticleDto articleDto) {
        ArticleDto articleDtoSaved = articleService.saveArticle(articleDto);
        return new ResponseEntity<>(articleDtoSaved, HttpStatus.CREATED);
    }
}
