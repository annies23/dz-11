package cc.robotdreams.test;

import org.example.Person;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTest {
    @Test
    public void testGetGender() {
        Woman woman = new Woman("Крістіна", "Річі", 58, null);
        Assert.assertEquals(woman.getGender(), Person.Gender.Woman);
    }

    @Test
    public void testIsRetired() {
        Woman woman1 = new Woman("Крістіна", "Річі", 58, null);
        Woman woman2 = new Woman("Різ", "Візерспун", 61, null);

        Assert.assertFalse(woman1.isRetired());
        Assert.assertTrue(woman2.isRetired());
    }
}
