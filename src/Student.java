public class Student extends VaultUser{
    public Student(String name, String userId){
        super(name, userId, "student");
    }
    @Override
    public void requestAccess(String resource, int clearance){
        if(clearance> 1){
            System.out.println("Access denied: student clearence level is 1 ");  
          }   
          else{
            System.out.println("Student access approved");
          }
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
