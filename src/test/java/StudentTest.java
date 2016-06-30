import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;

/**
 * Created by Roi.Amir on 28/06/2016.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentTest {
    @Test
    public void a_order1_getAvgRating_NoStudents() throws Exception {
        assertEquals(0.0d, Student.getAvgRating(), 0);
    }

    @Test
    public void a_order2_getAvgRating_NoStudents() throws Exception {
        Student s1 = new Student("1", 5);
        Student s2 = new Student("2", 9);
        Student s3 = new Student("3", 17);
        Student s4 = new Student("4", -9);
        Student s5 = new Student();
        assertEquals(4.4d, Student.getAvgRating(), 0);
    }


    @Test
    public void setName() throws Exception {
        Student s = new Student("a", 1);
        s.setName("b");
        assertEquals("b", s.getName());
    }

    @Test
    public void setNameNull() throws Exception {
        Student s = new Student("a", 1);
        s.setName(null);
        assertEquals(null, s.getName());
    }

    @Test
    public void changeRating() throws Exception {
        Student s = new Student("a", 1);
        s.changeRating(5);
        assertEquals(5, s.getRating());
    }

    @Test
    public void getName() throws Exception {
        Student s = new Student("a", 1);
        assertEquals("a", s.getName());
    }

    @Test
    public void getRating() throws Exception {
        Student s = new Student("a", 1);
        assertEquals(1, s.getRating());
    }

    @Test
    public void betterStudentTrue() throws Exception {
        Student s = new Student("better", 5);
        Student o = new Student("worse" , 3);
        assertTrue(s.betterStudent(o));
    }

    @Test
    public void betterStudentFalse() throws Exception {
        Student s = new Student("worse", 2);
        Student o = new Student("Better" , 3);
        assertFalse(s.betterStudent(o));
    }

    @Test
    public void toStringTest() throws Exception {
        Student s = new Student("Juan", 2);
        assertEquals("Name: Juan Rating: 2", s.toString());
    }
}