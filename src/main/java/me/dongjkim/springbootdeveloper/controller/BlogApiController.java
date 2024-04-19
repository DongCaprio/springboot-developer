package me.dongjkim.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.dongjkim.springbootdeveloper.domain.Article;
import me.dongjkim.springbootdeveloper.dto.AddArticleRequest;
import me.dongjkim.springbootdeveloper.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController // response body에 객체 데이터를 JSON 형식으로 반환
public class BlogApiController {

    private final BlogService blogService;

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request){
        Article savedArticle = blogService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedArticle);
    }

}
