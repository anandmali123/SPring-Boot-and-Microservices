package Practise.User_Ragistration_Form.bindings;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {
      @NotEmpty(message = "Name should not Empty")
      @Size(min=3,max=8,message="Uname should be 3 to 8 characters")
       private String uname;
      @NotEmpty(message = "Please Set Password")
      private String pwd;
      @NotEmpty(message = "please give email here ")
      @Email(message = "email invalid")
      private String email;
      @NotEmpty(message = "please give mobile number")
      @Size(min =10, message="Phno should have atleast 10 digit")
      private String phno;
      @NotNull(message = "Please Give here Age")
      @Min(value=21,message="Age should be minimum 21 years")
      @Max(value = 60, message="Age shouldn't cross 60 years")
      private Integer age;


}
