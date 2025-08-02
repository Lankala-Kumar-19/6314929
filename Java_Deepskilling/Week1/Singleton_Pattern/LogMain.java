
public class LogMain {
    public static void main(String[] args) {
        Logger logger=Logger.getInstance();
        Logger logger2=Logger.getInstance();
        logger.log("Hello");
        System.out.println((logger==logger2) ? "Same instance": "Not same instance");
    }
}
