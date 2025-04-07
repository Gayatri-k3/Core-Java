public class Electronics {
    String brand;
    String device_type;
    String model;
    int price;
    boolean is_smart;
    int warranty_in_years;
    String color;
    double weight;
    String power_source;
    boolean is_portable;

    public Electronics(String model) {
        this.model = model;
        System.out.println("Model-only constructor");
    }

    public Electronics(String brand, String device_type, String model) {
        this(model);
        this.brand = brand;
        this.device_type = device_type;
        System.out.println("Brand, device type, and model constructor");
    }

    public Electronics(String brand, String device_type, String model, int price) {
        this(brand, device_type, model);
        this.price = price;
        System.out.println("Brand, device type, model, and price constructor");
    }

    public Electronics(int warranty_in_years, boolean is_smart) {
        this.warranty_in_years = warranty_in_years;
        this.is_smart = is_smart;
        System.out.println("Warranty and smart feature constructor");
    }

    public Electronics(int warranty_in_years, boolean is_smart, boolean is_portable) {
        this(warranty_in_years, is_smart);
        this.is_portable = is_portable;
        System.out.println("Warranty, smart feature, and portability constructor");
    }

    public void show() {
        System.out.println("\n--- Electronics Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Device Type: " + device_type);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Smart Device: " + is_smart);
        System.out.println("Warranty: " + warranty_in_years + " year(s)");
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Power Source: " + power_source);
        System.out.println("Portable: " + is_portable);
    }
}
