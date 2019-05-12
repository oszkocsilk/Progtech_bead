package tests;

import org.junit.jupiter.api.Test;
import sample.Akna;

import static org.junit.jupiter.api.Assertions.*;

class AknaTest {
    Akna akna=new Akna();

    @Test
    void aknák() {
        assertEquals(2,akna.getNumberOfBombs());
    }




}