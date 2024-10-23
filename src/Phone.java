public class Phone implements Chargeable
{
    @Override
    public void charge()
    {
        System.out.println("using a 67W type-C charger");
    }

    public void takeAPic()
    {
        System.out.println("Snap");
    }

    public void makeACall()
    {
        System.out.println("ring ring");
    }


}
