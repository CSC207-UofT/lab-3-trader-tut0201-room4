import org.junit.*;
import static org.junit.Assert.*;
public class ChariotTest {
    Chariot c;
    Horse h;

    @Before
    public void setUp() throws Exception {
        c = new Chariot(2);
    }

    @Test(timeout = 50)
    public void TestMaxSpeed(){
        assertEquals(0, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed(){
        c.upgradeSpeed();
        assertEquals(1, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed(){
        c.upgradeSpeed();
        c.downgradeSpeed();
        assertEquals(0, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice(){
        assertEquals(20, c.getPrice());
    }

    @Test(timeout = 50)
    public void TestAddHorse(){
        h = new Horse();
        c.Addhorse(h);
        assertEquals(h.getMaxSpeed(), c.getMaxSpeed());
    }

}
