package model;

import java.io.Serializable;
import java.util.List;

public class CommercialProperty extends Property implements Serializable {
    private String businessType;
    private int numberOfParkingSpaces;
    public CommercialProperty(String propertyId, Owner owner, Address address, int price, double area, PropertyStatus status, List<Host> hosts, String businessType, int numberOfParkingSpaces) {
        super(propertyId, owner ,address, price, area, status, hosts);
        this.businessType = businessType;
        this.numberOfParkingSpaces = numberOfParkingSpaces;
    }

    public CommercialProperty(String propertyId, Owner owner, Address address, int price, double area, PropertyStatus status, String businessType, int numberOfParkingSpaces) {
        super(propertyId, owner ,address, price, area, status);
        this.businessType = businessType;
        this.numberOfParkingSpaces = numberOfParkingSpaces;
    }

    public String getBusinessType() {
        return businessType;
    }
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
    public int getNumberOfParkingSpaces() {
        return numberOfParkingSpaces;
    }
    public void setNumberOfParkingSpaces(int numberOfParkingSpaces) {
        this.numberOfParkingSpaces = numberOfParkingSpaces;
    }
    public String toString() {
        return "CommercialProperty [businessType=" + businessType + ", numberOfParkingSpaces=" + numberOfParkingSpaces + ", propertyId=" + this.getPropertyId() + ", price=" + this.getPrice() + ", area=" + this.getArea() + ", status=" + this.getStatus() + ", owner=" + this.getOwner().getFullName() + "]";
    }
}
