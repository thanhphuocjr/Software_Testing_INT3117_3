import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DataFlowTest {
    @Test
    void tc1() {
        assertEquals(-1, Compensation.calculateBonus(-1, 70));
    }
    
    @Test
    void tc2() {
        assertEquals(30, Compensation.calculateBonus(2, 80));
    }

    @Test
    void tc3() {
        assertEquals(60, Compensation.calculateBonus(3, 80));
    }

    @Test
    void tc4() {
        assertEquals(90, Compensation.calculateBonus(5, 80));
    }

    @Test
    void tc5() {
        assertEquals(0, Compensation.calculateBonus(1, 70));
    }

    @Test
    void tc6() {
        assertEquals(30, Compensation.calculateBonus(1, 80));
    }

    @Test
    void tc7() {
        assertEquals(40, Compensation.calculateBonus(1, 90));
    }

    @Test
    void tc8() {
        assertEquals(60, Compensation.calculateBonus(4, 80));
    }
    void tc9() {
        assertEquals(70, Compensation.calculateBonus(4, 90));
    }
    void tc10() {
        assertEquals(90, Compensation.calculateBonus(5, 80));
    }
    void tc11() {
        assertEquals(100, Compensation.calculateBonus(5, 90));
    }


}
