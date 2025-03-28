public class Main {
    public static void main(String[] args) {

        //declare the variable for the marks
        int marks1, marks2, marks3;

        //set the marks
        marks1 =85;
        marks2 =85;
        marks3 =85;

        //calculate the average
        int average = (marks1 + marks2 + marks3)/3;

        // when the problem says <60, what is not stated is that it should also be >=0 which we check
        if(average>=0 && average<60) {
            System.out.println("Failing.");
        }

        if(average>=60 && average<=69) {
            System.out.println("Below Average.");
        }

        if(average>=70 && average<=79) {
            System.out.println("Average.");
        }

        if(average>=80 && average<=89) {
            System.out.println("Good.");
        }

        if(average>=90 && average<=100) {
            System.out.println("Excellent.");
        }

        //covering invalid marks
        if(average<0 || average > 100){
            System.out.println("Invalid Marks.");
        }
    }
}
