package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    public Label lblDisplay;
    public Button btnAC;
    public Button btnPercent;
    public Button btnLeftBracket;
    public Button btnRightBracket;
    public Button btnEqual;
    public Button btnDivide;
    public Button btnMultiply;
    public Button btnSubtract;
    public Button btnAdd;
    public Button btnDot;
    public Button btn9;
    public Button btn8;
    public Button btn7;
    public Button btn6;
    public Button btn5;
    public Button btn4;
    public Button btn3;
    public Button btn2;
    public Button btn1;
    public Button btn0;

    public double total = 0;
    public double num = 0;
    public double num2 = 0;
    public boolean operationPressed = false;
    public boolean add = false;
    public boolean subtract = false;
    public boolean multiply = false;
    public boolean divide = false;

    public void setBtn0(javafx.event.ActionEvent actionEvent) {

        if (!operationPressed) {

            int temp = (int)num;
            num = Double.parseDouble(temp + "0");
            lblDisplay.setText(Double.toString(num));

        }

        else {

            int temp = (int) num2;
            num2 = Double.parseDouble(temp + "0");
            lblDisplay.setText(Double.toString(num2));

        }

    }

    public void setBtn1(javafx.event.ActionEvent actionEvent) {

        if (!operationPressed) {

        int temp = (int)num;
        num = Double.parseDouble(temp + "1");
        lblDisplay.setText(Double.toString(num));

        }

        else {

            int temp = (int) num2;
            num2 = Double.parseDouble(temp + "1");
            lblDisplay.setText(Double.toString(num2));

        }

    }

    public void setBtn2(javafx.event.ActionEvent actionEvent) {

        if (!operationPressed) {

        int temp = (int)num;
        num = Double.parseDouble(temp + "2");
        lblDisplay.setText(Double.toString(num));

        }

        else {

            int temp = (int) num2;
            num2 = Double.parseDouble(temp + "2");
            lblDisplay.setText(Double.toString(num2));

        }

    }

    public void setBtn3(javafx.event.ActionEvent actionEvent) {

        if (!operationPressed) {

        int temp = (int)num;
        num = Double.parseDouble(temp + "3");
        lblDisplay.setText(Double.toString(num));

        }

        else {

            int temp = (int) num2;
            num2 = Double.parseDouble(temp + "3");
            lblDisplay.setText(Double.toString(num2));

        }

    }

    public void setBtn4(javafx.event.ActionEvent actionEvent) {

        if (!operationPressed) {

        int temp = (int)num;
        num = Double.parseDouble(temp + "4");
        lblDisplay.setText(Double.toString(num));

        }

        else {

            int temp = (int) num2;
            num2 = Double.parseDouble(temp + "4");
            lblDisplay.setText(Double.toString(num2));

        }

    }

    public void setBtn5(javafx.event.ActionEvent actionEvent) {

        if (!operationPressed) {

        int temp = (int)num;
        num = Double.parseDouble(temp + "5");
        lblDisplay.setText(Double.toString(num));

        }

        else {

            int temp = (int) num2;
            num2 = Double.parseDouble(temp + "5");
            lblDisplay.setText(Double.toString(num2));

        }

    }

    public void setBtn6(javafx.event.ActionEvent actionEvent) {

        if (!operationPressed) {

        int temp = (int)num;
        num = Double.parseDouble(temp + "6");
        lblDisplay.setText(Double.toString(num));

        }

        else {

            int temp = (int) num2;
            num2 = Double.parseDouble(temp + "6");
            lblDisplay.setText(Double.toString(num2));

        }

    }

    public void setBtn7(javafx.event.ActionEvent actionEvent) {

        if (!operationPressed) {

        int temp = (int)num;
        num = Double.parseDouble(temp + "7");
        lblDisplay.setText(Double.toString(num));

        }

        else {

            int temp = (int) num2;
            num2 = Double.parseDouble(temp + "7");
            lblDisplay.setText(Double.toString(num2));

        }

    }

    public void setBtn8(javafx.event.ActionEvent actionEvent) {

        if (!operationPressed) {

        int temp = (int)num;
        num = Double.parseDouble(temp + "8");
        lblDisplay.setText(Double.toString(num));

        }

        else {

            int temp = (int) num2;
            num2 = Double.parseDouble(temp + "8");
            lblDisplay.setText(Double.toString(num2));

        }

    }

    public void setBtn9(javafx.event.ActionEvent actionEvent) {

        if (!operationPressed) {

            int temp = (int) num;
            num = Double.parseDouble(temp + "9");
            lblDisplay.setText(Double.toString(num));

        }

        else {

            int temp = (int) num2;
            num2 = Double.parseDouble(temp + "9");
            lblDisplay.setText(Double.toString(num2));

        }

    }

    public void setBtnAdd(ActionEvent actionEvent) {

        operationPressed = true;
        add = true;
        subtract = false;
        multiply = false;
        divide = false;
        lblDisplay.setText(Double.toString(0));

    }

    public void setBtnSubtract(ActionEvent actionEvent) {

        operationPressed = true;
        add = false;
        subtract = true;
        multiply = false;
        divide = false;
        lblDisplay.setText(Double.toString(0));

    }

    public void setBtnMultiply(ActionEvent actionEvent) {

        operationPressed = true;
        add = false;
        subtract = false;
        multiply = true;
        divide = false;
        lblDisplay.setText(Double.toString(0));

    }

    public void setBtnDivide(ActionEvent actionEvent) {

        operationPressed = true;
        add = false;
        subtract = false;
        multiply = false;
        divide = true;
        lblDisplay.setText(Double.toString(0));

    }

    public void setBtnEqual(ActionEvent actionEvent) {

        if (add) {

            total = num + num2;

        }

        else if (subtract) {

            total = num - num2;

        }

        else if (multiply) {

            total = num * num2;

        }

        else if (divide) {

            total = num / num2;

        }

        lblDisplay.setText(Double.toString(total));
        num = total;
        num2 = 0;
        total = 0;

        operationPressed = false;
        add = false;
        subtract = false;
        multiply = false;
        divide = false;

    }

    public void setBtnAC(ActionEvent actionEvent) {

        lblDisplay.setText(Double.toString(0));
        total = 0;
        num = 0;
        num2 = 0;
        operationPressed = false;
        add = false;
        subtract = false;
        multiply = false;
        divide = false;

    }

    public void setBtnDot(ActionEvent actionEvent) {



    }

    public void setBtnLeftBracket(ActionEvent actionEvent) {



    }

    public void setBtnRightBracket(ActionEvent actionEvent) {



    }

    public void setBtnPercent(ActionEvent actionEvent) {



    }

}
