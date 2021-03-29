/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.controller;

import com.itpm.dao.CommonDao;
import com.itpm.dao.TagDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anjula
 */
public class CommonController {
    
    public static void loadDataToTable(JTable table,ResultSet rs,String[]columnList) throws SQLException{
        DefaultTableModel dtm1=(DefaultTableModel)table.getModel();
        int rw=dtm1.getRowCount();
        for(int i=0;i<rw;i++){
            dtm1.removeRow(0);
        }
        while (rs.next()) {
            Object[] rowCells = new Object[columnList.length];
            for (int i = 0; i < columnList.length; i++) {
                rowCells[i] = rs.getString(columnList[i]);
            }
            dtm1.addRow(rowCells);
        }
        rs.getStatement().close();
        rs.close();
    }
    
    public static int getSelectedRowsid(int selectedRow,JTable table){
        int id = 0;
        if (selectedRow != -1) {
          // int id = Validations.getIntOrZeroFromString(tblCustomers.getValueAt(selectedItem, 0).toString());
             id = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());
        }
        else{
            
            JOptionPane.showMessageDialog(table,"Please select a row","Error !", JOptionPane.ERROR_MESSAGE);
        }
      return id;  
    }
    
    public static void loadDataToCombo(JComboBox comboBox,String attribute) throws SQLException{
       ResultSet rs=new TagDao().getDataToCombo(attribute); 
       System.out.println(rs);
       
       while(rs.next()){
           comboBox.addItem(rs.getString(attribute));
       }
    }
}
