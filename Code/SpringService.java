/**
 * SpringService
 */
public class SpringService {

    public Object getBean(String thing) {
        if(thing.equals("student")){
            return new StudentProxy();
        }
        return null;
    }
}