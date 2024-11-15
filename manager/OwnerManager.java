package manager;

import model.Owner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import model.*;


public class OwnerManager implements ManagerInterface <Owner> {
    Scanner scanner = new Scanner(System.in);

    Database db;

    public OwnerManager(Database db) {
        this.db = db;
    }

    @Override
    public boolean add() {
        String id = "owner" + Integer.toString(Database.generateId());
        System.out.println("Enter owner full name: ");
        String name = scanner.nextLine();
        System.out.println("Enter owner date of birth (dd/MM/yyyy): ");
        String dob = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dob, formatter);
        System.out.println("Enter owner phone number: ");
        String phone = scanner.nextLine();
        System.out.println("Enter owner email: ");
        String email = scanner.nextLine();
        Owner owner = new Owner(id, name, date, phone, email);
        db.addOwnerToDatabase(owner);
        return true;
    }

    @Override
    public boolean update() {
        for (Owner owner : db.getOwnersList()) {
            System.out.printf("%s %s\n", owner.getId(), owner.getFullName());
        }
        System.out.println("Enter owner id: ");
        String id = scanner.nextLine();
        Owner owner = db.getOwnersList().stream().filter(o -> o.getId().equals(id)).findFirst().orElse(null);
        if (owner == null) {
            System.out.println("Owner not found");
            return false;
        }
        System.out.println("Enter new owner full name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new owner date of birth (dd/MM/yyyy): ");
        String dob = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dob, formatter);
        System.out.println("Enter new owner phone number: ");
        String phone = scanner.nextLine();
        System.out.println("Enter new owner email: ");
        String email = scanner.nextLine();
        owner.setFullName(name);
        owner.setDateOfBirth(date);
        owner.setPhoneNumber(phone);
        owner.setEmail(email);
        return true;
    }

    @Override
    public boolean remove() {
        for (Owner owner : db.getOwnersList()) {
            System.out.printf("%s %s\n", owner.getId(), owner.getFullName());
        }
        System.out.println("Enter owner id: ");
        String id = scanner.nextLine();
        Owner owner = db.getOwnersList().stream().filter(o -> o.getId().equals(id)).findFirst().orElse(null);
        if (owner == null) {
            System.out.println("Owner not found");
            return false;
        }
        db.getOwnersList().remove(owner);
        return true;
    }

    @Override
    public List<Owner> get() {
        return db.getOwnersList();
    }
}
