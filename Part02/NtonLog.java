package Part02;

public  class NtonLog {
    private static final int MaxLoggers = 5;
    private static int LastLogger = 0;
    private static final LogFile[] instances = new LogFile[5];

    public static LogFile getInstance(){
        if(instances[LastLogger] == null) {
            instances[LastLogger] = new DateTimeLogFile();
        }
        System.out.println("Nton: " + LastLogger);
        LogFile instance = instances[LastLogger];
        LastLogger ++;
        if(LastLogger>4) LastLogger = 0;
        return instance;

    }
}
