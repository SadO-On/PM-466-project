import java.util.ArrayList;
import java.util.List;

public class Deliverable {
	private String name;
	private List<Activity> activity;

	Deliverable(String name){
		this.name=name;
		activity= new ArrayList<>();
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
		this.activity = activity;
	}


	public void addActivity(Activity a) {
		activity.add(a);
	}

}
