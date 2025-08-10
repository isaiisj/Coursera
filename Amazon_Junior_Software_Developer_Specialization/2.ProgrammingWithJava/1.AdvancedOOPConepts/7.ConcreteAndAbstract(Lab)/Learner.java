//TODO 12: make Learner class implement Assessment interface
public class Learner implements Assessments {
    //TODO 1: declare instance variables
    String name;
    double assignmentGrade;
    double quizGrade;
    Course course;
    double gradeScore;

    Learner(String name, double grade, Course course, double gradeScore) {
        //TODO 2: complete constructor
        this.name = name;
        this.assignmentGrade = grade;
        this.quizGrade = grade;
        this.course = course;
        this.gradeScore = gradeScore;
    }

    public String toString() {
        return "Name: " + this.name + " " + "Course: " + this.course.subject.title;
    }

    //TODO 13: override assignmentScore() method
    @Override
    public void assignmentScore(int marks) {
        this.assignmentGrade = marks;
    }

    //TODO 14: override quizScore() method
    @Override
    public void quizScore(int marks) {
        this.quizGrade = marks;
    }

    public double calculateGrade() {
      
        //TODO 17: calculate gradeScore as per the instructions above
        // Check if it's an online course by looking for "Online" in the course title
        boolean isOnline = this.course.subject.title.contains("Online");
        int maxAssignmentMarks = isOnline ? 30 : 100;
        int maxQuizMarks = isOnline ? 10 : 30;


        // Calculate assignment score out of 10
        double assignmentPercentage = (this.assignmentGrade * 10.0) / maxAssignmentMarks;

        // Calculate quiz score out of 10
        double quizPercentage = (this.quizGrade * 10.0) / maxQuizMarks;

        // Calculate average of assignment and quiz scores
        this.gradeScore = (assignmentPercentage + quizPercentage) / 2.0;

        return this.gradeScore;
    }

}
