package com.checkwithprayag.domain.repository;

import com.checkwithprayag.domain.entity.Gig;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GigRepository extends MongoRepository<Gig, String> {
}
