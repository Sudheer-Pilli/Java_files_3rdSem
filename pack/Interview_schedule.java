package pack;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Interview_schedule extends Job  {
    int Sch_id;
    String Cmp_Name;
    int sch_time;
    int Job_id;
    Date date1 = null;
    

    public void Interview_schedule() throws ParseException { // method to schedule interview
        System.out.println("X------------------------------------------X");
        System.out.println("please select the select the company: ");
        System.out.println("Google, facebook, instagram");
        Scanner insch = new Scanner(System.in);
        Cmp_Name = insch.nextLine();
        while (!Cmp_Name.equals("Google") && !Cmp_Name.equals("facebook") && !Cmp_Name.equals("instagram")) {
            System.out.println("please enter the correct input");
            Cmp_Name = insch.nextLine();
        }

        eligble_role();
        
        Scanner input = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter check-in date (dd/mm/yy):");
        String cinput = input.nextLine();
        if (null != cinput && cinput.trim().length() > 0) {
            date1 = format.parse(cinput);
        }
        System.out.println("X------------------------------------------X \n");
    }

    public void inverview_confirmation() {
        System.out.println("X------------------------------------------X");
        System.out.println("Confirmation deatails of the interview");
        // System.out.println("Student Roll No: "+ Std_id);
        // System.out.println("Student Name: "+ Std_name);
        System.out.println("Company Name: " + Cmp_Name);
        
        System.out.println("Date: " + date1);
        System.out.println("X------------------------------------------X \n");
    }
}
