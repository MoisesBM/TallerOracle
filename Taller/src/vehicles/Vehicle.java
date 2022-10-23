package vehicles;

public class Vehicle {

    public final static String MAKE = "Augur";
    public static int numVehicles = 0;

    public String chasissNo;
    public String model;

    public Vehicle(String model) {
        numVehicles++;
        chasissNo = "ch" + numVehicles;
        System.out.println("\nVehicle manufactered");

    }

    public static class Engine extends Vehicle{

        private static final String MAKE = "Predicter";
        public static int CAPACITY = 2222;
        
        public Engine(String model){
            super(model);
        }
        public static String getMAKE() {
            return MAKE;
        }
        public static int getCAPACITY() {
            return CAPACITY;
        }
    }

    /**
     * @return the chasissNo
     */
    public String getChasissNo() {
        return chasissNo;
    }

    /**
     * @param chasissNo the chasissNo to set
     */
    public void setChasissNo(String chasissNo) {
        this.chasissNo = chasissNo;
    }

    /**
     * @return the Model
     */
    public String getmodel() {
        return model;
    }

    /**
     * @param Model the Model to set
     */
    public void setmodel(String Model) {
        this.model = Model;
    }  

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "\nThe vehicle is manufactured by: " + Vehicle.MAKE + "\nThe model type is " + this.model + "\nThe chassis number is " + chasissNo + "\nThe engine make is " + Engine.getMAKE() + "\nThe engine capacity is " + Engine.getCAPACITY() + " CC";
    }

}
