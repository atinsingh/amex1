public class Employee {
    private final String name ;
    private int empId;
    private double hourlyRate ;
    public static String companyName = "PRAGRA" ;

    public Employee(String name, int empId, double hourlyRate) {
        this.name = name;
        this.empId = empId;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", hourlyRate=" + hourlyRate +
                '}';
    }

    public static void printMe(){
        System.out.println("Hello I am from Employee class - static member" + companyName );
    }
}
