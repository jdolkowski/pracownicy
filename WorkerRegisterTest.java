import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class WorkerRegisterTest {
    @Test
    public void contructorRegisterTest(){
        Building building = new Building("Mickiewicza", "2", "5", "Gdańsk");
        Building building2 = new Building("Dluga", "5", "7", "Warszawa");

        Salesman sut = new Salesman("Jan", "Kowalski", 35, 8, building, Salesman.Efficiency.SREDNIA, "25%");
        OfficeWorker sut1 = new OfficeWorker("Karol", "Nowak", 27, 3, building, 120);
        Handworker sut2 = new Handworker("Maciek", "Bednarek", 45, 20, building2, 80);
        ArrayList<Worker> workerList = new ArrayList<>();
        workerList.add(sut);
        workerList.add(sut1);
        workerList.add(sut2);

        WorkerRegister workreg = new WorkerRegister(workerList);
        assertNotNull(workreg);
    }
    @Test
    public void addWorkerRegisterTest(){
        Building building = new Building("Mickiewicza", "2", "5", "Gdańsk");
        Building building2 = new Building("Dluga", "5", "7", "Warszawa");

        Salesman sut = new Salesman("Jan", "Kowalski", 35, 8, building, Salesman.Efficiency.SREDNIA, "25%");
        OfficeWorker sut1 = new OfficeWorker("Karol", "Nowak", 27, 3, building, 120);

        ArrayList<Worker> workerList = new ArrayList<>();
        workerList.add(sut);
        workerList.add(sut1);

        WorkerRegister workreg = new WorkerRegister(workerList);
        Handworker sut2 = new Handworker("Maciek", "Bednarek", 45, 20, building2, 80);
        workreg.addWorker(sut2);

        ArrayList<Worker> testList = new ArrayList<>();
        testList.add(sut);
        testList.add(sut1);
        testList.add(sut2);
        assertEquals(workreg.getWorkers(), testList);
    }
    @Test
    public void addNWorkersRegisterTest(){
        Building building = new Building("Mickiewicza", "2", "5", "Gdańsk");
        Building building2 = new Building("Dluga", "5", "7", "Warszawa");

        Salesman sut = new Salesman("Jan", "Kowalski", 35, 8, building, Salesman.Efficiency.SREDNIA, "25%");

        ArrayList<Worker> workerList = new ArrayList<>();
        workerList.add(sut);

        WorkerRegister workreg = new WorkerRegister(workerList);
        OfficeWorker sut1 = new OfficeWorker("Karol", "Nowak", 27, 3, building, 120);
        Handworker sut2 = new Handworker("Maciek", "Bednarek", 45, 20, building2, 80);
        workreg.addNWorkers(sut1, sut2);

        ArrayList<Worker> testList = new ArrayList<>();
        testList.add(sut);
        testList.add(sut1);
        testList.add(sut2);
        assertEquals(workreg.getWorkers(), testList);
    }
    @Test
    public void removeWorkerTest(){
        Building building = new Building("Mickiewicza", "2", "5", "Gdańsk");
        Building building2 = new Building("Dluga", "5", "7", "Warszawa");

        Salesman sut = new Salesman("Jan", "Kowalski", 35, 8, building, Salesman.Efficiency.SREDNIA, "25%");
        OfficeWorker sut1 = new OfficeWorker("Karol", "Nowak", 27, 3, building, 120);
        Handworker sut2 = new Handworker("Maciek", "Bednarek", 45, 20, building2, 80);
        ArrayList<Worker> workerList = new ArrayList<>();
        workerList.add(sut);
        workerList.add(sut1);
        workerList.add(sut2);

        WorkerRegister workreg = new WorkerRegister(workerList);
        workreg.removeWorker(sut1.getID());
        workerList.remove(sut1);
        assertEquals(workreg.getWorkers(), workerList);
    }
    @Test
    public void sortRegisterTest(){
        Building building = new Building("Mickiewicza", "2", "5", "Gdańsk");
        Building building2 = new Building("Dluga", "5", "7", "Warszawa");

        Salesman sut = new Salesman("Jan", "Kowalski", 35, 8, building, Salesman.Efficiency.SREDNIA, "25%");
        OfficeWorker sut1 = new OfficeWorker("Karol", "Nowak", 27, 20, building, 120);
        Handworker sut2 = new Handworker("AMaciek", "Bednarek", 27, 20, building2, 80);
        ArrayList<Worker> workerList = new ArrayList<>();
        workerList.add(sut);
        workerList.add(sut1);
        workerList.add(sut2);

        WorkerRegister workreg = new WorkerRegister(workerList);
        workreg.sort();
        workreg.showReg();

        ArrayList<Worker> tmpList= new ArrayList<>();
        tmpList.add(sut2);
        tmpList.add(sut1);
        tmpList.add(sut);
        assertEquals(workreg.getWorkers(), tmpList);
    }
    @Test
    public void sortByCityRegisterTest(){
        Building building = new Building("Mickiewicza", "2", "5", "Gdańsk");
        Building building2 = new Building("Dluga", "5", "7", "Warszawa");

        Salesman sut = new Salesman("Jan", "Kowalski", 35, 8, building, Salesman.Efficiency.SREDNIA, "25%");
        OfficeWorker sut1 = new OfficeWorker("Karol", "Nowak", 27, 3, building, 120);
        Handworker sut2 = new Handworker("Maciek", "Bednarek", 45, 20, building2, 80);
        ArrayList<Worker> workerList = new ArrayList<>();
        workerList.add(sut);
        workerList.add(sut1);
        workerList.add(sut2);

        WorkerRegister workreg = new WorkerRegister(workerList);

        System.out.println(workreg.workersByCity("Gdańsk"));
        assertNotNull(workreg.workersByCity("Gdańsk"));
    }
}
