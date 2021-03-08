
public class Complaint {

	public String ComplaintID;
	public Boolean ComplaintStatus;
	public String Comp_Details;
	public CompType TypeOfComp;
	
	
	public Complaint(String complaintID, Boolean complaintStatus, String comp_Details, CompType typeOfComp) {
		
		ComplaintID = complaintID;
		ComplaintStatus = complaintStatus;
		Comp_Details = comp_Details;
		TypeOfComp = typeOfComp;
	}


	public Complaint() {
		
		ComplaintID = "CXT123";
		ComplaintStatus = true;
		Comp_Details = "Improper Insalation";
		TypeOfComp = TypeOfComp;
	}
	
public Complaint(Complaint c) {
		
		ComplaintID = c.ComplaintID;
		ComplaintStatus = c.ComplaintStatus;
		Comp_Details = c.Comp_Details;
		TypeOfComp = c.TypeOfComp;
	}


	public String getComplaintID() {
		return ComplaintID;
	}
	
	
	public void setComplaintID(String complaintID) {
		ComplaintID = complaintID;
	}
	
	
	public Boolean getComplaintStatus() {
		return ComplaintStatus;
	}
	
	
	public void setComplaintStatus(Boolean complaintStatus) {
		ComplaintStatus = complaintStatus;
	}
	
	
	public String getComp_Details() {
		return Comp_Details;
	}
	
	
	public void setComp_Details(String comp_Details) {
		Comp_Details = comp_Details;
	}
	
	
	public CompType getTypeOfComp() {
		return TypeOfComp;
	}
	
	
	public void setTypeOfComp(CompType typeOfComp) {
		TypeOfComp = typeOfComp;
	}


	@Override
	public String toString() {
		return "Complaint [ComplaintID=" + ComplaintID + ", ComplaintStatus=" + ComplaintStatus + ", Comp_Details="
				+ Comp_Details + ", TypeOfComp=" + TypeOfComp + "]";
	}
		

	
}
