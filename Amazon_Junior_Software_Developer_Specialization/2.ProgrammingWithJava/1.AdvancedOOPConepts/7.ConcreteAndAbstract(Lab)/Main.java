import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        //TODO 8: declare and initialize the object of ClassroomCourse class
        Subject subject = new Subject("Electronics",5.0);
        ClassroomCourse classroomCourse = new ClassroomCourse(subject,"Mike",2,
                "LakeSide", "two");
      
        //TODO 9: declare and initialize the Learner object
        Learner learner = new Learner("Donald", 80,classroomCourse,80);
      
        //TODO 18: display course list and accept user choice
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your course: ");
        System.out.println("1. Java");
        System.out.println("2. Java Online");
        System.out.println("3. JavaScript");
        System.out.println("4. JavaScript Online");
        int choice = scanner.nextInt();
      
        //TODO 19: initialize object of chose course
        //TODO 20: accept user input for learner's name
        //TODO 21: call assignmentScore() method and quizScore() methods
        //TODO 22: call assignmentScore() method. Display the result as described
        switch (choice) {
            case 1:
                Subject subjectJava = new Subject("Java",5);
                ClassroomCourse classroomCourse1 = new ClassroomCourse(subjectJava,"Mike",
                        4,"Pildoras informaticas","Introduction");
                System.out.println("Introduce learner name: ");
                String name = scanner.nextLine();
                System.out.println("Enter name: ");
                scanner.nextLine();
                Learner learner1 = new Learner(name,0, classroomCourse1,0);
                System.out.println("Enter assignment marks (max 100 for classroom course, 30 for online course)");
                int assignmentMarks1 = scanner.nextInt();
                learner1.assignmentScore(assignmentMarks1);
                System.out.println("Enter quiz marks (max 30 for classroom course, 10 for online course)");
                int quizMarks1 = scanner.nextInt();
                learner1.quizScore(quizMarks1);
                double grade1 = learner1.calculateGrade();
                System.out.println("Grade score: " + grade1);
                if (grade1 >= 5) {
                    System.out.println("Congratulations " + name + ". You have successfully passed the Java course.");
                } else {
                    System.out.println(name + " has completed the Java course.");
                }
                break;

            case 2:
                Subject subjectJavaOnline = new Subject("Java Online",5);
                OnlineCourse onlineCourse1 = new OnlineCourse(subjectJavaOnline,"Ann code",
                        2,5,3);
                System.out.println("Introduce learner name: ");
                String name2 = scanner.nextLine();
                scanner.nextLine();
                Learner learner2 = new Learner(name2,40, onlineCourse1,80);
                System.out.println("Enter assignment marks (max 100 for classroom course, 30 for online course)");
                int assignmentMarks2 = scanner.nextInt();
                learner2.assignmentScore(assignmentMarks2);
                System.out.println("Enter quiz marks (max 30 for classroom course, 10 for online course)");
                int quizMarks2 = scanner.nextInt();
                learner2.quizScore(quizMarks2);
                double grade2 = learner2.calculateGrade();
                System.out.println("Grade score: " + grade2);
                if (grade2 >= 5) {
                    System.out.println("Congratulations " + name2 + ". You have successfully passed the Java Online course.");
                } else {
                    System.out.println(name2 + " has completed the Java Online course.");
                }
                break;

            case 3:
                Subject subjectJavaScript = new Subject("JavaScript",5);
                ClassroomCourse classroomCourse2 = new ClassroomCourse(subjectJavaScript,"Mike",
                        4,"Pildoras informaticas","Introduction");
                System.out.println("Introduce learner name: ");
                String name3 = scanner.nextLine();
                scanner.nextLine();
                Learner learner3 = new Learner(name3,40, classroomCourse2,80);
                System.out.println("Enter assignment marks (max 100 for classroom course, 30 for online course)");
                int assignmentMarks3 = scanner.nextInt();
                learner3.assignmentScore(assignmentMarks3);
                System.out.println("Enter quiz marks (max 30 for classroom course, 10 for online course)");
                int quizMarks3 = scanner.nextInt();
                learner3.quizScore(quizMarks3);
                double grade3 = learner3.calculateGrade();
                System.out.println("Grade score: " + grade3);
                if (grade3 >= 5) {
                    System.out.println("Congratulations " + name3 + ". You have successfully passed the Java Online course.");
                } else {
                    System.out.println(name3 + " has completed the Java Online course.");
                }
                break;

            case 4:
                Subject subjectJavaScriptOnline = new Subject("JavaScript Online",5);
                OnlineCourse onlineCourse2 = new OnlineCourse(subjectJavaScriptOnline,"Ann code",
                        2,5,3);
                System.out.println("Introduce learner name: ");
                String name4 = scanner.nextLine();
                scanner.nextLine();
                Learner learner4 = new Learner(name4,40, onlineCourse2,80);
                System.out.println("Enter assignment marks (max 100 for classroom course, 30 for online course)");
                int assignmentMarks4 = scanner.nextInt();
                learner4.assignmentScore(assignmentMarks4);
                System.out.println("Enter quiz marks (max 30 for classroom course, 10 for online course)");
                int quizMarks4 = scanner.nextInt();
                learner4.quizScore(quizMarks4);
                double grade4 = learner4.calculateGrade();
                System.out.println("Grade score: " + grade4);
                if (grade4 >= 5) {
                    System.out.println("Congratulations " + name4 + ". You have successfully passed the Java Online course.");
                } else {
                    System.out.println(name4 + " has completed the Java Online course.");
                }
                break;

            default:
                System.out.println("Invalid option");
        }

    }
}
