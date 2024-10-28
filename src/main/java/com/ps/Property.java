package com.ps;

public class Property {

    private int id;
    private String address;
    private String location;
    private PropertyType propertyType;
    private double price;
    private boolean isAvailable;

    public Property (int id,String address, String location, PropertyType propertyType, double price,boolean isAvailable){
        this.id = id;
        this.address = address;
        this.location = location;
        this.propertyType = propertyType;
        this.price = price;
        this.isAvailable = isAvailable;
    }


    public enum PropertyType {
        apartment,
        house,
        commercial,
        land
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", propertyType=" + propertyType +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
