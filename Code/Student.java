/**
 * Shape
 */
public class Student {
    public String name;
    public int ID;
    
    /**
     * @return the name
     */
    public String getName() {
        System.out.println("getName is called");
        return name;
    }
    /**
     * @return the iD
     */
    public int getID() {
        return ID;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param iD the iD to set
     */
    public void setID(int iD) {
        ID = iD;
    }
}