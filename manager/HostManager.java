package manager;

import model.Database;
import model.Host;
import model.Owner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class HostManager implements ManagerInterface <Host> {

    Scanner scanner = new Scanner(System.in);

    Database db;

    public HostManager(Database db) {
        this.db = db;
    }

    @Override
    public boolean add() {
        String id = "host" + Integer.toString(Database.generateId());
        System.out.println("Enter host full name: ");
        String name = scanner.nextLine();
        System.out.println("Enter host date of birth (dd/MM/yyyy): ");
        String dob = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dob, formatter);
        System.out.println("Enter host phone number: ");
        String phone = scanner.nextLine();
        System.out.println("Enter host email: ");
        String email = scanner.nextLine();
        Host host = new Host(id, name, date, phone, email);
        db.addHostToDatabase(host);
        return true;
    }

    @Override
    public boolean update() {
        for (Host host : db.getHostsList()) {
            System.out.printf("%s %s\n", host.getId(), host.getFullName());
        }
        System.out.println("Enter host id: ");
        String id = scanner.nextLine();
        Host host = db.getHostsList().stream().filter(o -> o.getId().equals(id)).findFirst().orElse(null);
        if (host == null) {
            System.out.println("Host not found");
            return false;
        }
        System.out.println("Enter new host full name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new host date of birth (dd/MM/yyyy): ");
        String dob = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dob, formatter);
        System.out.println("Enter new host phone number: ");
        String phone = scanner.nextLine();
        System.out.println("Enter new host email: ");
        String email = scanner.nextLine();
        host.setFullName(name);
        host.setDateOfBirth(date);
        host.setPhoneNumber(phone);
        host.setEmail(email);
        return true;
    }

    @Override
    public boolean remove() {
        for (Host host : db.getHostsList()) {
            System.out.printf("%s %s\n", host.getId(), host.getFullName());
        }
        System.out.println("Enter host id: ");
        String id = scanner.nextLine();
        Host host = db.getHostsList().stream().filter(o -> o.getId().equals(id)).findFirst().orElse(null);
        if (host == null) {
            System.out.println("Host not found");
            return false;
        }
        db.getHostsList().remove(host);
        return true;    
    }

    @Override
    public List<Host> get() {
        return db.getHostsList();
    }
}
