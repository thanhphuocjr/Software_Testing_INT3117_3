import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompensationTest {
    @Test
    void rule1() {
        assertEquals(-1, Compensation.calculateBonus(-10, -10));
        assertEquals(-1, Compensation.calculateBonus(-10, 90));
        assertEquals(-1, Compensation.calculateBonus(-10, 200));

        assertEquals(-1, Compensation.calculateBonus(0, -10));
        assertEquals(-1, Compensation.calculateBonus(0, 90));
        assertEquals(-1, Compensation.calculateBonus(0, 200));
    }

    @Test
    void rule2() {
        assertEquals(-1, Compensation.calculateBonus(-100, -100));
        assertEquals(-1, Compensation.calculateBonus(0, -100));
        assertEquals(-1, Compensation.calculateBonus(100, -100));

        assertEquals(-1, Compensation.calculateBonus(-100, -1));
        assertEquals(-1, Compensation.calculateBonus(0, -1));
        assertEquals(-1, Compensation.calculateBonus(100, -1));
    }

    @Test
    void rule3() {
        assertEquals(-1, Compensation.calculateBonus(-100, 101));
        assertEquals(-1, Compensation.calculateBonus(0, 101));
        assertEquals(-1, Compensation.calculateBonus(100, 101));

        assertEquals(-1, Compensation.calculateBonus(-100, 200));
        assertEquals(-1, Compensation.calculateBonus(0, 200));
        assertEquals(-1, Compensation.calculateBonus(100, 200));
    }

    @Test
    void rule4() {
        assertEquals(0, Compensation.calculateBonus(1, 0));
        assertEquals(0, Compensation.calculateBonus(1, 1));
        assertEquals(0, Compensation.calculateBonus(1, 10));
        assertEquals(0, Compensation.calculateBonus(1, 78));
        assertEquals(0, Compensation.calculateBonus(1, 79));

        assertEquals(0, Compensation.calculateBonus(2, 0));
        assertEquals(0, Compensation.calculateBonus(2, 1));
        assertEquals(0, Compensation.calculateBonus(2, 10));
        assertEquals(0, Compensation.calculateBonus(2, 78));
        assertEquals(0, Compensation.calculateBonus(2, 79));

    }

    @Test
    void rule5() {
        assertEquals(30, Compensation.calculateBonus(1, 80));
        assertEquals(30, Compensation.calculateBonus(1, 81));
        assertEquals(30, Compensation.calculateBonus(1, 85));
        assertEquals(30, Compensation.calculateBonus(1, 88));
        assertEquals(30, Compensation.calculateBonus(1, 89));

        assertEquals(30, Compensation.calculateBonus(2, 80));
        assertEquals(30, Compensation.calculateBonus(2, 81));
        assertEquals(30, Compensation.calculateBonus(2, 85));
        assertEquals(30, Compensation.calculateBonus(2, 88));
        assertEquals(30, Compensation.calculateBonus(2, 89));

    }

    @Test
    void rule6() {
        assertEquals(40, Compensation.calculateBonus(1, 90));
        assertEquals(40, Compensation.calculateBonus(1, 91));
        assertEquals(40, Compensation.calculateBonus(1, 95));
        assertEquals(40, Compensation.calculateBonus(1, 99));
        assertEquals(40, Compensation.calculateBonus(1, 100));

        assertEquals(40, Compensation.calculateBonus(2, 90));
        assertEquals(40, Compensation.calculateBonus(2, 91));
        assertEquals(40, Compensation.calculateBonus(2, 95));
        assertEquals(40, Compensation.calculateBonus(2, 99));
        assertEquals(40, Compensation.calculateBonus(2, 100));

    }

    @Test
    void rule7() {
        assertEquals(0, Compensation.calculateBonus(3, 0));
        assertEquals(0, Compensation.calculateBonus(3, 1));
        assertEquals(0, Compensation.calculateBonus(3, 40));
        assertEquals(0, Compensation.calculateBonus(3, 78));
        assertEquals(0, Compensation.calculateBonus(3, 79));

        assertEquals(0, Compensation.calculateBonus(4, 0));
        assertEquals(0, Compensation.calculateBonus(4, 1));
        assertEquals(0, Compensation.calculateBonus(4, 40));
        assertEquals(0, Compensation.calculateBonus(4, 78));
        assertEquals(0, Compensation.calculateBonus(4, 79));
    }

    @Test
    void rule8() {
        assertEquals(60, Compensation.calculateBonus(3, 80));
        assertEquals(60, Compensation.calculateBonus(3, 81));
        assertEquals(60, Compensation.calculateBonus(3, 85));
        assertEquals(60, Compensation.calculateBonus(3, 88));
        assertEquals(60, Compensation.calculateBonus(3, 89));

        assertEquals(60, Compensation.calculateBonus(4, 80));
        assertEquals(60, Compensation.calculateBonus(4, 81));
        assertEquals(60, Compensation.calculateBonus(4, 85));
        assertEquals(60, Compensation.calculateBonus(4, 88));
        assertEquals(60, Compensation.calculateBonus(4, 89));
    }

    @Test
    void rule9() {
        assertEquals(70, Compensation.calculateBonus(3, 90));
        assertEquals(70, Compensation.calculateBonus(3, 91));
        assertEquals(70, Compensation.calculateBonus(3, 95));
        assertEquals(70, Compensation.calculateBonus(3, 99));
        assertEquals(70, Compensation.calculateBonus(3, 100));

        assertEquals(70, Compensation.calculateBonus(4, 90));
        assertEquals(70, Compensation.calculateBonus(4, 91));
        assertEquals(70, Compensation.calculateBonus(4, 95));
        assertEquals(70, Compensation.calculateBonus(4, 99));
        assertEquals(70, Compensation.calculateBonus(4, 100));
    }

    @Test
    void rule10() {
        assertEquals(0, Compensation.calculateBonus(5, 0));
        assertEquals(0, Compensation.calculateBonus(5, 1));
        assertEquals(0, Compensation.calculateBonus(5, 40));
        assertEquals(0, Compensation.calculateBonus(5, 78));
        assertEquals(0, Compensation.calculateBonus(5, 79));

        assertEquals(0, Compensation.calculateBonus(10, 0));
        assertEquals(0, Compensation.calculateBonus(10, 1));
        assertEquals(0, Compensation.calculateBonus(10, 40));
        assertEquals(0, Compensation.calculateBonus(10, 78));
        assertEquals(0, Compensation.calculateBonus(10, 79));
    }

    @Test
    void rule11() {
        assertEquals(90, Compensation.calculateBonus(5, 80));
        assertEquals(90, Compensation.calculateBonus(5, 81));
        assertEquals(90, Compensation.calculateBonus(5, 85));
        assertEquals(90, Compensation.calculateBonus(5, 88));
        assertEquals(90, Compensation.calculateBonus(5, 89));

        assertEquals(90, Compensation.calculateBonus(10, 80));
        assertEquals(90, Compensation.calculateBonus(10, 81));
        assertEquals(90, Compensation.calculateBonus(10, 85));
        assertEquals(90, Compensation.calculateBonus(10, 88));
        assertEquals(90, Compensation.calculateBonus(10, 89));
    }

    @Test
    void rule12() {
        assertEquals(100, Compensation.calculateBonus(5, 90));
        assertEquals(100, Compensation.calculateBonus(5, 91));
        assertEquals(100, Compensation.calculateBonus(5, 95));
        assertEquals(100, Compensation.calculateBonus(5, 99));
        assertEquals(100, Compensation.calculateBonus(5, 100));

        assertEquals(100, Compensation.calculateBonus(10, 90));
        assertEquals(100, Compensation.calculateBonus(10, 91));
        assertEquals(100, Compensation.calculateBonus(10, 95));
        assertEquals(100, Compensation.calculateBonus(10, 99));
        assertEquals(100, Compensation.calculateBonus(10, 100));
    }

}
