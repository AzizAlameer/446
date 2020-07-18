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
		
		for(int i=1;i<=num;i++) {
			
			
			System.out.println("Enter the name of phase "+i);
			
			String PHname=s.next();
			
			System.out.println("Enter the number of deliverables of phase "+i);
			
			int Dnum=s.nextInt();
			
			for(int j=1;j<=Dnum;j++) {
				
				System.out.println("Enter the name of deliverable "+j);
				
				String Dname=s.next();
				
				System.out.println("Enter the number of activities for deliverable "+j);
				
				int Anum=s.nextInt();
				
				for(int k=1;k<=Anum;k++) {
					
					System.out.println("Enter the name of Activity "+k);
					
					String Aname=s.next();

					System.out.println("Enter resources of activity "+k);

					String Resource=s.next();
					
					System.out.println("Enter predecessors of activity " +k);
					
					String predname=s.next();
					
					System.out.println("Enter successors of activity "+k);
					
					String succname=s.next();
					
					
					
				}
				
			}

			
			
			
		}
		
		
	}
	
	

}
