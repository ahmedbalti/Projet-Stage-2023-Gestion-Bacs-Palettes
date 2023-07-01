package com.spring.expedrecep.Repository;

import com.spring.expedrecep.Entity.Article;
import com.spring.expedrecep.Entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<Utilisateur,Integer> {
}
