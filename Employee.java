package CodingPracticeInterviewQuestions;

class Employee {
	
	int id;
	
	public Employee() {
        
    }
	
	 public Employee(String name, int id,int age) {
	        this.name = name;
	        this.id = id;
	        this.age = age;
	    }
	
	
	public String getEmpName() {
		return name;
	}
	public void setEmpName(String empName) {
		name = empName;
	}
	public int getEmpId() {
		return id;
	}
	public void setEmpId(int empId) {
		this.id = empId;
	}
	
	public int getEmpAge() {
		return age;
	}
	public void setEmpAge(int age) {
		this.age = age;
	}
	String name;
	int age;
	
	@Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + "' , age=" + age +'}';
    }

}



