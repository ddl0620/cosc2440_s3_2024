import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        try {
            Tenant t1 = new Tenant("1", "John Doe", LocalDate.of(1990, 1, 1), "123456789", "jd@gmail.com");
            Tenant t2 = new Tenant("2", "Jane Cass", LocalDate.of(1995, 2, 2), "987654321", "jc@gmail.com");
            Tenant t3 = new Tenant("3", "Alice Bob", LocalDate.of(2000, 3, 3), "456789123", "ab@gmail.com");
            Tenant t4 = new Tenant("4", "Bob Alice", LocalDate.of(2005, 4, 4), "789123456", "ba@gmail.com");
            Tenant t5 = new Tenant("5", "Cass Jane", LocalDate.of(2010, 5, 5), "321654987", "cj@gmail.com");
            Tenant t6 = new Tenant("6", "Doe John", LocalDate.of(2015, 6, 6), "654987321", "dj@gmail.com");

            List<Tenant> coTenants1 = new ArrayList<Tenant>();
            coTenants1.add(t2);
            coTenants1.add(t3);

            List<Tenant> coTenants2 = new ArrayList<Tenant>();
            coTenants2.add(t5);
            coTenants2.add(t6);

            CommercialProperty cp1 = new CommercialProperty("1", new Address("Hanoi", "Ba Dinh", "Ngoc Ha", "Hoang Hoa Tham", "178/173"), 1000, 1000, PropertyStatus.AVAILABLE, "Business1", 10);
            ResidentalProperty rp1 = new ResidentalProperty("2", new Address("Hanoi", "Thanh Xuan", "Nhan Chinh", "Le Van Luong", "21"), 2000, 2000, PropertyStatus.AVAILABLE, 3, true, true);

            RentalAgreement ra1 = new RentalAgreement("1", t1, coTenants1, cp1, "Monthly", LocalDate.of(2020, 1, 1), 1000, "Active");
            RentalAgreement ra2 = new RentalAgreement("2", t4, coTenants2, rp1, "Monthly", LocalDate.of(2020, 2, 2), 2000, "Active");

            List<RentalAgreement> RentalAgreementsList = new ArrayList<>();
            RentalAgreementsList.add(ra1);
            RentalAgreementsList.add(ra2);


            String filePath = "test.csv";
            RentalAgreementCsvWriter.writeRentalArgumentToCsv(RentalAgreementsList, filePath);
        }
        catch (IOException e) {
            System.out.println("Error");
        }


    }
}
