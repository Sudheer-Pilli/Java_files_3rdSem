package pack;
import java.security.DrbgParameters.Reseed;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.Soundbank;

// import java.util.Scanner;

// class sum_a_b{
//     static int add1(int num1, int num2) {
//         return num1+num2;
//     }
// }
// public class workspace {
//     // public static void main (String[] args){
//     //     int i=1;
//     //     int j; boolean f;
//     //     while(i<=22)
//     //     {
//     //         for (j=1;j<=11;j++){
//     //             f=false;
//     //             System.out.print(" ");
//     //             if (i%3 == 0){
//     //                 f=true;
//     //                 System.out.print("Coza");
//     //             }
//     //             if (i%5 == 0){
//     //                 f=true;
//     //                 System.out.print("loza");
//     //             }
//     //             if (i%7 == 0){
//     //                 f=true;
//     //                 System.out.print("woza");
//     //             } 
//     //             if(f==false)
//     //             {
//     //                 System.out.print(i);
//     //             } i++;
//     //         }System.out.println();
//     //     }
//     // }

        
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter your first no: ");
//         // int num1 = sc.nextInt();
//         // System.out.println("Enter second no: ");
//         // int num2 = sc.nextInt();
//         // System.out.println("Addition of 2 nums: " + add(num1,num2));
//         sum_a_b s_ab = new sum_a_b();
//         s_ab.add1(10,10);

//     }
// }
// two string xesho graphically
// public class workspace{
//     public static void main(String[] args) {
//         String name1 = "Sudheer";
//         String name2 = "Sudheer";
//         System.out.println(name1.compareTo(name2));
//         // String newstring = name1.toCharArray();

//     }
//}
// on moblie you have multiple keys 
/* 
keypad digits
*/


public class workspace{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in); // using scanner to take user input
        System.out.println("Enter your Full name");
        String first_name = ip.nextLine(); // Name will be assigned to first_name
        String[] splitting_name = first_name.split(" ");  // splitting the name with space
        for( String result : splitting_name) 
            System.out.println(result.charAt(0)); // printing their initials        
    }
}