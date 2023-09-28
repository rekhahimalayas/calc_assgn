package calc_app.calc.others;

public class main_demo {
    public static void main(String[] arr) {
        
        food_delivery_app.order_builder order_builder = new food_delivery_app.order_builder("best restraunt", "rekha", "maruthi temple road", "+91 91560199789");
        food_delivery_app order = order_builder.get_special_instructions("no onions and less oil pls").build();
        order.place_order();
    }
}
