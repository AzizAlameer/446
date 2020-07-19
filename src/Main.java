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
					
					String Aname=s.next();
					
					System.out.println("Enter the duration of activity "+k);
					
					int duration=s.nextInt();

					System.out.println("Enter resources of activity "+k);

					String Resource=s.next();
					
					
					
					
					System.out.println("Enter predecessor of activity(-1 if nothing) " +k);
					
					String predname=s.next();
					
					
					
					
					System.out.println("Enter successors of activity (-1 if nothing) "+k);
					
					String succname=s.next();
				
					Activity test = new Activity(Aname, duration,k,predname,succname);
					test.setResources(Resource);
					
					
					
					h.addActivity(test);
					
					
					
				}
				p.adddeliverable(h);
				
				
				
			}

			prject1.addphase(p);
			
			
		}
		
		// BRINGS ALL ACTIVITY
		
		// SET PRED SUCC
		
		// FORWARD AND BACKWARD 
		
		// print
		
		
		
		
		
	}
	
	

}
