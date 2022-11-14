package four;

import java.util.Scanner;

/*
*Profesor treba da se fokusira na analivu vaseg ispita i procjenu broja bodova
* Program treba na osnovu broja bodova da profi izbaci ocjenu

 */
public class ifElseDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj bodova: ");

        int brojBodova = new Scanner(System.in).nextInt();
        char ocjena = 0;
        if (brojBodova>=90){
            ocjena= 'A';

        } else if (brojBodova>=80) {
            ocjena = 'B';

        } else if (brojBodova>=70) {
            ocjena = 'C';

        }
        System.out.println("ocjena : " + ocjena);

    }
}
