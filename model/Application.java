package model;
import manager.*;
import java.util.Scanner;

public class Application {
    private static ManagerInterface<?> managerInterface;
    ConsoleUI consoleUI = new ConsoleUI();
    Database db = new Database();

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
                    managerInterface = new CommercialPropertyManager();
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
        scanner.close();
    }
}
