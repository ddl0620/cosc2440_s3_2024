import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.concurrent.ConcurrentNavigableMap;

public class RentalAgreement implements Serializable {
    private String agreementId;
    private Owner owner;
    private List<Host> hosts;
    private Tenant mainTenant;
    private List<Tenant> subTenants;
    private Property propertyLeased;
    private PaymentPeriod paymentPeriod;
    private LocalDate contractDate;
    private double rentingFee;
    private RentalAgreementStatus agreementStatus;

    public RentalAgreement(String agreementId, Owner owner, List<Host> hosts, Tenant mainTenant, List<Tenant> subTenants, Property propertyLeased, PaymentPeriod paymentPeriod, LocalDate contractDate, double rentingFee, RentalAgreementStatus agreementStatus) {
        this.agreementId = agreementId;
        this.owner = owner;
        this.hosts = hosts;
        this.mainTenant = mainTenant;
        this.subTenants = subTenants;
        this.propertyLeased = propertyLeased;
        this.paymentPeriod = paymentPeriod;
        this.contractDate = contractDate;
        this.rentingFee = rentingFee;
        this.agreementStatus = agreementStatus;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Host> getHosts() {
        return hosts;
    }

    public void setHosts(List<Host> hosts) {
        this.hosts = hosts;
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
        return paymentPeriod.toString();
    }

    public void setPaymentPeriod(PaymentPeriod paymentPeriod) {
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
        return agreementStatus.toString();
    }

    public void setAgreementStatus(RentalAgreementStatus agreementStatus) {
        this.agreementStatus = agreementStatus;
    }
}
