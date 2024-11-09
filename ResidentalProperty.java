public class ResidentalProperty extends Property{
    private int numberOfBedrooms;
    private boolean garageAvailability;
    private boolean gardenAvailability;

    public ResidentalProperty(String propertyId, Address address, int price, double area, PropertyStatus status, int numberOfBedrooms, boolean garageAvailability, boolean gardenAvailability) {
        super(propertyId, address, price, area, status);
        this.numberOfBedrooms = numberOfBedrooms;
        this.garageAvailability = garageAvailability;
        this.gardenAvailability = gardenAvailability;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public boolean isGarageAvailability() {
        return garageAvailability;
    }

    public void setGarageAvailability(boolean garageAvailability) {
        this.garageAvailability = garageAvailability;
    }

    public boolean isGardenAvailability() {
        return gardenAvailability;
    }

    public void setGardenAvailability(boolean gardenAvailability) {
        this.gardenAvailability = gardenAvailability;
    }
}
