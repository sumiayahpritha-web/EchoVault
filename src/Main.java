public class Main {
    public static void main(String[] args) {
       
       
        System.out.println("Echovault system initialized");

        Student student = new Student("joe","s-205");
        Researcher researcher =  new Researcher("jomes","R-305");
        Custodian custodian = new Custodian("joey","C-215");

        student.displayProfile();
        student.riskCheck();
        student.audit();
        student.requestAccess("Research Notes" , 1);


        System.out.println();

        researcher.displayProfile();
        researcher.riskCheck();
        researcher.audit();
        researcher.requestAccess("Experimental purposes" , 2);


         System.out.println();

        custodian.displayProfile();
        custodian.riskCheck();
        custodian.audit();
        custodian.requestAccess("Archieve" , 3);



        
        
    }
    
}
