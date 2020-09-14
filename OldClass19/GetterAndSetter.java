package OldClass19;

public class GetterAndSetter {
	
	String name;
	String DOB;
	int ID;
	
	public GetterAndSetter() {}
	
	public GetterAndSetter(String name, String DOB, int ID) {
		this.name = name;
		this.DOB = DOB;
		this.ID = ID;
	}
	
	public String getName(String name) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDOB(String DOB) {
		return DOB;
	}
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
	public int getID(int ID) {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
}
