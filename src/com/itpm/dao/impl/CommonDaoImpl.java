/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.dao.impl;

import com.itpm.connection.DatabaseConnection;
import com.itpm.core.CommonConstants;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anjula
 */
public class CommonDaoImpl {
    
    public static  ResultSet getAllRecords(String selectQuery) throws SQLException{
        Connection con=DatabaseConnection.databaseConnection();
        PreparedStatement ps=con.prepareStatement(selectQuery);
        ResultSet rs=ps.executeQuery();
        return rs;
    }
    
    public static ResultSet getResultByOneAttribute(String selectQuery,int tagCode,String attribute,String condition) throws SQLException{
        Connection con=DatabaseConnection.databaseConnection();
        System.out.println(selectQuery+ CommonConstants.where + attribute + condition + CommonConstants.parameter);
        PreparedStatement ps=con.prepareStatement(selectQuery+CommonConstants.where+attribute+condition+CommonConstants.parameter);
        ps.setString(1,Integer.toString(tagCode));
        ResultSet rs=ps.executeQuery();
        return rs;
         
    }
    public static ResultSet getDataToCombo(String selectQuery) throws SQLException{
        Connection con=DatabaseConnection.databaseConnection();
        PreparedStatement ps=con.prepareStatement(selectQuery);
        ResultSet rs=ps.executeQuery();
        return rs;
    }
}
