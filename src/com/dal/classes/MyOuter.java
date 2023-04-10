package com.dal.classes;

public class MyOuter {

	int x = 7;

	class MyInner {
		public void InnerMethod() {
			System.out.println("x == " + x);
		}
	}

	public void OuterMethod() {
		System.out.println("From outer method = " + x);
		MyInner inn = new MyInner();
		inn.InnerMethod();
	}

	public static void main(String[] args) {
		MyOuter mo = new MyOuter();
		// MyInner inn = new MyInner(); //invalid
		// inn.InnerMethod();
		// instantiate inner class /*<outerclassname>.<innerclassname> objname =
		// <outerclass instancename>.new <innerclassname>();*/
		MyOuter.MyInner mi = mo.new MyInner();
		mi.InnerMethod();
		mo.OuterMethod();
		// mo.InnerMethod(); illegal

	}

}
