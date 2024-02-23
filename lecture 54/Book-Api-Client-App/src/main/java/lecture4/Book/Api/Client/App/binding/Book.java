package lecture4.Book.Api.Client.App.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Integer BookId;
    private String BookName;
    private String BookPrice;

}
