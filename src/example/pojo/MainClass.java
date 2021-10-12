package example.pojo;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Scanner;

    public class MainClass {
        public static void main(String[] args) {
            Employee emp = new Employee();
            //user Input
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Name :");
            String name = sc.nextLine();

            System.out.println("Enter your Designation :");
            String designation = sc.nextLine();

            System.out.println("Enter your Employee_ID :");
            int id = sc.nextInt();

            System.out.println("Enter your Salary :");
            float salary = sc.nextFloat();

            emp.setName(name);
            emp.setId(id);
            emp.setDesignation(designation);
            emp.setSalary(salary);

            System.out.println("------------------Inserted Values------------------");

            System.out.println("Employee Name: " + emp.getName());
            System.out.println("Employee ID: " + emp.getId());
            System.out.println("Employee Designation: " + emp.getDesignation());
            System.out.println("Employee Salary: " + emp.getSalary());

            System.out.println("------------Representation of ArrayList-------------");

            ArrayList<Object> emp_list = new ArrayList<Object>();
            emp_list.add(emp);
            System.out.println(emp_list);

            System.out.println("------------Object list to Json data-------------");

            Gson emp_json=new Gson();
            String ObjTojson =emp_json.toJson(emp);
            System.out.println(ObjTojson);

            System.out.println("--------------Json data to Object-----------------");

            Gson emp_obj=new Gson();
            Employee JsonToObj = emp_obj.fromJson(ObjTojson, Employee.class);
            System.out.println(JsonToObj.name);
            System.out.println(JsonToObj.designation);
            System.out.println(JsonToObj.id);
            System.out.println(JsonToObj.salary);
        }
    }