package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
    	Scanner sin=new Scanner(System.in);
    	int size=sin.nextInt();
        int[] numbers=new int[size];
        for(int i=0;i<size;i++)
        {
        	numbers[i]=sin.nextInt();
        }

        Arrays.sort(numbers);

        int largest = numbers[numbers.length - 1];

        int secondLargest = Integer.MIN_VALUE;
        for (int i = numbers.length - 2; i >= 0; i--) {
            if (numbers[i] != largest) {
                secondLargest = numbers[i];
                break;
            }
        }

        System.out.println("Largest number: " + largest);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest number: " + secondLargest);
        } else {
            System.out.println("There is no second largest number (all elements might be equal).");
        }
    }
}
