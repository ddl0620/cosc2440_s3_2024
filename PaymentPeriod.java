public enum PaymentPeriod {
    DAILY("Daily"),
    WEEKLY("Weekly"),
    FORTNIGHTLY("Fortnightly"),
    MONTHLY("Monthly"),
    YEARLY("Yearly");

    private final String statusName;

    PaymentPeriod(String statusName) {
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
