package Subject;

import ObserverPattern.FacilityMaintanenceObserver;

public interface FacilityMaintanenceSubject 
{
	public void addObserver(FacilityMaintanenceObserver fmo);
	public void removeObserver(FacilityMaintanenceObserver fmo);
	public void update();
}
