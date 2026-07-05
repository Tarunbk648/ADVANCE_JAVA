package com.xworkz.training.dto;

import com.xworkz.training.constants.TrainingEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TrainingDto {
    private String training_Id;
    private String course_Name;
    private String duration;
    private TrainingEnum trainingEnum;
}
