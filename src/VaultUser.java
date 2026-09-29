public abstract class VaultUser implements Auditable, RiskAssesment {
    private String name;
     private String userId;
      private String role;
      public VaultUser(String name, String userId, String role){
        this.name = name;
        this.userId = userId;
        this.role = role;
      }
public static int requestCounter = 0;
  public static String generateRequestId(){
    requestCounter ++;
    return "EV-" + requestCounter;
  }
public void displayProfile(){
   System.out.println("Name:"+name);
   System.out.println("UserID:"+userId);
   System.out.println("Role:"+role);
}
public String getName() {
    return name;
}
public String getUserID() {
    return userId;
}
public String getRole() {
    return role;
}
public abstract void requestAccess(String resource, int clearance) throws InvalidAccessException;



public void checkAccess(String resource){
    System.out.println("Checking resouces for: " + resource);
}
public void checkAccess(String resource, int clearance ){
    System.out.println("Checking " + resource + " -with clearence level " + clearance);
}
protected int requiredClearence(String resource) throws InvalidAccessException{
    switch (resource) {
        case "Research notes":
        case "Statistics":
        return 1;    
    

        case "Experimental Data":
            return 2;

        case "Encryption Keys":
        case "Confidential Archieve":
        return 3; 

        default:
            throw new  InvalidAccessException("Unknown resouce: " + resource);
           
    }
}
}

