/**
 * Write a description of class Developer here.
 * This is RigoTechnology class which is used to add a class to the project that we have developed for
 * the first part of the coursework to make a graphical user interface (GUI) for a
 * system that stores details of developers in your developer list.
 * @author (Dipesh Kumar Chaudhary)
 * @id number (18028897)
 */
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class RigoTechnology implements ActionListener
 
{    
    private JFrame frame;
    
    // instance variables of JLabel
    private JLabel titleOne,titleTwo, srPlatform, srIntName,srWorkHrs,contractPrd, srSalary, advSalary,srDevName,joinDate, staffRoomNo,
    devNoSr ,jrPlatform, jrIntName,specialtization,jrWorkHrs,jrSalary,apntBy, termDate,devNameJr,apntDate,evaluationPrd,jrDevNo;
    
    // instance variables of JTextField
    private JTextField txtSrPlatform,txtSrIntName,txtSrWorkHrs,txtContractPrd,txtSrSalary,txtAdvSalary,txtSrDevName, txtJoinDate, txtStaffRoomNo,
    txtDevNoSr,txtJrPlatform,txtJrIntName,txtJrWorkHrs, txtJrSalary, txtApntBy, txtTermDate,txtDevNameJr, txtApntDate,txtSpecialtization,txtEvaluationPrd,txtJrDevNo; 
    
    // instance variable of JButton
    private JButton btnSrAdd,btnSrClear,btnSrApnt, btnTerminate, btnJrAdd, btnJrClear, btnJrApnt,btnDisplay;
    
    
    ArrayList<Developer> developers = new <Developer> ArrayList();//generic array list
    
    
    public static void main(String[] args)//This is main method
    {
        RigoTechnology obj= new RigoTechnology(); //crating object of RogoTechnology class
        obj.makeFrame();
    }
    
     
    public void makeFrame()//methods for making frame
    {
        frame = new JFrame("Appointment System");//name of frame 
        Container contentPane= frame.getContentPane();
        frame.setLayout(null);
        
        titleOne=new JLabel("<<<<Senior Developer>>>>");//creating Label
        contentPane.add(titleOne);//adding Jlabel to container
        titleOne.setBounds(210,6,200,20);// setting location of titleOne
        
        srPlatform= new JLabel("Platform");
        contentPane.add(srPlatform);
        srPlatform.setBounds(10,35,100,10);
        
        txtSrPlatform= new JTextField();//creating TextField
        contentPane.add(txtSrPlatform);
        txtSrPlatform.setBounds(150,33,400,20);
        
        srIntName= new JLabel("Interviewer Name");
        contentPane.add(srIntName);
        srIntName.setBounds(10,58,150,10);
        
        txtSrIntName= new JTextField();
        contentPane.add(txtSrIntName);
        txtSrIntName.setBounds(150,56,400,20);
        
        srSalary= new JLabel("Salary");
        contentPane.add(srSalary);
        srSalary.setBounds(10,81,100,10);
        
        txtSrSalary= new JTextField();
        contentPane.add(txtSrSalary);
        txtSrSalary.setBounds(150,79,100,20);
        
        srWorkHrs= new JLabel("Working Hours");
        contentPane.add(srWorkHrs);
        srWorkHrs.setBounds(350,81,100,10);
        
        txtSrWorkHrs= new JTextField();
        contentPane.add(txtSrWorkHrs);
        txtSrWorkHrs.setBounds(450,79,100,20);
                
        contractPrd= new JLabel("Contract Period");
        contentPane.add(contractPrd);
        contractPrd.setBounds(10,104,100,10);
        
        txtContractPrd= new JTextField();
        contentPane.add(txtContractPrd);
        txtContractPrd.setBounds(150,102,100,20);
                        
        btnSrAdd=new JButton("Add");
        btnSrAdd.setBounds(470,102,80,30);
        contentPane.add(btnSrAdd);
        btnSrAdd.addActionListener(this);
                 
        srDevName= new JLabel("Developer Name");
        contentPane.add(srDevName);
        srDevName.setBounds(10,145,150,10);
        
        txtSrDevName= new JTextField();
        contentPane.add(txtSrDevName);
        txtSrDevName.setBounds(150,143,400,20);
        
        joinDate= new JLabel("Joining Date");
        contentPane.add(joinDate);
        joinDate.setBounds(10,168,100,10);
        
        txtJoinDate= new JTextField();
        contentPane.add(txtJoinDate);
        txtJoinDate.setBounds(150,166,100,20);
        
        advSalary= new JLabel("Advance Salary");
        contentPane.add( advSalary);
        advSalary.setBounds(350,168,100,10);
        
        txtAdvSalary= new JTextField();
        contentPane.add(txtAdvSalary);
        txtAdvSalary.setBounds(450,166,100,20);
        
        staffRoomNo= new JLabel("Staff room NO");
        contentPane.add(staffRoomNo);
        staffRoomNo.setBounds(10,191,150,10);
                
        txtStaffRoomNo= new JTextField();
        contentPane.add(txtStaffRoomNo);
        txtStaffRoomNo.setBounds(150,189,100,20);
        
        devNoSr = new JLabel("Developer Number");
        contentPane.add(devNoSr);
        devNoSr.setBounds(10,214,150,10);
        
        txtDevNoSr= new JTextField();
        contentPane.add(txtDevNoSr);
        txtDevNoSr.setBounds(150,212,100,20);
         
        btnSrApnt = new JButton("Appoint");
        contentPane.add(btnSrApnt);
        btnSrApnt.setBounds(348,191,80,30);
        btnSrApnt.addActionListener(this); //registering as a listener with btnSrApnt
        
        btnTerminate = new JButton("Terminate");
        btnTerminate.setBounds(440,191,108,30);
        contentPane.add(btnTerminate);
        btnTerminate.addActionListener(this);    
        
        btnSrClear = new JButton("Clear");
        btnSrClear.setBounds(470,226,80,30);
        contentPane.add( btnSrClear);
        btnSrClear.addActionListener(this);
    
        titleTwo=new JLabel("<<<<Junior Developer>>>>");
        contentPane.add(titleTwo);
        titleTwo.setBounds(210,250,200,20);
        
        jrPlatform= new JLabel("Platform");
        contentPane.add(jrPlatform);
        jrPlatform.setBounds(10,281,150,10);
        
        txtJrPlatform= new JTextField();
        contentPane.add(txtJrPlatform);
        txtJrPlatform.setBounds(150,279,400,20);
        
        jrIntName= new JLabel("Interviewer's Name");
        contentPane.add(jrIntName);
        jrIntName.setBounds(10,304,150,10);
        
        txtJrIntName= new JTextField();
        contentPane.add(txtJrIntName);
        txtJrIntName.setBounds(150,302,400,20);
        
        jrSalary= new JLabel("Salary");
        contentPane.add(jrSalary);
        jrSalary.setBounds(10,327,100,10);
        
        txtJrSalary= new JTextField();
        contentPane.add( txtJrSalary);
        txtJrSalary.setBounds(150,325,100,20);
        
        jrWorkHrs= new JLabel("WorkingHours");
        contentPane.add(jrWorkHrs);
        jrWorkHrs.setBounds(350,327,100,10);
        
        txtJrWorkHrs= new JTextField();
        contentPane.add(txtJrWorkHrs);
        txtJrWorkHrs.setBounds(450,325,100,20);
        
        apntBy= new JLabel("AppointedBy");
        contentPane.add(apntBy);
        apntBy.setBounds(10,350,100,20);
        
        txtApntBy= new JTextField();
        contentPane.add(txtApntBy);
        txtApntBy.setBounds(150,348,100,20);
        
        termDate= new JLabel("Termination Date");
        contentPane.add(termDate);
        termDate.setBounds(340,350,100,10);
        
        txtTermDate= new JTextField();
        contentPane.add(txtTermDate);
        txtTermDate.setBounds(450,348,100,20); 
        
        btnJrAdd=new JButton("Add");
        btnJrAdd.setBounds(470,375,80,30);
        contentPane.add(btnJrAdd);
        btnJrAdd.addActionListener(this);
        
        devNameJr= new JLabel("Developer Name");
        contentPane.add(devNameJr);
        devNameJr.setBounds(10,415,150,10);
        
        txtDevNameJr= new JTextField();
        contentPane.add(txtDevNameJr);
        txtDevNameJr.setBounds(150,412,400,20);
        
        specialtization= new JLabel("Specialization");
        contentPane.add(specialtization);
        specialtization.setBounds(10,438,150,10);
        
        txtSpecialtization= new JTextField();
        contentPane.add(txtSpecialtization);
        txtSpecialtization.setBounds(150,436,400,20);
        
        apntDate= new JLabel("Appointed Date");
        contentPane.add(apntDate);
        apntDate.setBounds(10,461,100,10);
        
        txtApntDate= new JTextField();
        contentPane.add(txtApntDate);
        txtApntDate.setBounds(150,459,100,20);
        
        evaluationPrd= new JLabel("Evaluation Period");
        contentPane.add(evaluationPrd);
        evaluationPrd.setBounds(10,484,100,10);
        
        txtEvaluationPrd= new JTextField();
        contentPane.add(txtEvaluationPrd);
        txtEvaluationPrd.setBounds(150,482,100,20); 
        
        jrDevNo= new JLabel("Developer Number");
        contentPane.add(jrDevNo);
        jrDevNo.setBounds(340,484,150,10);
        
        txtJrDevNo= new JTextField();
        contentPane.add(txtJrDevNo);
        txtJrDevNo.setBounds(450,482,100,20);
                
        btnJrApnt = new JButton("Appoint");
        btnJrApnt.setBounds(380,515,80,30);
        contentPane.add(btnJrApnt);
        btnJrApnt.addActionListener(this);
                
        btnJrClear = new JButton("Clear");
        btnJrClear.setBounds(415,550,80,30);
        contentPane.add(btnJrClear);
        btnJrClear.addActionListener(this);
       
        
        btnDisplay = new JButton("Display");
        btnDisplay.setBounds(470,515,80,30);
        contentPane.add(btnDisplay);
        btnDisplay.addActionListener(this);
        
        frame.setSize(575,620); 
        frame.setVisible(true);
        frame.setResizable(false); 
    }
    
    
   public void actionPerformed(ActionEvent ae)//  This an abstract method in Action Listener Interface which invoked when the an action is occurs. 
   {
      Object btn=ae.getSource();
    if(btn==btnSrClear)//checks the 
    {
        srClear();
    }
    else if (btn==btnJrClear)
    {
        jrClear();
    }
    
    else if(btn==btnSrAdd)
    {
        srAdd();
    }
    else if(btn==btnSrApnt)
    {
      srAppoint();
    }
    else if(btn==btnJrAdd)
    {
      jrAdd();
    }
    else if(btn==btnJrApnt)
    {
        jrAppoint();
    }
    else if(btn==btnDisplay)
    {
      display();
    }
    else if(btn==btnTerminate)
    {
       terminate();    
    }
   
    
}

/**
 * This metod clears the text from all text fields of Senior developer.
 */
public void srClear()
{
    txtSrPlatform.setText("");       
    txtSrIntName.setText("");       
    txtSrWorkHrs.setText("");
    txtContractPrd.setText("");
    txtSrSalary.setText("");
    txtAdvSalary.setText("");
    txtSrDevName.setText("");
    txtJoinDate.setText("");
    txtStaffRoomNo.setText("");
    txtDevNoSr.setText("");    
}

 /**
 * This metod clears the text from all text fields of Junior developer.
 */       
public void jrClear()
{
   txtJrPlatform.setText("");       
   txtJrIntName.setText("");       
   txtJrWorkHrs.setText("");       
   txtJrSalary.setText("");       
   txtApntBy.setText("");       
   txtTermDate.setText("");      
   txtDevNameJr.setText("");       
   txtApntDate.setText("");       
   txtSpecialtization.setText("");       
   txtEvaluationPrd.setText("");       
   txtJrDevNo.setText("");        
}
  
/**
 * This method is used to get the input values of the platform, interviewer name
   and working hours per day are used to create a new object of type
  SeniorDeveloper, which is added to the array list of Developers.
 */
    public void srAdd()
    {
        try{            
            if(!txtSrPlatform.getText().equals("") && !txtSrIntName.getText().equals("") && !txtContractPrd.getText().equals("") 
             && !txtSrWorkHrs.getText().equals("") && !txtSrSalary.getText().equals(""))
             {                  
                String platform= txtSrPlatform.getText();
                String interviewerName= txtSrIntName.getText();
                int contractPeriod= Integer.parseInt(txtContractPrd.getText());
                int workingHours= Integer.parseInt(txtSrWorkHrs.getText());
                int salary= Integer.parseInt(txtSrSalary.getText());
                
                SeniorDeveloper sd=new SeniorDeveloper(platform,interviewerName,workingHours,salary,contractPeriod);
                developers.add(sd);
                
                JOptionPane.showMessageDialog(frame,"Senior Developer,Added Sucessfully","About Senior Developer",JOptionPane.INFORMATION_MESSAGE);
             }
            else 
            {
               JOptionPane.showMessageDialog(frame,"Enter all information","About Senior Developer",JOptionPane.ERROR_MESSAGE);   
            }
            }
            catch(NumberFormatException error )
            {
                 JOptionPane.showMessageDialog(frame, error.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        
            }
            catch(NullPointerException error)
        {
            JOptionPane.showMessageDialog(frame,error.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
            
 }
 
 /**
  * The Developer number, Developer name, joining date, advance salary and
    staff room number are entered into the GUI. This method is used to check
    input value of the Developer number. If a suitable value has
    been entered, it is used to get the appropriate developer from the array list of
    Developers. The method to hire the developer in the SeniorDeveloper class is
    then called.
  */
   
public void srAppoint()
{
    try{
        int DevNoSr = Integer.parseInt(txtDevNoSr.getText());
        String developerName = txtSrDevName.getText();
        String joiningDate = txtJoinDate.getText();
        int advanceSalary = Integer.parseInt(txtAdvSalary.getText());
        String staffRoomNumber = txtStaffRoomNo.getText();
         if (DevNoSr >= 0 && DevNoSr<developers.size())                 
         {
            SeniorDeveloper sr = (SeniorDeveloper) developers.get(DevNoSr);
            sr.hireDeveloper(developerName,joiningDate,advanceSalary,staffRoomNumber);
            JOptionPane.showMessageDialog(frame,"Senior Developer Appointed Sucessfully","About Senior Developer",JOptionPane.INFORMATION_MESSAGE);
         }
         else 
         {
             JOptionPane.showMessageDialog(frame,"Enter Valid Developer Number","About Senior Developer",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        catch(NullPointerException error)
        {
            JOptionPane.showMessageDialog(frame,error.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch(NumberFormatException error)
        {
          JOptionPane.showMessageDialog(frame, error.getMessage()," Error",JOptionPane.ERROR_MESSAGE);
         }
}

 /**
  *This method functon is to get , the input values of the platform, interviewer name
    and working hours per day are used to create a new object of type
    JuniorDeveloper, which is added to an array list of Developers.
  */   
        
public void jrAdd()
{
    try
    {
        if(!txtJrPlatform.getText().equals("") && !txtJrIntName.getText().equals("") && !txtApntBy.getText().equals("")
        && !txtJrWorkHrs.getText().equals("") && !txtJrSalary.getText().equals("") && !txtTermDate.getText().equals(""))
        {
        String platform= txtJrPlatform.getText();
        String interviewerName= txtJrIntName.getText();        
        int workingHours= Integer.parseInt(txtJrWorkHrs.getText());
        int salary= Integer.parseInt(txtJrSalary.getText());
        String AppointedBy = txtApntBy.getText();
        String TerminationDate = txtTermDate.getText();
        
     
        JuniorDeveloper jr=new JuniorDeveloper(platform,interviewerName,workingHours,salary,AppointedBy,TerminationDate);
        developers.add(jr);
        
        JOptionPane.showMessageDialog(frame,"Junior Developer Appointed Sucessfully ","About Junior Developer",JOptionPane.INFORMATION_MESSAGE);
       }
       else 
       {
           JOptionPane.showMessageDialog(frame,"Enter all Information","About Junior Developer",JOptionPane.ERROR_MESSAGE);   
        }                
     }
    catch(NumberFormatException error)
    {
        JOptionPane.showMessageDialog(frame,error.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
    }
    catch(NullPointerException error)
    {
    JOptionPane.showMessageDialog(frame,error.getMessage(),"Error",JOptionPane.ERROR_MESSAGE); 
    }
 } 
   
 /**
  * The developer number, the developer name, appointed date, termination date
    and specialization are entered into the GUI. This method is used to check,
    the input value of the developer number. If a suitable value
    has been entered, it is used to get the Developer from the array list of
    Developers. The method to appoint developer in the JuniorDeveloper class is
    then called
  */
    public void jrAppoint()
    {
     try
     {
     int jrDevNo = Integer.parseInt(txtJrDevNo.getText());
     String developerName = txtDevNameJr.getText();
     String appointedDate = txtApntDate.getText();
     String terminationDate = txtTermDate.getText();
     String specialization = txtSpecialtization.getText();
     
     if (jrDevNo >= 0 && jrDevNo<developers.size())
     {
        JuniorDeveloper juniorDev = (JuniorDeveloper) developers.get(jrDevNo);
        juniorDev.appointDeveloper(developerName,appointedDate,terminationDate,specialization);
        JOptionPane.showMessageDialog(frame,"Junior Developer Appointed Sucessfully ","About Senior Developer",JOptionPane.INFORMATION_MESSAGE);
     }
     else
     {
         JOptionPane.showMessageDialog(frame,"Enter Valid Developer Number","About Senior Developer",JOptionPane.ERROR_MESSAGE);
     }
    }
    
    catch(NullPointerException error)
    {
        JOptionPane.showMessageDialog(frame,error.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
    }
    
    catch(NumberFormatException error)
    {
      JOptionPane.showMessageDialog(frame, error.getMessage()," Error",JOptionPane.ERROR_MESSAGE);
    }
  
 }
 
/**
 * This method display the information relating to properties.
 */

public void display()
{
for(Developer all:developers)//for loops for displaying inforamtion
{
  all.display();
}
}

/**
 * The Developer number is entered into the GUI.This function checks the
 * input value of the Developer number is checked. If a suitable value has been
 *entered, it is used to get the appropriate Developer from the array list of
 *Developers. The method to terminate developer contract in SeniorDeveloper
 *class is then called
 */

 public void terminate()
{
   
   int devNoSr = Integer.parseInt(txtDevNoSr.getText());     
   if (devNoSr >= 0 && devNoSr<developers.size())
     {
        SeniorDeveloper sr = (SeniorDeveloper) developers.get(devNoSr);
        sr.terminateDeveloper();
        JOptionPane.showMessageDialog(frame,"Developer contract terminated","About Termination",JOptionPane.INFORMATION_MESSAGE);
     }
     else 
     {
        JOptionPane.showMessageDialog(frame,"Enter Valid Developer Number","About Senior Developer",JOptionPane.ERROR_MESSAGE);
     }
       

}
}
