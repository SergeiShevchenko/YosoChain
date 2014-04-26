/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yoso;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ACER
 */
public class Product {
    
    private ArrayList<Product> configuration;
    private int id;
    private Owner owner;
    private HashMap<String, String> properties;
    private int state;
    private HashMap<ListOfRequirements, ArrayList<Boolean>> testResults;
    private String version;
    
    public Product(ArrayList<Product> configuration, int id, Owner owner, HashMap<String, String> properties, int state, HashMap<ListOfRequirements, ArrayList<Boolean>> testResults, String version) {
        this.configuration = configuration;
        this.id = id;
        this.owner = owner;
        this.properties = properties;
        this.state = state;
        this.testResults = testResults;
        this.version = version;
    }
    
    public void addPart(Product product)
    {
        configuration.add(product);
    }

    public void removePart(Product product)
    {
        configuration.remove(product);
    }
    
    public void setConfiguration(ArrayList<Product> configuration) {
        this.configuration = configuration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setProperties(HashMap<String, String> properties) {
        this.properties = properties;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setTestResults(HashMap<ListOfRequirements, ArrayList<Boolean>> testResults) {
        this.testResults = testResults;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ArrayList<Product> getConfiguration() {
        return configuration;
    }

    public int getId() {
        return id;
    }

    public Owner getOwner() {
        return owner;
    }

    public HashMap<String, String> getProperties() {
        return properties;
    }

    public int getState() {
        return state;
    }

    public HashMap<ListOfRequirements, ArrayList<Boolean>> getTestResults() {
        return testResults;
    }

    public String getVersion() {
        return version;
    }
    

    
}
