package be.codekata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    FizzBuzz fb;

    @BeforeEach
    void setUp() {
        fb = new FizzBuzz();
    }

    @Test
    @DisplayName("This is the FizzBuzz example")
    void fizzBuzzExample(){
        fb.fizzBuzz();
    }
}
