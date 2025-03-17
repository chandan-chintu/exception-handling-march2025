package exceptionexamples;

public class MultipleCatchExample {
    public static void main(String[] args) {
        int a=10, b=10, result=0;
        try{
            // monitor code
            System.out.println("inside try block before exception occurs");
            result=a/b; // division by zero

            String msg1="hi hello";
            String msg2=null;
            System.out.println("length of msg1 is : "+msg1.length());
            System.out.println("length of msg2 is : "+msg2.length());

            int arr[] = {23,4,12,44};
            System.out.println("length of a is :"+arr.length);
            System.out.println("arr[0] is : "+arr[0]);
            System.out.println("arr[6] is : "+arr[6]);
            System.out.println("inside try block after exception occurs");
        } catch (ArithmeticException e){
            // handling exception
            System.out.println("Exception occurred : "+ e.getMessage()  +"---"+e.getClass());
        }  catch (NullPointerException e){
            System.out.println("Exception occured : "+e.getMessage() +"---"+e.getClass());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured : "+e.getMessage() +"---"+e.getClass());
        }
        System.out.println("result is : "+result);
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
    }
}
