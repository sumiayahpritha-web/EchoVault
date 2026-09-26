public class VaultUser {
    private String name;
     private String userId;
      private String role;
      public VaultUser(String name, String userId,String role){
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
}