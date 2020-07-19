
public class Project {
	
	private phase[] phases;
	private int nb;


	public Project( int size) {
		
		
		phases = new phase [size];
		
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
