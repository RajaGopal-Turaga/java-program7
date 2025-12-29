public class EvenOdd {
    public static void main(String[] args) {
        int n = 7;

        if ((n & 1) == 1)
            System.out.println("Odd number");
        else
            System.out.println("Even number");
    }
}
