
package calc_app.calc;

import calc_app.calc.factories.adv_calc_factory;
import calc_app.calc.factories.icalc_factory;


public class calc_app {
    public static void main(String[] atr) {
        icalc_factory fact = new adv_calc_factory();
        icalculator1 calc = new advanced_calculator();
        double res = calc.add(78, 34);
        System.out.println("res: " + res);
    }
}