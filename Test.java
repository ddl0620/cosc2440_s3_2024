import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.io.ObjectOutputStream;
import model.*;

public class Test {

    public static void main(String[] args) {

        Owner owner1 = new Owner("abc123", "Alice Ada", LocalDate.of(1990, 6, 6), "0910123456", "aliceada@example.com");
        Owner owner2 = new Owner("def456", "Bob Brown", LocalDate.of(1985, 8, 15), "0922233445", "bobbrown@example.com");
        Owner owner3 = new Owner("ghi789", "Charlie Clark", LocalDate.of(1992, 12, 12), "0933344556", "charlieclark@example.com");
        Owner owner4 = new Owner("jkl012", "Daisy Duke", LocalDate.of(1988, 4, 25), "0944455667", "daisyduke@example.com");
        Owner owner5 = new Owner("mno345", "Edward Elric", LocalDate.of(1995, 10, 30), "0955566778", "edwardelric@example.com");

        Host host1 = new Host("pqr678", "Fiona Frost", LocalDate.of(1987, 3, 14), "0966677889", "fionafrost@example.com");
        Host host2 = new Host("stu901", "George Green", LocalDate.of(1991, 7, 22), "0977788990", "georgegreen@example.com");
        Host host3 = new Host("vwx234", "Hannah Hall", LocalDate.of(1984, 11, 18), "0988899001", "hannahhall@example.com");
        Host host4 = new Host("yzb567", "Ivan Iron", LocalDate.of(1993, 9, 5), "0999900112", "ivaniron@example.com");
        Host host5 = new Host("abc890", "Julia Jewel", LocalDate.of(1989, 5, 27), "0900011223", "juliajewel@example.com");

        Tenant tenant1 = new Tenant("tnt123", "Liam Lane", LocalDate.of(1992, 2, 3), "0911222333", "liamlane@example.com");
        Tenant tenant2 = new Tenant("tnt456", "Mia Moore", LocalDate.of(1988, 6, 19), "0922333444", "miamoore@example.com");
        Tenant tenant3 = new Tenant("tnt789", "Noah Neal", LocalDate.of(1995, 10, 11), "0933444555", "noahneal@example.com");
        Tenant tenant4 = new Tenant("tnt012", "Olivia Oak", LocalDate.of(1989, 12, 24), "0944555666", "oliviaoak@example.com");
        Tenant tenant5 = new Tenant("tnt345", "Pauline Page", LocalDate.of(1993, 4, 5), "0955666777", "paulinepage@example.com");


        ResidentialProperty property1 = new ResidentialProperty(
                "prop101",
                owner1,
                new Address("123 Main St", "Springfield", "CA", "90210", "112"),
                350000,
                2500.0,
                PropertyStatus.AVAILABLE,
                3,
                true,
                false
        );

        ResidentialProperty property2 = new ResidentialProperty(
                "prop102",
                owner2,
                new Address("456 Maple Ave", "Riverdale", "NY", "10001", "110"),
                450000,
                3000.0,
                PropertyStatus.AVAILABLE,
                4,
                true,
                true
        );

        ResidentialProperty property3 = new ResidentialProperty(
                "prop103",
                owner3,
                new Address("789 Oak Dr", "Hill Valley", "TX", "75001", "111"),
                500000,
                3500.0,
                PropertyStatus.AVAILABLE,
                5,
                false,
                true
        );

        ResidentialProperty property4 = new ResidentialProperty(
                "prop104",
                owner4,
                new Address("321 Pine St", "Twin Peaks", "WA", "98001", "115"),
                275000,
                2200.0,
                PropertyStatus.AVAILABLE,
                2,
                true,
                false
        );

        ResidentialProperty property5 = new ResidentialProperty(
                "prop105",
                owner5,
                new Address("654 Elm St", "Sunnydale", "CA", "90002", "0606"),
                375000,
                2800.0,
                PropertyStatus.AVAILABLE,
                3,
                false,
                true
        );


        CommercialProperty property6 = new CommercialProperty(
                "prop106",
                owner1,
                new Address("Hanoi", "Thanh Xuan", "Nhan Chinh", "Le Van Luong", "21/708"),
                88000,
                1788.99,
                PropertyStatus.AVAILABLE,
                "Culinary",
                12
        );

        List<Host> h1 = new ArrayList<>();
        h1.add(host1);
        h1.add(host2);

        List<Host> h2 = new ArrayList<>();
        h2.add(host1);
        h1.add(host3);

        List<Tenant> st1 = new ArrayList<>();
        st1.add(tenant2);
        st1.add(tenant3);

        List<Tenant> st2 = new ArrayList<>();
        st2.add(tenant1);
        st2.add(tenant3);

        RentalAgreement ra1 = new RentalAgreement(
                "ra001",
                owner1,
                h1,
                tenant1,
                st1,
                property1,
                PaymentPeriod.MONTHLY,
                LocalDate.of(2024, 12, 11),
                2999.99,
                RentalAgreementStatus.ACTIVE
        );


        RentalAgreement ra2 = new RentalAgreement(
                "ra002",
                owner1,
                h2,
                tenant2,
                st2,
                property6,
                PaymentPeriod.YEARLY,
                LocalDate.of(2024, 6, 6),
                3999.99,
                RentalAgreementStatus.ACTIVE
        );

        owner1.addHostsCollaborated(host1);
        owner1.addHostsCollaborated(host2);
        owner1.addHostsCollaborated(host3);
        owner1.addNewRentalAgreementMade(ra1);

        host1.addOwnersCollaborated(owner1);
        host1.addNewRentalAgreement(ra1);
        host1.addNewRentalAgreement(ra2);
        host1.addNewPropertyHosted(ra1.getPropertyLeased());
        host1.addNewPropertyHosted(ra2.getPropertyLeased());

        host2.addOwnersCollaborated(owner1);
        host2.addNewRentalAgreement(ra1);
        host2.addNewRentalAgreement(ra2);
        host2.addNewPropertyHosted(ra1.getPropertyLeased());
        host2.addNewPropertyHosted(ra2.getPropertyLeased());

        host3.addOwnersCollaborated(owner1);
        host3.addNewRentalAgreement(ra2);
        host3.addNewPropertyHosted(ra2.getPropertyLeased());

        tenant1.addRentalAgreement(ra1);
        tenant1.addRentalAgreement(ra2);

        tenant2.addRentalAgreement(ra1);
        tenant2.addRentalAgreement(ra2);

        tenant3.addRentalAgreement(ra1);
        tenant3.addRentalAgreement(ra2);

        property1.addHost(host1);
        property1.addHost(host2);
        property1.setStatus(PropertyStatus.RENTED);

        property6.addHost(host1);
        property6.addHost(host3);

        Database db = new Database();
        db.addOwnerToDatabase(owner1);
        db.addHostToDatabase(host1);
        db.addHostToDatabase(host2);
        db.addHostToDatabase(host3);
        db.addTenantToDatabase(tenant1);
        db.addTenantToDatabase(tenant2);
        db.addTenantToDatabase(tenant3);
        db.addResidentialPropertyToDatabase(property1);
        db.addCommercialPropertyToDatabase(property6);
        db.addRentalAgreementToDatabase(ra1);
        db.addRentalAgreementToDatabase(ra2);



        try {
            File file = new File("file.data");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream objos = new ObjectOutputStream(os);

//            objos.writeObject(owner1);
//            objos.writeObject(host1);
//            objos.writeObject(host2);
//            objos.writeObject(tenant1);
//            objos.writeObject(tenant2);
//            objos.writeObject(tenant3);
//            objos.writeObject(property1);
//            objos.writeObject(ra1);
            objos.writeObject(db);

            objos.flush();
            objos.close();

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}