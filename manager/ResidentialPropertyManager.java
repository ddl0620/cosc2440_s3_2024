package manager;

import model.*;

import java.util.List;
import java.util.Scanner;

import model.Database;

public class ResidentialPropertyManager implements ManagerInterface<ResidentialProperty> {

    Scanner scanner = new Scanner(System.in);

    Database db;

    public ResidentialPropertyManager(Database db) {
        this.db = db;
    }


    @Override
    public boolean add() {
        String id = "rp" + Integer.toString(Database.generateId());
        for (Owner owner : db.getOwnersList()) {
            System.out.printf("%s %s\n", owner.getId(), owner.getFullName());
        }
        System.out.println("Enter owner id: ");
        String ownerId = scanner.nextLine();
        Owner owner = db.getOwnersList().stream().filter(o -> o.getId().equals(ownerId)).findFirst().orElse(null);
        if (owner == null) {
            System.out.println("Owner not found");
            return false;
        }
        System.out.println("Enter property city: ");
        String city = scanner.nextLine();
        System.out.println("Enter property district: ");
        String district = scanner.nextLine();
        System.out.println("Enter property ward: ");
        String ward = scanner.nextLine();
        System.out.println("Enter property street: ");
        String street = scanner.nextLine();
        System.out.println("Enter property house number: ");
        String houseNumber = scanner.nextLine();
        Address address = new Address(city, district, ward, street, houseNumber);
        System.out.println("Enter property price: ");
        int price = scanner.nextInt();
        System.out.println("Enter property area: ");
        double area = scanner.nextDouble();
        System.out.println("Enter property status (1. Available, 2. Rented, 3. Under maintenance) : ");
        int status = scanner.nextInt();
        if (status < 1 || status > 3) {
            System.out.println("Invalid status");
            return false;
        }
        PropertyStatus propertyStatus = PropertyStatus.values()[status - 1];
        System.out.println("Enter number of bedrooms: ");
        int numberOfBedrooms = scanner.nextInt();
        System.out.println("Enter garage availability (1. Yes, 2. No): ");
        int garage = scanner.nextInt();
        if (garage < 1 || garage > 2) {
            System.out.println("Invalid garage availability");
            return false;
        }
        boolean garageAvailability = garage == 1;
        System.out.println("Enter garden availability (1. Yes, 2. No): ");
        int garden = scanner.nextInt();
        if (garden < 1 || garden > 2) {
            System.out.println("Invalid garden availability");
            return false;
        }
        boolean gardenAvailability = garden == 1;
        ResidentialProperty residentialProperty = new ResidentialProperty(id, owner, address, price, area, propertyStatus, numberOfBedrooms, garageAvailability, gardenAvailability);
        owner.addPropertyOwned(residentialProperty);
        db.addResidentialPropertyToDatabase(residentialProperty);
        return true;
    }

    @Override
    public boolean update() {

        return true;
    }

    @Override
    public boolean remove() {
        return true;
    }

    @Override
    public List<ResidentialProperty> get() {
        return db.getResidentialPropertiesList();
    }
}
