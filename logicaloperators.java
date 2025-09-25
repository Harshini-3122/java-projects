public class logicaloperators {
    public static void main(String[] args){
        int a = 10,
            b = -5;
        int age = 25;
        boolean isStudent = true;
        System.out.println("===Logical Operators===");

        //Logical AND
        System.out.println("a= "+a +" b= "+b);
        System.out.println("Both numbers are positive (a>0 && b>0):" + (a>0 && b>0)) ;

        //Logical Or
        System.out.println("\nAge="+age);
        System.out.println("Not eligible(age<18 || age>60):" + (age<18 || age>60));

        //Logical Not
        System.out.println("\nisStudent=" +isStudent);
        System.out.println("You are not a student(!isStudent):" +(!isStudent));
    }
}
