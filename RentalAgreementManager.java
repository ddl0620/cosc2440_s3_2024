import java.util.List;

public interface RentalAgreementManager {
    boolean createRentalAgreement(RentalAgreement rentalAgreement);
    boolean updateRentalAgreement(RentalAgreement rentalAgreement);
    List<RentalAgreement> getAllRentalAgreements();
    RentalAgreement getRentalAgreementById(String agreementId);
    List<RentalAgreement> getRentalAgreementsByOwner(String ownerId);
    List<RentalAgreement> getRentalAgreementsByHost(String hostId);
}
