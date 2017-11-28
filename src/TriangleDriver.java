import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import javafx.application.Application;

import java.io.FileNotFoundException;

public class TriangleDriver extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        TextInputDialog sides = new TextInputDialog("9 10 16 Blue false");
        sides.setTitle("Find traits of a triangle");
        sides.setHeaderText("Input the lengths of the triangle's 3 sides separated by spaces...");
        sides.setContentText("<side one> <side two> <side three> <color> <filled> :");
        sides.showAndWait();
        String allSides = sides.getResult();
        String[] strArr = allSides.split(" ", (allSides.length() - 1));
        Triangle triangle = new Triangle(Double.parseDouble(strArr[0]), Double.parseDouble(strArr[1]), Double.parseDouble(strArr[2]), strArr[3], Boolean.parseBoolean(strArr[4]));
        Alert notPossible = new Alert(Alert.AlertType.ERROR);
        notPossible.setTitle("Error");
        notPossible.setHeaderText("Invalid Dimensions");
        notPossible.setContentText("The side lengths entered are not possible");
        Alert displayResults = new Alert(Alert.AlertType.INFORMATION);
        displayResults.setTitle("Triangle's Traits");
        displayResults.setHeaderText("Area, perimeter, color, fill...");
        displayResults.setContentText("Area: " + Double.toString(triangle.getArea()) + "\nPerimeter: " + Double.toString(triangle.getPerim()) + "\nColor: " + triangle.getColor() + "\nFilled?: " + Boolean.toString(triangle.isFilled()));
        if(Double.isNaN(triangle.getArea()) == true) {
            notPossible.showAndWait();
        } else {
            displayResults.showAndWait();
        }
    }
}
