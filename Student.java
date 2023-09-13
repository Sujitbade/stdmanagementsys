

//Student class is the parent class.
public class Student
{
    //Setting the accessor method as private for encaplusation.
    private int enrollmentID;
    private String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    //The course duration should be set in months.
    private int courseDuration;
    private int tutionFee;

    //Creating a constructor with specified parameters.
    public Student(String dateOfBirth , String studentName , int courseDuration, int tutionFee)
    {
        this.enrollmentID=0; 
        this.dateOfBirth=dateOfBirth;
        this.courseName="";
        this.studentName=studentName;
        this.dateOfEnrollment="";
        this.courseDuration=courseDuration;
        this.tutionFee=tutionFee;
    }

    // Creating accessor method for each attributes.

    public int getenrollmentID()
    {
        return this.enrollmentID;
    }

    public String getdateOfBirth()
    {
        return this.dateOfBirth;
    }

    public String getcourseName()
    {
        return this.courseName;
    }

    public String getstudentName()
    {
        return this.studentName;
    }

    public String getdateOfEnrollment()
    {
        return this.dateOfEnrollment;
    }

    public int getcourseDuration()
    {
        return this.courseDuration;
    }

    public int gettutionFee()
    {
        return this.tutionFee;
    }

    //Creating mutator method for required attributes.

    public void setcourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public void setenrollmentID(int enrollmentID)
    {
        this.enrollmentID = enrollmentID;
    }

    public void setdateOfEnrollment(String dateOfEnrollment)
    {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public void settutionFee(int tutionFee)
    {
        this.tutionFee = tutionFee;
    }

    public void setstudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public void setdateOfBirth( String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public void setcourseDuration (int courseDuration)
    {
        this.courseDuration = courseDuration;
    }

    /* A display method is created to display the enrollmentID,
    dateOfBirth, courseName, studentName, yearsEnrolled, courseDuration,
    tuitionFee */
    public void display()
    {
        /* Before displaying the output, the attritubes 
         * dateOfBirth , studentName , dateOfEnrollment , courseName,
         * enrollmentID , courseDuration , tutionFee
         * are checked. If it is left empty the suitable message is displayed.
         */
        if(this.dateOfBirth == ("") || this.studentName == ("") || this.dateOfEnrollment == ("") || this.courseName == ("")
        || this.enrollmentID == 0 || this.courseDuration == 0 || this.tutionFee == 0 )
        {
            System.out.println("Data has not been found.");
        }

        else
        {
            System.out.println("The Enrollment Id is: " + enrollmentID);
            System.out.println("Date of Birth: " + dateOfBirth);
            System.out.println("Course Name: " + courseName);
            System.out.println("Name of the Student: " + studentName);
            System.out.println("Dater of Enrollment: " + dateOfEnrollment);
            System.out.println("Course Duration: " + courseDuration);
            System.out.println("Tuition Fee (In NRS): " + tutionFee);
        }
    }
}
