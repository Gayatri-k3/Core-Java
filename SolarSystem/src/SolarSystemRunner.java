public class SolarSystemRunner {
        public static void main(String[] args) {
            SolarSystem solarSystem1 = new SolarSystem("Earth");
            solarSystem1.show();

            SolarSystem solarSystem2 = new SolarSystem("Milky Way", 8, "Mars");
            solarSystem2.show();

            SolarSystem solarSystem3 = new SolarSystem("Milky Way", 8, "Venus", false);
            solarSystem3.show();

            SolarSystem solarSystem4 = new SolarSystem(24, 365);
            solarSystem4.show();

            SolarSystem solarSystem5 = new SolarSystem(10, 687, true);
            solarSystem5.show();
        }
}
