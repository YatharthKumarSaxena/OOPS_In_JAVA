package Question_Practice;
public class FractionClass {
    private int numerator;
    private int denominator;
    // Default Parameterized Constructor
    FractionClass(int numerator,int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    // Public Default Constructor
    public FractionClass(){
        numerator = 0;
        denominator = 1;
    }
    // Public Member Function
    public void display(){
        System.out.println("Your Fraction :- " + numerator + "/" + denominator);
    }
    // Private Member Function
    private void simplify(){
        int num = numerator;
        int den = denominator;
        int limit = Math.min(num,den);
        int divide = 1;
        for(int i=limit;i>1;i--){
            if((num%i == 0) && (den%i == 0)){
                divide = i;
            }
        }
        numerator /= divide;
        denominator /= divide;
        return ;
    }
    // Public Member Function
    public FractionClass add(FractionClass f1, FractionClass f2){
        int den = f1.denominator * f2.denominator;
        int num = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        FractionClass f = new FractionClass(num,den);
        return f;
    }
    public FractionClass multiply(FractionClass f1, FractionClass f2){
        int den = f1.denominator * f2.denominator;
        int num = f1.numerator * f2.numerator;
        FractionClass f = new FractionClass(num,den);
        return f;
    }
    public FractionClass divide(FractionClass f1, FractionClass f2){
        int den = f1.denominator * f2.numerator;
        int num = f1.numerator * f2.denominator;
        FractionClass f = new FractionClass(num,den);
        return f;
    }
    public FractionClass subtract(FractionClass f1, FractionClass f2){
        int den = f1.denominator * f2.denominator;
        int num = f1.numerator * f2.denominator - f2.numerator * f1.denominator;
        FractionClass f = new FractionClass(num,den);
        return f;
    }
}
