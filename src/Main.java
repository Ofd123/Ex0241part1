public class Main
{
    public static void main(String[]args)
    {
        Chargeable[] devices = new Chargeable[5];
        devices[0] = new Phone();
        devices[1] = new Laptop();
        devices[2] = new Tablet();
        devices[3] = new Tablet();
        devices[4] = new Phone();
        for(int i = 0; i< devices.length; i++)
        {
            devices[i].charge();
        }
    }
}
