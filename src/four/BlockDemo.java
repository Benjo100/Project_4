package four;

import javax.swing.*;
import java.util.Scanner;

/*
Pustim korisnika da unese u konzoli broj godina.
Program provjerava punoljetnost korisnika konzumirajuci njegov unos godina

 */
public class BlockDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj godina : ");
        int starostKorisnikaPrograma = new Scanner(System.in).nextInt();
        boolean uslovZaPunoljestvo = starostKorisnikaPrograma >= 18;
        if (uslovZaPunoljestvo) {
            System.out.println("Vi ste punoljetni");
        } else {
            System.out.println("Maloljetni ste ");


        }
    }}





