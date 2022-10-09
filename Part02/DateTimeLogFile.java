package Part02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeLogFile extends LogFile {

    @Override
    public void log(String message) {
       
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println(dtf.format(now) + " " + message);
        
    }
    
}
