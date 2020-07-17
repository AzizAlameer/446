
public class phase {
	
	private String Pname;
	private deliverable[] de;
	
	public phase(String pname, deliverable[] de) {
		super();
		Pname = pname;
		this.de = de;
	}
	

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public deliverable[] getDe() {
		return de;
	}

	public void setDe(deliverable[] de) {
		this.de = de;
	}
	
	
	
	
	
	

}
