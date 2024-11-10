import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class RentalAgreement {
    private String agreementId;
    private Tenant mainTenant;
    private List<Tenant> subTenants;
    private Property propertyLeased;
    private String paymentPeriod;
    private LocalDate contractDate;
    private double rentingFee;
    private String agreementStatus;

    public RentalAgreement(String agreementId, Tenant mainTenant, List<Tenant> subTenants, Property propertyLeased, String paymentPeriod, LocalDate contractDate, double rentingFee, String agreementStatus) {
        this.agreementId = agreementId;
        this.mainTenant = mainTenant;
        this.subTenants = subTenants;
        this.propertyLeased = propertyLeased;
        this.paymentPeriod = paymentPeriod;
        this.contractDate = contractDate;
        this.rentingFee = rentingFee;
        this.agreementStatus = agreementStatus;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public Tenant getMainTenant() {
        return mainTenant;
    }

    public void setMainTenant(Tenant mainTenant) {
        this.mainTenant = mainTenant;
    }

    public List<Tenant> getSubTenants() {
        return subTenants;
    }

    public void setSubTenants(List<Tenant> subTenants) {
        this.subTenants = subTenants;
    }

    public Property getPropertyLeased() {
        return propertyLeased;
    }

    public void setPropertyLeased(Property propertyLeased) {
        this.propertyLeased = propertyLeased;
    }

    public String getPaymentPeriod() {
        return paymentPeriod;
    }

    public void setPaymentPeriod(String paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    public double getRentingFee() {
        return rentingFee;
    }

    public void setRentingFee(double rentingFee) {
        this.rentingFee = rentingFee;
    }

    public String getAgreementStatus() {
        return agreementStatus;
    }

    public void setAgreementStatus(String agreementStatus) {
        this.agreementStatus = agreementStatus;
    }
}
