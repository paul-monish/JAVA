package Assignment2;

import java.util.Scanner;
/*
B. Consider the basic pay of an employee as user input. AGP is 50% of the basic pay. Company provides
50% DA and 15% HRA on the merged basic(Basic+AGP). Write a java program to calculate and display total
salary of the employee
 */
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
