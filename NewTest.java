import java.io.*;
import java.util.List;
import model.*;

public class NewTest {
    public static void main(String[] args) {
        try {
            File file = new File("file.data");
            InputStream is = new FileInputStream(file);
            ObjectInputStream objis = new ObjectInputStream(is);

            Owner owner1 = (Owner) objis.readObject();

            Host host1 = (Host) objis.readObject();
            Host host2 = (Host) objis.readObject();

            Tenant tenant1 = (Tenant) objis.readObject();
            Tenant tenant2 = (Tenant) objis.readObject();
            Tenant tenant3 = (Tenant) objis.readObject();

            ResidentialProperty property1 = (ResidentialProperty) objis.readObject();

            RentalAgreement ra1 = (RentalAgreement) objis.readObject();

            Database db = (Database) objis.readObject();

            System.out.println(ra1.getHosts().get(0).getRentalAgreementsManaged().getFirst().getAgreementId());
            System.out.println(ra1.getHosts().get(1).getRentalAgreementsManaged().getFirst().getAgreementId());
            System.out.println(host1.getOwnersCollaborated().getFirst().getRentalAgreementsMade().getFirst().getHosts().get(1).getFullName());

            System.out.println(db.getResidentialPropertiesList().getFirst().getHosts().getFirst().getOwnersCollaborated().getFirst().getFullName());

            System.out.println();

            List<CommercialProperty> ps = db.getCommercialPropertiesList();
            for (CommercialProperty cp : ps) {
                System.out.println(cp.getBusinessType());
                System.out.println(cp.getPropertyId());
                System.out.println(cp.getOwner().getFullName());
                System.out.println();
                List<Host> thisHouseHosts = cp.getHosts();
                for (Host h : thisHouseHosts) {
                    System.out.println(h.getFullName());
                }
                System.out.println();
            }

            List<RentalAgreement> ras = db.getRentalAgreementsList();
            for (RentalAgreement ra : ras) {
                System.out.println(ra.getAgreementId());
            }

            RentalAgreement ra2 = db.getRentalAgreementsList().get(1);
            System.out.println(ra2.getMainTenant().getFullName());
            for (Tenant t : ra2.getSubTenants()) {
                System.out.println(t.getFullName());
            }


        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
