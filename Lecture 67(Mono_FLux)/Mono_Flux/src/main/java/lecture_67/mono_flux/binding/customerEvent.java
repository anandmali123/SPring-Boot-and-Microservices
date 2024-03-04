package lecture_67.mono_flux.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class customerEvent {

    private String name;
    private Date createDate;
}
