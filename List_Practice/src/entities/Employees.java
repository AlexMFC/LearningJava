
package entities;


public class Employees {
    private String name;
    private int id;
    private double salary;

    public Employees(String name, int id, double salary){
        this.setName(name);
        this.setId(id);
        this.setSalary(salary);
    }
    
    public void incSal(double increase){
        this.setSalary(this.getSalary() * (1+(increase/100)));
    }
    
    public void status(){
        System.out.println("Name: "  + this.getName() +
                "Id: " + this.getId() +
                "Salary: " + String.format("%.2f", this.getSalary()));
                
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
