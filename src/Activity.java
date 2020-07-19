
public class Activity {
	
	  private String name;
	  private int duration;
	  private String resources;
	  private int est;
	  private int lst;
	  private int ef;
	  private int lf;
	private int id;
	private Activity[] successors;
	 private Activity[] predecessors;
	 private String predName;
	 private String succName;
	 
	 
		  
		  //just a concept 
		  

	  public Activity (String names,int dur,int ids,String pred,String succ) {
		  predName=pred;
		  succName=succ;
		  name=names;
		  id=ids;
		  duration=dur;
		  predecessors= new Activity[3];
		  successors = new Activity[3];
		  resources=null;
		  est=0;
		  lst=0;
		  ef=0;
		  lf=0;
	  }
	  
	  

	  
	  public String getPredName() {
		return predName;
	}




	public void setPredName(String predName) {
		this.predName = predName;
	}




	public String getSuccName() {
		return succName;
	}




	public void setSuccName(String succName) {
		this.succName = succName;
	}




	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}



	public String getResources() {
		return resources;
	}





	public void setResources(String resources) {
		this.resources = resources;
	}





	public int getId() {
		return id;
	}
	public void setId(int id) {
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
