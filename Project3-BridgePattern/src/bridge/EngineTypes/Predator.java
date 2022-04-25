package bridge.EngineTypes;

public class Predator implements FancyEngines
{
	int horsepower;

    public Predator(){
        horsepower = 760;
    }

    @Override
    public int run() {
        System.out.println("\nThe Shelby Mustang GT500 is using Ford Supercharged 5.2-Liter V8 engine. It is also called A Predator because "
        					+ " it makes a massive "
        					+ horsepower
        					+ " horsepower for the Ford Mustang Shelby GT500, making it the most powerful Mustang to date.");
        return horsepower;
    }
}
