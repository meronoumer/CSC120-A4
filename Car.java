import java.util.ArrayList;

public class Car implements CarRequirements {
    private ArrayList passengers;
    private int capacity;


/**
 * Constructs a Car object with the given list of passengers and capacity.
 *
     * @param passengers The initial list of passengers in the car.
     * @param capacity   The maximum number of passengers the car can hold.

 */
public Car( ArrayList passengers, int Capacity) {
    this.passengers = new ArrayList<Passenger>(passengers); 
    this.capacity = capacity; 
}

/**
 * Returns the maximum passenger capacity of the car.
 *
 * @return The capacity of the car.
 */
public int getCapacity(){
    return capacity;

}

/**
 * Returns the number of seats remaining in the car.
 *
 * @return The number of available seats.
 */
public int seatsRemaining(){
     
    return this.capacity - this.passengers.size() ;

}

/**
 * Adds a passenger to the car if there is available space.
 *
 * @param p The passenger to add.
 * @return True if the passenger was added successfully, false otherwise.
 */
public Boolean addPassenger(Passenger p){
    if (seatsRemaining() > 0 && !this.passengers.contains(p)){
        this.passengers.add(p);
        return true;}

    else{
        return false;
    }
    


}

/**
 * Removes a passenger from the car if they are present.
 *
 * @param p The passenger to remove.
 * @return True if the passenger was removed successfully, false otherwise.
 */
public Boolean removePassenger(Passenger p){
    if(seatsRemaining() > 0 && this.passengers.contains(p)){
        this.passengers.remove(p);
        return true;
        
    }
    else{
        return false;
    }

}

/**
 * Prints the passenger manifest of the car.
 */
public void printManifest(){
    if (this.passengers.size()>0){
        System.out.println("----------------------");
        System.out.println("Passenger Manifest");
        for(Object person : passengers){
            System.out.println(person);
        }System.out.println("----------------------");
    }
    else{
        System.out.println("This car is empty.") ;
    }
}
}

