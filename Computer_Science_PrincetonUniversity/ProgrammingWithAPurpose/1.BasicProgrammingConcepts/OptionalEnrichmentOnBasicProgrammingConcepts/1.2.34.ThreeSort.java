public class ThreeSort {
    public static void main(String[] args) {

        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int number3 = Integer.parseInt(args[2]);

        int max = Math.max(Math.max(number1, number2),number3);
        int min = Math.min(Math.min(number1, number2),number3);
        int middle = number1 + number2 + number3 - max - min;

        System.out.println("Min: " + min);
        System.out.println("Middle: " + middle);
        System.out.println("Max: " + max);
    }
}
