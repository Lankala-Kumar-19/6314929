public class Logger {
    private static int count=0;
    private Logger(){
        count++;
        System.out.println("Logger is "+count+" time initialized");
    }
    public static class LoggerHelper{
        private static final Logger INSTANCE=new Logger();
    }
    public static Logger getInstance(){
        return LoggerHelper.INSTANCE;
    }
    public void log(String s){
        System.out.println("Log message: "+s);
    }
}
