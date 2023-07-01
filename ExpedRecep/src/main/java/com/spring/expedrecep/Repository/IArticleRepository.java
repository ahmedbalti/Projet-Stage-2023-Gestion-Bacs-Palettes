package com.spring.expedrecep.Repository;

import com.spring.expedrecep.Entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArticleRepository extends JpaRepository<Article,Integer> {
}
