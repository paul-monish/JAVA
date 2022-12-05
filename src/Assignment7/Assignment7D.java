package Assignment7;
//import java.util.Scanner;
//
//class Assignment7.Name {
//	String f, m, l;
//
//	public Assignment7.Name(String f, String m, String l) {
//		this.f = f;
//		this.m = m;
//		this.l = l;
//	}
//
//}
//
//class Assignment7.DOB {
//	int d, m, y;
//
//	public Assignment7.DOB(int d, int m, int y) {
//		this.d = d;
//		this.m = m;
//		this.y = y;
//	}
//
//}
//
//class Student {
//	int id;
//	double[] marks = new double[3];
//	Assignment7.Name name;
//	String gender;
//	Assignment7.DOB date;
//
//	Student() {
//	}
//
//	public Student(int id, double[] marks, Assignment7.Name name, String gender, Assignment7.DOB date) {
//		this.id = id;
//		this.marks = marks;
//		this.name = name;
//		this.gender = gender;
//		this.date = date;
//	}
//
//	void disp(Student s[]) {
//		System.out.println("|  id  |  name  |  gender  |  d.o.b  |  english  |  math  |  cs  |");
//		System.out.println("------------------------------------------------------------------");
//		for (int i = 0; i < s.length; i++)
//			System.out.println(" | " + s[i].id + " | " + s[i].name.f + " " + s[i].name.m + " " + s[i].name.l + " | "
//					+ s[i].gender + " | " + s[i].date.d + "/" + s[i].date.m + "/" + s[i].date.y + " | " + s[i].marks[0]
//					+ " | " + s[i].marks[1] + " | " + s[i].marks[2] + " | ");
//	}
//
//	void findById(int id, Student s[]) {
//		int i = 0;
//		for (; i < s.length; i++) {
//			if (s[i].id == id)
//				break;
//			else
//				System.out.println("Not Found!!!");
//		}
//		System.out.println("|  id  |  name  |  gender  |  d.o.b  |  english  |  math  |  cs  |");
//		System.out.println("------------------------------------------------------------------");
//		System.out.println(" | " + s[i].id + " | " + s[i].name.f + " " + s[i].name.m + " " + s[i].name.l + " | "
//				+ s[i].gender + " | " + s[i].date.d + "/" + s[i].date.m + "/" + s[i].date.y + " | " + s[i].marks[0]
//				+ " | " + s[i].marks[1] + " | " + s[i].marks[2] + " | ");
//	}
//
////	public boolean equals(Student n) {
////		if (n.f == this.name.f && n.l == this.name.l && n.m == this.name.m) {
////			return true;
////		} else {
////			return false;
////		}
////	}
//
//	void findByName(Assignment7.Name n, Student s[]) {
//		int i = 0;
//		for (; i < s.length; i++) {
//			if (n.f.equalsIgnoreCase(s[i].name.f) && n.l.equalsIgnoreCase(s[i].name.l)
//					&& n.m.equalsIgnoreCase(s[i].name.m))
//				break;
//			else
//				System.out.println("Not Found!!!");
//		}
//		System.out.println("   id  |  name  |  gender  |  d.o.b  |  english  |  math  |  cs  |");
//		System.out.println("------------------------------------------------------------------");
//		System.out.println(s[i].id + " | " + s[i].name.f + " " + s[i].name.m + " " + s[i].name.l + " | " + s[i].gender
//				+ " | " + s[i].date.d + "/" + s[i].date.m + "/" + s[i].date.y + " | " + s[i].marks[0] + " | "
//				+ s[i].marks[1] + " | " + s[i].marks[2] + " | ");
//	}
//
//}
//
//public class Assignment7.Assignment7D {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Scanner sc1 = new Scanner(System.in);
//		Scanner sc2 = new Scanner(System.in);
//
//		double[] marks = new double[3];
//		System.out.println("Enter Number Of Students");
//		int n = sc.nextInt();
//		Student[] s = new Student[n];
//		for (int i = 0; i < n; i++) {
//			System.out.println("Enter ID:");
//			int id = sc.nextInt();
//			System.out.println("Enter fname:");
//			String f = sc1.nextLine();
//			System.out.println("Enter lname:");
//			String l = sc1.nextLine();
//			System.out.println("Enter mname:");
//			String m = sc1.nextLine();
//			System.out.println("Enter Gender:");
//			String g = sc1.nextLine();
//			System.out.println("Enter day:");
//			int d = sc.nextInt();
//			System.out.println("Enter month:");
//			int mo = sc.nextInt();
//			System.out.println("Enter year:");
//			int y = sc.nextInt();
//			System.out.println("Enter marks Of 3 sub:");
//			for (int j = 0; j < 3; j++)
//				marks[j] = sc2.nextDouble();
//			s[i] = new Student(id, marks, new Assignment7.Name(f, m, l), g, new Assignment7.DOB(d, mo, y));
//		}
//		Student sn = new Student();
//		sn.disp(s);
////		System.out.println("------------------------------------------------------------------");
////		System.out.println("Enter Id which you want to find?");
////		int id = sc.nextInt();
////		sn.findById(id, s);
////		System.out.println("------------------------------------------------------------------");
////		System.out.println("Enter Assignment7.Name which you want to find?");
////		System.out.println("Enter fname:");
////		String f = sc1.nextLine();
////		System.out.println("Enter lname:");
////		String l = sc1.nextLine();
////		System.out.println("Enter mname:");
////		String m = sc1.nextLine();
////		sn.findByName(new Assignment7.Name(f, m, l), s);
//	}
//
//}
/*
D. Declare a class student that represents the following hierarchical information- id, name (First, Middle, Last),
Gender, DOB (day, month, year), marks of 3 subjects considering an 1D array (English, Mathematics, Computer
Science). To store the name and DOB use the concept aggregation. Write a java program to store and display the
database of n students by using array of objects. Also write methods to search a particular student (based on id or
name) from array and display his/her details.

 */
