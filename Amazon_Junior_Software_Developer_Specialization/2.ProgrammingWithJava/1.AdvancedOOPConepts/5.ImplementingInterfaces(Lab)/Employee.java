//TODO 10: make the Employee class implement EmployeeInterface
class Employee extends Person implements EmployeeInterface {
    //TODO 11: declare basicPay as int attribute
    private int basicPay;
    Employee(String name, int age, int basicPay) {
        this.name = name;
        this.age=age;
        this.basicPay = basicPay;
    }
  
    @Override
    public double computeSalary() {
        double salary;
        //TODO 12: salary calculation logic goes here - basicPay+50 percent of basicPay
        salary = basicPay + (basicPay * 0.50);
        return salary;
    }
  
    @Override
    public double computeTax() {
        double tax;
        //TODO 13: tax is 10 percent of basicPay
        tax = basicPay * 0.10;
        return tax;
    }
  
    @Override
    public void getDetails() {
        super.getDetails();
        //TODO 14: add print statements to print basicPay, salary and tax
        System.out.println("Basic pay: " + this.basicPay);
        System.out.println("Salary: " + this.computeSalary());
        System.out.println("Tax: " + this.computeTax());
    }
}
