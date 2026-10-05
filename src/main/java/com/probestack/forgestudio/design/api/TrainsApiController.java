package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.CreateReleaseTrainRequest;
import com.probestack.forgestudio.design.model.ExecuteTrainActionRequest;
import com.probestack.forgestudio.design.model.ReleaseTrain;
import com.probestack.forgestudio.design.model.TrainHistory;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.TrainsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T15:39:54.279529962Z[GMT]")
@Controller
@RequestMapping("${openapi.multiRepoReleaseTrain.base-path:/v1}")
public class TrainsApiController implements TrainsApi {

    private static final Logger log = LoggerFactory.getLogger(TrainsApiController.class);

    private final TrainsService trainsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public TrainsApiController(TrainsService trainsService, GeneratedRequestValidator generatedRequestValidator) {
        this.trainsService = trainsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<ReleaseTrain> createReleaseTrain(@RequestBody() CreateReleaseTrainRequest createReleaseTrainRequest) {
        log.info("Processing createReleaseTrain request");
        try {
            generatedRequestValidator.validate("createReleaseTrain", createReleaseTrainRequest);
            var response = trainsService.createReleaseTrain(createReleaseTrainRequest);
            log.info("createReleaseTrain completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process createReleaseTrain: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<ReleaseTrain> executeTrainAction(@PathVariable() UUID trainId, @RequestBody() ExecuteTrainActionRequest executeTrainActionRequest) {
        log.info("Processing executeTrainAction request");
        try {
            generatedRequestValidator.validate("executeTrainAction", executeTrainActionRequest);
            var response = trainsService.executeTrainAction(trainId, executeTrainActionRequest);
            log.info("executeTrainAction completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process executeTrainAction: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<ReleaseTrain> getReleaseTrain(@PathVariable() UUID trainId) {
        log.info("Processing getReleaseTrain request");
        try {
            var response = trainsService.getReleaseTrain(trainId);
            log.info("getReleaseTrain completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getReleaseTrain: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<TrainHistory> getTrainHistory(@PathVariable() UUID trainId, @RequestParam(value = "page", required = false, defaultValue = "0") Integer page, @RequestParam(value = "size", required = false, defaultValue = "50") Integer size) {
        log.info("Processing getTrainHistory request");
        try {
            var response = trainsService.getTrainHistory(trainId, page, size);
            log.info("getTrainHistory completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getTrainHistory: {}", e.getMessage(), e);
            throw e;
        }
    }
}
