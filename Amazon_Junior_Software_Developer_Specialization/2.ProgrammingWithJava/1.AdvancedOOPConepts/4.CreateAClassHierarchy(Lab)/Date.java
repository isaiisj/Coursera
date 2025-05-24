/** TOOO 2: Declare the Date class with
 * the integer attributes date, month and year
 * **/
public class Date {
    int dd;
    int mm;
    int yy;

    Date(int d, int m, int y) {
        this.dd = d;
        this.mm = m;
        this.yy = y;
    }

    /** TODO 3: Include the getDate() method
     * which returns the string representation
     * of the date
     * **/
    String getDate() {
        return this.dd + "-" + this.mm + "-" + this.yy;
    }
}
