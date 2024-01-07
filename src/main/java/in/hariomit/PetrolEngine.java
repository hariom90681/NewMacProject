package in.hariomit;

public class PetrolEngine implements IEngine
{

    public PetrolEngine(){
        System.out.println("Petrol Engine :: Constructo");
    }
    @Override
    public int start() {
        System.out.println("Petrol Engine Started");
        return 1;
    }
}
