import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MainTest {
    @Test
    void prob() {
        Main Main = new Main();
        int x[] = {1, -1, 0};
        int y[] = {2, 3, -5};
        int z[] = {3, 4, -7};
        assertTrue(Main.problem(3, x, y, z));
    }
    @Test
    void prop1() {
        Main Main = new Main();
        int x[] = {3, 8};
        int y[] = {9, -2};
        int z[] = {-6, 6};
        assertFalse(Main.problem(2, x, y, z));
    }
    @Test
    void prop2() {
        Main phy = new Main();
        int x[] = {7};
        int y[] = {2};
        int z[] = {9};
        assertFalse(Main.problem(1, x, y, z));
    }
    @Test
    void prop3() {
        Main Main = new Main();
        int x[] = {1};
        int y[] = {2};
        int z[] = {3};
        assertThrows(IllegalArgumentException.class, () -> {
            Main.problem(0, x, y, z);
        });
    }
    @Test
    void prob4() {
        Main Main = new Main();
        int x[] = {4,-4};
        int y[] = {8,-8};
        int z[] = {9,-9};
        assertThrows(IllegalArgumentException.class, () -> {
            Main.problem(-2, x, y, z);
        });
    }
    @Test
    void prob5() {
        Main Main = new Main() ;
        int x[] = {-1,1};
        int y[] = {2,-2};
        int z[] = {5,-5};
        assertThrows(ArrayIndexOutOfBoundsException.class , () ->
        {Main.problem(4,x,y ,z);});
    }
}
