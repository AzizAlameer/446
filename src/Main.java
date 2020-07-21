import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
	 
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter project name:");
		
		String PRname=s.next();
		
		System.out.println("Enter project start date:");
		
		String PRdate=s.next();
		
		
		System.out.println("Enter number of phases:");
		
		int num=s.nextInt();
		Project prject1 = new Project(num);
		int numacc = 0;
		for(int i=1;i<=num;i++) {
			
			
			System.out.println("Enter the name of phase "+i);
			
			String PHname=s.next();
			
			System.out.println("Enter the number of deliverables of phase "+i);
			
			int Dnum=s.nextInt();
			phase p = new phase(PHname, Dnum);
			
			for(int j=1;j<=Dnum;j++) {
				
				System.out.println("Enter the name of deliverable "+j);
				
				String Dname=s.next();
				
				System.out.println("Enter the number of activities for deliverable "+j);
				
				int Anum=s.nextInt();
				
				deliverable h = new deliverable(Dname, Anum);
				
				for(int k=1;k<=Anum;k++) {
					
					System.out.println("Enter the name of Activity "+k);
					
					
			     
			         String  Aname= s.next();
			         
			      
					
				
					System.out.println("Enter the duration of activity "+k);
					
					int duration=s.nextInt();

					System.out.println("Enter resources of activity "+k);

					String Resource=s.next();
					
					numacc++;
					String predname="";
					for(int l = 0;l<3;l++) {
					System.out.println("Enter predecessor of activity by name(-1 if nothing 0 if done) " +k);
					
					String poname=s.next();
					
					if(poname.equalsIgnoreCase("0")){
						break;
					}
					
					if(poname.equalsIgnoreCase("-1")) {
						predname=poname;
						break;
					}else {
						
						predname+=poname+" ";
					}
					
					
					
					}
					
					String succname="";
					
					for(int l = 0;l<3;l++) {
					
					System.out.println("Enter successors of activity (-1 if nothing 0 if done) "+k);
					
					String su=s.next();
					if(su.equalsIgnoreCase("0")){
						break;
					}
					
					if(su.equalsIgnoreCase("-1")) {
						succname=su;
						break;
					}else {
						
						succname+=su+" ";
					}
					
					
					}
					
					//System.out.println(predname);
					//System.out.println(succname);
					Activity test = new Activity(Aname, duration,predname,succname);
					test.setResources(Resource);
					
					
					
					h.addActivity(test);
					
					
					
				}
				p.adddeliverable(h);
				
				
				
			}

			prject1.addphase(p);
			
			

		}
		prject1.setNba(numacc);
		//System.out.println(prject1.getPhases().length);
		//phase testing [] = prject1.getPhases().clone();
		//System.out.println(testing[0].getDe().length);
		
		
		Activity Allact[]=prject1.combineActivity().clone();
		

	
		
		// BRINGS ALL ACTIVITY
		
		// SET PRED SUCC
		
	
		for(int i = 0;i<Allact.length;i++) {
			
			String yes=Allact[i].getPredName();
			
			String yess[]=yes.split(" +");
			
			Activity pre[]= new Activity[yess.length];
			
			for(int v = 0 ; v <yess.length;v++) {
				
				pre[v]=prject1.Search(yess[v]);
				
			}
			Allact[i].setPredecessors(pre);
			
			String no=Allact[i].getSuccName();
			
			String nos[]=no.split(" +");
			
			Activity suc[]= new Activity[nos.length];
			
			for(int g = 0 ; g <nos.length;g++) {
				
				suc[g]=prject1.Search(nos[g]);
			}
			Allact[i].setSuccessors(suc);
			
			
		}
		
		
	
		
		prject1.Forward(Allact);
		
		prject1.backward(Allact);
		String faisal = "Project name: "+PRname +"\n";
		faisal+="Number of phases: "+num +"\n";
		System.out.println("Project name: "+PRname);
		System.out.println("Project start date: "+PRdate);
		System.out.println("Number of phases: "+num);  
		
		phase[] p= prject1.getPhases();
		deliverable[] d;
		Activity[] a;
		for(int l =0; l<=p.length-1; l++) {
			faisal+="Phase" +(l+1) +" name: "+ p[l].getPname() +"\n";
			System.out.println("Phase" +(l+1) +" name: "+ p[l].getPname());
			d=p[l].getDe();
			for (int u =0; u<= d.length-1; u++) {
				faisal+="Deliverable"+(u+1)+" name: "+d[u].getDname()+"\n";
				System.out.println("Deliverable"+(u+1)+" name: "+d[u].getDname() );
				a= d[u].getActivities();
				for (int i=0; i<=a.length-1; i++) {
					faisal+="activity name: "+a[i].getName() +"\n";
					faisal+="activity duration: "+a[i].getDuration() +"\n";
					faisal+="activity resources: "+a[i].getResources() +"\n";
					faisal+=" EF: "+a[i].getEf();
					faisal+=" LF: "+a[i].getLf();
					faisal+=" LS: "+a[i].getLst();
					faisal+=" ES: "+a[i].getEst() +"\n";
					System.out.println("activity name: "+a[i].getName());
					System.out.println("activity duration: "+a[i].getDuration());
					System.out.println("activity resources: "+a[i].getResources());
					System.out.print(" EF: "+a[i].getEf());
					System.out.print(" LF: "+a[i].getLf());
					System.out.print(" LS: "+a[i].getLst());
					System.out.println(" ES: "+a[i].getEst()); 
				}
			}
		}
		
		
		faisal+="------------------------------------------------" +"\n";
		System.out.println("------------------------------------------------");
		Activity[] c= prject1.combineActivity().clone();
		Activity[] CA = new Activity[c.length];
		int CAd=0;
		int coun=0;
		for(int f=0; f<=c.length-1; f++) {
			if (c[f].getLf()==c[f].getEf()) {
				CA[coun++]=c[f];
				CAd+=c[f].getDuration();
			}
		}
		faisal+=" " +"\n";
		faisal+="Critcal Path:" ;
		System.out.println(" ");
		System.out.print("Critcal Path:");
		for (int g=0; g<=CA.length-1; g++) {
			if (CA[g]==null) {
				continue;
			}
			faisal+=CA[g].getName()+" ";
			System.out.print(CA[g].getName()+" ");
		}
		faisal+=" "+"\n";
		faisal+="Critcal Path Duration: ";
		faisal+=CAd+"\n";
		System.out.println(" ");
		System.out.print("Critcal Path Duration: ");
		System.out.println(CAd); 
		
		
		
		// FORWARD AND BACKWARD 
		
		// print
		File outFile = new File("Output.txt");
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(outFile));
			writer.write(faisal);
			writer.close();
		} catch (IOException ex) {
			System.out.println("Error writing file");
		}
		
		
		
		
		
	}

	

}
