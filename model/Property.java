package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Property implements Serializable {
    private String propertyId;
    private Address address;
    private int price;
    private double area;
    private PropertyStatus status;
    private Owner owner;
    private List<Host> hosts;

    public Property(String propertyId, Owner owner ,Address address, int price, double area, PropertyStatus status, List<Host> hosts) {
        this.propertyId = propertyId;
        this.owner = owner;
        this.address = address;
        this.price = price;
        this.area = area;
        this.status = status;
        this.hosts = hosts;
    }

    public Property(String propertyId, Owner owner ,Address address, int price, double area, PropertyStatus status) {
        this.propertyId = propertyId;
        this.owner = owner;
        this.address = address;
        this.price = price;
        this.area = area;
        this.status = status;
        this.hosts = new ArrayList<>();
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Host> getHosts() {
        return hosts;
    }

    public void setHosts(List<Host> hosts) {
        this.hosts = hosts;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PropertyStatus getStatus() {
        return status;
    }

    public void setStatus(PropertyStatus status) {
        this.status = status;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void addHost(Host host) {
        hosts.add(host);
    }

}
