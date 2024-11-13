package manager;

import model.Property;

import java.util.List;

public class ResidentialPropertyManager implements ManagerInterface<Property> {

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
    public List<Property> get() {
        return List.of();
    }
}
