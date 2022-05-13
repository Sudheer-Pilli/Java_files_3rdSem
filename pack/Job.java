package pack;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Job {
    
    public final AtomicInteger count = new AtomicInteger(0);
    int job_id  = 101;
    int job_appl_no;
    int Cmp_id;
    public String job_role ="";
    int Std_id;
    float Std_marks;
    boolean check;

    public Boolean eligible_or_not() {
        System.out.println("X------------------------------------------X");
        System.out.println("check if you are eligble for the job or not ");
        Scanner jip = new Scanner(System.in);
        System.out.print("Please enter your marks: ");
        Std_marks = jip.nextFloat();
        while (Std_marks < 0 || Std_marks >= 100) {
            System.out.print("Please enter your marks (0-100): ");
            Std_marks = jip.nextFloat();
        }
        if (Std_marks >= 80) {  
            check = true;

        } else {
            check = false;
            System.out.println("you are not eligible Sorry!!");
        }
        System.out.println("X------------------------------------------X \n");
        return check;
    }

    public void eligble_role() {
        // System.out.println("Welcome to check if you are eligble for the job or not
        // overriding ");
        // job_id = count.incrementAndGet();
        job_appl_no = count.incrementAndGet();
        System.out.println("X------------------------------------------X");
        Scanner apj = new Scanner(System.in);
        while (!job_role.equals("DA") && !job_role.equals("AI")) {
            System.out.println("Please chose the jobrole, DA or AI");
            job_role = apj.nextLine();
            // System.out.println("You have sucessfully applied for " + job_role);
        }
        // System.out.println("X------------------------------------------X \n");
    }
}
