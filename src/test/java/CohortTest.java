import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class CohortTest {

    private Cohort cohort;
    private Student chimmy;
    private Student cooky;
    private Student shooky;
    private Student rj;

    @Before
    public void setUp() {
        this.cohort = new Cohort();
        this.chimmy = new Student(1554, "Chimmy");
        this.shooky = new Student(5685, "Shooky");
        this.cooky = new Student(6984, "Cooky");
        this.rj = new Student(5252, "RJ");
    }

    @Test
    public void testAddStudent() {
        Cohort cohort = new Cohort();

        Cohort.addStudent(new Student(1554, "Chimmy"));
        assertEquals(1, cohort.getStudents().size());

        Cohort.addStudent(new Student(5252, "RJ"));
        assertEquals(2, cohort.getStudents().size());

        Student cooky = new Student(1, "Cooky");
        Cohort.addStudent(chimmy);
        assertEquals(chimmy, cohort.getStudents().get(2));
    }

    @Test
    public void testGetStudents() {
        Cohort cohort = new Cohort();

        Cohort.addStudent(new Student(1554, "Chimmy"));
        Cohort.addStudent(new Student(1554, "Chimmy"));
        Cohort.addStudent(new Student(1554, "Chimmy"));
        Cohort.addStudent(new Student(1554, "Chimmy"));

        assertEquals(3, cohort.getStudents().size());
    }

    @Test
    public void testCohort() {
        Cohort cohort = new Cohort();

        Student shooky = new Student(5685, "Shooky");

        shooky.addGrade(85);
        shooky.addGrade(68);
        shooky.addGrade(96);

        Student cooky = new Student(6984, "Cooky");

        cooky.addGrade(75);
        cooky.addGrade(82);
        cooky.addGrade(80);

        Cohort.addStudent(shooky);
        Cohort.addStudent(cooky);

        assertEquals(75, cohort.getCohortAverage(), 0);
    }
}
