import java.io.Serializable;
import java.util.List;

public class ResidentialProperty extends Property implements Serializable {
    private int numberOfBedrooms;
    private boolean garageAvailability;
    private boolean gardenAvailability;

    public ResidentialProperty(String propertyId, Owner owner, Address address, int price, double area, PropertyStatus status, int numberOfBedrooms, boolean garageAvailability, boolean gardenAvailability, List<Host> hosts) {
        super(propertyId, owner ,address, price, area, status, hosts);
        this.numberOfBedrooms = numberOfBedrooms;
        this.garageAvailability = garageAvailability;
        this.gardenAvailability = gardenAvailability;
    }

    public ResidentialProperty(String propertyId, Owner owner, Address address, int price, double area, PropertyStatus status, int numberOfBedrooms, boolean garageAvailability, boolean gardenAvailability) {
        super(propertyId, owner ,address, price, area, status);
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
