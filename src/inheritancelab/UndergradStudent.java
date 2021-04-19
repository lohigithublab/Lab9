package inheritancelab;

public class UndergradStudent extends Student
{
   private int year;
   
   public UndergradStudent(String studentID, String firstName, String lastName , int year)
   {
       super(studentID, firstName , lastName);
       this.year = year;
   }

    public int getYear() {
        return year;
    }
//
    @Override
    public void studentData() {
         System.out.println("UndergradStudent data");
         System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "Student{" + "studentID = " + this.getStudentID() + ", firstName = " + this.getFirstName() + ", lastName = " + this.getLastName() + ", year = " + this.getYear() + '}';
    }
   
    public void setYear(int Year) {
        this.year = Year;
    }

}
