import java.io.Serializable;
import java.util.List;

public class Database implements Serializable {
    private List<Owner> ownersList;
    private List<Host> hostsList;
    private List<Tenant> tenantsList;
    private List<ResidentialProperty> residentialPropertiesList;
    private List<CommercialProperty> commercialPropertiesList;
    private List<RentalAgreement> rentalAgreementsList;



}
