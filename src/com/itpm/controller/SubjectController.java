/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.controller;

import com.itpm.dao.SubjectDao;
import com.itpm.model.Subject;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anjula
 */
public class SubjectController {
    
    public static boolean addSubject(String code,String name,int year,int semester,int lectureHours,int tutorialHours,int labHours,int evaluationHours) throws SQLException{
    Subject subject=new Subject();
    subject.setSubjectCode(code);
    subject.setSubjectName(name);
    subject.setOfferedYear(year);
    subject.setOfferedSemester(semester);
    subject.setLectureHours(lectureHours);
    subject.setTutorialHours(tutorialHours);
    subject.setEvaluationHours(evaluationHours);
    return new SubjectDao().addSubject(subject);
        
    }

    public static ResultSet getAllSubjects() throws SQLException{
        return new SubjectDao().getAllSubjects();
    }
}
