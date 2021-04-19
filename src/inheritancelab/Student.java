package inheritancelab;

public class Student 
{
    private String studentID;
    private String firstName;
    private String lastName;
    
    public Student(String studentID, String firstName, String lastName) 
    {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getStudentID() 
    {
        return studentID;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setStudentID(String studentID) 
    {
        this.studentID = studentID;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
   
    
   public void studentData() {
        System.out.println("Student data");
        System.out.println(toString());
    }
   
    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }
    
}
