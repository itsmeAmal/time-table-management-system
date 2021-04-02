/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.dao;

import com.itpm.connection.DatabaseConnection;
import com.itpm.model.Location;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Anjula
 */
public class LocationDao {
    
    public  boolean addLocation(Location location) throws SQLException{
       Connection con=DatabaseConnection.databaseConnection();
       PreparedStatement ps=con.prepareStatement("insert into rooms(room_id,room_type,room_capacity,room_related_building_id) values(?,?,?,?)");
       ps.setString(0, location.getRoom());
       ps.setString(1, location.getRoomType());
       ps.setString(0, x);
       
        return true;
    }
}
