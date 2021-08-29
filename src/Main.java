import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    //Класс без использования библеотеки Stream API
    public static void main(String[] args) {
        int[] intList = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        int size = 0;
        //Получим размер нового массива (все положительные и кратные 2 числа)
        for (int num : intList) {
            if (evenNumber(num)) {
               size++;
            }
        }
        //Создадим новый массив необходимого размера и запишем туда нужные значения
        int[] newList = new int[size];
        int massNum = 0;
        for (int num : intList) {
            if (evenNumber(num)) {
                newList[massNum] = num;
                massNum++;
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
            System.out.print(i + " ");
        }
    }

    //Проверка на чётное и положительное число
    private static boolean evenNumber(int num) {
        return num > 0 && num % 2 == 0;
    }
}
