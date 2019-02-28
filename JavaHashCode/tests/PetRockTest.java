import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {

    @Test
    public void getName() {
        PetRock petRock = new PetRock("a");

        assertEquals(petRock.getName(),"a");
    }

    @Test
    public void setName() {
    }

    @Test
    public void name() {
    }
}