import java.util.Arrays;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
                 int[] array = createEvenArray(5);
                 System.out.println(Arrays.toString(reverseArray(array)));
             }

             private static int[] createEvenArray(int size) {
                 Scanner scanner = new Scanner(System.in);
                 int[] result = new int[size];
                 int next;
                 for (int i = 0; i < result.length; i++) {
                     do {
                         System.out.println("Podaj kolejną liczbę parzystą:");
                         next = scanner.nextInt();
                     }
                     while (isEven(next));
                     result[i] = next;
                     System.out.println("ok");
                 }
                 return result;
             }

             private static boolean isEven(int number) {
                 return number % 2 != 0;
                 }

             private static int[] reverseArray(int[] array) {
                 int[] reversed = new int[array.length];
                 int j = 0;
                 for (int i = (array.length-1); i > -1; i--) {
                     reversed[j] = array[i];
                     j++;
                 }
                 return reversed;
             }
         }