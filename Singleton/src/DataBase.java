public class DataBase {
    // we introduce the keyword volatile as when many threads are accessing the instance
    // they will copy the value to their local cache and won't the updated value which may got changed by other threads
    // so to flush down the updated value in their local cache we use this keyword
    private static volatile DataBase dataBase = null;

    // this print line is to check if the constructor is called more than one time or not
    private DataBase() {
        System.out.println("DataBase instance created");
    }

    // this method is intentionally static as we made the constructor private
    // making this function synchronized will make sure that only one thread will access this function
    // but is this code worth it? we just want the if condition to be thread safe
    // also there is no need of using synchronized once the instance is created
    // bcz other threads would be waiting
    public static DataBase getDataBaseInstance() {
        if (dataBase == null) {
            // only this line needs to be thread safe
            // so it's better to remove synchronized keyword from function
            // and add to this line ... also reflection id concept is used
            synchronized (DataBase.class) {

                // but this is also not good as suppose two threads are accessed the method and they cross the if
                // condition then they will eventually be creating two instances of this class
                // to solve this problem we introduce double checking
                if (dataBase == null) {
                    dataBase = new DataBase();
                }
            }
            // earlier to get the instance all the threads were waiting which was taking a lot of time
            // to do some heavy work
        }
        return dataBase;
    }


}
