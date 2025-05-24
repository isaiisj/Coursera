/** TODO 11: Create the Teacher class with
 * these attributes (Name, date of birth,
 * date of appointment, subject, qualification
 * and salary) and constructor
 *  **/
public class Teacher extends Employee {
    private String subject;
    private String qualification;

    Teacher(String name, Date dateOfBirth, Date dateOfAppointment, String subject, String qualification) {
        this.name = name;
        this.dob = dateOfBirth;
        this.dateOfAppointment = dateOfAppointment;
        this.subject = subject;
        this.qualification = qualification;
    }

    /** TODO 12: Override the getDetails() method
     * in the Teacher class to print values of the
     * instance variables
     *  **/
    @Override
    void getDetails() {
        System.out.println("Name of Teacher: " + this.name);
        System.out.println("Date of Birth: " + this.dob.getDate());
        System.out.println("Date of Appointment: " + this.dateOfAppointment.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Qualifications: " + this.qualification);
        System.out.println("Salary: " + this.getSalary());
    }

    /** TODO 13: Implement the getSalary() and setSalary() methods
     * the abstract methods in the Employee class.
     *  **/
    @Override
    int getSalary() {
        return this.salary;
    }

    @Override
    void setSalary(int sal) {
        this.salary = sal;
    }
}
