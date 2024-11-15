package model;
import manager.*;
import java.io.*;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

public class Application {
    private static ManagerInterface<?> managerInterface;

    private Database loadDatabase() {
        Database db = null;
        File file = new File("database.data");
        if (file.exists()) {
            try {
                InputStream is = new FileInputStream(file);
                ObjectInputStream objis = new ObjectInputStream(is);
                db = (Database) objis.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            db = new Database();
        }
        return db;
    }

    private void saveDatabase(Database db) {
        try {
            File file = new File("database.data");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream objos = new ObjectOutputStream(os);
            objos.writeObject(db);
            objos.flush();
            objos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void options(int opt) {
        if (opt == 1) {
            managerInterface.add();
        } else if (opt == 2) {
            managerInterface.update();
        } else if (opt == 3) {
            managerInterface.remove();
        } else if (opt == 4) {
            for (Object obj : managerInterface.get()) {
                System.out.println(obj.toString());
            }
        }
    }

    public void run() {

        ConsoleUI consoleUI = new ConsoleUI();
        Database db = loadDatabase();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            consoleUI.printMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    managerInterface = new RentalAgreementManager();
                    consoleUI.printOptions(managerInterface);
                    options(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 2:
                    managerInterface = new OwnerManager(db);
                    consoleUI.printOptions(managerInterface);
                    options(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 3:
                    managerInterface = new HostManager(db);
                    consoleUI.printOptions(managerInterface);
                    options(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 4:
                    managerInterface = new TenantManager(db);
                    consoleUI.printOptions(managerInterface);
                    options(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 5:
                    managerInterface = new PaymentManager();
                    consoleUI.printOptions(managerInterface);
                    options(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 6:
                    managerInterface = new ResidentialPropertyManager(db);
                    consoleUI.printOptions(managerInterface);
                    options(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 7:
                    managerInterface = new CommercialPropertyManager(db);
                    consoleUI.printOptions(managerInterface);
                    options(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 8:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        saveDatabase(db);
        scanner.close();
    }
}
