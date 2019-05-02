/**
 * Aop
 */

/*the code specifies how the weaving creates a proxy class and works with it.*/ 
public class Aop {

    public static void main(String[] args) {
        SpringService springService = new SpringService();
        Student student = (Student) springService.getBean("student");
        student.getName();
    }
}