package Question_Practice;

public class mainProgram {
    public static void main(String[] args) {
        FractionClass f = new FractionClass();
        f.display();
        FractionClass f1 = new FractionClass(2,2);
        f1.display();
        FractionClass f2 = new FractionClass(1,2);
        f = f.add(f1,f2);
        f.display();
        f = f.subtract(f1,f2);
        f.display();
        f = f.multiply(f1,f2);
        f.display();
        f = f.divide(f1,f2);
        f.display();
        ArrayList arr = new ArrayList();
        System.out.println("Size = " + arr.size());
        System.out.println("Capacity = " + arr.capacity());
        arr.add(1);
        System.out.println("Size = " + arr.size());
        System.out.println("Capacity = " + arr.capacity());
        arr.add(2);
        System.out.println("Size = " + arr.size());
        System.out.println("Capacity = " + arr.capacity());
        arr.add(3);
        System.out.println("Size = " + arr.size());
        System.out.println("Capacity = " + arr.capacity());
        arr.add(4);
        System.out.println("Size = " + arr.size());
        System.out.println("Capacity = " + arr.capacity());
        arr.add(5);
        System.out.println("Size = " + arr.size());
        System.out.println("Capacity = " + arr.capacity());
        arr.display();
        arr.set(0,10);
        arr.display();
        arr.set(8,90);
        arr.display();
        System.out.println(arr.capacity());
    }
}
