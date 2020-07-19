
public class Project {
	
	private phase[] phases;
	private int nb;
	private int nba;
	
	public Project( int size) {
		
		
		phases = new phase [size];
		
	}
	
	
	
	public int getNba() {
		return nba;
	}

	public void setNba(int nba) {
		this.nba = nba;
	}
	
	
	public Activity[] combineActivity() {
		
	int counter =0;
			Activity[] allactivity = new Activity[nba];
			
		for (int i = 0; i <= phases.length; i++) {
			
			deliverable[] del = phases[i].getDe();
			
			for(int j =0; j<= del.length; j++) {
				Activity[] activ = del[j].getActivities();
				
				for (int m =0; m<=activ.length; m++) {
					allactivity[counter++]=activ[m];
				}
				
			}
		
		}
		return allactivity;
	}
	
public phase[] getPhases() {
		return phases;
	}

	public void setPhases(phase[] phases) {
		this.phases = phases;
	}

public void addphase(phase p) {
		
		if(nb<phases.length)
		{
			phases[nb++]=p;
		}
		else
			System.out.println("wrong");
		
	}
	


}
