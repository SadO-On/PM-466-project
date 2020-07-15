import java.util.ArrayList;
import java.util.List;

public class Project {

	private String name;
	private String projectMangerName;
	// I suggest  to convert it to date if possible
	private String projectStartDate;
	private List<Phase> phase;
	Project(String name,String projectMangerName,String projectStartDate){
		this.name=name;
		this.projectStartDate=projectStartDate;
		this.projectMangerName=projectMangerName;
		phase = new ArrayList<>();
	}
	
	public void addPhase(Phase p) {
		phase.add(p);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProjectMangerName() {
		return projectMangerName;
	}
	public void setProjectMangerName(String projectMangerName) {
		this.projectMangerName = projectMangerName;
	}
	public List<Phase> getPhase() {
		return phase;
	}
	public void setPhase(List<Phase> phase) {
		this.phase = phase;
	}

	public String getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(String projectStartDate) {
		this.projectStartDate = projectStartDate;
	}


}
