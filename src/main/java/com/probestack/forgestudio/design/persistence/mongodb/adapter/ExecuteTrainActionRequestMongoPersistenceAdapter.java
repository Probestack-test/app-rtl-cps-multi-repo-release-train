package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.ExecuteTrainActionRequestDomainRepository;
import com.probestack.forgestudio.design.model.ExecuteTrainActionRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.ExecuteTrainActionRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.ExecuteTrainActionRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ExecuteTrainActionRequestMongoPersistenceAdapter implements ExecuteTrainActionRequestDomainRepository {
    private final ExecuteTrainActionRequestMongoRepository repository;

    public ExecuteTrainActionRequestMongoPersistenceAdapter(
            ExecuteTrainActionRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ExecuteTrainActionRequest save(ExecuteTrainActionRequest executeTrainActionRequest) {
        ExecuteTrainActionRequestDocument document = toDocument(executeTrainActionRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<ExecuteTrainActionRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<ExecuteTrainActionRequest> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private ExecuteTrainActionRequestDocument toDocument(
            ExecuteTrainActionRequest executeTrainActionRequest) {
        ExecuteTrainActionRequestDocument document = new ExecuteTrainActionRequestDocument();
        BeanUtils.copyProperties(executeTrainActionRequest, document);
        return document;
    }

    private ExecuteTrainActionRequest toDomain(ExecuteTrainActionRequestDocument document) {
        ExecuteTrainActionRequest domain = new ExecuteTrainActionRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
