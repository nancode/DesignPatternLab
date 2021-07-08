package ProgrammingUsingInterfaces;


interface DisplayModule{
     void display();

}

class Monitor implements DisplayModule{
    // why is this required to be public.
    public void display() {
        System.out.println("This is displayed on a Monitor");
    }
}

class Projector implements DisplayModule{
    public void display() {
        System.out.println("This is displayed on a Projector");
    }
}

public class Computer {
    public static void main(String[] args){
        DisplayModule firstOption = new Monitor();
        DisplayModule alternateOption = new Projector();
        firstOption.display();
        alternateOption.display();
    }
}
