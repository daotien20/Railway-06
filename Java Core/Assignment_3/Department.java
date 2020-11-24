package Assignment_3;

public class Department {
	int	departmentID;
	String	departmentName;
	

	public boolean equals(Department department2) {
		if(departmentName == department2.departmentName) {
			return true;	
		}else {
		return false;
		}
	}

	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + "]";
	}

}
