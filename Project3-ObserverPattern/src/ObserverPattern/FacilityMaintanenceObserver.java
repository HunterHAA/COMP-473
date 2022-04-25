package ObserverPattern;

import java.util.Date;

public interface FacilityMaintanenceObserver 
{
	public void update(String usage, Date startTime, int cost, int facilityDownTime, boolean maintenanceStatus);
}
