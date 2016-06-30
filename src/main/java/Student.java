/**
 * Created by Roi.Amir on 28/06/2016.
 */
public class Student {
    private String name;
    private int rating;

    private static int numberOfStudents;
    private static int totalRating;

    public static double getAvgRating(){
        if (numberOfStudents == 0) {
            return 0;
        }
        
        return totalRating/(double)numberOfStudents;
    }

    public static int getTotalRating(){
        return totalRating;
    }

    public Student (){
         initStudent("", 0);
   }

    public Student (String name, int rating){
         initStudent(name, rating);
    }

    private void initStudent(String name, int rating) {
        this.name = name;
        this.rating = rating;

        numberOfStudents++;
        totalRating += rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void changeRating(int rating) {
        totalRating -= this.rating;
        totalRating += rating;
        this.rating = rating;
    }

    public String toString() {
        return "Name: " + name + " Rating: " + rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public boolean betterStudent(Student other) {
        return (this.rating > other.rating);
    }

}
