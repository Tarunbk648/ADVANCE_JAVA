package com.xworkz.training;

import com.xworkz.training.constants.TrainingEnum;
import com.xworkz.training.controller.TrainingController;
import com.xworkz.training.dto.TrainingDto;

import java.util.Scanner;

public class TrainingRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrainingController traningController = new TrainingController();

        TrainingDto trainingDto = new TrainingDto();

        System.out.println("Enter Training ID:");
        String trainingId = sc.nextLine();
        trainingDto.setTraining_Id(trainingId);

        System.out.println("Enter Course Name:");
        String courseName = sc.nextLine();
        trainingDto.setCourse_Name(courseName);

        System.out.println("Enter the Course Duration:");
        String duration = sc.nextLine();
        trainingDto.setDuration(duration);

        System.out.println("Enter the Course Enum:");
        TrainingEnum trainingEnum = TrainingEnum.valueOf(sc.nextLine().toUpperCase());
        trainingDto.setTrainingEnum(trainingEnum);


        traningController.save(trainingDto);   //Dto--->Controller

    }
}
