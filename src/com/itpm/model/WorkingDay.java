/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.model;

import java.math.BigDecimal;

/**
 *
 * @author Amal
 */
public class WorkingDay {

    private int id;
    private String dayName;
    private int workingHours;
    private int workingMinutes;
    private BigDecimal workingDayAmountId;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the dayName
     */
    public String getDayName() {
        return dayName;
    }

    /**
     * @param dayName the dayName to set
     */
    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    /**
     * @return the workingHours
     */
    public int getWorkingHours() {
        return workingHours;
    }

    /**
     * @param workingHours the workingHours to set
     */
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    /**
     * @return the workingMinutes
     */
    public int getWorkingMinutes() {
        return workingMinutes;
    }

    /**
     * @param workingMinutes the workingMinutes to set
     */
    public void setWorkingMinutes(int workingMinutes) {
        this.workingMinutes = workingMinutes;
    }

    /**
     * @return the workingDayAmountId
     */
    public BigDecimal getWorkingDayAmountId() {
        return workingDayAmountId;
    }

    /**
     * @param workingDayAmountId the workingDayAmountId to set
     */
    public void setWorkingDayAmountId(BigDecimal workingDayAmountId) {
        this.workingDayAmountId = workingDayAmountId;
    }
    
    

}
