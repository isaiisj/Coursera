/** TODO 9: create a class "Penguin" from the "Animal" class **/
public class Penguin extends Animal implements Walk,Swim{
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    Penguin(String nameOfAnimal, boolean isSwimming, int walkSpeed, int swimSpeed) {
        super(nameOfAnimal);
    }

    @Override
    public void eatingFood() {
        System.out.println("Penguin: I'm eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }

    @Override
    public void walking() {
        System.out.println("I am walking at the speed of " + walkSpeed + " mph");
    }

    @Override
    public void swimming() {
        System.out.println("I am swimming at the speed of " + swimSpeed + " nautical miles per hour");
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }
}
