package com.checkwithprayag.domain.repository;

import com.checkwithprayag.domain.entity.TimeLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeLogRepository extends MongoRepository<TimeLog, String> {
}
