package exceptionexamples;

public class NestedTryAndCatchExample {
    public static void main(String[] args) {

        try{
            System.out.println("inside 1st try block");
            int a=10, b=10, result=0;
            result=a/b; // division by zero
            System.out.println("result is : "+result);
            try{
                System.out.println("inside 2nd try block");
                String msg1="hi hello";
                String msg2="hello";
                System.out.println("length of msg1 is : "+msg1.length());
                System.out.println("length of msg2 is : "+msg2.length());
                try{
                    System.out.println("inside 3rd try block");
                    int arr[] = {23,4,12,44};
                    System.out.println("length of a is :"+arr.length);
                    System.out.println("arr[0] is : "+arr[0]);
                    System.out.println("arr[6] is : "+arr[6]);
                    System.out.println("inside try block after exception occurs");
                } catch (Exception e) {
                    System.out.println("inside 3rd catch block");
                    System.out.println("Exception occurred : "+e.getMessage());
                }
            } catch (Exception e) {
                try{

                } catch (Exception ex) {
                }
                System.out.println("inside 2nd catch block");
                System.out.println("Exception occurred : "+e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("inside 1st catch block");
            System.out.println("Exception occurred : "+e.getMessage());
        }
    }
}
