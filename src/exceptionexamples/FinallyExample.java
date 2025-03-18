package exceptionexamples;

public class FinallyExample {
    public static void main(String[] args) {
        int a=10,b=0;
        int result = 0;
        try{
             result = a/b;
            System.out.println("ending try block");
        } catch (Exception e){
            System.out.println("Exception occurred : "+e.getMessage());
        }
        finally {
                System.out.println("Finally will always execute");
        }
    }
}
