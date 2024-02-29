package Redis.server2.binding;

import lombok.Data;

import java.io.Serializable;

@Data
public class Employee implements Serializable {
    private Integer Empid;
    private String Name;
    private Integer age;
}
