import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Tenant extends Person{
    private List<Property> propertiesRented = new ArrayList<Property>();
    private List<RentalAgreement> rentalAgreementsList = new ArrayList<RentalAgreement>();

    public Tenant(String id, String fullName, LocalDate dateOfBirth, String phoneNumber, String email) {
        super(id, fullName, dateOfBirth, phoneNumber, email);
    }

    public List<Property> getPropertiesRented() {
        return propertiesRented;
    }

    public void setPropertiesRented(List<Property> propertiesRented) {
        this.propertiesRented = propertiesRented;
    }

    public List<RentalAgreement> getRentalAgreementsList() {
        return rentalAgreementsList;
    }

    public void setRentalAgreementsList(List<RentalAgreement> rentalAgreementsList) {
        this.rentalAgreementsList = rentalAgreementsList;
    }
}
