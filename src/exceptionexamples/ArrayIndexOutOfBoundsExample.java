package exceptionexamples;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        try{
            int a[] = {23,4,12,44};
            System.out.println("length of a is :"+a.length);
            System.out.println("a[0] is : "+a[0]);
            System.out.println("a[6] is : "+a[6]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured : "+e.getMessage());
        }
    }

}
