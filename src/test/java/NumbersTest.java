import static org.junit.Assert.*;

public class NumbersTest {

    @org.junit.Test
    public void sum() {
     Integer actual=   Numbers.sum(12345);
     System.out.println("Result of your number: "+actual);
        Integer expected=15;
        assertEquals(expected,actual);

    }
}