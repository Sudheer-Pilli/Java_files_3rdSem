package pack;
import java.security.DrbgParameters.Reseed;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.Soundbank;

import java.util.Scanner;




public class workspace{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        while(N <=1 | N>=100){
             N = scanner.nextInt();
        }

        if(N % 2 == 0){
            if (N >= 2 & N <=5) {
                System.out.println("Not Weird");
            }
            if (N >= 6 & N <=20) {
                System.out.println("Weird");
            }
            if (N > 20){
                System.out.println("Not Weird");
            }
        }else{
            System.out.println("Weird");
        }
        // Complete this line
        // Complete this line

        // Complete this line
        // Complete this line
    }
}