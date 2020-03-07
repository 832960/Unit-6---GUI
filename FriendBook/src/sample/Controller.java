package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    public TextField textGetName;
    public TextField textGetPhone;
    public TextField textGetEmail;
    public TextField textGetAddress;
    public ListView<FriendBook> friendList = new ListView<>();
    public Label lblName;
    public Label lblPhone;
    public Label lblEmail;
    public Label lblAddress;
    public Button btnEditFriend;
    public Button btnDelFriend;

    public void addFriend(ActionEvent actionEvent) {

        String name = textGetName.getText();
        String phoneNumber = textGetPhone.getText();
        String email = textGetEmail.getText();
        String address = textGetAddress.getText();

        FriendBook temp = new FriendBook(name, phoneNumber, email, address);
        friendList.getItems().add(temp);

        textGetName.clear();
        textGetPhone.clear();
        textGetEmail.clear();
        textGetAddress.clear();

        btnEditFriend.setDisable(true);
        btnDelFriend.setDisable(true);

    }

    public void displayFriend(MouseEvent mouseEvent) {

        FriendBook temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        lblName.setText(temp.name);
        lblPhone.setText(temp.getPhoneNumber());
        lblEmail.setText(temp.getEmail());
        lblAddress.setText(temp.getAddress());

        btnEditFriend.setDisable(false);
        btnDelFriend.setDisable(false);

    }

    public void delFriend(ActionEvent actionEvent) {



    }

    public void editFriend(ActionEvent actionEvent) {



    }

}
