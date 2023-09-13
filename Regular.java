

/*Regular class is the child class which extends 
the parent class Student using the concept of Inheritance*/
public class Regular extends Student
{
    //Setting the accessor method as private for encaplusation.
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;

    //Creating constructor with parameters.
    public Regular( int enrollmentID , String dateOfBirth , String courseName , String studentName , String dateOfEnrollment, int tutionFee, 
    int courseDuration,double daysPresent, int numOfCreditHours , int numOfModules )
    {
        /*A call is made to the superclass constructor with four
         * parameters.
         */
        super (dateOfBirth , studentName ,  courseDuration, tutionFee);
        /*A call is made to the parent class mutator methods with the
         * corresponding parameters.
         */
        setdateOfEnrollment(dateOfEnrollment);
        setenrollmentID(enrollmentID);
        setcourseName(courseName);   
        this.numOfModules= numOfModules;
        this.numOfCreditHours=numOfCreditHours;
        this.daysPresent=daysPresent;
        this.isGrantedScholarship = false;
    }

    //Creating accessor method for each attribute.
    public int getnumOfModules()
    {
        return this.numOfModules;
    }

    public int getnumOfCreditHours()
    {
        return this.numOfCreditHours;
    }

    public double getdaysPresent()
    {
        return this.daysPresent;
    }

    public boolean getisGrantedScholarship()
    {
        return this.isGrantedScholarship;
    }

    /*Creating a method named presentPercentage which calculates present percentage
     * and returns the attendance grade accordingly.
     */ 
    public void presentPercentage( double daysPresent )
    {   
        /*The present percentage is calculated as the
        ratio of number of days present and the course duration and expressed as
        percentage.*/
        //Days present is divided by 30 to convert it into months
        double presentPercentage= ((daysPresent/30)/getcourseDuration()) * 100;
        if( (daysPresent/30) > getcourseDuration() )
        {
            System.out.println("Days present cannot be greater than course duration");
        }
        else
        {
            if ( presentPercentage >= 80 && presentPercentage <= 100)
            {
                System.out.println("You have obtained grade A");
                isGrantedScholarship = true;
            }
            else if ( presentPercentage >= 60 && presentPercentage <= 79)
            {
                System.out.println("You have obtained grade B");
                isGrantedScholarship = false;
            }
            else if (presentPercentage >= 40 && presentPercentage <= 59)
            {
                System.out.println("You have obtained grade C");
                isGrantedScholarship = false;
            }
            else if ( presentPercentage >= 20 && presentPercentage <= 39)
            {
                System.out.println("You have obtained grade D");
                isGrantedScholarship = false;
            }
            else
            {
                System.out.println("You have obtained grade E");
                isGrantedScholarship = false;
            }
        }
    }

    public void grantCertificate( String courseName, int enrollmentID, String dateOfEnrollment)
    {
        /*is granted scholarship is set to true only if the present percentage is 
         * greatert than or equals to 80 and lesser than or equal to 100. 
         * The appropriate message displayed accordingly.
         */
        if(isGrantedScholarship == true)
        {
            System.out.println("Your details : ");
            System.out.println("Enrollment ID : " + enrollmentID);
            System.out.println("Your course : " + courseName);
            System.out.println("You enrolled on : " + dateOfEnrollment);
            System.out.println("You have been granted scholarship");
        }
        else 
        {
            System.out.println("Your details : ");
            System.out.println("Enrollment ID : " + enrollmentID);
            System.out.println("Your course : " + courseName);
            System.out.println("You enrolled on : " + dateOfEnrollment);
        }
    }

    //
    public void display()
    {
        super.display();
        System.out.println("The number of modules is:" + numOfModules);
        System.out.println("The number of credit hours is:" + numOfCreditHours);
        System.out.println("The student was present for: " + daysPresent + " days.");
    }
}
