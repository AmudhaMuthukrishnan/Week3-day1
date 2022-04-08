package Week3.day1;

public class Students {
	
	public int getStudentInfo(int id)
	{
		return id;
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student id is"+" " + id + " " +" Student name is name"+ " " + name); 
		
		
	}
	
	public void getStudentInfo(String email, long phoneno)
	{
		System.out.println("Student email is"+ " " + email + " " +"Student phoneno is "+ " " + phoneno);
		
	}
	
	public static void main(String[] args) {
		Students stud = new Students();
		System.out.println(stud.getStudentInfo(19793));
		stud.getStudentInfo(19678, "Amudha");
		stud.getStudentInfo("abcd@gmail.com", 99384475634l);
		
	}

}
