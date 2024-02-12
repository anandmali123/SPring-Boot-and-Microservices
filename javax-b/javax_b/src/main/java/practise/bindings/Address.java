package practise.bindings;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;


@Data
public class Address {
    private String city;
    private String state;
    private String country;

    
}
