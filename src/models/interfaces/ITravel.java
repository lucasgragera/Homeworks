package models.interfaces;

public interface ITravel {
    public void travel();

    default public void travels(){
        System.out.println("Default method");
    }
}
