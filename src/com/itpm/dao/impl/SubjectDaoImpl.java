/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.dao.impl;

import com.itpm.connection.DatabaseConnection;
import com.itpm.dao.SubjectDao;
import com.itpm.model.Subject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anjula
 */
public class SubjectDaoImpl implements SubjectDao {

    String selectQuery = "select * from subjects";

    @Override
    public boolean addSubject(Subject subject) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into subjects(subject_code,subject_evaluation_hours,subject_lab_hours,subject_lecture_hours_amount,subject_name,subject_offered_semester,subject_offered_year,subject_tutorial_hours)values(?,?,?,?,?,?,?,?)");
        ps.setString(1, subject.getSubjectCode());
        ps.setInt(2, subject.getEvaluationHours());
        ps.setInt(3, subject.getLabHours());
        ps.setInt(4, subject.getLectureHours());
        ps.setString(5, subject.getSubjectName());
        ps.setInt(6, subject.getOfferedSemester());
        ps.setInt(7, subject.getOfferedYear());
        ps.setInt(8, subject.getTutorialHours());
        ps.executeUpdate();
        ps.close();
        return true;
    }

    public ResultSet getAllSubjects() throws SQLException {
        return new CommonDaoImpl().getAllRecords(selectQuery);
    }
}
