/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combobox;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

////
////formas de llenar combo box
////por teclado
////por base de datos
///por get value ///

public class COMBOBOX extends Application {
    ComboBox<usuario>cmbusuario = new ComboBox();
    @Override
    public void start(Stage primaryStage) {
           MenuBar menugame= new MenuBar();
        Menu menufile = new Menu("file");
        
       MenuItem game = new MenuItem("new game");
       MenuItem exit = new MenuItem("new exit");
       menufile.getItems().add(game);
       menufile.getItems().add(exit);
        
       ComboBox<String>cmb = new ComboBox();
       cmb.getItems().add("cesar");
       cmb.getItems().addAll("galo","rosio");
       
       
      // ComboBox<usuario>cmbusuario = new ComboBox();
       
       //usuario user1 = new usuario(1," cesar alcivar");
       usuario user2 = new usuario(2,"galo vera");
       usuario user3 = new usuario(3,"rocio");
       
       cmbusuario.getItems().addAll(new usuario(1,"ceasr"),user2,user3);
       
       menugame.getMenus().add(menufile);
       
        Button btn = new Button();
        btn.setText("ok");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
            usuario user = cmbusuario.getValue();
               System.out.println(user.getId()+" - "+ user.getNombre());
            }
        });
        
       VBox root = new VBox(menugame);
       root.getChildren().add(cmb);
       root.getChildren().add(cmbusuario);
       root.getChildren().add(btn);

        root.setSpacing(20);
        root.setMinSize(350, 250);
        Scene scene = new Scene(root); 
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
