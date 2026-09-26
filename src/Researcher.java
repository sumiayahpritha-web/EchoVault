public class Researcher extends VaultUser{
    public Researcher (String name, String userId){
        super(name, userId, "Researcher");
    }
    @Override
    public void requestAccess(String resource, int clearance){
        if(clearance> 2){
            System.out.println("Access denied: Researcher clearence level is 2 ");  
          }   
          else{
            System.out.println("Researcher access approved");
          }
         }
         @Override
         public void audit(){
            System.out.println("Research activity recorded");
         }
         @Override
         public void riskCheck(){
            System.out.println("Risk: Acceptable");
         }
     

}
