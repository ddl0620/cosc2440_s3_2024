package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Database implements Serializable {
    private List<Owner> ownersList = new ArrayList<>();
    private List<Host> hostsList = new ArrayList<>();
    private List<Tenant> tenantsList = new ArrayList<>();
    private List<ResidentialProperty> residentialPropertiesList = new ArrayList<>();
    private List<CommercialProperty> commercialPropertiesList = new ArrayList<>();
    private List<RentalAgreement> rentalAgreementsList = new ArrayList<>();

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
        return ownersList;
    }

    public List<Host> getHostsList() {
        return hostsList;
    }

    public List<Tenant> getTenantsList() {
        return tenantsList;
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
}
