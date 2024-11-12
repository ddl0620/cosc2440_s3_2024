import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RentalAgreementCsvWriter {
    public static void writeRentalArgumentToCsv(List<RentalAgreement> rentalAgreements, String filePath) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.append("AgreementId, mainTenant, subTenants, propertyLeasedId, paymentPeriod, contractDate, rentingFee, agreementStatus\n");
            for (RentalAgreement ra : rentalAgreements) {
                writer.append(ra.getAgreementId()).append(",");
                writer.append(ra.getMainTenant().getFullName()).append(",");
                List<String> namesOfSubTenants = new ArrayList<>();
                for (Tenant t : ra.getSubTenants()) {
                    namesOfSubTenants.add(t.getFullName());
                }
                String namesOfSubTenantsString = String.join(";", namesOfSubTenants);
                writer.append(namesOfSubTenantsString).append(",");
                writer.append(ra.getPropertyLeased().getPropertyId()).append(",");
                writer.append(ra.getPaymentPeriod()).append(",");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                writer.append(ra.getContractDate().format(formatter)).append(",");
                writer.append(String.valueOf(ra.getRentingFee())).append(",");
                writer.append(ra.getAgreementStatus()).append("\n");

            }
        }
        catch (IOException e) {
            System.out.println("Error writing to .csv file");
            throw e;
        }
    }
}
