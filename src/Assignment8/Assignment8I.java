package Assignment8;
/*
Given 2 strings, s1 and s2, create a new string by appending s2 in the middle of s1.
append Middle("Chrisdem", IamNewString) → "ChrIamNewStringisdem"

 */
@FunctionalInterface
interface MyStringHandling{
    public String appendMiddle(String s1,String s2);
}

public class Assignment8I {
    public static void main(String[] args) {
        MyStringHandling m=(String s1,String s2)->{
                    int n=(s1.length()/2)-1;
                    return s1.substring(0,n)+s2+s1.substring(n);
        };
        System.out.println(m.appendMiddle("Chrisdem", "IamNewString"));
    }
}
