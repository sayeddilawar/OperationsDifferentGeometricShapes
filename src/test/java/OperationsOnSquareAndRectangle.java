import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationsOnSquareAndRectangle
{
    @DisplayName("Area of Square with Positive Sides")
    @Test
    void toImplementAreaOfSquareWithPositiveSides()
    {
        OperationsOfSquareAndRectangleMain object = new OperationsOfSquareAndRectangleMain(5);
        assertEquals(25,object.areaOfSquare());
    }

    @DisplayName("Area of Square with Negative Sides")
    @Test
    void toImplementAreaOfSquareWithNegativeSides()
    {
        OperationsOfSquareAndRectangleMain object = new OperationsOfSquareAndRectangleMain(-5);
        assertEquals(-25,object.areaOfSquare());
    }

    @DisplayName("Area of Square with Positive Decimal side")
    @Test
    void toImplementAreaOfSquareWithPositiveDecimalSides()
    {
        OperationsOfSquareAndRectangleMain object = new OperationsOfSquareAndRectangleMain(5.5);
        assertEquals(30.25,object.areaOfSquare());
    }

    @DisplayName("Area of Square with Positive Decimal side")
    @Test
    void toImplementAreaOfSquareWithNegativeDecimalSides()
    {
        OperationsOfSquareAndRectangleMain object = new OperationsOfSquareAndRectangleMain(-5.5);
        assertEquals(30.25,object.areaOfSquare());
    }

    //Perimeter of Square
    @DisplayName("Perimeter of Square with Positive side")
    @Test
    void toImplementPerimeterOfSquareWithPositiveSides()
    {
        OperationsOfSquareAndRectangleMain object = new OperationsOfSquareAndRectangleMain(10);
        assertEquals(40,object.perimeterOfSquare());
    }

    @DisplayName("Perimeter of Square with Negative side")
    @Test
    void toImplementPerimeterOfSquareWithNegativeSides()
    {
        OperationsOfSquareAndRectangleMain object = new OperationsOfSquareAndRectangleMain(-10);
        assertEquals(-40,object.perimeterOfSquare());
    }

    @DisplayName("Perimeter of Square with Positive Decimal side")
    @Test
    void toImplementPerimeterOfSquareWithPositiveDecimalSides()
    {
        OperationsOfSquareAndRectangleMain object = new OperationsOfSquareAndRectangleMain(2.5);
        assertEquals(10,object.perimeterOfSquare());
    }

    @DisplayName("Perimeter of Square with Negative Decimal side")
    @Test
    void toImplementPerimeterOfSquareWithNegativeDecimalSides()
    {
        OperationsOfSquareAndRectangleMain object = new OperationsOfSquareAndRectangleMain(-2.5);
        assertEquals(-10,object.perimeterOfSquare());
    }
    //End Perimeter Of Square


}

