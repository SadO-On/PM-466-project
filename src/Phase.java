import java.util.ArrayList;
import java.util.List;

public class Phase {
	private String name;
	private List<Deliverable> deliverables;

	Phase(String name) {
		this.name = name;
		deliverables = new ArrayList<>();
	}
	public void addDeliverable(Deliverable d) {
		deliverables.add(d);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Deliverable> getDeliverables() {
		return deliverables;
	}

	public void setDeliverables(List<Deliverable> deliverables) {
		this.deliverables.addAll(deliverables);
	}

}
