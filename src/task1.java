public class task1 {
    //Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    public static void main(String[] args) {
        //System.out.println(div(8, 0));
        //OutOfBounds();
        System.out.println(runTime(""));
    }

    // ArithmeticException
    public static int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return a / b;
    }

    // ArrayIndexOutOfBoundsException
    public static void OutOfBounds(){
        int[] arr = new int[5];
        System.out.println(arr[10]);
    }

    //RuntimeException
    public static String runTime(String str){
        if(str == ""){
            throw new RuntimeException("Пустая строка!");
        }
        return str;
    }
}