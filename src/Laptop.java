public class Laptop implements Chargeable
{

    @Override
    public void charge()
    {
        System.out.println("using the AC adapter charger");
    }

    public void work()
    {
        System.out.println("creating an app");
    }
}
