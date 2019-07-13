package qualle.inc;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import qualle.inc.alg.Sort;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Button GenerateBtn;

    @FXML
    private Button SortBtn;

    @FXML
    private Spinner<Integer> sizeArr = new Spinner<>();

    @FXML
    private Label inputArr;

    @FXML
    private RadioButton bubbleS;

    @FXML
    private RadioButton quickS;

    @FXML
    private RadioButton selectionS;

    @FXML
    private RadioButton insertionS;

    @FXML
    private RadioButton mergeS;

    @FXML
    private Label outputArr;

    private int[] array;
    private int[] sortedArray;

    private MainLogic logic = new MainLogic();
    private Sort sort = new Sort();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bubbleS.setSelected(true);

        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(5, 5000, 10);
        sizeArr.setValueFactory(valueFactory);
        sizeArr.setEditable(true);

        GenerateBtn.setOnAction(event -> {

            int x = sizeArr.getValue();
            logic.setArray(x);
            array = logic.getArray();

            inputArr.setText(logic.getArrayInStr(array));
        });

        SortBtn.setOnAction(event -> {

            if (bubbleS.isSelected()) {

                sortedArray = sort.BubbleS(logic.getArray());

            } else if (quickS.isSelected()) {

                sortedArray = sort.QuickS(logic.getArray());

            } else if (selectionS.isSelected()) {

                sortedArray = sort.SelectionS(logic.getArray());

            } else if (insertionS.isSelected()) {

                sortedArray = sort.InsertionS(logic.getArray());

            } else if (mergeS.isSelected()) {

                sortedArray = sort.MergeS(logic.getArray());
            }

            outputArr.setText(logic.getArrayInStr(sortedArray));
        });
    }


}
