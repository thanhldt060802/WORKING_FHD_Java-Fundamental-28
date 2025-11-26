import java.util.Comparator;

public class CompareComputerPrice implements Comparator<Computer> {

    @Override
    public int compare(Computer o1, Computer o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
    
}
