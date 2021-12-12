import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;



class ExampleTest {
    private Example app = new Example();

    @Test
    void test_validX() {
        Integer number = 50;
        InputStream inputStream = new ByteArrayInputStream(number.toString().getBytes());
        System.setIn(inputStream);

        assertEquals(number, app.getX());

    }

    @Test
    void test_invalidX() {
        var values = new ArrayList<>(Arrays.asList("gg", "11.11"));
        for (String value : values) {
            InputStream inputStream = new ByteArrayInputStream(value.getBytes());
            System.setIn(inputStream);

            assertThrows(InputMismatchException.class, app::getX);
        }
    }

    @Test
    void test_validY() {
        Integer number = 50;
        InputStream inputStream = new ByteArrayInputStream(number.toString().getBytes());
        System.setIn(inputStream);

        assertEquals(number, app.getY());

    }

    @Test
    void test_invalidY() {
        var values = new ArrayList<>(Arrays.asList("gg", "11.11"));
        for (String value : values) {
            InputStream inputStream = new ByteArrayInputStream(value.getBytes());
            System.setIn(inputStream);

            assertThrows(InputMismatchException.class, app::getY);
        }
    }

    @Test
    void test_test() {
        assertTrue(app.test(2, 2));

        assertTrue(app.test(10, 10));

        assertTrue(app.test(100, 100));
    }

    @Test
    void test_print() {
        int x = 2;
        int y = 2;
        String expectedResult = "Результат: " + app.test(x,y);
        String actualResult = app.print(x,y);
        assertEquals(expectedResult, actualResult);
    }
}