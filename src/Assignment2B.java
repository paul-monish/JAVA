import java.util.Scanner;

public class Assignment2B {
	float totalSalary(float basic) {
		float AGP = basic * (50 / 100.0F);
		float DA = (basic + AGP) * (50 / 100.0F);
		float HRA = (basic + AGP) * (15 / 100.0F);
		float TS = basic + AGP + DA + HRA;
		return TS;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Pay:");
		float bs = sc.nextFloat();
		System.out.println("Total Salary= " + new Assignment2B().totalSalary(bs));
		sc.close();
	}

}
