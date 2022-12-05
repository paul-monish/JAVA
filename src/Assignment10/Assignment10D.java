package Assignment10;

class Mathexception extends Exception{
    public Mathexception(String msg){
        super(msg);
    }

}
class Overflowexception extends Mathexception{
    public Overflowexception(){
        super("> by another number");
    }
}
class Underflowexception extends Mathexception{
    public Underflowexception(){
        super("< by another number");
    }
}
public class Assignment10D {
    public static void main(String[] args) {
        int a=101;
        try{
            if(a<100){
                throw  new Underflowexception();
            }
            else{
                throw new Overflowexception();
            }
        }
        catch(Overflowexception e){
            e.printStackTrace();
        }
        catch(Underflowexception e){
            e.printStackTrace();
        }
        catch(Mathexception e){
            e.printStackTrace();
        }


    }
}

