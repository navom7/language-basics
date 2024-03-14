package employee;


public class Employee {
    public static void main(String[] args) {
        int a = -10;
        System.out.println("abc: " + a);
        byte c = 123;
        byte b = 2;


        //String literals and comparisons
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");

        System.out.println(s1==s2);//true because both points to same heap memory
        System.out.println(s1.equals(s2));

        System.out.println(s1==s3); //comes out false
        //because these two s1 and s3 both are at different heap memory locations


        System.out.println(s1.equals(s3));//true because value are same

    }
    public void getSalary() {
        System.out.println(23434);
    }
}
