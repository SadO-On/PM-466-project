import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;


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
                System.out.println("*To Exit and print info , Enter (0)------------------------------------------*");
                System.out.println("**************************************************************");
                System.out.println("Enter your choice--> ");
                // Exception if the user enter letter, in case the user is homar
                input = s.nextInt();
                if (input == 1) {
                    System.out.println("Please, Enter the project name");
                    String projectName = s.next();
                    pw.print("Project Name: " + projectName + "\n");
                    System.out.println("Please, Enter the project manger name");
                    String pmName = s.next();
                    pw.print("Project manger name: " + pmName + "\n");
                    System.out.println("Please, Enter project start date [dd-mm-yyyy]");
                    String projectdate = s.next();
                    pw.print("startDate: " + projectdate + "\n");
                    System.out.println("Please,  Enter number of phases");
                    // Take loop number
                    int phaseNum = s.nextInt();
                    pw.print("Number of phases: " + phaseNum + "\n");
                    // Create new project
                    project = new Project(projectName, pmName, projectdate);
                    for (int i = 1; i <= phaseNum; i++) {
                        pw.print("------------------------------------------------------------\n");
                        pw.print("Phase" + " " + i + "\n");
                        System.out.println("Please, Enter the name of phase" + " " + i);
                        // Create new phase
                        phase = new Phase(s.next());
                        pw.print("Name:" + phase.getName() + "\n");
                        // add phase to phaseList
                        System.out.println("Please, Enter the number of deliverables of phase " + " " + i);
                        // Take loop number
                        int deliverableNum = s.nextInt();
                        pw.print("Number of deliverables:" + deliverableNum + "\n");
                        for (int j = 1; j <= deliverableNum; j++) {
                            System.out.println("Please, Enter the name of deliverable" + " " + j);
                            // Create new deliverable
                            deliverable = new Deliverable(s.next());
                            pw.print("Deliverable " + j + " name: " + deliverable.getName() + "\n");
                            pw.print("Deliverable " + deliverable.getName() + " activities: " + "\n");
                            // add deliverable to deliverableList

                            System.out.println("Please, Enter the number of activities for deliverable " + j);
                            int activityNum = s.nextInt();
                            for (int r = 1; r <= activityNum; r++) {
                                System.out.println("Please, Enter the name of activity " + r);
                                String name = s.next();
                                System.out.println("Please, Enter the duration of activity " + r);
                                int duration = s.nextInt();
                                System.out.println("Please, Enter the resources of activity " + r);
                                String resources = s.next();
                                System.out.println("Please, Enter the name of the employee of the activity " + r);
                                String employee = s.next();
                                System.out.println("Please, Enter the number of precedences (0 if none) ");
                                pw.print("activity " + r + " ,name: " + name + " ,duration: " + duration + " ,resources: " + resources + " ,employee in charge: " + employee + "\n");
                                int numpre = s.nextInt();
                                ArrayList<Integer> precedences = new ArrayList<>();
                                pw.print("precedences of activity " + r + " are: ");
                                for (int k = 1; k <= numpre; k++) {
                                    System.out.println("Please, Enter precedence " + k + " of activity " + r + " (1 would be the first activity)" + "\n");
                                    
                                    int pre = s.nextInt();
                                    pw.print(" activity " + pre+"\n");
                                    pw.print("\n");

                                    precedences.add(pre - 1);
                                }
                                activity = new Activity(name, duration, resources, employee);
                                if (numpre != 0) {
                                    activity.setPrecedence(precedences);
                                } else {
                                    pw.print("there is no precedence for activity "+ r+"\n");
                                    pw.print("\n");
                                }
                                deliverable.addActivity(activity);
                                deliverable.caloclatecritcalpath();
                            }
                            pw.print("\n");
                            phase.addDeliverable(deliverable);
                            System.out.println("the critical path is of deliverable " + j + " is " + phase.getDeliverables().get(j - 1).getCritecalpath());
                            pw.print("the critical path of deliverable " + j + " is " + phase.getDeliverables().get(j - 1).getCritecalpath()+"\n");

                        }
                        project.addPhase(phase);

                    }
                } else if (input != 0) {
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
