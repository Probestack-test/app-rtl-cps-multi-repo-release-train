package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.ExecuteTrainActionRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for ExecuteTrainActionRequest documents.
 */
public interface ExecuteTrainActionRequestMongoRepository extends MongoRepository<ExecuteTrainActionRequestDocument, String> {
}
