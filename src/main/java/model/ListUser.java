/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PHANMINHTIEN
 */
public class ListUser {
    List<User> list = new ArrayList<>();

    public ListUser() {
        list.add(new User("admin", "12345", true));
        list.add(new User("Ty", "123", true));
        list.add(new User("Tai", "12345", true));
        list.add(new User("admin1", "12345", true));
        list.add(new User("admin2", "12345", true));
        
    }
    public boolean checkLogin(String userName, String password){
        for(User user : list){
           if(user.getUserName().equals(userName) && user.getPassword().equals(password)){
               return true;
           } 
        }
        return false;
    }
    
    
    
}
