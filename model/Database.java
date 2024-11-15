package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.*;

public class Database implements Serializable {
    private List<Owner> ownersList = new ArrayList<>();
    private List<Host> hostsList = new ArrayList<>();
    private List<Tenant> tenantsList = new ArrayList<>();
    private List<ResidentialProperty> residentialPropertiesList = new ArrayList<>();
    private List<CommercialProperty> commercialPropertiesList = new ArrayList<>();
    private List<RentalAgreement> rentalAgreementsList = new ArrayList<>();
    private static Map<Integer, Integer> IdMap = new HashMap<>();

    public void addOwnerToDatabase(Owner owner) {
        this.ownersList.add(owner);
    }

    public void addHostToDatabase(Host host) {
        this.hostsList.add(host);
    }

    public void addTenantToDatabase(Tenant tenant) {
        this.tenantsList.add(tenant);
    }

    public void addResidentialPropertyToDatabase(ResidentialProperty residentialProperty) {
        this.residentialPropertiesList.add(residentialProperty);
    }

    public void addCommercialPropertyToDatabase(CommercialProperty commercialProperty) {
        this.commercialPropertiesList.add(commercialProperty);
    }

    public void addRentalAgreementToDatabase(RentalAgreement rentalAgreement) {
        this.rentalAgreementsList.add(rentalAgreement);
    }

    public void clearOwnerData() {
        this.ownersList.clear();
    }

    public void clearHostData() {
        this.hostsList.clear();
    }

    public void clearTenantData() {
        this.tenantsList.clear();
    }

    public List<Owner> getOwnersList() {
        return this.ownersList;
    }

    public List<Host> getHostsList() {
        return this.hostsList;
    }

    public List<Tenant> getTenantsList() {
        return this.tenantsList;
    }

    public List<ResidentialProperty> getResidentialPropertiesList() {
        return residentialPropertiesList;
    }

    public List<CommercialProperty> getCommercialPropertiesList() {
        return commercialPropertiesList;
    }

    public List<RentalAgreement> getRentalAgreementsList() {
        return rentalAgreementsList;
    }

    public static int generateId() {
        int id;
        do {
            id = Math.abs(new java.util.Random().nextInt() % 1000);
        } while (IdMap.containsKey(id) && IdMap.get(id) == 1);
        IdMap.put(id, 1);
        return id;
    }
}
