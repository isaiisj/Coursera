public class UseStudent {

    public static void main(String[] args) {
        Student s = null;
        printStudent(s);

        Student[] students = new Student[2];
        Student s1 = new Student("Student1", 20);
        Student s2 = new Student("Student2", 21);
        students[0] = s1;
        students[1] = s2;
        listStudents(students);
        
        thisIsRisky();
    }

    private static void printStudent(Student student) {
        /** TODO 1: Handle the NullPointerException with a try block
         * **/
        try {
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
        } catch (NullPointerException e) {
            /** TODO 2: Once created the try block, create the code
            *  that specifies exactly what is being handled with catch block
            *  **/
            /** TODO 3: Pass to the catch the type of exception **/
            /** TODO 4: Print the exception message **/
            System.out.println(e.getMessage());
        }
    }

    private static void listStudents(Student[] students) {
        for (int i = 0; i <= students.length; i++) {
            /** TODO 5: Surround the array access code for the loop
             * in the listStudents method with a try  block
             *  **/
            try {
                System.out.println(students[i].getName() + " " + students[i].getAge());
            } catch (ArrayIndexOutOfBoundsException e) {
                /** TODO 6: Catch the exception and handle it **/
                /** TODO 7: Pass the type of the exception as ArrayIndexOutOfBoundsException **/
                /** TODO 8: Print the exception message by calling getMessage() **/
                System.out.println(e.getMessage());
            }
        }
    }

    /** TODO 9: Check the output looks as the following
     *
     * Cannot invoke "Student.getName()" because "student" is null
     * Student1 20
     * Student2 21
     * Index 2 out of bounds for length 2
     *  **/

    private static void thisIsRisky() {
        /** TODO 10: Fix the code using a try-catch block,
         * examine the output error message, and identify what
         * the problem is. Call this methos in the main method.
         * **/

        int priceTag = 50;
        int discount = 0;

        try {
            System.out.println("Total = " + (priceTag/discount));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

}
