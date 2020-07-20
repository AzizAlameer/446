
public class Project {
	
	private phase[] phases;
	private int nb;
	private int nba;
	
	public Project( int size) {
		
		nba=0;
		phases = new phase [size];
		
	}
	
	
	
	public int getNba() {
		return nba;
	}

	public void setNba(int nba) {
		this.nba = nba;
	}
	
	public Activity Search(String name) {
		
		for (int i = 0; i < phases.length; i++) {
			
				deliverable[] del = phases[i].getDe().clone();
				
				for(int j =0; j< del.length; j++) {
					
					Activity[] activ = del[j].getActivities().clone();
					
					for (int m =0; m<activ.length; m++) {
					if(name.equalsIgnoreCase(activ[m].getName())) {
						
						return activ[m];
					}
						
						
					}
					
				}
			
			}
		
		
		return null;
		
	}
	
	
	public Activity[] combineActivity() {
		
	int counter =0;
			Activity[] allactivity = new Activity[nba];
			//System.out.println(nba);
		for (int i = 0; i < phases.length; i++) {
		//	System.out.println(phases.length);
			deliverable[] del = phases[i].getDe().clone();
			
			for(int j =0; j< del.length; j++) {
				Activity[] activ = del[j].getActivities().clone();
				
				for (int m =0; m<activ.length; m++) {
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
