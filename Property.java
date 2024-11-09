public class Property {
    private String propertyId;
    private Address address;
    private int price;
    private double area;
    private PropertyStatus status;

    public Property(String propertyId, Address address, int price, double area, PropertyStatus status) {
        this.propertyId = propertyId;
        this.address = address;
        this.price = price;
        this.area = area;
        this.status = status;
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

}
