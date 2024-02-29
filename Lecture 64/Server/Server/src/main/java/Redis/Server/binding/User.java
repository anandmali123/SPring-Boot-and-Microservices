package Redis.Server.binding;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Integer uid;
    private String name;
    private Integer age;

}
