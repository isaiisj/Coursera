// TODO 13: Create a new class named Latte
// TODO 14: inherit from Coffee using the extends keyword
public class Latte extends Coffee{
    // TODO 15: declare two attributes to store the milk type and syrup flavor (String)
    // milkType and syrupFlavor
    String milkType;
    String syrupFlavor;

    // TODO 16: constructor to initialize all attributes
    Latte(String name, String roast, double price, String milkType, String syrupFlavor){
        // Todo 17: use super to call the Coffe constructor
        super(name,roast,price);
        // TODO 18: Initialize milkType and syrupFlavor using this
        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }

    // TODO 19: define a method to print the details of milk type ans syrup flavor along with the
    // total bill
    public void printLatteDetails(){
        System.out.println("You asked for a " + syrupFlavor + " flavor Latte with " + milkType + " milk");
        System.out.println("Your total bill is $" + price);
    }
}
