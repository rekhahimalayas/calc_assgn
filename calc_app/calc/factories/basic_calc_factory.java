package calc_app.calc.factories;
import calc_app.calc.basic_calculator;
import calc_app.calc.icalculator1;

public class basic_calc_factory implements icalc_factory {
    public icalculator1 create_calc() {
        return new basic_calculator();
    }
}