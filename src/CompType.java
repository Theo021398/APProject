
public class CompType {

	public Products ProductSpecificComplaint;
	public String WaitTimeComplaint;
	public String QualityOfServiceComplaint;
	
	//DEFAULT
	public CompType() {
		
		ProductSpecificComplaint = ProductSpecificComplaint;//find a change for this
		WaitTimeComplaint = "Lenghty Response time";
		QualityOfServiceComplaint = "Ill mannered employee / Suggestions to improve customer satisfaction";
	}

	//PRIMARY
	public CompType(Products productSpecificComplaint, String waitTimeComplaint, String qualityOfServiceComplaint) {
		
		ProductSpecificComplaint = productSpecificComplaint;
		WaitTimeComplaint = waitTimeComplaint;
		QualityOfServiceComplaint = qualityOfServiceComplaint;
	}
	
	//copy
	public CompType(CompType type) {
		
		ProductSpecificComplaint = type.ProductSpecificComplaint;
		WaitTimeComplaint = type.WaitTimeComplaint;
		QualityOfServiceComplaint = type.QualityOfServiceComplaint;
	}

	

	public Products getProductSpecificComplaint() {
		return ProductSpecificComplaint;
	}

	public void setProductSpecificComplaint(Products productSpecificComplaint) {
		ProductSpecificComplaint = productSpecificComplaint;
	}

	public String getWaitTimeComplaint() {
		return WaitTimeComplaint;
	}

	public void setWaitTimeComplaint(String waitTimeComplaint) {
		WaitTimeComplaint = waitTimeComplaint;
	}

	public String getQualityOfServiceComplaint() {
		return QualityOfServiceComplaint;
	}

	public void setQualityOfServiceComplaint(String qualityOfServiceComplaint) {
		QualityOfServiceComplaint = qualityOfServiceComplaint;
	}
		
	//getters and setters
		
			
		
	
}
