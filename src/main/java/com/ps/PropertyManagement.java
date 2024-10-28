package com.ps;

import java.util.ArrayList;


public class PropertyManagement {
    //Properties: name, address, phone, and ArrayList<Property> properties.
    //Methods:
    //addProperty(Property property): Adds a new property to the management system.
    //removeProperty(int propertyId): Removes a property by its unique ID.
    //listAvailableProperties(): Lists all available (unsold) properties.
    //searchByLocation(String location): Searches properties by location.
    //searchByPriceRange(double minPrice, double maxPrice): Searches properties within a price range.
    //searchByType(PropertyType type): Searches properties by type.
    private String name;
    private String address;
    private String phone;
    private ArrayList<Property> properties;

    public PropertyManagement (String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.properties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
