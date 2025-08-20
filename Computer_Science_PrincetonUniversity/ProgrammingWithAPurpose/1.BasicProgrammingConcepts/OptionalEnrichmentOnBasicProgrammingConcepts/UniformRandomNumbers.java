public class UniformRandomNumbers {
    public static void main(String[] args) {
      
        double randomNumber = Math.random();
        double rnadomNumber2 = Math.random();
        double rnadomNumber3 = Math.random();
        double rnadomNumber4 = Math.random();
        double rnadomNumber5 = Math.random();
        double average = (randomNumber + rnadomNumber2 + rnadomNumber3 + rnadomNumber4 + rnadomNumber5) / 5;

        System.out.println("Number 1: " + randomNumber);
        System.out.println("Number 2: " + rnadomNumber2);
        System.out.println("Number 3: " + rnadomNumber3);
        System.out.println("Number 5: " + rnadomNumber4);
        System.out.println("Number 5: " + rnadomNumber5 + "\n");

        System.out.println("Average value: " + average);

        double min = Math.min(Math.min(Math.min(Math.min(randomNumber,rnadomNumber2), rnadomNumber3), rnadomNumber4), rnadomNumber5);
        double max = Math.max(Math.max(Math.max(Math.max(randomNumber,rnadomNumber2), rnadomNumber3), rnadomNumber4), rnadomNumber5);


        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
