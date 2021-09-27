/* A test for the class Car.
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car cAr;

    @Before
    public void setUp() throws Exception {
        cAr = new Car();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() { assertEquals(3, cAr.getMaxSpeed()); }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        cAr.upgradeSpeed();
        assertEquals(4, cAr.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        cAr.downgradeSpeed();
        assertEquals(2, cAr.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() { assertEquals(30, cAr.getPrice()); }
}
