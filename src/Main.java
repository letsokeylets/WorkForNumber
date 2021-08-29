import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    //Класс без использования библеотеки Stream API
    public static void main(String[] args) {
        //Получим новый массив только с положительными числами кратными 2
        int[] intList = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        int[] newList = new int[intList.length];
        for (int i = 0; i < intList.length; i++) {
            int number = intList[i];
            if (number > 0 && number % 2 == 0) {
                newList[i] = number;
            }
        }
        //Отсортируем полученный массив по возрастанию
        for (int i = 0; i < newList.length; i++) {
            for (int j = 0; j < newList.length-1; j++) {
                int number = newList[i];
                if (number < newList[j]) {
                    newList[i] = newList[j];
                    newList[j] = number;
                }
            }
        }
        //Вывод на экран отсортированного массива, убрав лишние элементы массива (нули)
        for (int i : newList) {
            if (i != 0) System.out.print(i + " ");
        }
    }
}
