
public class deliverable {
	private String dname;
	private Activity[] activities;
	private int nb;
	
	
	public deliverable(String dname,int size) {
		
		this.dname = dname;
		activities = new Activity[size];;
		nb=0;
	}

	public void addActivity(Activity A) {
		
		if(nb<activities.length)
		{
			activities[nb++]=A;
		}
		else
			System.out.println("wrong");
		
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
