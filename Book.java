import java.util.*;

public interface Book {
    public TreeSet<Integer> getNumbers(String name);
    public TreeSet<String> getNames(Integer number);
    public void addEntry(String name, Integer Number);
}
