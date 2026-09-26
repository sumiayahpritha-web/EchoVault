public class Custodian extends VaultUser{
    public Custodian(String name, String userId){
        super(name, userId, "Custodian");
    }
    @Override
    public void requestAccess(String resource, int clearance){
        if(clearance> 3){
            System.out.println("Access denied: invalid clearance ");  
          }   
          else{
            System.out.println("Custodian access approved");
          }
         }
         @Override
         public void audit(){
            System.out.println("Custodian release recorded");
         }
         @Override
         public void riskCheck(){
            System.out.println("Risk: Controlled");
         }
     

}
