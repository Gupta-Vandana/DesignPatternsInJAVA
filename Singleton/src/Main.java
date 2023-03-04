import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//      this code verifies that this is not thread safe as the constructor is called twice
//      this code runs at almost same time
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> DataBase.getDataBaseInstance());
        executorService.execute(() -> DataBase.getDataBaseInstance());
//        testing code for singleton pattern but this is not thread safe
//        DataBase dataBase1 = DataBase.getDataBaseInstance();
//        DataBase dataBase2 = DataBase.getDataBaseInstance();
//        System.out.println(dataBase1);
//        System.out.println(dataBase2);
    }
}