/**
* Write a description of class JuniorDeveloper here.
*
* @author (Dipesh Kumar Chaudhary)
* @id number (18028897)
*/

public class JuniorDeveloper extends Developer
{
    //attributes:
    private int salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;
    
    
    public JuniorDeveloper(String platform,String interviewerName, int workingHours, int salary, String appointedBy, String terminationDate)
    {       
        super(platform, interviewerName, workingHours);//A call is made to the superclass constructor with three parameters
        this.salary = salary;//salary is  given the corresponding parameter values
        this.appointedBy = appointedBy;//appointed by is  given the corresponding parameter values
        this.terminationDate = terminationDate;//termination date is  given the corresponding parameter values
        appointedDate ="";//appointed date to empty ("") string
        evaluationPeriod = "";// evaluation period to empty ("") string
        specialization = "";// specialization to empty ("") string
        joined = false;// joined status to false
    }
    
    //Each attribute having corresponding accessor method
    public int getSalary()
    {
        return salary;
    }     
    public String getAppointedDate()
     {
         return appointedDate;
     }
    public String getEvaluationPeriod()
     {
         return evaluationPeriod;
     }
    public String getTerminationDate()
     {
         return terminationDate;
     }
    public String getSpecialization()
     {
         return specialization;
     }
    public String getAppointedBy()
     {
         return appointedBy;
     }
    public boolean getJoined()
     {
     return joined;   
     }
     
     public void setSalary(int newSalary)
    {    
        this.salary=newSalary;
        if(joined == false) 
        {
            this.salary =newSalary;
        }
        else
        {
            System.out.println("It is not possible to change salary.");
        }
     }
    
    //a method appoint developer for the particular platform having four parameters
    public void appointDeveloper(String developerName, String appointedDate, String terminationDate, String specialization)
     {
        if(joined == false)
        {
            super.setDeveloperName(developerName);
            this.terminationDate = terminationDate;
            this.specialization = specialization;
            this.appointedDate = appointedDate;
            joined = true;
        }
        else
        {
        System.out.println("Mr./Mrs. " +super.getDeveloperName()+"is already appointed in "+appointedDate+ ".");
        
        }
        this.terminationDate = terminationDate;
        this.specialization = specialization;
        this.appointedDate = appointedDate;
      }
     
    public void display()// method to call display method from super class and if condition is true displaying given output
    {
        
        super.display();
        if(joined == true)//If the developer is already joined then
        {  
            System.out.println("Developer Name is "+getDeveloperName());
            System.out.println("Appointed in "+getAppointedDate());
            System.out.println(" Appointed by "+appointedBy);
            System.out.println("Developer Specialization is "+specialization);
            System.out.println("Salary is "+salary);
            System.out.println("Evaluation Period will be "+evaluationPeriod);
            System.out.println("Termination date is "+terminationDate);
                
        }        
    }
}