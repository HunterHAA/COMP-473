package ObserverPattern;

import java.util.Date;

import Facility.Facility;

public interface FacilityUseObserver {
	public void update(Date startDate, Date endDate, Facility facility, String clientName, String usingPurpose);
}
