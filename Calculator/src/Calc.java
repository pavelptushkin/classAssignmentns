public class Calc {

    public Calc() {

    }

    public double add(double first, double second){
        return first + second;
            }
    public double subtract(double first, double second){
        return first - second;
    }
    public double multiply(double first, double second){
        return first * second;
    }
    public double divide(double first, double second){
        return first / second;
    }

    public static void main(String[] args) {
        Calc nCalc = new Calc();
        System.out.println(nCalc.add(6,7));
        System.out.println(nCalc.subtract(7,6));
        System.out.println(nCalc.multiply(2,2));
        System.out.println(nCalc.divide(2,2));
    }
}
