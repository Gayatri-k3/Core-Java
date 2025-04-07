public class ElectronicsRunner {
    public static void main(String[] args) {
        Electronics electronics = new Electronics("Galaxy Tab S6");
        electronics.show();

        Electronics electronics1 = new Electronics("Samsung", "Tablet", "Galaxy Tab S7");
        electronics1.show();

        Electronics electronics2 = new Electronics("Apple", "Smartphone", "iPhone 15", 999);
        electronics2.show();

        Electronics electronics3 = new Electronics(2, true);
        electronics3.show();

        Electronics electronics4 = new Electronics(3, true, true);
        electronics4.show();
    }
}
