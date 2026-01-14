import java.util.Scanner;

public class reverse {

    // Function to reverse the array
    static void reverse(float[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            float temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        float[] arr = new float[n];

        System.out.println("Enter the floating point values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }

        // Call reverse function
        reverse(arr);

        System.out.println("Reversed Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
