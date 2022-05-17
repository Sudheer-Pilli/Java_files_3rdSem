
/* 
Name: Sudheer P
RollNo: 2147234
Programming lang: Java
*/
import java.util.Date;
import java.util.Scanner;

import pack.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class placment_java {
    public static void main(String[] args) throws ParseException {
        Student_list Std_list = new Student_list();
        Department_list Dp_list = new Department_list();
        Company_list Cmp_list = new Company_list();
        Placement_office Po_list = new Placement_office();
        Placement_coordinator Plo_list = new Placement_coordinator();
        Job Jb_list = new Job();
        Interview_schedule Is_lSchedulesecond = new Interview_schedule();
        Interview_progress Ip_list = new Interview_progress();        
        System.out.println("X------------------------------------------X");
        String cmd_line;
        try {
            cmd_line = (args[0]);
            if (cmd_line.equals(0)) {
                
            }
        } catch (Exception e) {
            //TODO: handle exception
            Scanner cmd_inp = new Scanner(System.in);
            System.out.println(" please enter your college name: ");
            cmd_line = cmd_inp.nextLine();
            System.out.println("welcome to " + cmd_line +" University placments");
        } finally{
            // Dp_list.getting_dept_info();
            Std_list.show_std_data();
            // Jb_list.eligible_or_not();
            if (Jb_list.eligible_or_not() == true) {
                // Applying for job
            System.out.println("Do you want to apply for job? ");
            Scanner apj = new Scanner(System.in);
            String apply = apj.nextLine();
            // Validating for the input

            while (!apply.equals("Yes") && !apply.equals("No")) {
                System.out.println("Please chose the correct input");
                apply = apj.nextLine();
    
            }
            if (apply.equals("No")) {
                System.out.println("Thank you");
    
            } else {
                Is_lSchedulesecond.Interview_schedule();
                
                // Job.eligible_or_not( job_role_res ,Std_list.Std_id);
                Is_lSchedulesecond.inverview_confirmation();
            }
            }
        } 
    }
}
