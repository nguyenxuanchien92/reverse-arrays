import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] arr;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        arr = new int[size];
        int i = 0;

        while (i < arr.length) {

            System.out.print("Enter number in array: ");
            int val = sc.nextInt();
            arr[i] = val;
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

    }
}
