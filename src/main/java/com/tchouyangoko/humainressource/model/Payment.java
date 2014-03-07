/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.model;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author mikiahidjo
 */
public final class Payment {
    private String id;
    private String date;
    private double salary;
    
    List<Employe>employe;
    
     private Payment(){

    }

    private Payment(Builder builder) {
        id=builder.id;
        date= builder.date;
        salary=builder.salary;
        employe=builder.employe;

    }

    public static class Builder{
        private String id;
    private String date;
    private double salary;
    
    List<Employe>employe;

        public Builder(String date,double Salary) {
            this.date = date;
            this.salary=salary;
            
        }

        public Builder id(String value){
            id=value;
            return this;
        }

        public Builder employe(List<Employe> value){
            employe=value;
            return this;
        }

        public Payment build(){
            return new Payment(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public double getSalary() {
        return salary;
    }

    public List<Employe> getEmploye() {
        return employe;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Payment other = (Payment) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
