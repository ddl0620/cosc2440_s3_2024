package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Tenant extends Person implements Serializable {
    private List<RentalAgreement> rentalAgreementsList;
    private List<Payment> paymentsList;

    public Tenant(String id, String fullName, LocalDate dateOfBirth, String phoneNumber, String email) {
        super(id, fullName, dateOfBirth, phoneNumber, email);
        this.rentalAgreementsList = new ArrayList<RentalAgreement>();
        this.paymentsList = new ArrayList<Payment>();
    }

    public List<RentalAgreement> getRentalAgreementsList() {
        return rentalAgreementsList;
    }

    public void setRentalAgreementsList(List<RentalAgreement> rentalAgreementsList) {
        this.rentalAgreementsList = rentalAgreementsList;
    }

    public List<Payment> getPaymentsList() {
        return paymentsList;
    }

    public void setPaymentsList(List<Payment> paymentsList) {
        this.paymentsList = paymentsList;
    }

    public void addPayment(Payment payment) {
        paymentsList.add(payment);
    }

    public void addRentalAgreement(RentalAgreement rentalAgreement) {
        rentalAgreementsList.add(rentalAgreement);
    }

    public void removePayment(Payment payment) {
        paymentsList.remove(payment);
    }

    public void removeRentalAgreement(RentalAgreement rentalAgreement) {
        rentalAgreementsList.remove(rentalAgreement);
    }

//    public void updatePayment(Payment payment) {
//        for (int i = 0; i < paymentsList.size(); i++) {
//            if (paymentsList.get(i).getPaymentId().equals(payment.getPaymentId())) {
//                paymentsList.set(i, payment);
//            }
//        }
//    }

    public void updateRentalAgreement(RentalAgreement rentalAgreement) {
        for (int i = 0; i < rentalAgreementsList.size(); i++) {
            if (rentalAgreementsList.get(i).getAgreementId().equals(rentalAgreement.getAgreementId())) {
                rentalAgreementsList.set(i, rentalAgreement);
            }
        }
    }


}
