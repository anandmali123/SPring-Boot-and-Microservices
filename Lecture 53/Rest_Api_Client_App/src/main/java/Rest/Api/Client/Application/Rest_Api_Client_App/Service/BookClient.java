package Rest.Api.Client.Application.Rest_Api_Client_App.Service;

import Rest.Api.Client.Application.Rest_Api_Client_App.bindings.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class BookClient {

    public void postRequest(){
        String url="https://ashikit-sb-rest-api.herokuapp.com/book";

        RestTemplate rt=new RestTemplate();

        Book book=new Book();

        book.setBookName("Amamd");
        book.setBookPrice(234);

        ResponseEntity<String>  postforEntity=rt.postForEntity(url,book,String.class);

        String body=postforEntity.getBody();

        System.out.println(body);



    }
    public void getRequest(){
        String url="https://ashikit-sb-rest-api.herokuapp.com/books";
        RestTemplate rt=new RestTemplate();

        ResponseEntity<String> getforentity=rt.getForEntity(url,String.class);

        System.out.println(getforentity.getBody());




    }

    public void getRequestusingbookclass(){
        String url="https://ashikit-sb-rest-api.herokuapp.com/books";
        RestTemplate rt=new RestTemplate();

        ResponseEntity<Book[]> getforentity=rt.getForEntity(url,Book[].class);

         Book[] body=getforentity.getBody();
        for(Book book:body){
            System.out.println(book);
        }





    }
}
