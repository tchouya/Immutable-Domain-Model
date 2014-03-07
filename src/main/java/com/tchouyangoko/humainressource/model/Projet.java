/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.model;

import java.util.List;

/**
 *
 * @author mikiahidjo
 */
public final class Projet {
    private int id;
    private String name;
    private String description;
    
    List<ProjetAssign>projetassign;
    
    private Projet()
    {
        
    }
    
    private Projet(Builder builder)
    {
        id=builder.id;
        name=builder.name;
        description=builder.description;
        projetassign=builder.projetassign;
    }
    
    public static class Builder{
        private int id;
    private String name;
    private String description;
    
    List<ProjetAssign>projetassign;
    
    public Builder(String name,String description)
    {
        this.name=name;
        this.description=description;
    }
       
    public Builder id(int value)
    {
        id=value;
        return this;
    }
    
    public Builder projetassign(List<ProjetAssign>value)
    {
        projetassign=value;
        return this;
    }
    
    public Projet build()
    {
        return new Projet(this);
    }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<ProjetAssign> getProjetassign() {
        return projetassign;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.id;
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
        final Projet other = (Projet) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}
