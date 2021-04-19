package inheritancelab;

public class InheritanceLab 
{
    public static void main(String[] args) 
    {
      UndergradStudent myUndergradStudent = new UndergradStudent("0819568" , "David" , "Son" ,2);
      GraduateStudent myGraduateStudent= new GraduateStudent("0816325" , "Peter" , "Thomas" , "IT");
      myUndergradStudent.studentData();
      myGraduateStudent.studentData();
    }
    

}
