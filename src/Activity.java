import java.util.ArrayList;

public class Activity {
	private String name;
	private int duration;
	private String activityResource;
	private ArrayList<Integer> precedence;
	private ArrayList<Integer> exender;
	private String employeeName;
	private boolean viseted;
	private int total = 0;
	private String path;


	Activity(String name, int duration, String activityResource, String employeeName) {
		this.name = name;
		this.duration = duration;
		this.activityResource = activityResource;
		this.precedence = new ArrayList<>();
		this.exender = new ArrayList<>();
		this.employeeName = employeeName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getActivityResource() {
		return activityResource;
	}

	public void setActivityResource(String activityResource) {
		this.activityResource = activityResource;
	}

	public ArrayList<Integer> getPrecedence() {
		return precedence;
	}

	public void setPrecedence(ArrayList<Integer> precedence) {
		this.precedence.addAll(precedence);
	}

	public ArrayList<Integer> getExender() {
		return exender;
	}

	public void setExender(ArrayList<Integer> exender) {
		this.exender.addAll(exender) ;
	}
	public void addExender(int ex){
		this.exender.add(ex);
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = this.name +path;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
