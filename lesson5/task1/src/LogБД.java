public class LogБД extends LogFactory{
    private final String OUTPUT = "DbLogger –Log into database: ";
    @Override
    public void logWrite(String message) {
        message = "{" + message + "}";
        System.out.println(OUTPUT + message);
    }
}
