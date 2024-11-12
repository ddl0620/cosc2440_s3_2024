import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.io.Serializable;

public class Owner extends Person implements Serializable {
    private List<Property> propertiesOwned;
    private List<Host> hostsCollaborated;
    private List<RentalAgreement> rentalAgreementsMade;

    public Owner(String id, String fullName, LocalDate dateOfBirth, String phoneNumber, String email) {
        super(id, fullName, dateOfBirth, phoneNumber, email);
        List<Property> propertiesOwned = new ArrayList<Property>();
        hostsCollaborated = new ArrayList<Host>();
        rentalAgreementsMade = new ArrayList<RentalAgreement>();
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

    public void addHostsCollaborated(Host host) {
        this.hostsCollaborated.add(host);
    }
    public void addNewRentalAgreementMade(RentalAgreement ra) {
        this.rentalAgreementsMade.add(ra);
    }
}
