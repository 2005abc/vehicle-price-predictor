package com.vinay.predictor.repository;

import com.vinay.predictor.model.PredictionHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PredictionRepository extends JpaRepository<PredictionHistory, Long> {
}