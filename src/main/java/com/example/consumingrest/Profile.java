package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Profile {

    private String companyName;
    private String description;
    private Long price;

    public Profile() {
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public String getDescription() {
        return this.description;
    }
    
    public Long getPrice() {
    	return this.price;
    }
    public void setcompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setPrice(Long price) {
    	this.price = price;
    }
    @Override
    public String toString() {
        return "Profile{" +
                "companyName=" + companyName + "\n" +
                ", description='" + description + '\'' + ", price= " + price +
                '}';
    }
}