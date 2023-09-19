import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {

    @Test

    public void getMax() {

        MaxService service = new MaxService();

        int a = 6;
        int b = 8;

        int expected = b;
        int actual = service.max(a, b);
        Assertions.assertEquals(expected, actual);
        System.out.println();

    }
}
