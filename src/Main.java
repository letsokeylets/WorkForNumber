import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    //Класс без использования библеотеки Stream API
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();
        for (Integer value : intList) {
            if (value > 0 && value % 2 == 0) {
                newList.add(value);
            }
        }
        newList.sort(Comparator.naturalOrder());
        System.out.println(newList);
    }
}
