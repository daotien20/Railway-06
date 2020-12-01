package Assignment_4;

public class Department {
	int	departmentID;
	String	departmentName;
	
	public Department() {
		super();
	}

	public Department(String departmentName) {
		super();
		this.departmentID = 0;
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + "]";
	}

	
	
}
