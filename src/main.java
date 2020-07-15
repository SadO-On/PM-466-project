import java.util.Scanner;
import java.io.*;

public class main {

	public static void main(String[] args) {
		int input;
		Project project;
		Phase phase;
		Deliverable deliverable;
		Activity activity;
		Scanner s = new Scanner(System.in);

		try {
			//Write to file
			FileWriter fw = new FileWriter("info.txt");
			PrintWriter pw = new PrintWriter(fw);
			do {
				System.out.println("**************************************************************");
				System.out.println("*-----------------Project Management Program-----------------*");
				System.out.println("**************Welcome please insert your choice:**************");
				System.out.println("*To add a new Project, Enter (1)-----------------------------*");
				System.out.println("*To Exit, Enter (0)------------------------------------------*");
				System.out.println("**************************************************************");
				System.out.println("Enter your choice--> ");
				// Exception if the user enter letter, in case the user is homar
				input = s.nextInt();
				if (input == 1) {
					System.out.println("Please, Enter the project name");
					String projectName = s.next();
					pw.print("Project Name:" + projectName+"\n");
					System.out.println("Please, Enter the project manger name");
					String pmName = s.next();
					pw.print("Project manger name:" + pmName+"\n");
					System.out.println("Please, Enter project start date [dd-mm-yyyy]");
					String projectdate = s.next();
					pw.print("startDate" + projectdate+"\n");
					System.out.println("Please,  Enter number of phases");
					// Take loop number
					int phaseNum = s.nextInt();
					pw.print("Number of phases:" + phaseNum+"\n");
					// Create new project
					project = new Project(projectName, pmName, projectdate);
					for (int i = 1; i <= phaseNum; i++) {
						pw.print("------------------------------------------------------------\n");
						pw.print("Phase" + " " + i+"\n");
						System.out.println("Please, Enter the name of phase" + " " + i);
						// Create new phase
						phase = new Phase(s.next());
						pw.print("Name:" + phase.getName()+"\n");
						// add phase to phaseList
						project.addPhase(phase);
						System.out.println("Please, Enter the number of deliverables of phase " + " " + i);
						// Take loop number
						int deliverableNum = s.nextInt();
						pw.print("Number of deliverables:" + deliverableNum+"\n");
						for (int j = 1; j <= deliverableNum; j++) {
							System.out.println("Please, Enter the name of deliverable" + " " + j);
							// Create new deliverable
							deliverable = new Deliverable(s.next());
							pw.print("Deliverable" + "" + j + "" + "name:" + deliverable.getName()+"\n");
							// add deliverable to deliverableList
							phase.addDeliverable(deliverable);
//								Here, add activity here continue the rest of logic
//								System.out.println("Please, Enter the number of activities for deliverable"+j);
//								int activityNum=s.nextInt();
//								for(int r =1; r<=activityNum;r++) {
//									
//								}
						}
					}
				} else if(input != 0){
					System.out.println("Wrong entry");
				}
			} while (input != 0);
			System.out.println("Thank you !");
			pw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {

			s.close();
		}

	}

}
