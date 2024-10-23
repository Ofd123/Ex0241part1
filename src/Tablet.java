import java.util.Optional;

public class Tablet implements Chargeable
{

    @Override
    public void charge()
    {
        System.out.println("using a 15W type-C charger");
    }

    public void takeANote()
    {
        System.out.println("opening note pad");
    }


}
