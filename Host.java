import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Host extends Person{
    private List<Property> propertiesHosted = new ArrayList<Property>();
    private List<Owner> ownersCollaborated = new ArrayList<Owner>();
    private List<RentalAgreement> rentalAgreementsManaged = new ArrayList<RentalAgreement>();

    public Host(String id, String fullName, LocalDate dateOfBirth, String phoneNumber, String email) {
        super(id, fullName, dateOfBirth, phoneNumber, email);
    }

    public List<Property> getPropertiesHosted() {
        return propertiesHosted;
    }

    public void setPropertiesHosted(List<Property> propertiesHosted) {
        this.propertiesHosted = propertiesHosted;
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
}
