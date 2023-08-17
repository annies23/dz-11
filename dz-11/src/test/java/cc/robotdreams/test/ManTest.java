package cc.robotdreams.test;
import org.example.Man;
import org.example.Person;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ManTest {
    @Test
    public void testGetGender() {
        Man man = new Man("Сем", "Сміт", 63, null);
        Assert.assertEquals(man.getGender(), Person.Gender.Man);
    }

    @Test
    public void testIsRetired() {
        Man man1 = new Man("Сем", "Сміт", 63, null);
        Man man2 = new Man("Джон", "МакКейн", 66, null);

        Assert.assertFalse(man1.isRetired());
        Assert.assertTrue(man2.isRetired());
    }
}
