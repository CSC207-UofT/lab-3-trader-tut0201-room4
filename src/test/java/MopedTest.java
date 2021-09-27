import org.junit.*;

import static org.junit.Assert.*;

public class MopedTest {
    Moped m;

    @Before
    public void setUp() throws Exception {
        m = new Moped();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(300, m.getMaxSpeed());
    }


    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        m.downgradeSpeed();
        assertEquals(299, m.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(87000, m.getPrice());
    }


}
