package calc_app.calc.others;

public class food_delivery_app {
    String rest;
    String name;
    String addr;
    String ph_num;
    String spec_ins;

    private food_delivery_app(order_builder other) {
        this.rest = other.rest;
        this.name = other.name;
        this.addr = other.addr;
        this.ph_num = other.ph_num;
        this.spec_ins = other.special_instructions;
    }
    public String getRest() {
        return rest;
    }
    public String getName() {
        return name;
    }
    public String getAddr() {
        return addr;
    }
    public String getPh_num() {
        return ph_num;
    }

    public void place_order() {
        System.out.println("order placed from res: "+ this.rest);
        System.out.println("name: "+name);
        System.out.println("phone num: "+ ph_num);
        System.out.println("addr: "+addr);
        System.out.println("special instructions: "+ spec_ins);
    }
    
    public static class order_builder {
        String rest;
        String name;
        String addr;
        String ph_num;
        String special_instructions;

        public order_builder(String rest, String name, String addr, String ph_num) {
            this.rest = rest;
            this.name = name;
            this.addr = addr;
            this.ph_num = ph_num;
        }

        public order_builder get_special_instructions(String ins) {
            special_instructions = ins;
            return this;
        }

        public food_delivery_app build() {
            return new food_delivery_app(this);
        }
    }
}
