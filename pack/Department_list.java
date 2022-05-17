package pack;
import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class Department_list implements placement_interface {
    String Dept_id;
    String Dept_name;
    String Dept_desc;
    String Dept_hod;
    int i = 0;
    // Student_list.College_name ="test";
    Scanner dept_scan = new Scanner(System.in);

    public void getting_dept_info() {
        System.out.println("Enter your Dept_name: ");
        Dept_name = dept_scan.nextLine();
        
        // Pair<String, String> pair_obj = Pair.fromArray(arr);
        // System.out.print(pair_obj);
        
    }
    
    
}
