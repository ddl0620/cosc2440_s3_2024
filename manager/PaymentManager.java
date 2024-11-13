package manager;

import model.Payment;

import java.util.List;

public class PaymentManager implements ManagerInterface <Payment> {

    @Override
    public boolean add() {
        return false;
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
    public List<Payment> get() {
        return List.of();
    }
}
