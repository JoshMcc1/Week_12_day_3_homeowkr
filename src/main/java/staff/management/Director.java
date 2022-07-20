package staff.management;

import staff.Employee;

public class Director extends Manager
{
  private static  double budget;

  public Director(String name, String nINumber, double salary, String deptName, double budget)
  {
    super(name, nINumber, salary, deptName);
    this.budget = budget;
  }

  public static double getBudget()
  {
    return budget;
  }

  @Override
  public double payBonus() {
    return Employee.getSalary() * 0.02;
  }
}
