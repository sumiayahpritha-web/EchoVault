public class Researcher extends VaultUser{
    public Researcher (String name, String userId){
        super(name, userId, "Researcher");
    }
    @Override
    public void requestAccess(String resource, int clearance) throws InvalidAccessException{
        if(clearance> 2){
            throw new InvalidAccessException("Researcher access is limited to 2") ;  
          }   
          
            System.out.println("Researcher access approved");
          
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
