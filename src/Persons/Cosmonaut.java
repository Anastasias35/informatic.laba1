package Persons;
import Enum.Speed;

public class Cosmonaut extends Person {
    protected boolean MoveUp=true;
    public Cosmonaut(String name, int currentheight){
              super(name,currentheight);
              System.out.println("Создан персонаж " + name);
    }
    public void  Move(){
              if (this.currentheight>0) {
                  System.out.println(getName() +" " + Speed.Fast.getword() + " " +"поднимались" );
              }
              else {
                  System.out.println(getName() +  " стояли на месте");
              }
    }


}