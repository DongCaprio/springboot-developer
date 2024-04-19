package me.dongjkim.springbootdeveloper.repository;

import me.dongjkim.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
