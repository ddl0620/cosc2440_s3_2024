package manager;

import model.*;

import java.util.List;
import java.util.Scanner;

public class CommercialPropertyManager implements ManagerInterface<CommercialProperty> {

    Scanner scanner = new Scanner(System.in);

    Database db;

    public CommercialPropertyManager(Database db) {
        this.db = db;
    }

    @Override
    public boolean add() {
        String id = "cp" + Integer.toString(Database.generateId());
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
        scanner.nextLine();
        System.out.println("Enter commercial property business type: ");
        String businessType = scanner.nextLine();
        System.out.println("Enter commercial property number of parking spaces: ");
        int parkingSpaces = scanner.nextInt();
        CommercialProperty commercialProperty = new CommercialProperty(id, owner, address, price, area, propertyStatus, businessType, parkingSpaces);
        owner.addPropertyOwned(commercialProperty);
        db.addCommercialPropertyToDatabase(commercialProperty);
        return true;
    }

    @Override
    public boolean update() {
        for(CommercialProperty commercialProperty : db.getCommercialPropertiesList()) {
            System.out.printf("%s %s\n", commercialProperty.getPropertyId(), commercialProperty.getAddress().getCity());
        }
        System.out.println("Enter property id to update: ");
        String id = scanner.nextLine();
        CommercialProperty commercialProperty = db.getCommercialPropertiesList().stream().filter(o -> o.getPropertyId().equals(id)).findFirst().orElse(null);
        if (commercialProperty == null) {
            System.out.println("Property not found");
            return false;
        }
        System.out.println("Enter new owner id: ");
        String ownerId = scanner.nextLine();
        Owner owner = db.getOwnersList().stream().filter(o -> o.getId().equals(ownerId)).findFirst().orElse(null);
        if (owner == null) {
            System.out.println("Owner not found");
            return false;
        }
        System.out.println("Enter new property city: ");
        String city = scanner.nextLine();
        System.out.println("Enter new property district: ");
        String district = scanner.nextLine();
        System.out.println("Enter new property ward: ");
        String ward = scanner.nextLine();
        System.out.println("Enter new property street: ");
        String street = scanner.nextLine();
        System.out.println("Enter new property house number: ");
        String houseNumber = scanner.nextLine();
        Address address = new Address(city, district, ward, street, houseNumber);
        System.out.println("Enter new property price: ");
        int price = scanner.nextInt();
        System.out.println("Enter new property area: ");
        double area = scanner.nextDouble();
        System.out.println("Enter new property status (1. Available, 2. Rented, 3. Under maintenance) : ");
        int status = scanner.nextInt();
        if (status < 1 || status > 3) {
            System.out.println("Invalid status");
            return false;
        }
        PropertyStatus propertyStatus = PropertyStatus.values()[status - 1];
        scanner.nextLine();
        System.out.println("Enter new commercial property business type: ");
        String businessType = scanner.nextLine();
        System.out.println("Enter new commercial property number of parking spaces: ");
        int parkingSpaces = scanner.nextInt();
        commercialProperty.setAddress(address);
        commercialProperty.setPrice(price);
        commercialProperty.setArea(area);
        commercialProperty.setStatus(propertyStatus);
        commercialProperty.setBusinessType(businessType);
        commercialProperty.setNumberOfParkingSpaces(parkingSpaces);
        commercialProperty.setOwner(owner);
        return true;
    }

    @Override
    public boolean remove() {
        return false;
    }

    @Override
    public List<CommercialProperty> get() {
        return db.getCommercialPropertiesList();
    }
}
