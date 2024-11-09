import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Owner extends Person {
    private List<Property> propertiesOwned = new ArrayList<Property>();
    private List<Host> hostsCollaborated = new ArrayList<Host>();
    private List<RentalAgreement> rentalAgreementsMade = new ArrayList<RentalAgreement>();

    public Owner(String id, String fullName, LocalDate dateOfBirth, String phoneNumber, String email) {
        super(id, fullName, dateOfBirth, phoneNumber, email);
    }

    public List<Property> getPropertiesOwned() {
        return propertiesOwned;
    }

    public void setPropertiesOwned(List<Property> propertiesOwned) {
        this.propertiesOwned = propertiesOwned;
    }

    public List<Host> getHostsCollaborated() {
        return hostsCollaborated;
    }

    public void setHostsCollaborated(List<Host> hostsCollaborated) {
        this.hostsCollaborated = hostsCollaborated;
    }

    public List<RentalAgreement> getRentalAgreementsMade() {
        return rentalAgreementsMade;
    }

    public void setRentalAgreementsMade(List<RentalAgreement> rentalAgreementsMade) {
        this.rentalAgreementsMade = rentalAgreementsMade;
    }
}
