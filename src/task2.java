/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя.*/

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrays(new int[]{1, 2, 3}, new int[]{1, 2, 3, 4})));
    }

    public static int[] arrays(int[] a, int[] b) {
        int[] c = new int[a.length];

        if (a.length > b.length || a.length < b.length) {
            throw new RuntimeException("Массивы разной длины");
        } else {
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] - b[i];
            }
        }
        return c;
    }
}
