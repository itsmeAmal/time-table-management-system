/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.dao;

import com.itpm.connection.DatabaseConnection;
import com.itpm.model.Tag;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anjula
 */
public class TagDao {
    
    private  String  selectQuery="select * from tags";
    
  
    public  boolean addTag(Tag tag) throws SQLException{
        
        Connection con=DatabaseConnection.databaseConnection();
        PreparedStatement ps=con.prepareStatement("insert into tags(tag_code,tag_name,tag_related_name) values (?,?,?)");
        ps.setInt(1,tag.getTagCode());
        ps.setString(2,tag.getTagName());
        ps.setString(3,tag.getRelatedTag());
        ps.executeUpdate();
        ps.close();
        return true;
        
    }
    
    public   ResultSet getAllTags() throws SQLException{
        return CommonDao.getAllRecords(selectQuery);
    }
   
    public boolean updateTag(Tag tag) throws SQLException{
        Connection con=DatabaseConnection.databaseConnection();
        PreparedStatement ps=con.prepareStatement("update tags set tag_name=?,tag_related_name=? where tag_code=? ");
        ps.setString(1, tag.getTagName());
        ps.setString(2,tag.getRelatedTag());
        ps.setInt(3, tag.getTagCode());
        ps.executeUpdate();
        ps.close();
        return true;
    }
    public boolean deleteTag(int id) throws SQLException{
        Connection con=DatabaseConnection.databaseConnection();
        PreparedStatement ps=con.prepareStatement("delete from tags where tag_code=?");
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
        return true;
        
    }
    
     public  ResultSet getTagObjectByTagId(int id,String attribute,String condition) throws SQLException{
       return CommonDao.getResultByOneAttribute(selectQuery,id,attribute,condition);
    }
    
     public ResultSet getDataToCombo(String  attribute) throws SQLException{
         return CommonDao.getDataToCombo(selectQuery);
     }
     
     
     
}
