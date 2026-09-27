public class Main {
    public static void main(String[] args) {
       
       
        System.out.println("Echovault system initialized");

        //Student student = new Student("joe","s-205");
        //Researcher researcher =  new Researcher("jomes","R-305");
        //Custodian custodian = new Custodian("joey","C-215");
        VaultUser user1 = new Student("joe","s-205");
         VaultUser user2 = new Researcher("jomes","R-305");
          VaultUser user3 = new Custodian("joey","C-215");
        user1.displayProfile();
        user1.riskCheck();
        user1.audit();
        user1.requestAccess("Research Notes" , 1);
        user1.checkAccess("research stats");
        user1.checkAccess("research stats", 3);
         System.out.println(VaultUser.generateRequestId());



        System.out.println();

        user2.displayProfile();
        user2.riskCheck();
        user2.audit();
        user2.requestAccess("Experimental purposes" , 2);
 System.out.println(VaultUser.generateRequestId());


         System.out.println();

        user3.displayProfile();
        user3.riskCheck();
        user3.audit();
        user3.requestAccess("Archieve" , 3);

        System.out.println(VaultUser.generateRequestId());


        
        
    }
    
}
