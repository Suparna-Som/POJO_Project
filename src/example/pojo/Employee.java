package example.pojo;

public class Employee {

    public String name;
    public int id;
    public float salary;
    public String designation;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public float getSalary(){
        return salary;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }
    public String getDesignation(){
        return designation;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }
}
