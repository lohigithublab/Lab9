package inheritancelab;

public class GraduateStudent extends Student
{
    private String type;
    
    public GraduateStudent(String studentID, String firstName, String lastName , String type)
    {
        super(studentID, firstName , lastName);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void studentData() {
         System.out.println("GraduateStudent data");
         System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "Student{" + "studentID = " + this.getStudentID() + ", firstName = " + this.getFirstName() + ", lastName = " + this.getLastName() + ", type = " + this.getType() + '}';
    }
}
