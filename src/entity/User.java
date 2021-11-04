/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Arthur
 */
public class User {
    private String firstName;
    private String lastName;
    private String phone;

    public User(){
    
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
   
        @Override
    public String toString() {
        return "User{" 
                + "firstName=" + firstName 
                + ", lastName=" + lastName 
                + ", phone=" + phone 
                + '}';
    }
}
