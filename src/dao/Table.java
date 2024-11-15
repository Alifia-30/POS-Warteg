/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Suban
 */
public class Table {
    public static void main(String[] args){
        try{
            String usertable = "create table user(id int AUTO_INCREMENT primary key, name varchar(200),email varchar(200),mobileNumber varchar(15),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(200)UNIQUE(email))";
            DBOperation.setDataOrDelete(usertable, "User Table Create Successfully");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
