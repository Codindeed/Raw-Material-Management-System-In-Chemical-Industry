






   public class emp{
   private int empid;
   private String fn;
   private String ln;
   private String des;
   private int sal;
   private String pn;
  
   
   
   
   
    /**
     *
     * @param Employeeid
     * 
     */
    public emp(int Employeeid ,String FirstName,String LastName, String Designation,int Salary,String ProjectName)
   {this.empid = Employeeid;
    this.fn = FirstName;
    this.ln = LastName;
    this.des = Designation;
    this.sal= Salary;
    this.pn= ProjectName;
    
    
       
   }

    emp(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public int getEmployeeid(){
      return empid; 
   }
    public  String getFirstName(){
      return fn; 
   }
     public String getLastName(){
      return ln; 
   }
      public String getDesignation(){
      return des; 
   }
     public String getProjectNamey(){
      return pn; 
   } 
      public int getSalary(){
      return sal; 
   } 
    
   
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinmay pc
 */
