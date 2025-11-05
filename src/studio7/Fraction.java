package studio7;

public class Fraction {
    private double numerator;
    private double denominator;

    public Fraction(double numerator, double denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction b){
        return new Fraction(this.numerator*b.denominator+b.numerator*this.denominator, this.denominator*b.denominator);
    }

    public Fraction subtract(Fraction b){
        return new Fraction(this.numerator*b.denominator-b.numerator*this.denominator, this.denominator*b.denominator);
    }

    public Fraction multiply(Fraction b){
        return new Fraction(this.numerator*b.numerator, this.denominator*b.denominator);
    }
    // public Fraction simplify(){
        // if()
        // return;
    }

    public Fraction reciprocal(){
        return new Fraction(this.denominator, this.numerator);
    }
    public static void main(String[] args){

    }
}
