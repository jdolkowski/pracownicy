import java.util.ArrayList;
import java.util.*;

public class WorkerRegister {
    private ArrayList<Worker> workers;

    public WorkerRegister(ArrayList<Worker> workers){
        this.workers = workers;
    }
    public void addWorker(Worker worker){
        workers.add(worker);
    }
    public void removeWorker(String ID){
        for(Worker worker : workers){
            if(ID.equals(worker.getID())){
                workers.remove(worker);
                break;
            }
        }
    }
    public void showReg(){
        for(Worker i : this.getWorkers()){
            System.out.println(i.toStringWorker());
        }
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
    }

    public void addNWorkers(Worker... workers){
        for(Worker tmpWorker : workers){
            addWorker(tmpWorker);
        }
    }

    public String workersByCity(String city){
        StringBuilder workersByCityList = new StringBuilder();
        for(Worker tmp_worker : getWorkers()){
            if(tmp_worker.getCity().equals(city)){
                workersByCityList.append(tmp_worker.toStringWorker()).append("\n");
            }
        }
        return workersByCityList.toString();
    }
//doswiadczenie malejąco, wiek pracownika rosnąco, alfabetycznie
    public void sort(){
        this.getWorkers().sort(new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                int result = Integer.compare(o1.getExperience(), o2.getExperience());
                result *= -1;
                if (result == 0) {
                    result = Integer.compare(o1.getAge(), o2.getAge());
                    if (result == 0) {
                        result = o1.getName().compareTo(o2.getName());
                    }
                }
                return result;
            }
        });
    }
}
