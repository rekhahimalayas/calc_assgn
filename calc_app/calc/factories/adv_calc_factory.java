package calc_app.calc.factories;
import calc_app.calc.advanced_calculator;
import calc_app.calc.icalculator1;

public class adv_calc_factory implements icalc_factory {
    public icalculator1 create_calc() {
        return new advanced_calculator();
    }

}