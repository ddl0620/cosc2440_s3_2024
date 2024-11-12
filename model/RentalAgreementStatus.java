package model;

public enum RentalAgreementStatus {
    NEW("New"),
    ACTIVE("Active"),
    COMPLETED("Completed");

    private final String statusName;

    RentalAgreementStatus(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }

    @Override
    public String toString() {
        return statusName;
    }
}
