package Part02;

public class Program {
    
    public static void main(String args[]) {            
       

        SingletonLog.getInstance().log("this is a message with date/time");
    
        for(int i=0;i<10;i++){
            NtonLog.getInstance().log("MESSAGE " + i);
        }
       
    }
}
