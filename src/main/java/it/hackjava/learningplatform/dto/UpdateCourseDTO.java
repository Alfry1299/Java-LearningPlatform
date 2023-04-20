package it.hackjava.learningplatform.dto;

import java.util.List;

public class UpdateCourseDTO {
    private String description;
    private String date;
    private List<Long> addedstudentIds;
    private List<Long> removedstudentIds;

   
    public UpdateCourseDTO() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Long> getAddedstudentIds() {
        return addedstudentIds;
    }

    public void setAddedstudentIds(List<Long> addedstudentIds) {
        this.addedstudentIds = addedstudentIds;
    }

    public List<Long> getRemovedstudentIds() {
        return removedstudentIds;
    }

    public void setRemovedstudentIds(List<Long> removedstudentIds) {
        this.removedstudentIds = removedstudentIds;
    }

    
}
