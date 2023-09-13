

/*Dropout class is the child class which extends 
the parent class Student using the concept of Inheritance*/
public class Dropout extends Student
{
    //declaring the variables and assigning the private access modifier
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;

    public Dropout(String dateOfBirth ,String studentName ,int courseDuration , int tutionFee ,int numOfRemainingModules ,
    int numOfMonthsAttended ,String dateOfDropout,String courseName,int enrollmentID,String dateOfEnrollment)
    {
        super(dateOfBirth , studentName ,courseDuration,tutionFee);
        setdateOfEnrollment(dateOfEnrollment);
        setenrollmentID(enrollmentID);
        setcourseName(courseName);
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout; 
        this.remainingAmount=0;
        this.hasPaid= false;
    }
    
    //accessor method of the corresponding attributes.
    public int getnumOfRemainingModules()
    {
        return this.numOfRemainingModules;
    }

    public int getnumOfMonthsAttended()
    {
        return this.numOfMonthsAttended;
    }

    public String getdateOfDropout()
    {
        return this.dateOfDropout;
    }

    public int getremainingAmount()
    {
        return this.remainingAmount;
    }

    public boolean gethasPaid()
    {
        return this.hasPaid;
    }

    //Calculating the amount left to be paid.
    public void billsPayable( )
    {
        this.remainingAmount= (getcourseDuration() - numOfMonthsAttended)* gettutionFee();
        this.hasPaid = true;
    }

    //method for removeStudent.
    public void removeStudent()
    {
        //setting the value of the attributes to null if has paid is true.
        if (hasPaid == true)
        {
            setenrollmentID(0);
            setstudentName("");
            settutionFee (0);
            setdateOfEnrollment("");
            setdateOfBirth("");
            dateOfDropout = "";
            numOfRemainingModules = 0;
            numOfMonthsAttended = 0;
            remainingAmount = 0 ;
            setcourseName("");
            setcourseDuration(0);
        }

        else
        {
            System.out.print("All bills not cleared");
        }
    }

    
    public void display()
    {
        super.display();
        System.out.println("The number of remaining modules of the student is :" + numOfRemainingModules);
        System.out.println("The student has attended :" + numOfMonthsAttended + "months");
        System.out.println("The student dropped out on: " + dateOfDropout);
        System.out.println("The remaining amount to be paid(in NRs) is : " + remainingAmount);
    }
}
