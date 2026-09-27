public class Main {
    public static void main(String[] args) {
       
       
        System.out.println("Echovault system initialized");

        //Student student = new Student("joe","s-205");
        //Researcher researcher =  new Researcher("jomes","R-305");
        //Custodian custodian = new Custodian("joey","C-215");
        VaultUser student = new Student("joe","s-205");
         VaultUser researcher = new Researcher("jomes","R-305");
          VaultUser custodian = new Custodian("joey","C-215");
        student.displayProfile();
        student.riskCheck();
        student.audit();
        student.checkAccess("research stats");
        student.checkAccess("research stats", 1);
         System.out.println(VaultUser.generateRequestId());
          try{
            student.requestAccess("Research Notes" , 5);
        }
        catch(InvalidAccessException e){
            System.out.println("Status denied");
            System.out.println("Reason: " + e.getMessage());

        }
        finally{
    System.out.println("Request processing");
}



        System.out.println();

        researcher.displayProfile();
        researcher.riskCheck();
        researcher.audit();
        researcher.checkAccess("Previous year research");
        researcher.checkAccess("Previous year research", 2);
        System.out.println(VaultUser.generateRequestId());
        try{
            researcher.requestAccess("Experimental purposes" , 2);
        }
        catch(InvalidAccessException e){
            System.out.println("Status denied");
            System.out.println("Reason: " + e.getMessage());

        }
        finally{
    System.out.println("Request processing");
}

         System.out.println();

        custodian.displayProfile();
        custodian.riskCheck();
        custodian.audit();
        custodian.checkAccess("Confidential archieve");
        custodian.checkAccess("Confidential archieve", 3);
    
        System.out.println(VaultUser.generateRequestId());

       try{
            custodian.requestAccess("Archieve" , 3);
        }
        catch(InvalidAccessException e){
            System.out.println("Status denied");
            System.out.println("Reason: " + e.getMessage());

        }
finally{
    System.out.println("Request processing");
}
}
    
}