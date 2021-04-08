/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.model;

/**
 *
 * @author Anjula
 */
public class Lecturer {
    
    private int lecturerId;
    private String lectuerName;

    /**
     * @return the lecturerId
     */
    public int getLecturerId() {
        return lecturerId;
    }

    /**
     * @param lecturerId the lecturerId to set
     */
    public void setLecturerId(int lecturerId) {
        this.lecturerId = lecturerId;
    }

    /**
     * @return the lectuerName
     */
    public String getLectuerName() {
        return lectuerName;
    }

    /**
     * @param lectuerName the lectuerName to set
     */
    public void setLectuerName(String lectuerName) {
        this.lectuerName = lectuerName;
    }
   
}
