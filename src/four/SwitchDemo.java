package four;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {

        System.out.println("Unesite redni broj danan u sedmici");

        int redniBrojDana = new Scanner(System.in).nextInt();
        if (redniBrojDana<1 || redniBrojDana>7){
            System.out.println("Nauci");
        }
        else{
            switch (redniBrojDana){
                case 1:
                    System.out.println("ponedjeljak");
                    break;
                case 2:
                    System.out.println("utorak");
                    break;
                case 3:
                    System.out.println("srijeda");
                    break;
                case 4:
                    System.out.println("cetvrtak");
                    break;
                case 5:
                    System.out.println("petak");
                    break;
                case 6:
                    System.out.println("subota");
                    break;
                case 7:
                    System.out.println("nedjelja");
                    break;
            }
        }
    }
}
