
/**
 * Write a description of class Elevator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elevator
{
    //the current floor
    private int floor;
    private static final int MAX_FLOORS = 10;
    
    /**
     * Creates a Elevator object, the starting floor is 3
     */
    public Elevator(int onFloor)
    {
        floor = onFloor;
    }
    
    /**
     * increases the floor by 1
     */
    public void up()
    {
        if(floor < MAX_FLOORS){
        floor += 1;
    }
}
    
    /**
     * decreases the floor by 1
     */
    public void down()
    {
        if(floor > 0){
        floor -= 1;
    }
}

/**
 * entering any number displays what floor the elevator is on
 */
public int getFloor(int onFloor)
{
    return floor;
}
}
    

