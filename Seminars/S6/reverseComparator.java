import java.util.Comparator;

public class reverseComparator implements Comparator<Integer> {
    @Override
    public int compare (Integer i1, Integer i2){
        return i2.compareTo(i1);
    }
}
