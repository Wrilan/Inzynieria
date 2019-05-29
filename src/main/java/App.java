import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.List;

import dao.UserDao;
import entity.User;

public class App extends Application {
    public void hibernateTest() {
        UserDao userDao = new UserDao();
        List<User> users = userDao.getUsers();
        users.forEach(element -> System.out.println(element.getPassword()));
    }

    @Override
    public void start(Stage primaryStage) {
        hibernateTest();

        Group group = new Group();

        Scene scene = new Scene(group ,600, 300);
        scene.setFill(Color.BLUE);

        primaryStage.setTitle("NFZ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}