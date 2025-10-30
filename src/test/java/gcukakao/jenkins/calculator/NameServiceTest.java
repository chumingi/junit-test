package gcukakao.jenkins.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameServiceTest {
    private Calculator calculator = new Calculator();

    @Test
    void testMyName() {
        assertEquals("추민기", calculator.getAuthorName());
        }
}