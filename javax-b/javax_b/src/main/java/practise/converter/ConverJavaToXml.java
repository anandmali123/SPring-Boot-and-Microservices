package practise.converter;
import practise.bindings.Person;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import java.io.File; // Import File class

public class ConverJavaToXml {
    public static void main(String[] args) throws JAXBException {
              Address adr=new Address();
              adr.setCity()
            Person person = new Person();
            person.setId(101); // Correct method name is setId
            person.setName("Anand");
            person.setAge(22);
            person.setPhno(935); // Assuming phno is a long

            JAXBContext instance = JAXBContext.newInstance(Person.class);
            Marshaller marshaller = instance.createMarshaller();

            marshaller.marshal(person, new File("Person.xml"));

            System.out.println("Marshalling Completed....");
        
    }
}
