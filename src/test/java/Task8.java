public class Task8 {
    public static void main(String[] args) {
        int[] numbers = {15, 27, 8, 52, 48};


        int sum = 0;
        int max = numbers[0];


        for (int number : numbers) {
            sum += number;


            if (number > max) {
                max = number;}}
        System.out.println("ჯამი: " + sum);
        System.out.println("ყველაზე დიდი რიცხვი: " + max);
    }
}
