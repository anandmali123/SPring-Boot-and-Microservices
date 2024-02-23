package lecture4.Book.Api.Client.App.service;

import lecture4.Book.Api.Client.App.binding.Book;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import javax.print.DocFlavor;

@Service
public class BookClient {

    public void invokePost(){
        String url="https://ashokit-book-app.herokuapp.com/book";//api url rest api from where we retrieve data

        Book book=new Book();

        book.setBookId(1);
        book.setBookPrice("124");
        book.setBookName("Anand");
        WebClient client=WebClient.create();

        String resp=client.post() //https post  reuest
                .uri(url)//endpoint url
                .bodyValue(book)//Https reuest body data
                .retrieve()//Retrice http reponse
                .bodyToMono(String.class)//Bind resonse to string class
                .block(); //<Make it as sync
        System.out.println(resp);//printing data from apis and print on console
    }


    public void invokeBookAsync(){

        String url="https://ashokit-book-app.herokuapp.com/book";


        WebClient client=WebClient.create();

        client.get()//HTTPS get request
                .uri(url)//from which url
                .retrieve()
                .bodyToMono(Book[].class)//Bind resonse to Book[] array
                .subscribe(BookClient::respHandler);//for async call it will not wait for response and directly execute its remaining work
        System.out.println("**************Request sent********************");


    }

    public static void respHandler(Book[] books){
        for(Book b:books){
            System.out.println(b);
        }
    }

    public void invokeGet() {
        String apiUrl = "https://www,ashokit-book-app.herokuapp.clm/books";

        WebClient client = WebClient.create();

        String block = client.get() //GET Request
                .uri(apiUrl)
                .retrieve() //retrieve responseBody

                .bodyToMono(String.class) //bind response data
                .block(); //make it sync

        System.out.println(block);

    }


}
