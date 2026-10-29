import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i<size; i++){
            for (int j = 1; j<=size; j++){
                System.out.println("Enter the element at index " + i + ": ");
                arr[i] = sc.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i<size; i++){
            for (int j = 1; j<=size; j++){
                System.out.print(arr[i] + " ");
               
            }
            System.out.println();
        }
    
    sc.close();
    }
}