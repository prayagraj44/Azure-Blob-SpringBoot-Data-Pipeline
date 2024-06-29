package com.checkwithprayag.domain.repository;

import com.checkwithprayag.domain.entity.Gig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GigRepository extends JpaRepository<Gig, String> {
}
