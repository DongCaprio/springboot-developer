package me.dongjkim.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.dongjkim.springbootdeveloper.domain.Article;
import me.dongjkim.springbootdeveloper.dto.AddArticleRequest;
import me.dongjkim.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}
