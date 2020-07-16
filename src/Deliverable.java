import java.util.ArrayList;
import java.util.List;

public class Deliverable {
    private String name;
    private List<Activity> activity;
    private String criticalpath;

    Deliverable(String name) {
        this.name = name;
        activity = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Activity> getActivity() {
        return activity;
    }

    public void setActivity(List<Activity> activity) {
        this.activity.addAll(activity);
    }

    public String getCritecalpath() {
        return criticalpath;
    }

    public void setCritecalpath(String critecalpath) {
        this.criticalpath = critecalpath;
    }

    public void addActivity(Activity a) {
        activity.add(a);
    }

    public void caloclatecritcalpath() {
        System.out.println("sssssssssssssssss");
        int total = 0;


        for (int i = 0; i < activity.size(); i++) {
            if (activity.get(i).getTotal() < activity.get(i).getDuration()) {
                activity.get(i).setTotal(activity.get(i).getDuration());
                activity.get(i).setPath(", ");
                System.out.println(activity.get(i).getName() + "," + activity.get(i).getTotal());
            }
            System.out.println("sssssssssssssssss2");

            for (int j = 0; j < activity.size(); j++) {
                System.out.println("sssssssssssssssss3");

                for (int k = 0; k < activity.get(j).getPrecedence().size(); k++) {
                    System.out.println("sssssssssssssssss4");

                    if (activity.get(i).getName().equalsIgnoreCase(activity.get(activity.get(j).getPrecedence().get(k)).getName())) {
                        System.out.println("sssssssssssssssss5");

                        if (activity.get(j).getTotal() < activity.get(j).getDuration() + activity.get(i).getTotal()) {
                            System.out.println("sssssssssssssssss6");

                            activity.get(j).setTotal(activity.get(j).getDuration() + activity.get(i).getTotal());
                            System.out.println("sssssssssssssssss7");

                            activity.get(j).setPath(" , " + activity.get(i).getPath());
                            System.out.println("sssssssssssssssss8");

                            System.out.println(activity.get(j).getPath());
                            System.out.println(activity.get(j).getTotal());
                            if(total>activity.get(j).getTotal()) {
                                total = activity.get(j).getTotal();
                                criticalpath = activity.get(j).getPath();
                            }

                        }
                    }
                    System.out.println("sssssssssssssssss9");

                }
            }
        }
        System.out.println("exit now ");
    }
}
