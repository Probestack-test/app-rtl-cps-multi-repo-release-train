package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.ExecuteTrainActionRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for ExecuteTrainActionRequest domain operations.
 */
public interface ExecuteTrainActionRequestDomainRepository {
    ExecuteTrainActionRequest save(ExecuteTrainActionRequest executeTrainActionRequest);

    Optional<ExecuteTrainActionRequest> findById(String id);

    List<ExecuteTrainActionRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
