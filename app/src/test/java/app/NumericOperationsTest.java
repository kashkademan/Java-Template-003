package app;

// import org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

public class NumericOperationsTest {
    private NumericOperations numericOperations;

    @BeforeEach
    public void setUp() {
        numericOperations = new NumericOperations();
    }

    @Test
    public void testSortArray() {
        int[] array = {3, 1, 2};
        int[] expected = {1, 2, 3};
        Assertions.assertArrayEquals(expected, numericOperations.sortArray(array));
    }

    @Test
    public void testAdd() {
        int a = 4;
        int b = 5;
        int expected = 9;
        // assertEquals(expected, numericOperations.add(a, b));
        Assertions.assertEquals(expected, numericOperations.add(a, b));
    }
}
