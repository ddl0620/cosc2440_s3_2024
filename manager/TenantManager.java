package manager;

import model.Database;
import model.Tenant;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class TenantManager implements ManagerInterface <Tenant>{

    Scanner scanner = new Scanner(System.in);

    Database db;

    public TenantManager(Database db) {
        this.db = db;
    }

    @Override
    public boolean add() {
        String id = "tenant" + Integer.toString(Database.generateId());
        System.out.println("Enter tenant name: ");
        String name = scanner.nextLine();
        System.out.println("Enter tenant date of birth (dd/MM/yyyy): ");
        String dob = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dob, formatter);
        System.out.println("Enter tenant phone number: ");
        String phone = scanner.nextLine();
        System.out.println("Enter tenant email: ");
        String email = scanner.nextLine();
        Tenant tenant = new Tenant(id, name, date, phone, email);
        db.addTenantToDatabase(tenant);
        return true;
    }


    @Override
    public boolean update() {
        for (Tenant tenant : db.getTenantsList()) {
            System.out.printf("%s %s\n", tenant.getId(), tenant.getFullName());
        }
        System.out.println("Enter tenant id: ");
        String id = scanner.nextLine();
        Tenant tenant = db.getTenantsList().stream().filter(o -> o.getId().equals(id)).findFirst().orElse(null);
        if (tenant == null) {
            System.out.println("Tenant not found");
            return false;
        }
        System.out.println("Enter new tenant name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new tenant date of birth (dd/MM/yyyy): ");
        String dob = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dob, formatter);
        System.out.println("Enter new tenant phone number: ");
        String phone = scanner.nextLine();
        System.out.println("Enter new tenant email: ");
        String email = scanner.nextLine();
        tenant.setFullName(name);
        tenant.setDateOfBirth(date);
        tenant.setPhoneNumber(phone);
        tenant.setEmail(email);
        return true;
    }

    @Override
    public boolean remove() {
        for (Tenant tenant : db.getTenantsList()) {
            System.out.printf("%s %s\n", tenant.getId(), tenant.getFullName());
        }
        System.out.println("Enter tenant id: ");
        String id = scanner.nextLine();
        Tenant tenant = db.getTenantsList().stream().filter(o -> o.getId().equals(id)).findFirst().orElse(null);
        if (tenant == null) {
            System.out.println("Tenant not found");
            return false;
        }
        db.getTenantsList().remove(tenant);
        return true;
    }

    @Override
    public List<Tenant> get() {
        return db.getTenantsList();
    }
}
