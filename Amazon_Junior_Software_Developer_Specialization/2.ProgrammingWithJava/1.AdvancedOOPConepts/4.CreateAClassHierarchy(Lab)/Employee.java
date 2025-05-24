/** TODO 8: Declare an abstract Employee
 * class as an extension of the Person class
 *  **/
abstract class Employee extends Person {
    /** TODO 9: Include two additional attributes
     * dateOfAppointment and salary
     *  **/
    Date dateOfAppointment;
    int salary;

    /** TODO 10: Include two abstract getter and setter methods
     * for salary as getSalary() and setSalary(). The
     * salary must also be returned as an integer value
     *  **/
    abstract void setSalary(int sal);
    abstract int getSalary();
}