import java.util.Scanner;

class Name {
	String fn, mn, ln;

	Name(String fn, String mn, String ln) {
		this.fn = fn;
		this.mn = mn;
		this.ln = ln;
	}

	String fullN() {
		return (fn + " " + mn + " " + ln);
	}
}

class DOB {
	String bd, bm, by;

	DOB(String bd, String bm, String by) {
		this.bd = bd;
		this.bm = bm;
		this.by = by;
	}

	String dob() {
		return (bd + "-" + bm + "-" + by);
	}
}

class StuDetails {
	String sID, g;
	Name nm;
	DOB db;
	String[] sub = { "English", "Mathematics", "Computer Science" };
	double[] mk = new double[3];

	StuDetails() {
	}

	StuDetails(String sID, Name nm, DOB db, String g, double[] mk) {
		this.sID = sID;
		this.nm = nm;
		this.db = db;
		this.g = g;
		this.mk = mk;
	}

	void dis(StuDetails[] s, int i) {
		System.out.println("ID: " + s[i].sID);
		System.out.println("Assignment7.Name: " + s[i].nm.fullN());
		System.out.println("Assignment7.DOB: " + s[i].db.dob());
		System.out.println("Gender: " + s[i].g);
		System.out.println("Marks of 3 subjects:");
		for (int j = 0; j < 3; j++) {
			System.out.println(s[i].sub[j] + ": " + s[i].mk[j]);
		}
	}

	void tDetails(StuDetails[] s) {
		for (int i = 0; i < s.length; i++) {
			dis(s, i);
		}
	}

	void fbn(StuDetails[] s, String[] f) {
		int i = 0, flag = 0;
		for (; i < s.length; i++) {
//            if (s[i].nm.fullN().equalsIgnoreCase(f)) {
//                System.out.println("Full Assignment7.Name: "+s[i].nm.fullN());
//                flag = 1;
//                break;
//            }
			if (s[i].nm.mn.isEmpty()) {
				if (s[i].nm.fn.equalsIgnoreCase(f[0]) && s[i].nm.ln.equalsIgnoreCase(f[1])) {
					flag = 1;
					break;
				}
			} else {
				if (s[i].nm.fn.equalsIgnoreCase(f[0]) && s[i].nm.mn.equalsIgnoreCase(f[1])
						&& s[i].nm.ln.equalsIgnoreCase(f[2])) {
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0) {
			System.out.println("Invalid Assignment7.Name!!!");
		} else {
			dis(s, i);
		}
	}

	void fbi(StuDetails[] s, String f) {
		int i = 0, flag = 0;
		for (; i < s.length; i++) {
			if (f.equals(s[i].sID)) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Invalid ID!!!");
		} else {
			dis(s, i);
		}
	}
}

class Assignment7D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		StuDetails std = new StuDetails();
		String ftn, mdn, ltn;
		System.out.print("Enter no. of student: ");
		int ns = sc.nextInt();
		StuDetails[] st = new StuDetails[ns];
		for (int i = 0; i < ns; i++) {
			System.out.print("Student ID: ");
			String sID = sc1.next();
			System.out.print("First Assignment7.Name: ");
			ftn = sc2.nextLine();
			System.out.print("Middle Assignment7.Name: ");
			mdn = sc2.nextLine();
			System.out.print("Last Assignment7.Name: ");
			ltn = sc2.nextLine();
			Name nm = new Name(ftn, mdn, ltn);
			System.out.print("Birth Date: ");
			String bd = sc.next();
			System.out.print("Birth Month: ");
			String bm = sc.next();
			System.out.print("Birth Year: ");
			String by = sc.next();
			DOB d = new DOB(bd, bm, by);
			System.out.print("Gender: ");
			String g = sc1.next();
			System.out.println("Enter marks of 3 subjects:");
			double[] m = new double[3];
			for (int j = 0; j < 3; j++) {
				System.out.print(std.sub[j] + ": ");
				m[j] = sc1.nextDouble();
			}
			st[i] = new StuDetails(sID, nm, d, g, m);
		}
		std.tDetails(st);
		while (true) {
			System.out.println("1 --> Assignment6.Search by Assignment7.Name");
			System.out.println("2 --> Assignment6.Search by ID");
			System.out.println("3 --> Exit");
			System.out.print("Enter your choice: ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: // System.out.print("First Assignment7.Name: ");
//                        ftn = sc2.nextLine();
//                        System.out.print("Middle Assignment7.Name: ");
//                        mdn = sc2.nextLine();
//                        System.out.print("Last Assignment7.Name: ");
//                        ltn = sc2.nextLine();
//                        Assignment7.Name nm = new Assignment7.Name(ftn, mdn, ltn);
//                        std.fbn(st, nm.fullN());
				System.out.print("Enter your name: ");
				String sn = sc2.nextLine();
				String[] sn1 = sn.split(" ");
				std.fbn(st, sn1);
				break;
			case 2:
				System.out.print("Enter searching ID: ");
				String p = sc1.next();
				std.fbi(st, p);
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Invalid choice!!!");
			}
		}
	}
}