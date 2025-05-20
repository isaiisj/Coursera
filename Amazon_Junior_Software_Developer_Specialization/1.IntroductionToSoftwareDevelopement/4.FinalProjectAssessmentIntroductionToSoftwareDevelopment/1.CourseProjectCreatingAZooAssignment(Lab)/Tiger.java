/** TODO 1: extend the class Animal to create a new
 * land based animal named "Tiger" which
 * extends Animal.
 * Extra properties of class "Tiger" are:
 * 1. number of stripes
 * 2. speed
 * 3. sound level of roar
 *
 **/
public class Tiger extends Animal implements Walk {
    private int numberOfStripes;
    private int speed;
    private String soundLevel;

    Tiger(String nameOfAnimal, int numberOfStripes, int speed, String soundLevel) {
        super(nameOfAnimal);
        this.numberOfStripes = numberOfStripes;
        this.speed = speed;
        this.soundLevel = soundLevel;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSoundLevelOfRoar() {
        return soundLevel;
    }

    public void setSoundLevelOfRoar(String soundLevelOfRoar) {
        this.soundLevel = soundLevel;
    }

    /** TODO 3: implement the unimplemented methods of
     *           "Eat" interface in the class
     *          "Tiger" class created in the TODO 1
     *          and also in the
     *          "Dolphin" class created in TODO 2.
     **/
    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }

    /** TODO 5: implement the "Walk" interface in
     *          "Tiger" class created in the TODO 1
     *          and in the  implementation of the
     *          "walking" method of the interface
     *          display -
     *          "Tiger: I am walking at the speed "
     *          and join the value of the variable "speed"
     *
     **/
    @Override
    public void walking() {
        System.out.println("I am walking at the speed " + speed + " mph");
    }
}
