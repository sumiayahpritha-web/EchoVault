public class Student extends VaultUser{
    public Student(String name, String userId){
        super(name, userId, "student");
    }
    @Override
    public void requestAccess(String resource, int clearance) throws InvalidAccessException{

        int required = requiredClearence(resource);
        if(clearance > required || clearance> 1){ 
            throw new InvalidAccessException("student access is limited to 1") ;
          }   
        
            System.out.println("Student access approved");
        
         }
         @Override
         public void audit(){
            System.out.println("Access request recorded");
         }
         @Override
         public void riskCheck(){
            System.out.println("Risk: Low");
         }
     

}
