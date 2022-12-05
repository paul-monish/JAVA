package Assignment9;//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//class Assignment9.Employee{
//    int EID;
//    String name;
//    double basic;
//    String city;
//
//    void setDetails(int EID, String name, double basic, String city) {
//        this.EID = EID;
//        this.name = name;
//        this.basic = basic;
//        this.city = city;
//    }
//    void getDetails(Assignment9.Employee[] e){
//        for(Assignment9.Employee ee:e){
//            System.out.println("EID: "+ee.EID);
//            System.out.println("Assignment7.Name: "+ee.name);
//            System.out.println("Basic: "+ee.basic);
//            System.out.println("City:"+ee.city);
//        }
//    }
//
//    double getGrossSalary(int EID,Assignment9.Employee[] e,int n){
//        int flag=0;
//        int i=0;
//        for(;i<n;i++){
//            if(e[i].EID==EID){
//                flag=1;
//                break;
//            }
//        }
//        if(flag==1){
//            return e[i].basic;
//        }
//        else
//            return -1.00;
//    }
//
//}
//class Company1 extends Assignment9.Employee{
//
//    @Override
//    double getGrossSalary(int EID, Assignment9.Employee[] e, int n) {
//            double basic=super.getGrossSalary(EID,e,n);
//            double AGP = basic * (40 / 100.0d);
//            double DA = (basic + AGP) * (25 / 100.0d);
//            double HRA = (basic + AGP) * (10 / 100.0d);
//            double TS = basic + AGP + DA + HRA;
//            return TS;
//    }
//
//}
//class Company2 extends  Assignment9.Employee{
//    @Override
//    double getGrossSalary(int EID, Assignment9.Employee[] e, int n) {
//            double basic=super.getGrossSalary(EID,e,n);
//            double AGP = basic * (50 / 100.0d);
//            double DA = (basic + AGP) * (50 / 100.0d);
//            double HRA = (basic + AGP) * (15 / 100.0d);
//            double TS = basic + AGP + DA + HRA;
//            return TS;
//    }
//}
//public class Assignment9.Assignment9A {
//    public static void main(String[] args) throws IOException {
//        System.out.println("Enter Assignment9.Number Of Employees:");
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int n=Integer.parseInt(br.readLine());
//        Assignment9.Employee[] e=new Assignment9.Employee[n];
//        for(int i=0;i<n;i++){
//            System.out.println("Enter EID:");
//            int EID=Integer.parseInt(br.readLine());
//            System.out.println("Enter Assignment7.Name:");
//            String name=br.readLine();
//            System.out.println("Enter Basic Salary:");
//            double basic=Double.parseDouble(br.readLine());
//            System.out.println("Enter City:");
//            String city=br.readLine();
//            e[i]=new Assignment9.Employee();
//            e[i].setDetails(EID,name,basic,city);
//            System.out.println("===============================");
//        }
//        new Assignment9.Employee().getDetails(e);
//        System.out.println("Enter Company: \n1. Company1.\n2. Company2");
//        switch (Integer.parseInt(br.readLine())){
//            case 1:
//                System.out.println("Enter EID");
//                int Eid1=Integer.parseInt(br.readLine());
//                System.out.println("Gross Salary of "+Eid1+" :"+new Company1().getGrossSalary(Eid1,e,n));
//                break;
//            case 2:
//                System.out.println("Enter EID");
//                int Eid2=Integer.parseInt(br.readLine());
//                System.out.println("Gross Salary of "+Eid2+" :"+new Company2().getGrossSalary(Eid2,e,n));
//                break;
//        }
//
//
//    }
//
//}
import java.util.Scanner;
class Employee{
    String Name,City;
    int EID;
    float Basic=200;

    void takeDetails()
    {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter EID: ");
        EID=sc1.nextInt();
        System.out.println("Enter Assignment7.Name: ");
        Name=sc2.nextLine();
        System.out.println("Enter Basic Pay: ");
        Basic=sc1.nextFloat();
        System.out.println("Enter City: ");
        City=sc2.nextLine();
    }

    void display()
    {
        System.out.println("EID: "+EID);
        System.out.println("NAME: "+Name);
        System.out.println("BASIC PAY: "+Basic);
        System.out.println("CITY: "+City);
    }

    float grossSal(Employee e)
    {
        System.out.println(e.Basic);
        return e.Basic;
    }
}

class company1 extends Employee{
    @Override
    float grossSal(Employee e)
    {
        float Basic=super.grossSal(e);
        float AGP=(40/100.0f)*Basic;
        float merged=AGP+Basic;
        float DA=(25/100.0f)*merged;
        float HRA=(10/100.0f)*merged;
        float TS= Basic+AGP+DA+HRA;
        return TS;

    }
}

class company2 extends Employee{
    @Override
    float grossSal(Employee e)
    {
        System.out.println("s");
        float Basic=super.grossSal(e);//200
        float AGP=(50/100.0f)*Basic;//100
        float merged=AGP+Basic;//300
        float DA=(50/100.0f)*merged;//150
        float HRA=(15/100.0f)*merged;//45
        float TS=Basic+AGP+DA+HRA;//45+150+100
        return TS;
    }
}

public class Assignment9A {
    public static void main(String[] args) {

        Employee e = new company2();
        Scanner s = new Scanner(System.in);
        e.takeDetails();
        e.display();

        System.out.println("Enter Company: \n1. Company1\n2. Company2");
        int n=s.nextInt();
        switch (n) {
            case 1:
                Employee c1=new company1();
                System.out.println("Total Salary: "+c1.grossSal(e));
                break;

            case 2:
                company2 c2=new company2();
                System.out.println("Total Salary: "+c2.grossSal(e));
                break;
        }
    }
}
