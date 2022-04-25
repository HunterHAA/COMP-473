package Subject;

import java.util.Date;

import ObserverPattern.FacilityUseObserver;

public interface FacilityUseSubject 
{
	public void addObserver(FacilityUseObserver fuo);
	public void removeObserver(FacilityUseObserver fuo);
	public void update();
}
