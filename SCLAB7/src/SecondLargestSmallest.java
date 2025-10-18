import java.util.Scanner;

public class SecondLargestSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements that you want to check from: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements (one after another):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE || secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Not enough unique elements try diff values");
        } else {
            System.out.println("The Second largest number is: " + secondLargest);
            System.out.println("THe Second smallest number is: " + secondSmallest);
        }
    }
}