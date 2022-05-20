package pack;
import java.util.ArrayList;
import java.util.Scanner;

public class Student_list extends Department_list{
    int Std_id;
    String Std_name, Std_lname;
    String Dept_id ;
    int Age;
    float Marks;
    String Gender;
    public String show_std_data() {
        Scanner Sip = new Scanner(System.in);
        int arr_counter;
        ArrayList<Integer>s_id=new ArrayList<>();
        ArrayList<Integer>s_name=new ArrayList<>();
        ArrayList<Integer>s_dept=new ArrayList<>();
        System.out.println("Enter the no of records to be inserted");
        arr_counter = Sip.nextInt();
        Sip.nextLine();
        for (int i = 0; i < arr_counter; i++) {
            System.out.print("Enter Std_id: ");
        Std_id = Sip.nextInt();
        Sip.nextLine();
        System.out.print("Enter name: ");
        Std_name = Sip.nextLine();
        System.out.print("Enter Dept: ");
        Dept_id = Sip.nextLine();
        // Dept_id = (super.Dept_name);
        while(!Dept_id.equals("Comp") && !Dept_id.equals("law") && !Dept_id.equals("commers"))
        {
            System.out.println("please chose the correct dept Comp, law, Commers");
            Dept_id = Sip.nextLine();
        }
        System.out.print("Enter age: ");
        Age = Sip.nextInt();
        Sip.nextLine();
        while (Age < 18 || Age>100) {
            System.out.println("please type the correct age");
            Age = Sip.nextInt();
            Sip.nextLine();
        }
        System.out.print("Enter Gneder: ");
        Gender = Sip.nextLine();
        while (!Gender.equals("Male") && !Gender.equals("Female")) {
            System.out.println("please enter Male or Female");
            Gender = Sip.nextLine();
        }
        System.out.println("X------------------------------------------X \n");
        }
        System.out.println("Student id: "+s_id);
        System.out.println("Student Name: "+s_name);
        System.out.println("Student Dept: "+ s_dept);
        return Std_id + Std_name + Dept_id;
    }

    public String get_std_name(int Std_id) { // method with one parameters
        return Std_name;
    }

    public String get_std_name(int Std_id, String Std_name) { // method overloading with two parameters
        return Std_name + Std_id;
    }
}
