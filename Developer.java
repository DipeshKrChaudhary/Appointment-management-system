/**
 * Write a description of class Developer here.
 * The Developer class is super class and it has four attributes.
 * @author (Dipesh Kumar Chaudhary)
 * @id number (18028897)
 */
// Developer class is super class
public class Developer
{
    //attributes and access modifier is made private:
    private String platform;
    private String interviewrName;
    private String developerName;
    private int workingHours;
    
   /**
     *The platform, interviewer name and working hour are initialized in the constructor named developer 
     *by being assigned the value of the developer's parameters
     */
    public Developer(String platform,String interviewrName, int workingHours)
    {
        this.platform=platform;//this.variable is used to refer current class instance variable, platfrom is assigned to corrresponding parameter value
        this.interviewrName =interviewrName;//interviewer name is assigned to corrresponding parameter value
        this.workingHours =workingHours;//working hours assigned to corrresponding parameter value
        developerName =(""); //assigning developer name an empty string ("")
    }
    
    /**
     * Creating each attribute having a corresponding accessor method
     */
    public String getPlatform()//getVariable() is used to get value of variable, a method to get platform variable
    {
         return platform;
    }
    public String getInterviewrName()//a method to get interviewer name variable 
    {
        return interviewrName;
    } 
    public String getDeveloperName()//a method to get developer name variable
    {
        return developerName;
    } 
    public double getWorkingHours()//a method to get working hour variable
    {
        return workingHours;
    }
    
    /**
     * a method to set the developer name to a new name
     */     
    public void setDeveloperName(String developerName)//setVariable() is used to  update/initalization  variable
    {
        this.developerName = developerName;
    }
    
    /**
     * a method which will output the platform, working hour, interviewer name and,
     * if the developername is not an empty string, the developer name too.  
     */        
    
    public void display() //method do have return type 
    {
        System.out.println("The platfrom is" +getPlatform());
        System.out.println("Working hour is " +getWorkingHours());
        System.out.println("Interviewer name is "+interviewrName);
        if(developerName != "") //if the developername is not an empty string
        {
            System.out.println("The Name of developer is "+developerName);
        }
    }
}