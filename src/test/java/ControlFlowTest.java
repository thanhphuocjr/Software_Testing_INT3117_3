import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControlFlowTest {
    @Test
    void tc1() {
        assertEquals(-1, Compensation.calculateBonus(0, 50));
    }

    @Test
    void tc2() {
        assertEquals(0, Compensation.calculateBonus(1, 50));
    }

    @Test
    void tc3() {
        assertEquals(30, Compensation.calculateBonus(2, 85));
    }

    @Test
    void tc4() {
        assertEquals(40, Compensation.calculateBonus(2, 95));
    }

    @Test
    void tc5() {
        assertEquals(60, Compensation.calculateBonus(3, 85));
    }

    @Test
    void tc6() {
        assertEquals(70, Compensation.calculateBonus(3, 95));
    }

    @Test
    void tc7() {
        assertEquals(90, Compensation.calculateBonus(5, 85));
    }

    @Test
    void tc8() {
        assertEquals(100, Compensation.calculateBonus(5, 95));
    }
}
