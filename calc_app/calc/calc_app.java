
package calc_app.calc;

import calc_app.calc.factories.adv_calc_factory;
import calc_app.calc.factories.icalc_factory;
import factories.*;

public class calc_app {
    public static void main(String[] atr) {
        icalc_factory fact = new adv_calc_factory();
        double res = fact.create_calc().sqrt(78);
        System.out.println("res: " + res);
    }
}