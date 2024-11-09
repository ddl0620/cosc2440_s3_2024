public class CommercialProperty extends Property{
    private String businessType;
    private int numberOfParkingSpaces;
    public CommercialProperty(String propertyId, Address address, int price, double area, PropertyStatus status, String businessType, int numberOfParkingSpaces) {
        super(propertyId, address, price, area, status);
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
}
