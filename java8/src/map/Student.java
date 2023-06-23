package map;

public class Student {

	private String stdName;
	private String address;
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(String stdName, String address) {
		super();
		this.stdName = stdName;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", address=" + address + "]";
	}
	
	
}
