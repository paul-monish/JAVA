package com.test;

class A {
	int a;
	int b;

	A(int a, int b) {
		this.a = a;
		this.b = b;
	}

	A ob() {
		return new A(a, b);
	}
}

class B {
	int a;
	int b;

	B(int a, int b) {
		this.a = a;
		this.b = b;
	}

	B ob() {
		return new B(a, b);
	}

	public boolean equals(B a) {
		if (a.a == this.a && a.b == this.b) {
			return true;
		} else {
			return false;
		}
	}
}

public class CompareObject {

	public static void main(String[] args) {
//		A a1 = new A(1, 2);
//		A a2 = new A(1, 2);
		B b = new B(1, 2);
		B b1 = new B(1, 2);

		System.out.println(b.equals(b1));

	}

}
