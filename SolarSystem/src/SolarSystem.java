public class SolarSystem {
    String Galaxy;
    int no_of_planets;
    String planet;
    boolean supports_life;
    int rotation_time;
    int revolution_time;
    boolean has_rings;
    int no_of_moons;
    String position;
    String temperature;

    public SolarSystem(String planet) {
        this.planet = planet;
        System.out.println("Planet name constructor");
    }

    public SolarSystem(String Galaxy, int no_of_planets, String planet) {
        this(planet);
        this.Galaxy = Galaxy;
        this.no_of_planets = no_of_planets;
        System.out.println("Galaxy, number of planets, and planet name constructor");
    }

    public SolarSystem(String Galaxy, int no_of_planets, String planet, boolean supports_life) {
        this(Galaxy, no_of_planets, planet);
        this.supports_life = supports_life;
        System.out.println("Galaxy, number of planets, planet name, and supports life constructor");
    }

    public SolarSystem(int rotation_time, int revolution_time) {
        this.rotation_time = rotation_time;
        this.revolution_time = revolution_time;
        System.out.println("Rotation and revolution time constructor");
    }

    public SolarSystem(int rotation_time, int revolution_time, boolean has_rings) {
        this(rotation_time, revolution_time);
        this.has_rings = has_rings;
        System.out.println("Rotation, revolution time, and has rings constructor");
    }

    public void show() {
        System.out.println("\nSolar System Details");
        System.out.println("Galaxy: " + Galaxy);
        System.out.println("Number of Planets: " + no_of_planets);
        System.out.println("Planet: " + planet);
        System.out.println("Supports Life: " + supports_life);
        System.out.println("Rotation Time: " + rotation_time);
        System.out.println("Revolution Time: " + revolution_time);
        System.out.println("Has Rings: " + has_rings);
        System.out.println("Number of Moons: " + no_of_moons);
        System.out.println("Position: " + position);
        System.out.println("Temperature: " + temperature);
    }
}
