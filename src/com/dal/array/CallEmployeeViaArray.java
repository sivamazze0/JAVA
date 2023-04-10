package com.dal.array;

import com.dal.model.Employee;
public class CallEmployeeViaArray {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEname("Malar");
		Employee e2 = new Employee();
		e2.setEname("Bala");

		Employee[] empArr = new Employee[2];
		
		empArr[0]=e1;
		empArr[1]=e2;

		for(Employee i : empArr)
		{
			System.out.println(i);
		}

	}

}
