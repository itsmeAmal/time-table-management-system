/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.controller;

import com.itpm.dao.impl.LocationDaoImpl;
import com.itpm.model.Location;
import java.sql.SQLException;

/**
 *
 * @author Anjula
 */
public class LocationContoller {
   
    public static boolean addLocation(String buildingName,String room,String roomType,int roomCapacity ) throws SQLException{
        Location location=new Location();
        location.setBuildingName(buildingName);
        location.setRoom(room);
        location.setRoomCapacity(roomCapacity);
        location.setRoomType(roomType);
        return new LocationDaoImpl().addLocation(location);
    }
}
