import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ResidentialPropertyCsvWriter {
    public static void writeResidentialPropertyToCsv(List<ResidentialProperty> residentialProperties, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.append("ResidentialPropertyId, City, District, Ward, Street, houseNumber, price, area, status, numberOfBedrooms, garageAvailability, gardenAvailability\n");
            for (ResidentialProperty rp : residentialProperties) {
                writer.append(rp.getPropertyId()).append(",");
                writer.append(rp.getAddress().getCity()).append(",");
                writer.append(rp.getAddress().getDistrict()).append(",");
                writer.append(rp.getAddress().getWard()).append(",");
                writer.append(rp.getAddress().getStreet()).append(",");
                writer.append(rp.getAddress().getHouseNumber()).append(",");
                writer.append(String.valueOf(rp.getPrice())).append(",");
                writer.append(String.valueOf(rp.getArea())).append(",");
                writer.append(rp.getStatus().toString()).append(",");
                writer.append(String.valueOf(rp.getNumberOfBedrooms())).append(",");
                writer.append(String.valueOf(rp.isGarageAvailability())).append(",");
                writer.append(String.valueOf(rp.isGardenAvailability())).append("\n");
            }
        }
        catch (IOException e) {
            System.out.println("Error writing to .csv file");
//            throw e;
        }
    }
}
