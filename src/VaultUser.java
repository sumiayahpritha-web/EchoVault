public abstract class VaultUser implements Auditable, RiskAssesment {
    private String name;
     private String userId;
      private String role;
      public VaultUser(String name, String userId, String role){
        this.name = name;
        this.userId = userId;
        this.role = role;
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
public abstract void requestAccess(String resource, int clearance);
}