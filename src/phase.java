
public class phase {
	
	private String Pname;
	private deliverable[] de;
	private int nb;
	
	public phase(String pname, int size) {
		
		Pname = pname;
		de = new deliverable[size] ;
		nb=0;
	}
	
public void adddeliverable(deliverable d) {
		
		if(nb<de.length)
		{
			de[nb++]=d;
		}
		else
			System.out.println("wrong");
		
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
