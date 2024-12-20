import org.example.Octagon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OctagonTest {

    @Test
    void testGetArea() {
        Octagon octagon = new Octagon(5);
        double expectedArea = (2 + (2 / Math.sqrt(2))) * 5 * 5;
        assertEquals(expectedArea, octagon.getArea(), 0.0001, "Вычисленная площадь неверна");
    }

    @Test
    void testGetPerimeter() {
        Octagon octagon = new Octagon(5);
        double expectedPerimeter = 8 * 5;
        assertEquals(expectedPerimeter, octagon.getPerimeter(), 0.0001, "Вычисленный периметр неверен");
    }

    @Test
    void testClone() {
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = octagon1.clone();

        assertNotSame(octagon1, octagon2, "Клон должен создавать новый объект");
        assertEquals(octagon1.getSide(), octagon2.getSide(), "Сторона склонированного объекта должна быть такой же");
    }

    @Test
    void testCompareToEqualObjects() {
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = new Octagon(5);

        assertEquals(0, octagon1.compareTo(octagon2), "Сравнение одинаковых объектов должно возвращать 0");
    }

    @Test
    void testCompareToDifferentObjects() {
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = new Octagon(6);

        assertTrue(octagon1.compareTo(octagon2) < 0, "Шестиугольник 1 должен быть меньше шестиугольника 2");
        assertTrue(octagon2.compareTo(octagon1) > 0, "Шестиугольник 2 должен быть больше шестиугольника 1");
    }

    @Test
    void testSetAndGetSide() {
        Octagon octagon = new Octagon();
        octagon.setSide(10);
        assertEquals(10, octagon.getSide(), "Сеттер или геттер для стороны работают некорректно");
    }
}
