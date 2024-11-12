import java.io.*;


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

            System.out.println(ra1.getHosts().get(0).getRentalAgreementsManaged().getFirst().getAgreementId());
            System.out.println(ra1.getHosts().get(1).getRentalAgreementsManaged().getFirst().getAgreementId());
            System.out.println(host1.getOwnersCollaborated().getFirst().getRentalAgreementsMade().getFirst().getHosts().get(1).getFullName());



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
