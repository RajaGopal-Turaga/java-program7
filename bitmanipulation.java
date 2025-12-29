import java.util.*;

class bitmanipulation {
    public static void main(String[] args) {
        System.out.println("enter n value:");
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        if ((n & 1) == 1) {
            System.out.println("odd");
        } else
            System.out.println("even");
        sin.close();
    }
}