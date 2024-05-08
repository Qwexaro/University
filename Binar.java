import java.util.Scanner;

public class Binar {
    public static void main(String[] args) {
        int x =  new Scanner(System.in).nextInt();

        int[] mas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = mas[0];
        int end = mas[mas.length-1];
        int mid = mas.length / 2; //index
        while(true) {

            if (x == mas[mid])
            {
                System.out.println("Мы нашли число " + mas[mid]);
                break;
            }
            else if (x < mas[mid])
            {
                end = mas[mid];
                mid = start + (end - start) / 2;

            }
            else if (x > mas[mid])
            {
                start = mas[start];
                start = start + (end - start) / 2;
            }


        }
        // s+(e-s)/2

    }
}


