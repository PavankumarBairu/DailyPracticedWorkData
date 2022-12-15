package encapsulation;

public class Student {
	
	 int rollNumber;
	 String sName;
	 boolean flag;
	 String  address;
	
	
	public Student(int rollNumber, String sName, boolean flag) {
		super();
		this.rollNumber = rollNumber;
		this.sName = sName;
		this.flag = flag;
		
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public String toString() {
		System.out.println(rollNumber+sName);
		return "Student [rollNumber=" + rollNumber + ", sName=" + sName + ", flag=" + flag + ", address=" + address
				+ "]";
		
	
	}
	

}
