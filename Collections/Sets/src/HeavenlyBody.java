import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody { //final class can't be subclassed
    private final String name; //this is a "blank final variable" because it hasn't been initialized
    private final double orbitalPeriod; //
    private final Set<HeavenlyBody> satellites;
    private BodyType bodyType;

    public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyType = bodyType;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites); //a new hashset of the current contents of "satellite"
        //the code that calls this method doesn't have access to our original hashset
    }

    public boolean addMoon(HeavenlyBody moon) {
        if(moon.getBodyType() == BodyType.MOON) {
            return this.satellites.add(moon); //adding moon to the hashset called satellites
        }
        return false;
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if((obj == null) || (obj.getClass() != this.getClass())) { //this is to make sure that subclasses don't compare equal
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        BodyType objType = ((HeavenlyBody) obj).getBodyType();

        return this.bodyType.equals(objType) && this.name.equals(objName);
    }


//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj) {
//            return true;
//        }
//
//        System.out.println("obj.getClass() is " + obj.getClass());
//        System.out.println("this.getClass() is " + this.getClass());
//        if ((obj == null) || (obj.getClass() != this.getClass())) {
//            return false;
//        }
//
//        String objName = ((HeavenlyBody) obj).getName();
//        return this.name.equals(objName);
//    }


    @Override
    public int hashCode() {
        System.out.println("hashCode() called");
        return this.name.hashCode() + 57;
    }



}
