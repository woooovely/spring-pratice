package me.woosang.springbootpratice.service;


import lombok.RequiredArgsConstructor;
import me.woosang.springbootpratice.domain.Article;
import me.woosang.springbootpratice.dto.AddArticleRequest;
import me.woosang.springbootpratice.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
