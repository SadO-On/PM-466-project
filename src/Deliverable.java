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
        int total = 0;


        for (int i = 0; i < activity.size(); i++) {
            if (activity.get(i).getTotal() < activity.get(i).getDuration()) {
                activity.get(i).setTotal(activity.get(i).getDuration());
                activity.get(i).setPath(", ");
            }

            for (int j = 0; j < activity.size(); j++) {

                for (int k = 0; k < activity.get(j).getPrecedence().size(); k++) {

                    if (activity.get(i).getName().equalsIgnoreCase(activity.get(activity.get(j).getPrecedence().get(k)).getName())) {

                        if (activity.get(j).getTotal() < activity.get(j).getDuration() + activity.get(i).getTotal()) {

                            activity.get(j).setTotal(activity.get(j).getDuration() + activity.get(i).getTotal());

                            activity.get(j).setPath(" , " + activity.get(i).getPath());

//                            System.out.println(activity.get(j).getPath());
//                            System.out.println(activity.get(j).getTotal());
                            if(total<activity.get(j).getTotal()) {
                                total = activity.get(j).getTotal();
                                criticalpath = activity.get(j).getPath();
                            }

                        }
                    }

                }
            }
        }
    }
}
