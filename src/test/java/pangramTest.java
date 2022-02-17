import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pangramTest {

    @org.junit.jupiter.api.Test
    void run() {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean expected = true;
        boolean actual = pangram.run(input);
        assertEquals(expected, actual, "quick brown fox failed");

        input = "T";
        expected = false;
        actual = pangram.run(input);
        assertEquals(expected, actual, "\"T\" character failed");

    }

    @Test
    void runNumbersTest() {
        String input = "1 The quick brown fox jumps over the lazy dog";
        assertEquals(true, pangram.run(input), "quick brown fox number failed");

        input = "0 1 2 3 4 5 6 7 8 9";
        boolean expected = false;
        boolean actual = pangram.run(input);
        assertEquals(expected, actual, "0-9 failed");

        input = "0";
        expected = false;
        actual = pangram.run(input);
        assertEquals(expected, actual, "0-9 failed");
    }

    @Test
    void runSpecialCharTest() {
        String input = "The quick brown fox jumps over the lazy dog!";
        assertEquals(true, pangram.run(input), "quick brown fox ! failed");

        input = "!@#$%^&*((_)+";
        boolean expected = false;
        boolean actual = pangram.run(input);
        assertEquals(expected, actual, "!@#$%^&*( failed");

        input = "!";
        expected = false;
        actual = pangram.run(input);
        assertEquals(expected, actual, "\"!\" failed");
    }
}