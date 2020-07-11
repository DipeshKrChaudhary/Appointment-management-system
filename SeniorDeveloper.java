/**
 * Write a description of class SeniorDeveloper here.
 * The SeniorDeveloper class is a subclass of the Developer class and have seven attriubtes.
 * @author (Dipesh Kumar Chaudahry)
 * @id number (18028897)
 */
public class SeniorDeveloper extends Developer //SeniorDeveloper class is a subclass of the Developer class
{
    //attributes:
    private int salary;
    private String joiningDate;
    private String staffRoomNumber;
    private int contractPeriod;
    private double advanceSalary;
    private boolean appointed;
    private boolean terminated;
    
   /** a constructor named SeniorDeveloper accepting five parameters, which are the platform
     *  interviewer name, working hour(hours per day), salary and contractPeriod(months)
     */ 
    public SeniorDeveloper(String platform, String interviewerName, int workingHours, int salary, int contractPeriod)
    {
        super(platform, interviewerName, workingHours);// call is made to the superclass constructor withthree parameter
        this.salary = salary;//Assigning salary attributes to the corresponding parameter values
        this.contractPeriod = contractPeriod;//contract period attributes to the corresponding parameter values
        joiningDate = (""); //assigning joining date as an empty ("") string
        staffRoomNumber = ("");// staff room number as an empty ("") string
        advanceSalary =0.0;//advance salary to 0.0
        appointed = false;//developer appointed status is initialized to false
        terminated = false;// terminated status is initialized to false
    }
    
   /**
     * each attributes making a corresponding accessor method
     */
    public int getSalary()//getVariable() is used to get value of variable, a method to get salary variable
    {
        return salary;
    }   
    public String getStaffRoomNumber()// a method to get staff room number variable
    {
        return staffRoomNumber;
    }       
    public int getContractPeriod()// a method to get contract period variable
    {
        return contractPeriod;
    }    
    public double getAdvanceSalary()// a method to get advance salary variable
    {
        return advanceSalary;
    }
     public String getJoiningDate()// a method to get joining date variable
    {
        return joiningDate;
    }
    public boolean getAppointed()//  a method to get appointed variable 
    {
        return appointed;
    }
    public boolean getTerminated()// a method to get terminated variable
    {
        return terminated;
    }
    
    
    /**
    * a method is created to set the salary as changes to new salary
    * and  method accepts a new salary as a parameter 
    * and assigns the new value to the salary attribute
    */
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    
    /**
    * A method is created to set the contract period as changes to contact 
    * period also occur which accepts a new contract period as a parameter and 
    * assigns the new value to the contract period attribute
    */
    public void setContractPeriod(int contractPeriod)
    {
        this.contractPeriod = contractPeriod;
    }
    
    /**
    *a method created to hire developer for the particular platform, which 
    *accepts, as parameters, a new developer name, joining date, advance salary, 
    *staff room number  
    */
    public void hireDeveloper(String developerName, String joiningDate,int advanceSalary, String staffRoomNumber)
    {
        if(appointed == true)
        {
            System.out.println("we had already appointd a developer did you forget. "+developerName +this.staffRoomNumber);
        }
        else
        {
            super.setDeveloperName(developerName);
            this.joiningDate = joiningDate;
            this.staffRoomNumber = staffRoomNumber;
            this.advanceSalary = advanceSalary;
            appointed = true;
            terminated = false;
         }
    }
    
    public void terminateDeveloper()// method for developer contact termination
    {
      if(terminated == false)
      {
          super.setDeveloperName("");
          joiningDate = ("");
          advanceSalary =0.0;
          appointed = false;
          terminated = true;
      }
      else
      {
          System.out.println("The developer contract is terminated");
      }
    }
    
     /**
    *a method is created to print the platform, interviewer name and 
    * developer salary,
    */
  
    public void print()
    { System.out.println("The platform is " +getPlatform());
      System.out.println("Interviewer name is "+getInterviewrName());
      System.out.println("Developer salary is "+salary);
    }
   
    public void display()//a method to call Display method  from super class and if condition is true displaying given output
    {
        super.display();
        if(appointed == true)
        {
            System.out.println("The joinind date is "+getJoiningDate());
            System.out.println("The advance salary is "+getAdvanceSalary());
            System.out.println("The developer name is "+ getDeveloperName());
            System.out.println("The termination status is "+ terminated);
        }
    }
}    