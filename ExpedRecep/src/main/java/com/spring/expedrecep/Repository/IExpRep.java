package com.spring.expedrecep.Repository;

import com.spring.expedrecep.Entity.Audit;
import com.spring.expedrecep.Entity.ExpRep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExpRep extends JpaRepository<ExpRep,Integer> {
}
