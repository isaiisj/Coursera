/** TODO 14: Inside the main() method
 * create three instances of Date:
 * The date of birth of each student as dobOfStudent.
 * The date of birth of each teacher as dobOfTeacher.
 * And the date of appointment of each teacher as dateOfAppointment of teacher.
 *  **/
public class Main {
    public static void main(String[] args) {
        Date dobOfStudent = new Date(1, 1, 2005); //dob of student
        Date dobOfTeacher = new Date(10, 10, 1995); //dob of teacher
        Date dobOfAppointment = new Date(1, 4, 2024); //dateOfAppointment of teacher

        /** TODO 15: Declare a ner Teacher object as follows:
         * Name: Madhavan
         * Date of Birth: date2
         * Date of Appointment: date3
         * Qualification: MTech
         * Subject: Electronics
         * **/
        Teacher teacher = new Teacher("Madhavan",dobOfTeacher,dobOfAppointment,"MTech","Electronics");

        /** TODO 16: Declare a new Student object as follows:
         * Name: Belinda
         * Date of birth: date1
         * Teacher: teacher
         * Subject: Electronics
         * **/
        Student student = new Student("Belinda", dobOfStudent,teacher,"Electronics");

        /** TODO 17: Call setSalary() and assign a value of 50000 to the salary variable **/
        teacher.setSalary(50000);

        /** TODO 18: Call the getDetails() method for the teacher and student classes
         * to print the information of the teacher and the student
         *  **/
        teacher.getDetails();
        student.getDetails();

    }
}
