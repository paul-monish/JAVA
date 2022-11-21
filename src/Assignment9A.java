import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee{
    int EID;
    String name;
    double basic;
    String city;

    void setDetails(int EID, String name, double basic, String city) {
        this.EID = EID;
        this.name = name;
        this.basic = basic;
        this.city = city;
    }
    void getDetails(Employee[] e){
        for(Employee ee:e){
            System.out.println("EID: "+ee.EID);
            System.out.println("Name: "+ee.name);
            System.out.println("Basic: "+ee.basic);
            System.out.println("City:"+ee.city);
        }
    }

    double getGrossSalary(int EID,Employee[] e,int n){
        int flag=0;
        int i=0;
        for(;i<n;i++){
            if(e[i].EID==EID){
                flag=1;
                break;
            }
        }
        if(flag==1){
            return e[i].basic;
        }
        else
            return -1.00;
    }

}
class Company1 extends Employee{

    @Override
    double getGrossSalary(int EID, Employee[] e, int n) {
            double basic=super.getGrossSalary(EID,e,n);
            double AGP = basic * (40 / 100.0d);
            double DA = (basic + AGP) * (25 / 100.0d);
            double HRA = (basic + AGP) * (10 / 100.0d);
            double TS = basic + AGP + DA + HRA;
            return TS;
    }

}
class Company2 extends  Employee{
    @Override
    double getGrossSalary(int EID, Employee[] e, int n) {
            double basic=super.getGrossSalary(EID,e,n);
            double AGP = basic * (50 / 100.0d);
            double DA = (basic + AGP) * (50 / 100.0d);
            double HRA = (basic + AGP) * (15 / 100.0d);
            double TS = basic + AGP + DA + HRA;
            return TS;
    }
}
public class Assignment9A {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter Number Of Employees:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Employee[] e=new Employee[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter EID:");
            int EID=Integer.parseInt(br.readLine());
            System.out.println("Enter Name:");
            String name=br.readLine();
            System.out.println("Enter Basic Salary:");
            double basic=Double.parseDouble(br.readLine());
            System.out.println("Enter City:");
            String city=br.readLine();
            e[i]=new Employee();
            e[i].setDetails(EID,name,basic,city);
            System.out.println("===============================");
        }
        new Employee().getDetails(e);
        System.out.println("Enter Company: \n1. Company1.\n2. Company2");
        switch (Integer.parseInt(br.readLine())){
            case 1:
                System.out.println("Enter EID");
                int Eid1=Integer.parseInt(br.readLine());
                System.out.println("Gross Salary of "+Eid1+" :"+new Company1().getGrossSalary(Eid1,e,n));
                break;
            case 2:
                System.out.println("Enter EID");
                int Eid2=Integer.parseInt(br.readLine());
                System.out.println("Gross Salary of "+Eid2+" :"+new Company2().getGrossSalary(Eid2,e,n));
                break;
        }


    }

}
