import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void toFindAreaOfSquareUsingPositiveDimension()
    {
        Square square=new Square();
        int actualArea = square.Area(4);
        int expectedArea=16;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    void toFindAreaOfSquareUsingNegativeDimension()
    {
        Square square=new Square();
        int actualArea = square.Area(-4);
        int expectedArea=16;
        assertEquals(actualArea,expectedArea);
    }


}
