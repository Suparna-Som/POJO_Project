package example.pojo;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Scanner;

    public class MainClass {
        public static void main(String[] args) {
            Employee[] emp = new Employee[3];
            //user Input
            ArrayList<Object> emp_list = new ArrayList<Object>();
            Scanner sc = new Scanner(System.in);

            System.out.println("------------------Insert Values------------------");
                for (int i = 0; i < 3; i++) {
                    emp[i] = new Employee();

                    System.out.println("Enter your Name :");
                    String name = sc.nextLine();
                    emp[i].setName(name);


                    System.out.println("Enter your Designation :");
                    String designation = sc.nextLine();
                    emp[i].setDesignation(designation);


                    System.out.println("Enter your Employee_ID :");
                    int id = sc.nextInt();
                    emp[i].setId(id);


                    System.out.println("Enter your Salary :");
                    float salary = sc.nextFloat();
                    emp[i].setSalary(salary);


                    emp_list.add(emp[i]);

                    System.out.println("Data Inserted Successfully");


                    System.out.println("Employee_ID :"+emp[i].getId());
                    System.out.println("Employee_Name :"+emp[i].getName());
                    System.out.println("Employee_Designation :"+emp[i].getDesignation());
                    System.out.println("Employee_Salary :"+emp[i].getSalary());
                }

            System.out.println("------------Representation of ArrayList-------------");
            System.out.println("");

            System.out.println(emp_list);
            System.out.println("");

            System.out.println("------------Object list to Json data-------------");
            System.out.println("");

            Gson emp_json=new Gson();
            String ObjTojson =emp_json.toJson(emp);
            System.out.println(ObjTojson);

            System.out.println("--------------Json data to Object-----------------");
            System.out.println("");

            Gson emp_obj=new Gson();
            Employee[] JsonToObj = emp_obj.fromJson(ObjTojson, Employee[].class);
            System.out.println(JsonToObj[2]);
        }
    }
