/** TODO 1: Declare the abstract Person class
 * The class must contain:
 * The common minimum attributes name and dob(date of birth),
 * And the abstract void getDetails() method.
 * Ensure that dob is created as an object of the Date class.
 * Each subclass must also implement the getDetails() method.
 * **/
abstract class Person {
    String name;
    Date dob;

    abstract void getDetails();
}
