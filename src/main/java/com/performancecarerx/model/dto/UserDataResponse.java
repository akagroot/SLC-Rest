/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performancecarerx.model.dto;

import com.performancecarerx.model.ExerciseStandard;
import com.performancecarerx.model.UserProfileModel;
import java.util.List;

/**
 *
 * @author jberroteran
 */
public class UserDataResponse {
    private UserProfileModel userProfileModel;
    private List<ExercisesByDate> exercisesByDate;
    private List<GroupedRecordedExercises> exercisesByGroup;
    private ExerciseStandard standard;
    
    public UserDataResponse(UserProfileModel userProfileModel, List<ExercisesByDate> exercisesByDate, List<GroupedRecordedExercises> exercisesByGroup, ExerciseStandard standard) {
        this.userProfileModel = userProfileModel;
        this.exercisesByDate = exercisesByDate;
        this.exercisesByGroup = exercisesByGroup;
        this.standard = standard;
    }
    
    public UserProfileModel getUserProfileModel() {
        return userProfileModel;
    }
    public List<ExercisesByDate> getExercisesByDate() {
        return exercisesByDate;
    }
    public List<GroupedRecordedExercises> getExercisesByGroup() {
        return exercisesByGroup;
    }
    public ExerciseStandard getStandard() {
        return standard;
    }
    
    @Override
    public String toString() { 
        StringBuilder builder = new StringBuilder();
        builder.append("UserDataResponse [")
                .append("userProfileModel=").append(userProfileModel) 
                .append(", exercisesByDate=").append(exercisesByDate)
                .append(", exercisesByGroup=").append(exercisesByGroup)
                .append(", standard=").append(standard)
                .append("]");
        return builder.toString();
    }
}
