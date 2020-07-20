
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
	
	
	public void Forward(Activity[] all) {
		
		for(int i=0;i<all.length;i++) {
			if(all[i].getPredName().equalsIgnoreCase("-1")) {
				all[i].setEst(0);
				all[i].setEf(all[i].getDuration());
				continue;
			}
			
			
			Activity preds[]=all[i].getPredecessors().clone();
			
			int max = preds[0].getEf();
			
			for(int j =0;j<all[i].getPredecessors().length;j++) {
			
				
				
				if(preds[j].getEf()>max) {
					max=preds[j].getEf();
					
				}
				
				
			}
			all[i].setEst(max);
			all[i].setEf(all[i].getEst()+all[i].getDuration());
			
		}
		
		
		
	}
	
	public void backward(Activity[] all) {
		
		
		Activity reverse[]=new Activity[all.length];
		int counter=0;
		  for(int i=all.length-1;i>=0;i--) {
			  
			  reverse[counter++]=all[i];
		
		}
		
		  for(int i=0;i<reverse.length;i++) {
			  
			 if(reverse[i].getSuccName().equalsIgnoreCase("-1")) {
				 
				 reverse[i].setLf(reverse[i].getEf());
				 
				 reverse[i].setLst(reverse[i].getLf()-reverse[i].getDuration());
				 continue;
				 
			 }
			 Activity succe[]=reverse[i].getSuccessors().clone();
			 
			 int min=succe[0].getLst();
			 
			 for(int j=0;j<reverse[i].getSuccessors().length;j++) {
				 
				 
				 if(succe[j].getLst()<min) {
					 
					 min=succe[j].getLst();
					 
				 }
			 }
			  
			 reverse[i].setLf(min);
			 
			 reverse[i].setLst(reverse[i].getLf()-reverse[i].getDuration());
			  
			  
		  }
		  
			for(int i=0;i<reverse.length;i++) {
				System.out.println(reverse[i].getName());
				System.out.println(reverse[i].getEf());
				System.out.println(reverse[i].getLf());
				System.out.println(reverse[i].getLst());
				System.out.println(reverse[i].getEst());

			}
		  
		
		
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
