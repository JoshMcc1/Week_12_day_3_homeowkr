package staff;

public abstract class Employee
{


  private static String name;
  private static String nINumber;
  private static double salary;

  public Employee(String name, String nINumber, double salary) {
    this.name = name;
    this.nINumber = nINumber;
    this.salary = salary;
  }

  public static String getName()
  {
    return name;
  }

  public static String getNINumber()
  {
    return nINumber;
  }

  public static double getSalary()
  {
    return salary;
  }

  public static void setName(String name)
  {
    if (name.equals(""))
    {
      System.out.println("Name cannot be empty");
    }
    else {
      Employee.name = name;
    }
  }

  public void raiseSalary(double salIncrease) {
    if (salIncrease < 0) {
      System.out.println("Negative number cannot be used to increase salary");
    }
    else {
      this.salary += salIncrease;
    }
  }

  public abstract double payBonus();
}
