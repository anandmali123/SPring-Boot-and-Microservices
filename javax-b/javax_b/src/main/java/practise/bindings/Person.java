package practise.bindings;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class Person {

    private Integer id;

    private String Name;

    private Integer age;

    private Integer phno;
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setPhno(Integer phno) {
        this.phno = phno;
    }
     
    
   
      

    
}
