package com.checkwithprayag.domain.repository;

import com.checkwithprayag.domain.entity.Bid;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidRepository extends MongoRepository<Bid, String> {
}
