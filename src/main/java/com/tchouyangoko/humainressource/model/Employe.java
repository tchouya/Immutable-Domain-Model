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
public final class Employe implements User {
    private String id;
    private String firstname;
    private String lastname;
    
    List<ProjetAssign>passign;
    List<JobHistory>jobhistory;
    List<Office>office;
    List<Qualification>qualification;
     private Employe(){

    }

    private Employe(Builder builder) {
       id=builder.id;
        firstname= builder.firstname;
        lastname=builder.lastname;
        
        passign=builder.passign;
        jobhistory=builder.jobhistory;
        office=builder.office;
        qualification=builder.qualification;

    }

    public static class Builder{
         private String id;
    private String firstname;
    private String lastname;
    
    List<ProjetAssign>passign;
    List<JobHistory>jobhistory;
    List<Office>office;
    List<Qualification>qualification;

        public Builder(String firstname,String lastname) {
            this.firstname = firstname;
            this.lastname=lastname;
        }


        public Builder id(String value){
            id=value;
            return this;
        }

        public Builder passign(List<ProjetAssign> value){
            passign=value;
            return this;
        }
        
        public Builder jobhistory(List<JobHistory> value){
           jobhistory =value;
            return this;
        }

         public Builder office(List<Office> value){
            office=value;
            return this;
        }
          public Builder qualification(List<Qualification> value){
            qualification=value;
            return this;
        }
        public Employe build(){
            return new Employe(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public List<ProjetAssign> getPassign() {
        return passign;
    }

    public List<JobHistory> getJobhistory() {
        return jobhistory;
    }

    
   
    public List<Office> getOffice() {
        return office;
    }

    public List<Qualification> getQualification() {
        return qualification;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Employe other = (Employe) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
