import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterMelonTest {
    @Test
    void main() {
        Watermelon watermelon = new Watermelon();
        assertTrue(watermelon.watermelonw(12));
    }
    @org.junit.jupiter.api.Test
    void even() {
        Watermelon watermelon = new Watermelon();
        assertTrue(watermelon.watermelonw(30));
    }
    @org.junit.jupiter.api.Test
    void odd() {
        Watermelon watermelon = new Watermelon();
        assertFalse(watermelon.watermelonw(9));
    }
    @org.junit.jupiter.api.Test
    void two() {
        Watermelon watermelon = new Watermelon();
        assertFalse(watermelon.watermelonw(2));
    }
    @org.junit.jupiter.api.Test
    void negativeOdd() {
        Watermelon watermelon = new Watermelon();
        assertThrows(IllegalArgumentException.class, () -> {
            watermelon.watermelonw(-3);});
    }
    @org.junit.jupiter.api.Test
    void negativeEven() {
        Watermelon watermelon = new Watermelon();
        assertThrows(IllegalArgumentException.class, () -> {
            watermelon.watermelonw(-8);});
    }

}
