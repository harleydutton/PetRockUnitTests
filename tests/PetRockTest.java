import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {
    private PetRock rocky = new PetRock("rocky");
    @Test

    public void getName() throws Exception {
        assertEquals("rocky", rocky.getName());
    }

    @Test
    public void testHappy() throws Exception {
        assertTrue(rocky.isHappy());
    }

    @Test
    public void unhappyAfterThrow()throws Exception{
        rocky.throwPet();
        assertFalse(rocky.isHappy());
    }
}