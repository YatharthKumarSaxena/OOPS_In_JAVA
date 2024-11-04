package BASICS;

public class Cars {
    // Data Members

    // Default Data Member // Can be accessed in same package only;
    String name;
    String ModelNo;
    double cost;
    double mileage;

    // Private Data Member // Can be accessed in the same file
    private int specialDetectNo;

    // Public Data Member // Can be accessed in all package
    public int yearOfManufacture;

    // Member functions

    // Setters // Public Member functions
    public void setSpecialDetectNo(int specialDetectNo){
        this.specialDetectNo = specialDetectNo;
    }
    // Getters // Public Member functions
    public int getSpecialDetectNo(){
        return specialDetectNo;
    }
    // Public Member functions
    public String getName(){
        return name;
    }
    // Default Member functions
    int getYearOfManufacture(){
        return yearOfManufacture;
    }
    // Private Member functions
    private void hello(){
        System.out.println("I can be accessed in the same file only");
    }
}

