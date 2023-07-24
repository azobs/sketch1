package com.sketch1.sketch1.service;

import com.sketch1.sketch1.dto.ArticleDto;
import com.sketch1.sketch1.mapper.ArticleMapper;
import com.sketch1.sketch1.models.Article;
import com.sketch1.sketch1.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService{

    ArticleMapper articleMapper;
    ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImpl(ArticleMapper articleMapper, ArticleRepository articleRepository) {
        this.articleMapper = articleMapper;
        this.articleRepository = articleRepository;
    }

    @Override
    public List<ArticleDto> findAllArticle() {
        return articleMapper.entityToDto(articleRepository.findAll());
    }

    @Override
    public ArticleDto saveArticle(ArticleDto articleDto) {
        Article articleSaved = articleRepository.save(articleMapper.dtoToEntity(articleDto));
        return articleMapper.entityToDto(articleSaved);
    }
}
