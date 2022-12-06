package Assignment9;

interface MeanInterface{
    default float mean(int a[]){
        float s=0.0f;
        for(int i:a){
            s+=i;
        }
        return s/a.length;
    }
}
interface DeviationInterface extends MeanInterface{
    default float deviation(int a[]){
        float m=mean(a);
        float s=0.0f;
        for(int i:a){
            s+=Math.pow((i-m),2);
        }

        return (float)Math.sqrt(s/(a.length));
    }
}
public class Assignment9G implements MeanInterface,DeviationInterface{

    public static void main(String[] args) {
        int arr[]={11,22,33,44,55};
        Assignment9G a=new Assignment9G();
        System.out.println(a.mean(arr));
        System.out.println(a.deviation(arr));
    }
}
