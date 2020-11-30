import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class BuildingTest {
    @Test
    public void constructorBuildingTest(){
        Building sut = new Building("Mickiewicza", "2", "5", "Gdańsk");
        assertNotNull(sut);
    }
}
