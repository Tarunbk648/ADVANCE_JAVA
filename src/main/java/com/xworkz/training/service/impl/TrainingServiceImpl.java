package com.xworkz.training.service.impl;

import com.xworkz.training.dao.TrainingDao;
import com.xworkz.training.dao.impl.TrainingDaoImpl;
import com.xworkz.training.dto.TrainingDto;
import com.xworkz.training.service.TrainingService;

public class TrainingServiceImpl implements TrainingService {
    TrainingDao trainingDao= new TrainingDaoImpl();
    @Override
    public void process(TrainingDto trainingDto) {
        trainingDao.process(trainingDto);   //Service--->Dao

    }
}
