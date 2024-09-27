package com.aginatech.stock_api.repository;

import com.aginatech.stock_api.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Integer, Article> {
}
