package codingdojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueMorseTest {

    UniqueMorse toTest = new UniqueMorse();

    @Test
    void uniqueMorseRepresentations1() {
        assertEquals(2,toTest.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }

    @Test
    void uniqueMorseRepresentations2() {
        assertEquals(1,toTest.uniqueMorseRepresentations(new String[]{"hello", "ssdrj", "isedrj", "svirwt", "eiilram"}));
    }

    @Test
    void uniqueMorseRepresentations3() {
        assertEquals(7,toTest.uniqueMorseRepresentations(new String[]{"one", "two", "three", "four", "five", "six", "seven"}));
    }

    @Test
    void uniqueMorseRepresentations4() {
        assertEquals(4,toTest.uniqueMorseRepresentations(new String[]{"hello", "ssdrj", "silvana", "sirsrga", "alongerwordd", ""}));
    }

    @Test
    void uniqueMorseRepresentations5() {
        assertEquals(0,toTest.uniqueMorseRepresentations(new String[]{}));
    }
}