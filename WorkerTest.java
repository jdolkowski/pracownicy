import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class WorkerTest {
    @Test
    public void constructorOfficeworkerTest(){
        Building building = new Building("Mickiewicza", "2", "5", "Gdańsk");
        OfficeWorker sut = new OfficeWorker("Jan", "Kowalski", 35, 8, building, 100);
        assertNotNull(sut);
    }
    @Test(expected = IllegalArgumentException.class)
    public void constructorOfficeworkerFailTest(){
        Building building = new Building("Mickiewicza", "2", "5", "Gdańsk");
        OfficeWorker sut = new OfficeWorker("Jan", "Kowalski", 35, -3, building, 100);
    }
    @Test
    public void stringOfficeworkerTest(){
        Building building = new Building("Mickiewicza", "2", "5", "Gdańsk");
        OfficeWorker sut = new OfficeWorker("Jan", "Kowalski", 35, 8, building, 100);
        System.out.println(sut.toStringWorker());
        assertNotNull(sut.toStringWorker());
    }
    @Test
    public void constructorSalesmanTest(){
        Building building = new Building("Mickiewicza", "2", "5", "Gdańsk");
        Salesman sut = new Salesman("Jan", "Kowalski", 35, 8, building, Salesman.Efficiency.SREDNIA, "25%");
        assertNotNull(sut);
    }
    @Test
    public void stringSalesmanTest(){
        Building building = new Building("Mickiewicza", "2", "5", "Gdańsk");
        Salesman sut = new Salesman("Jan", "Kowalski", 35, 8, building, Salesman.Efficiency.SREDNIA, "25%");
        System.out.println(sut.toStringWorker());
        assertNotNull(sut);
    }
    @Test
    public void provisionToDoubleTest(){
        Building building = new Building("Mickiewicza", "2", "5", "Gdańsk");
        Salesman sut = new Salesman("Jan", "Kowalski", 35, 8, building, Salesman.Efficiency.SREDNIA, "25%");
        assertEquals(0.25f, sut.getProvisionDouble(), 0.0f );
    }
    @Test
    public void workerValueTest(){
        Building building = new Building("Mickiewicza", "2", "5", "Gdańsk");

        Salesman sut = new Salesman("Jan", "Kowalski", 35, 8, building, Salesman.Efficiency.SREDNIA, "25%");

        assertEquals(" wydajnosc: SREDNIA prowizja: 25% wartość: 720", sut.getWorkerSpecificInfo());
    }
}
