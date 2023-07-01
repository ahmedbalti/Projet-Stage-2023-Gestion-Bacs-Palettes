package com.spring.expedrecep.Repository;

import com.spring.expedrecep.Entity.Article;
import com.spring.expedrecep.Entity.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFournisseurRepository extends JpaRepository<Fournisseur,Integer> {
}
