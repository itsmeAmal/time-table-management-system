/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.dao.impl;

import com.itpm.connection.DatabaseConnection;
import com.itpm.dao.CommonDao;
import com.itpm.dao.StudentGroupDao;
import com.itpm.model.StudentGroup;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author root_user
 */
public class StudentGroupDaoImpl implements StudentGroupDao {

    private CommonDao commonDao;

    private String selectQuery = "select * from students";
    //student_id, student_group_no, student_sub_group_no, student_group_id, student_sub_group_id, student_academic_year_and_sem, student_programme

    @Override
    public boolean addStudentGroup(StudentGroup studentGroup) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into students (student_group_no, student_sub_group_no,"
                + " student_group_id, student_sub_group_id, student_academic_year_and_sem, student_programme) values (?,?,?,?,?,?)");
        ps.setString(1, studentGroup.getGroupNo());
        ps.setString(2, studentGroup.getSubGroupNo());
        ps.setInt(3, studentGroup.getGroupId());
        ps.setInt(4, studentGroup.getSubGroupId());
        ps.setString(5, studentGroup.getAcademicYearAndSem());
        ps.setString(6, studentGroup.getProgram());
        ps.executeUpdate();
        ps.close();
        return true;
    }

    @Override
    public boolean updateStudentGroup(StudentGroup studentGroup) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("update students set student_group_no=?, "
                + "student_sub_group_no=?, student_academic_year_and_sem=?, student_programme=?,"
                + "  student_group_id=?, student_sub_group_id=? where student_id=?");
        ps.setString(1, studentGroup.getGroupNo());
        ps.setString(2, studentGroup.getSubGroupNo());
        ps.setString(3, studentGroup.getAcademicYearAndSem());
        ps.setString(4, studentGroup.getProgram());
        ps.setInt(5, studentGroup.getGroupId());
        ps.setInt(6, studentGroup.getSubGroupId());
        ps.setInt(7, studentGroup.getStudentId());
        ps.executeUpdate();
        ps.close();
        return true;
    }

    @Override
    public boolean deleteStudentGroup(int id) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from students where student_id=?");
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
        return true;
    }

    @Override
    public ResultSet getAllStudentGroups() throws SQLException {
        return new CommonDaoImpl().getAllRecords(selectQuery);
    }

    @Override
    public ResultSet getStrudentGroupByOneAttribute(String attribute, String condition, String value) throws SQLException {
        return commonDao.getResultByAttribute(selectQuery, attribute, condition, value);
    }

}
