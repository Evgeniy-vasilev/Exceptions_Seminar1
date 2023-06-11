/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.*/

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrays(new int[]{1, 2, 3,4}, new int[]{1, 2, 5, 4})));
    }

    public static int[] arrays(int[] a, int[] b) {
        int[] c = new int[a.length];

        if (a.length != b.length) {
            throw new RuntimeException("Массивы разной длины!");
        } else {
            for (int i = 0; i < a.length; i++) {
                if (b[i] == 0) {
                throw new RuntimeException("Во втором массиве присутствует элемент равный нулю!");
                }
                c[i] = a[i] / b[i];
            }
        }
        return c;
    }
}
