public class Employee {
    private String name;
    private double salary,raise;
    public Employee(String employee_name,double currentsalary)
    {
        name = employee_name;
        salary = currentsalary;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public void raiseSalary(double byPercent)
    {
        raise =((salary * byPercent)/100);
        salary=salary+raise;
    }
}
