package org.example.gui_chat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class C2W_Chat_App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
      c2w_window = stage;

      c2w_listenButton = new Button("Port Number: ");
      c2w_listenButton.setOnAction(this:: c2w_doAction);

      c2w_connectButton =new Button("Connect to : ");


    }


    public static void main(String[] c2w_args) {
        launch(c2w_args);
    }
    private enum ConnectionState{ LISTENING, CONNECTING, CONNECTED, CLOSED}

    private static String c2w_defaultPort = "1501";

    private static String c2w_defaultHost = "localhost";

    private volatile ConnectionHandler connection;

    private Button c2w_listenButton, c2w_connectButton, c2w_closeButton, c2w_clearButton, c2w_quitButton, c2w_saveButton, c2w_c2w_sendButton;

    private TextField c2w_listeningPortInput, c2w_remotePortInput, c2w_remoteHostInput;

    private TextField c2w_messageInput;

    private TExtArea c2w_transcript;

    private Stage c2w_window;





}