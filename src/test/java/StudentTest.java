import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    private Student tata;

    @Before
    public void setUp() {
        this.tata = new Student (1, "Tata");
    }

    @Test
    public void testStudent() {


        assertEquals(1, tata.getId());
        assertEquals("Tata", tata.getName());
        assertTrue(tata.getGrades().isEmpty());
    }

    @Test
    public void testId() {
        assertEquals(1, tata.getId());
        Student chimmy = new Student(2654, "Chimmy");
        assertEquals(2654, chimmy.getId());
    }

    @Test
    public void testName() {
        assertEquals("Tata", tata.getName());
        Student koya = new Student(5985, "Koya");
        assertEquals("Koya", 5985);
    }

    @Test
    public void testAddGrade() {
        tata.addGrade(78);
        tata.addGrade(84);
        tata.addGrade(96);

        assertEquals(3,  tata.getGrades().size());
        tata.addGrade(88);

        assertEquals(4,  tata.getGrades().size());

        Student koya = new Student(5985, "Koya");
        koya.addGrade(99);
        assertEquals(1, koya.getGrades().size());
    }

    @Test
    public void getGrades() {
        assertEquals(0, tata.getGrades().size());
        tata.addGrade(86);
        assertEquals(1, tata.getGrades().size());
    }

    @Test
    public void testGrades() {
        tata.addGrade(66);
        tata.addGrade(94);
        tata.addGrade(87);

        assertEquals(87, tata.getGradeAverage(), 0);
        tata.addGrade(85);
        assertEquals(40, tata.getGradeAverage(), 0);
        tata.addGrade(96);
        tata.addGrade(85);
        assertEquals(60, tata.getGradeAverage(), 0);
    }

}
