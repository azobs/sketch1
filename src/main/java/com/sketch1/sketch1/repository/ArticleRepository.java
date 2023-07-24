package com.sketch1.sketch1.repository;

import com.sketch1.sketch1.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
