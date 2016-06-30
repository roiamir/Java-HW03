import java.text.DecimalFormat;

/**
 * Created by Roi.Amir on 30/06/2016.
 */
public class Employee {
    private String name;
    private double rate;
    private double hours;
    private static final double BOUNOS_RATE = 0.1d;

    public Employee(){
        name = "";
    }

    public Employee (String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee (String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public double salary() {
        return rate*hours;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        return "Name:" + name + " " +
                "Rate:" + df.format(rate) +" " +
                "Hours:" + df.format(hours);
    }

    public void changeRate(double rate) {
        this.rate = rate;
    }

    public double bonus() {
        return salary() * BOUNOS_RATE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }


}
