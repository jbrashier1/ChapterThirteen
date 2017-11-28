import javafx.application.Application;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
public class Triangle extends GeometricObject {
    public double sideOne;
    public double sideTwo;
    public double sideThree;

    public Triangle() {
        this.sideOne = 1;
        this.sideTwo = 1;
        this.sideThree = 1;
    }

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.sideOne = firstSide;
        this.sideTwo = secondSide;
        this.sideThree = thirdSide;
    }

    public Triangle(double firstSide, double secondSide, double thirdSide, String color, boolean filled) {
        this.sideOne = firstSide;
        this.sideTwo = secondSide;
        this.sideThree = thirdSide;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getArea() {
        double p = (this.sideOne + this.sideTwo + this.sideThree) / 2;
        return Math.sqrt( p * (p - this.sideOne) * (p - this.sideTwo) * (p - this.sideThree));
    }

    public double getPerim() {
        return (this.sideOne + this.sideTwo + this.sideThree);
    }

    public double getSideOne() {
        return this.sideOne;
    }

    public double getSideTwo() {
        return this.sideTwo;
    }

    public double getSideThree() {
        return this.sideThree;
    }
}
