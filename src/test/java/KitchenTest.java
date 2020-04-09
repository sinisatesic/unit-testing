import org.junit.*;
import tdd.Kitchen;

import static org.junit.Assert.*;

public class KitchenTest {

@Test
    public void testConstructor(){
    Kitchen kitchen = new Kitchen();
    assertEquals(0, kitchen.size());
}

@Test
    public void testIsEmpty() {
    Kitchen kitchen = new Kitchen();
    assertTrue(kitchen.isEmpty());
}

@Test
    public void testAdd() {
    Kitchen kitchen = new Kitchen();
    kitchen.add("blue corn");
    assertEquals(1, kitchen.size());
}

@Test
    public void testPop() {
    Kitchen kitchen = new Kitchen();
    kitchen.add("blue corn");
    kitchen.add("white corn");
    kitchen.add("yellow corn");
    kitchen.pop();
    assertEquals(2, kitchen.size());
    kitchen.pop();
    kitchen.pop();
    kitchen.pop();
}
}
