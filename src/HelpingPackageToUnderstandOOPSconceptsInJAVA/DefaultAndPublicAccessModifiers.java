package HelpingPackageToUnderstandOOPSconceptsInJAVA;
import java.util.Scanner;
import BASICS.Cars;
import ConstructorInJAVA.Warrior;
public class DefaultAndPublicAccessModifiers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cars C = new Cars();
        C.yearOfManufacture = 2023;
        // C.cost = 456677898.89; // Default Data Member cannot be accessed in the other package
        // C.specialDetectNo = 90; // Private Data Member cannot be accessed in any other file
        System.out.println(C.yearOfManufacture);
        // System.out.println(C.getYearOfManufacture()); // getYearOfManufacture() is not public in BASICS.Cars; cannot be accessed from outside package
        C.setSpecialDetectNo(89); // Setter is used to set value of private data member
        System.out.println(C.getSpecialDetectNo()); // Getter is used to access private data member
        Warrior w = new Warrior(); // Public Default Constructor from different package is called
        // Warrior w1 = new Warrior("Karna","Outstanding Archer",150,123,340); // Cannot make parameterized constructor as it is made default in other package file not public
        w.display();
    }
}
