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
        return false;
    }

    @Override
    public boolean remove() {
        return false;
    }

    @Override
    public List<Tenant> get() {
        return List.of();
    }
}
