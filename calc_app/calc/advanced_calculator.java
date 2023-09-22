package calc_app.calc;

public class advanced_calculator extends basic_calculator{
    public double sqrt(int num) {
        if (num < 0) {
            throw new IllegalArgumentException();
        }

        return Math.sqrt(num);
    }
}