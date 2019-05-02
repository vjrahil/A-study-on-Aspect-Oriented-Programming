public class StudentProxy extends Student {
    public String getName() {
        new LoggingAspect().getNameAdvice();
        return super.getName();
    } 
}