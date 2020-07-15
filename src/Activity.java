
public class Activity {
	private String name;
	private int duration;
	private String activityResource;
	private String precedence;
	private String employeeName;

	Activity(String name, int duration, String activityResource, String precedence, String employeeName) {
		this.name = name;
		this.duration = duration;
		this.activityResource = activityResource;
		this.precedence = precedence;
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

	public String getPrecedence() {
		return precedence;
	}

	public void setPrecedence(String precedence) {
		this.precedence = precedence;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
