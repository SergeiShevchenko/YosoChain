/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yoso;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class ListOfRequirements {
    private ArrayList<Requirement> requirementsList;

    public void setRequirementsList(ArrayList<Requirement> requirementsList) {
        this.requirementsList = requirementsList;
    }

    public ArrayList<Requirement> getRequirementsList() {
        return requirementsList;
    }
    
    public void addRequirement(String name, String value)
    {
        requirementsList.add(new Requirement(name, value));
    }
   
}
