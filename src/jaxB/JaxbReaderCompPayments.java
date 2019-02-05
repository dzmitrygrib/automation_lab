package jaxB;

import java.io.File;
import java.rmi.UnmarshalException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.qaprosoft.insuranceCompany.Finance.CompanyPayments;

public class JaxbReaderCompPayments {
	public static void main(String[] args) throws JAXBException, UnmarshalException{
		File file = new File("src/data/CompanyPayments.xml");
		JAXBContext context = JAXBContext.newInstance(com.qaprosoft.insuranceCompany.Finance.CompanyPayments.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		CompanyPayments payments = (CompanyPayments) unmarshaller.unmarshal(file);
		System.out.println(payments);
		
	}
}
