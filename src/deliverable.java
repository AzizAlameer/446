
public class deliverable {
	private String dname;
	private Activity[] activities;
	
	
	public deliverable(String dname,int size) {
		
		this.dname = dname;
		activities = new Activity[size];;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public Activity[] getActivities() {
		return activities;
	}


	public void setActivities(Activity[] activities) {
		this.activities = activities;
	}
	
	

}
