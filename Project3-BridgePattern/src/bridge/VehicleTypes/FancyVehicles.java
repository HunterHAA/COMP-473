package bridge.VehicleTypes;

import bridge.EngineTypes.FancyEngines;

public abstract class FancyVehicles 
{
    FancyEngines engine;
    
    public void setEngine(FancyEngines engine){
        this.engine = engine;
        System.out.println("\nThis vehicle uses the " + engine + " engine.");
    }

    public abstract void driving();
}
