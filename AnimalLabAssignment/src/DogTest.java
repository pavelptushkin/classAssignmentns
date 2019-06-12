import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DogTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }


    @Test
    public void speak() {
        Dog dog = new Dog("dog");
        dog.speak();
        assertEquals("Dog is barking\r\n", outContent.toString());
    }

    @Test
    public void eat() {
        Dog dog = new Dog("dog");
        dog.eat();
        assertEquals("The dog is chewing on a bone\r\n", outContent.toString());
    }

    @Test
    public void moves() {
        Dog dog = new Dog("dog");
        dog.moves();
        assertEquals("The dog is running\r\n", outContent.toString());
    }
}