
public class Activity {
	
	  private String id;
	  private int duration;
	  private String resources;
	  private int est;
	  private int lst;
	  private int ef;
	  private int lf;
	  private Activity[] successors;
	  private Activity[] predecessors;
	  
	  //just a concept 
	  
	  public Activity (String d,int dur) {
		  id=d;
		  duration=dur;
		  predecessors= new Activity[3];
		  successors = new Activity[3];
		  resources=null;
		  est=0;
		  lst=0;
		  ef=0;
		  lf=0;
	  }
	  
	  




	public String getResources() {
		return resources;
	}





	public void setResources(String resources) {
		this.resources = resources;
	}





	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getEst() {
		return est;
	}
	public void setEst(int est) {
		this.est = est;
	}
	public int getLst() {
		return lst;
	}
	public void setLst(int lst) {
		this.lst = lst;
	}
	public int getEf() {
		return ef;
	}
	public void setEf(int ef) {
		this.ef = ef;
	}
	public int getLf() {
		return lf;
	}
	public void setLf(int lf) {
		this.lf = lf;
	}
	public Activity[] getSuccessors() {
		return successors;
	}
	public void setSuccessors(Activity[] successors) {
		this.successors = successors;
	}
	public Activity[] getPredecessors() {
		return predecessors;
	}
	public void setPredecessors(Activity[] predecessors) {
		this.predecessors = predecessors;
	}

}
