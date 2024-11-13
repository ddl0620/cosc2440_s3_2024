package model;

import manager.*;

public class ConsoleUI {
    public void printWelcomeMessage() {
        System.out.println("Welcome to Rental Manager Application");
    }

    public void printMainMenu() {
        System.out.println("Select an option: ");
        System.out.println("1. Manage Rental Agreements");
        System.out.println("2. Manage Owner");
        System.out.println("3. Manage Hosts");
        System.out.println("4. Manage Tenants");
        System.out.println("5. Manage Tenants' Payment");
        System.out.println("6 Manage Residential Properties");
        System.out.println("7. Manage Commercial Properties");
        System.out.println("8. Exit");
    }

    public void printOptions(ManagerInterface<?> managerInterface) {
        if (managerInterface instanceof RentalAgreementManager) {
            System.out.println("Select an option: ");
            System.out.println("1. Add Rental Agreement");
            System.out.println("2. Update Rental Agreement");
            System.out.println("3. Remove Rental Agreement");
            System.out.println("4. Get all Rental Agreement");
            System.out.println("5. Exit");
        }

        else if (managerInterface instanceof OwnerManager) {
            System.out.println("Select an option: ");
            System.out.println("1. Add Owner");
            System.out.println("2. Update Owner");
            System.out.println("3. Remove Owner");
            System.out.println("4. Get all Owner");
            System.out.println("5. Exit");
        }

        else if (managerInterface instanceof HostManager) {
            System.out.println("Select an option: ");
            System.out.println("1. Add Host");
            System.out.println("2. Update Host");
            System.out.println("3. Remove Host");
            System.out.println("4. Get all Host");
            System.out.println("5. Exit");
        }

        else if (managerInterface instanceof TenantManager) {
            System.out.println("Select an option: ");
            System.out.println("1. Add Tenant");
            System.out.println("2. Update Tenant");
            System.out.println("3. Remove Tenant");
            System.out.println("4. Get all Tenant");
            System.out.println("5. Exit");
        }

        else if (managerInterface instanceof ResidentialPropertyManager) {
            System.out.println("Select an option: ");
            System.out.println("1. Add Residential Property");
            System.out.println("2. Update Residential Property");
            System.out.println("3. Remove Residential Property");
            System.out.println("4. Get all Residential Property");
            System.out.println("5. Exit");
        }

        else if (managerInterface instanceof CommercialPropertyManager) {
            System.out.println("Select an option: ");
            System.out.println("1. Add Commercial Property");
            System.out.println("2. Update Commercial Property");
            System.out.println("3. Remove Commercial Property");
            System.out.println("4. Get all Commercial Property");
            System.out.println("5. Exit");
        }

        else if (managerInterface instanceof PaymentManager) {
            System.out.println("Select an option: ");
            System.out.println("1. Add Payment");
            System.out.println("2. Update Payment");
            System.out.println("3. Remove Payment");
            System.out.println("4. Get all Payment");
            System.out.println("5. Exit");
        }
    }
}
