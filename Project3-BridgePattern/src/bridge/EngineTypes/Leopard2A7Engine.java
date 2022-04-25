package bridge.EngineTypes;

public class Leopard2A7Engine implements FancyEngines
{
	int horsepower;
	
    public Leopard2A7Engine(){
        horsepower = 1500;
    }
    
    public int run()
    {
        System.out.println("The Leopard 2A7 tank is powered by an MTU MB-873 Ka-501 turbocharged diesel, developing " + horsepower + " horsepower.");
        return horsepower;
    }
}
