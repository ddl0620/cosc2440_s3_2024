package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Host extends Person implements Serializable {
    private List<Property> propertiesHosted;
    private List<Owner> ownersCollaborated;
    private List<RentalAgreement> rentalAgreementsManaged;

    public Host(String id, String fullName, LocalDate dateOfBirth, String phoneNumber, String email) {
        super(id, fullName, dateOfBirth, phoneNumber, email);
        propertiesHosted = new ArrayList<Property>();
        ownersCollaborated = new ArrayList<Owner>();
        rentalAgreementsManaged = new ArrayList<RentalAgreement>();
    }

    public List<Property> getPropertiesHosted() {
        return propertiesHosted;
    }

    public void setPropertiesHosted(List<Property> propertiesHosted) {
        this.propertiesHosted = propertiesHosted;
    }

    public void addNewPropertyHosted(Property p1) {
        this.propertiesHosted.add(p1);
    }

    public List<Owner> getOwnersCollaborated() {
        return ownersCollaborated;
    }

    public void setOwnersCollaborated(List<Owner> ownersCollaborated) {
        this.ownersCollaborated = ownersCollaborated;
    }

    public List<RentalAgreement> getRentalAgreementsManaged() {
        return rentalAgreementsManaged;
    }

    public void setRentalAgreementsManaged(List<RentalAgreement> rentalAgreementsManaged) {
        this.rentalAgreementsManaged = rentalAgreementsManaged;
    }

    public void addNewRentalAgreement(RentalAgreement ra) {
        this.rentalAgreementsManaged.add(ra);
    }

    public void removeRentalAgreementById(String Id) {
        this.rentalAgreementsManaged.removeIf(ra -> ra.getAgreementId().equals(Id));
    }

    public void addOwnersCollaborated(Owner owner) {
        this.ownersCollaborated.add(owner);
    }

}
