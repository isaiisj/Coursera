public class Main {
    public static void main(String[] args) {

        //set the car speed
        int carSpeed = 60 ;

      
        // when the problem says <60, what is not stated is that it should also be >=0 which we check
        if(carSpeed>=0 && carSpeed<16) {
            System.out.println("1st Gear.");
        }

        if(carSpeed>=17 && carSpeed<=32) {
            System.out.println("2nd Gear.");
        }

        if(carSpeed>=33 && carSpeed<=48) {
            System.out.println("3rd Gear.");
        }

        if(carSpeed>=49 && carSpeed<=64) {
            System.out.println("4th Gear.");
        }

        if(carSpeed>=65 && carSpeed<=80) {
            System.out.println("5th Gear.");
        }

        if(carSpeed > 80) {
            System.out.println("SLOW DOWN BOSS.");
        }

        //covering invalid speed
        if(carSpeed<0){
            System.out.println("Invalid Car Speed.");
        }
    }
}
