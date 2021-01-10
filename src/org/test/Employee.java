package org.test;

//import packagename.ClassName;
import org.sample.Client;

public class Employee {

	public void empId() {
		System.out.println("Employee id: 123");
	}

	public void empName() {
		System.out.println("Employee name: Amy");
	}

	// Execution will always start from main method

	public static void main(String[] args) {

		// Object creation---ClassName objName=new ClassName();
		Employee empDetails = new Employee();

		// Method call---objName.methodName();
		empDetails.empId();
		empDetails.empName();
		
		Company comDetails=new Company();
		comDetails.companyId();
		comDetails.companyName();
		
		Client cliDetails=new Client();
		cliDetails.clientId();
		cliDetails.clientName();
		
	}

}

//Ctrl+Space bar---suggestions
//Ctrl+D-----Delete a line
//Ctrl+shift+f-----To align the program