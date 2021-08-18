import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    void toCalcuateAreaOfRectangleWithPositiveDimensions(){
        Rectangle rectangle=new Rectangle(4,2);
        int actualArea=rectangle.Area();
        int expectedArea=8;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    void toCalcuateAreaOfRectangleWithNegativeDimensions(){
        Rectangle rectangle=new Rectangle(-4,-2);
        int actualArea=rectangle.Area();
        int expectedArea=8;
        assertEquals(actualArea,expectedArea);
    }

    @Test
    void toCalcuateAreaOfRectangleWithPositiveLengthAndNegativeWidth(){
        Rectangle rectangle=new Rectangle(4,-2);
        int actualArea=rectangle.Area();
        int expectedArea=-8;
        assertEquals(actualArea,expectedArea);

    }

    @Test
    void toCalcuateAreaOfRectangleWithNegativeLengthAndPositiveWidth(){
        Rectangle rectangle=new Rectangle(-4,2);
        int actualArea=rectangle.Area();
        int expectedArea=-8;
        assertEquals(actualArea,expectedArea);
    }

}
