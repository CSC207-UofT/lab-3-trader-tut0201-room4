/*
 * This file contains sample JUnit test cases for Mothman.java
 */

import org.junit.*;

import static org.junit.Assert.*;


public class MothmanTest {
    Mothman m;

    @Before
    public void setUp() throws Exception {
        m = new Mothman();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("...", h.sound());
    }
    
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, m.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(2, m.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        h.downgradeSpeed();
        assertEquals(0, m.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(9001, m.getPrice());
    }

}
