public class Main {
    public static void main(String[] args) {
        VaultUser user1 = new VaultUser("jen","RS-204","Researcher");
        VaultUser user2 = new VaultUser("rob", "RS-209","Researcher");
        user1.displayProfile();
        System.out.println();
        user2.displayProfile();
        
    }
    
}
