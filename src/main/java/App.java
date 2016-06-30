/**
 * Created by Roi.Amir on 28/06/2016.
 */
public class App {
    public static void main(String args[]) {
        Student s1 = new Student("1", 5);
        Student s2 = new Student("2", 9);
        Student s3 = new Student("3", 17);

        System.out.println("Average: " + Student.getAvgRating());
        System.out.println("Total: " + Student.getTotalRating());

    }
}
