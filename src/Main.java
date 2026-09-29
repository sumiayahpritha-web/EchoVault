public class Main {
    public static void main(String[] args) {
       
       
        System.out.println("Echovault system initialized\n");

        //Student student = new Student("joe","s-205");
        //Researcher researcher =  new Researcher("jomes","R-305");
        //Custodian custodian = new Custodian("joey","C-215");

        VaultUser student = new Student("X","S-205");
         VaultUser researcher = new Researcher("Y","R-305");
          VaultUser custodian = new Custodian("Z","C-215");
        student.displayProfile();
        student.riskCheck();
        student.audit();

        System.out.println();
        student.checkAccess("Encryption Keys");
        student.checkAccess("Encryption Keys", 3);

        System.out.println();
         System.out.println(VaultUser.generateRequestId());
          try{
            student.requestAccess("Encryption Keys" , 3);
        }
        catch(InvalidAccessException e){
            System.out.println("Status : Denied");
            System.out.println("Reason: " + e.getMessage());

        }
        finally{
    System.out.println("Request processing completed.");
}



        System.out.println();

        researcher.displayProfile();
        researcher.riskCheck();
        researcher.audit();
       System.out.println();

        researcher.checkAccess("xyz");
        researcher.checkAccess("xyz", 2);
        System.out.println();

        System.out.println(VaultUser.generateRequestId());
        try{
            researcher.requestAccess("xyz" , 2);
        }
        catch(InvalidAccessException e){
            System.out.println("Status denied");
            System.out.println("Reason: " + e.getMessage());

        }
        finally{
    System.out.println("Request processing completed.");
}

         System.out.println();

        custodian.displayProfile();
        custodian.riskCheck();
        custodian.audit();
        System.out.println();


        custodian.checkAccess("Confidential archieve");
        custodian.checkAccess("Confidential archieve", 3);

         System.out.println();

    
        System.out.println(VaultUser.generateRequestId());

       try{
            custodian.requestAccess("Confidential Archieve" , 3);
        }
        catch(InvalidAccessException e){
            System.out.println("Status denied");
            System.out.println("Reason: " + e.getMessage());

        }
finally{
    System.out.println("Request processing completed.");
}
}
    
}