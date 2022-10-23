package vehicles;

/**CODIGO REALIZADO POR SEBASTIAN ARANA.**/

public class TestedV {
    public static void main(String[] args)          {
        System.out.println("\nManufactured: "+ Vehicle.MAKE);
        System.out.println("\nNumber of vehicles manufactured: "+ Vehicle.numVehicles);
        
        Vehicle vehicle1 = new Vehicle("Vision");
        System.out.println(vehicle1);
        
        Vehicle vehicle2 = new Vehicle("Edict");
        System.out.println(vehicle2);
        
        vehicle2.setmodel("Seer");
        System.out.println(vehicle1);
        System.out.println(vehicle2);
        
        Vehicle.Engine vehicle3  = new Vehicle.Engine("Fortune");
        System.out.println("\nVehicle number "+ vehicle3.getChasissNo() + "is a" + vehicle3.getmodel() + "model and has an engine capacity of " + vehicle3.getCAPACITY() + "cc");
        
        System.out.println("\nNumber of vehicles manufactured: "+ Vehicle.numVehicles);
    }    
}
