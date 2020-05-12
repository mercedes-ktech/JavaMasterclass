import java.util.*;

public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>(); //this variable belongs to the class. it will be initialized only once,
    //at the start of execution.
    //a single copy will be shared by all instances of the class
    //it can be accessed with the class name. it doesn't need any object.
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88, BodyType.PLANET);
        //new object of type HeavenlyBody
        solarSystem.put(temp.getName(), temp);
        //put an element with "Mercury" as key and object "temp" as value into the map called solarSystem
        planets.add(temp);
        //add the HeavenlBody "temp" to the set "planets"


        //now add a few more planets
        temp = new HeavenlyBody("Venus", 225, BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225, BodyType.MOON);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365, BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 28, BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon); //add to map
        temp.addMoon(tempMoon); //add the moon to the HeavenlyBody called "temp"

        temp = new HeavenlyBody("Mars", 687, BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Deimos", 1.3, BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new HeavenlyBody("Phobos", 0.3, BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        temp = new HeavenlyBody("Jupiter", 4332, BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io", 1.8, BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Europa", 3.5, BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Ganymede", 7.1, BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Callisto", 16.7, BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        temp = new HeavenlyBody("Saturn", 10759, BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus", 30660, BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 165, BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 248, BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for(HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Jupiter"); //grab planet Jupiter from the solarSystem map
        System.out.println("Moons of Jupiter");
        for(HeavenlyBody jupiterMoon : body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getName()); //i don't understand how/why "upiterMoon.getName()" returns the name of the moon (satellite)
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All moons");
        for(HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }

        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842, BodyType.PLANET);
        planets.add(pluto);

        for(HeavenlyBody planet : planets) {
            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }

        solarSystem.forEach((k, v) -> {
            System.out.println("KEY: " + k + " // VALUE: " + v.getName() + " // BODY TYPE: " + v.getBodyType().toString());
        });


        Object o = new Object();
        o.equals(o);
        "pluto".equals("");

        HeavenlyBody earth1 = new HeavenlyBody("Earth", 365, BodyType.PLANET);
        HeavenlyBody earth2 = new HeavenlyBody("Earth", 365, BodyType.PLANET);

        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth1.equals(pluto));
        System.out.println(pluto.equals(earth1));




    }
}
