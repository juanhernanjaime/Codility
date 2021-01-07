
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodilityDemoTest {
    @Test
    public void solutionTest() {
        CodilityDemo demo = new CodilityDemo();
        assertEquals(demo.solution(new int[]{-1, -3}), 1);
        assertEquals(demo.solution(new int[]{1, 2, 3}), 4);
        assertEquals(demo.solution(new int[]{1, 3, 6, 4, 1, 2, 5, 8, 9}), 7);
        assertEquals(demo.solution(new int[]{1, 3, 6, 4, 1, 2}), 5);
    }
}
