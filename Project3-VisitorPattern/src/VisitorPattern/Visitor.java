package VisitorPattern;

public interface Visitor 
{
	public void visitFacility(Facility.Facilities facilities);
	public void visitFacilityMaintanence(FacilityMaintanence.FacilityMaintanenceRequest facilityMaintanenceRequest);
	public void visitFacilityUse(FacilityUse.FacilityUseRequest facilityUseRequest);
}
