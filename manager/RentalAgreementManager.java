package manager;

import model.RentalAgreement;

import java.util.List;

public class RentalAgreementManager implements ManagerInterface <RentalAgreement> {

    @Override
    public boolean add() {

        return true;
    }

    @Override
    public boolean update() {
        return false;
    }

    @Override
    public boolean remove() {
        return false;
    }

    @Override
    public List<RentalAgreement> get() {
        return List.of();
    }
}
