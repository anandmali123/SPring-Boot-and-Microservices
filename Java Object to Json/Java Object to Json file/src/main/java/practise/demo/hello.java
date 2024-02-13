package practise.demo;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

class Main {
    public static void main(String[] args) {
        // Create a Java object
        MyObject myObject = new MyObject("John", 30);

        // Convert Java object to JSON
        Gson gson = new Gson();
        String json = gson.toJson(myObject);
        try (FileWriter writer = new FileWriter("output.json")) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print JSON
        System.out.println(json);
    }
}

class MyObject {
    private String name;
    private int age;

    public MyObject(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
