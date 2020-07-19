
public class Project {
	
	private phase[] phases;
	private int nb;
	
	
	public Project( int size) {
		
		
		phases = new phase [size];
		
	}
	
	
	private int nba;
	private int nba2;
	
	public int getNba() {
		return nba;
	}

	public void setNba(int nba) {
		this.nba = nba;
	}
	private Activity[] allactivity = new Activity[nba];
	
	public void combineActivity() {
		for (int i = 0; i <= phases.length; i++) {
			
			deliverable[] del = phases[i].getDe();
			
			for(int j =0; j<= del.length; j++) {
				Activity[] activ = del[j].getActivities();
				
				for (int m =0; m<=activ.length; m++) {
					addacc(activ[m]);
				}
				
			}
		
		}
		return;
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
	
public void addacc(Activity k) {
	
	
	allactivity[nba2++]=k;
		
	
}
	

}
