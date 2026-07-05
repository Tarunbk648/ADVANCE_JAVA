package com.xworkz.training.controller;

import com.xworkz.training.dto.TrainingDto;
import com.xworkz.training.service.TrainingService;
import com.xworkz.training.service.impl.TrainingServiceImpl;

public class TrainingController {
    TrainingService trainingService = new TrainingServiceImpl();
    public void save(TrainingDto trainingDt){
        trainingService.process(trainingDt);   //Controller-->Service

    }
}
