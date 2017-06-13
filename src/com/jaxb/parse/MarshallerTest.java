package com.jaxb.parse;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshallerTest {
	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(EmployeeType.class);
		Marshaller m = context.createMarshaller();
		AddressType address = new AddressType();
		address.setPin(267236);
		address.setStreet("Bangalre");
		EmployeeType employee = new EmployeeType();
		employee.setName("Basant");
		employee.setProfession("Developer");
		employee.setAddress(address);
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(employee, System.out);

	}
}
