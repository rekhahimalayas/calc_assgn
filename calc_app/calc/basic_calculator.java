package calc_app.calc;

public class basic_calculator implements icalculator1{
    public int add(int a, int b) {
        return (a+b);
    }

    public int sub(int a, int b) {
        return (a-b);
    }

    public int mul(int a, int b) {
        return (a*b);
    }

    public double div(int a, int b) {
        return (double)a/b;
    }
}