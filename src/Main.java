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
					
					
					System.out.println("Enter predecessor of activity by ID(-1 if nothing) " +k);
					
					String predname=s.next();
					
					
					
					
					System.out.println("Enter successors of activity (-1 if nothing) "+k);
					
					String succname=s.next();
				
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
		
		
		for(int i=0;i<Allact.length;i++) {
			System.out.println(Allact[i].getName());
			System.out.println(Allact[i].getEf());
			System.out.println(Allact[i].getLf());
			System.out.println(Allact[i].getLst());
			System.out.println(Allact[i].getEst());

		}
		
		
		
		
		
		
		
		// FORWARD AND BACKWARD 
		
		// print
		
		
		
		
		
	}
	
	

}
