package ConstructorInJAVA;

public class Warrior {
    // Default Data Members
    String name;
    int attack;
    int health;
    int defense;
    String skill;
    static int WarriorNo;
    private final static String detail = "Mahabharata Warrior karna is made automatically by default constructor";
    // Public Default Constructor
    public Warrior(){
        name = "Karna";
        skill = "Outstanding Archer";
        attack = 150;
        defense = 1000000;
        health = 2000;
        WarriorNo ++;
    }
    // Default Parameterized Constructor
    Warrior(String name,String skill,int attack,int defense,int health){
        this.name = name;
        this.skill = skill;
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        WarriorNo ++;
    }
    // Public Parameterized Constructor
    public Warrior(int health,String skill,String name,int attack,int defense){
        this.name = name;
        this.skill = skill;
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        WarriorNo ++;
    }
    // Public Member Functions
    public void display(){
        System.out.println("Warrior name is " + name);
        System.out.println("Skill of the Warrior is " + skill);
        System.out.println("Attack of the Warrior is " + attack);
        System.out.println("Defense of the Warrior is " + defense);
        System.out.println("Health of the Warrior is " + health);
    }
    // Getter
    public String getDetail(){
        return detail;
    }
    // Static Getter Function
    public static String getDetailbyClassWarriorAndObject(){
        return detail;
    }
}
