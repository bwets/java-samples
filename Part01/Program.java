package Part01;


public class Program {
    
    public static void main(String args[]) {

                 
        LogFile simpleLog = new SimpleLogFile();
        simpleLog.log("this is a simple message");

        LogFile dateLog = new DateTimeLogFile();
        dateLog.log("this is a message with date/time");
    
        Currency euro =new EuroCurrency();
        euro.formatPrice(523);

        Currency pound =new UKCurrency();
        pound.formatPrice(523);

        Currency dollar =new USCurrency();
        dollar.formatPrice(523);
    }
}
