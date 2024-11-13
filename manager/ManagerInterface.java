package manager;

import java.util.List;

public interface ManagerInterface<T> {
    boolean add();
    boolean update();
    boolean remove();
    List<T> get();
}