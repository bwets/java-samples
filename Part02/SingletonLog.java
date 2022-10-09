package Part02;

public class SingletonLog {
    private static final LogFile instance = new DateTimeLogFile();

    public static LogFile getInstance(){
        return instance;
    }
}
