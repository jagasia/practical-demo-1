
public class Employee {

private int id;
    private String name;
    private String department;

     
    public void setAndDisplayEmployeeDetails(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;

        
        System.out.println("Employee Details:");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setAndDisplayEmployeeDetails(1, "mani", "Engineering");
    }
}

}
