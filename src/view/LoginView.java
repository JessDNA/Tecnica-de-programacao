/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author jogan
 */
public class LoginView extends Application {
    
    private AnchorPane pane;
    private Scene Scene;
    private Label TextLogin;
    
    private TextField User;
    private PasswordField Password;
    
    private Button Login;
    private Button Logout;
    
    private void initComponents(){
        TextLogin = new Label("Login");
               
        TextLogin.setFont(new Font(36));  
              
        User = new TextField();
        User.setPromptText ("Digite seu login...");
        
        Password = new PasswordField();
        Password.setPromptText("Digite sua Senha...");
        
        Login= new Button("Entrar");
        Logout = new Button("Sair");
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        pane = new AnchorPane();
        Scene  = new Scene(pane, 600, 400);
        initComponents();
        
        Login.setOnAction(new EventHandler<ActionEvent>(){
            public void handle (ActionEvent arg0){
                if(User.getText().equals("usu") && Password.getText().equals("123")){
                    JOptionPane.showMessageDialog(null, "Usuário Autenticado","Autenticacao", 
                                                    JOptionPane.INFORMATION_MESSAGE);
                } else {
                     JOptionPane.showMessageDialog(null, "Usuário Não Autenticado","Autenticacao", 
                                                    JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        Logout.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent arg0) {
                 System.exit(0);
            } 
        });
        
        pane.getChildren().addAll(TextLogin,User, Password, Login, Logout);
        pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, #9c27b0 0%, silver 100%);");
        stage.setScene(Scene);
        stage.setTitle("Tela de Login");
        stage.show();
        
        initLayout();
    }

    public static void main(String[] args) {
        launch(args);
    }  
    private void initLayout(){
        TextLogin.setLayoutX((pane.getWidth() - TextLogin.getWidth())/8);
        TextLogin.setLayoutY(10);
        
        User.setLayoutX((pane.getWidth() - User.getWidth()) / 8);
        User.setLayoutY(70);
             
        Password.setLayoutX((pane.getWidth() - Password.getWidth()) / 8);
        Password.setLayoutY(130);
       
        Login.setLayoutX((pane.getWidth()- Login.getWidth()) / 1.5);
        Login.setLayoutY(200);
        
        Logout.setLayoutX((pane.getWidth()- Logout.getWidth()) / 1.5);
        Logout.setLayoutY(240);
        
    }
}