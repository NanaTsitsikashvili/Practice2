public class Task5 {
    public static void main(String[] args) {
        int x = 50;
        int y = 10;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        boolean XgreaterthanY= x > y;
        System.out.println("x მეტია y-ზე: " + XgreaterthanY);

        boolean XequalsY= x == y;
        System.out.println("x ტოლია Y-ის "+ XequalsY);

        boolean isLessOrEqual = x <= y;
        System.out.println("X ნაკლებია ან ტოლია " + isLessOrEqual);

        boolean shedareba1 = XgreaterthanY && XequalsY;
        boolean  shedareba2 = XgreaterthanY || isLessOrEqual;
        System.out.println("x მეტია ან ტოლი " +  shedareba1);
        System.out.println("x მეტია ან ნაკლებია ან ტოლია " + shedareba2);
    }
}
