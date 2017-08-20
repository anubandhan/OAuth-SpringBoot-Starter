package com.talentica.oauth.controller;

import com.talentica.oauth.entitiy.Article;
import com.talentica.oauth.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/get")
    @ResponseBody
    @Transactional(readOnly = true)
    public ResponseEntity<Article> helloWorld() {
        Article article = new Article();//articleService.getArticleById(1);
        article.setArticleId(1);
        article.setTitle("ABC");
        return new ResponseEntity<Article>(article, HttpStatus.OK);
    }

}