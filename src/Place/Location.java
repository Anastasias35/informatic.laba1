package Place;
import Interface.Conditionchecker;
import Persons.Person;

public  abstract  class Location implements Conditionchecker {
    protected final String name;
    protected final int height;
    protected final boolean lowpressure;
    protected final boolean exit;
    public Location(String name,int height, boolean lowpressure,boolean exit){
        this.name=name;
        this.height=height;
        this.lowpressure=lowpressure;
        this.exit=exit;
    }
    public void output(Person person){
        if (exit){
            System.out.println(person.getName() + " добрались до выхода");
        }
        else {
            System.out.println(person.getName()+ " еще не добрались до выхода");
        }
    }
    public void Sneak(Person person){
        System.out.println(person.getName() +" пробираются в " + name);
        if (lowpressure){
            System.out.println("у" + person.getName() + " возникают проблемы");
        }
        printCondition();
        output(person);

    }
    public String getName(){
        return name;
    }
    public boolean getExit(){
        return exit;
    }
    public int getHeight(){
        return height;
    }
    public boolean getLowpressure(){
        return lowpressure;
    }
    @Override
    public boolean condition(){
        return lowpressure;
    }
    public void printCondition(){
        System.out.println(condition() ? "Воздух разреженный в " + getName():  "Воздух неразреженный в " + getName());}
    @Override
    public String toString() {
        return "Location{" + "name='" + name + '\'' + ", height=" + height + ", lowpressure=" + lowpressure + ", exit=" + exit + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return height == location.height &&
                lowpressure == location.lowpressure &&
                exit == location.exit &&
                Objects.equals(name, location.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, height, lowpressure, exit);
    }
}
