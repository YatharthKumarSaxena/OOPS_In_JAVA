package ConstructorInJAVA;

public class ParameterizedConstructor {
    public static void main(String[] args) {
        System.out.println(Warrior.WarriorNo);
        Warrior w = new Warrior("Arjun","Outstanding Archer",170,523000,1800);
        System.out.println(Warrior.WarriorNo);
        Warrior s = new Warrior();
        System.out.println(Warrior.WarriorNo);
        Warrior n = new Warrior(2200,"Outstanding Archer","Eklavya",120,92000);
        w.display();
        s.display();
        n.display();
        System.out.println(w.getDetail());
        System.out.println(Warrior.WarriorNo); // Static Data Member is accessed by class
        System.out.println(Warrior.getDetailbyClassWarriorAndObject()); // Static Function is accessed by class
        // System.out.println(Warrior.getDetail()); // Non-static method 'getDetail()' cannot be referenced from a static context
    }
}
