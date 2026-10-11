
/*
 * Name: William Judd
 * Course: CSD402 Java for Programmers
 * Assignment: Module 11.2 Written Assignment
 * Date: October 11, 2026
 *
 * Description:
 * Demonstrates the JavaFX GridPane and ScrollPane layout components
 * using a sample computer inventory application.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JuddSystemInventory extends Application {

    @Override
    public void start(Stage primaryStage) {

        // GridPane organizes information into rows and columns.
        GridPane inventoryGrid = new GridPane();

        inventoryGrid.setHgap(20);
        inventoryGrid.setVgap(12);
        inventoryGrid.setPadding(new Insets(15));

        // Column headings identify the inventory fields.
        inventoryGrid.add(new Label("Device Name"), 0, 0);
        inventoryGrid.add(new Label("IP Address"), 1, 0);
        inventoryGrid.add(new Label("Operating System"), 2, 0);
        inventoryGrid.add(new Label("Status"), 3, 0);

        // Sample inventory records used for this demonstration.
        String[][] devices = {
            {"WEB-SERVER-01", "192.168.1.10", "Ubuntu Linux", "Online"},
            {"DB-SERVER-01", "192.168.1.11", "Windows Server", "Online"},
            {"FILE-SERVER-01", "192.168.1.12", "Ubuntu Linux", "Offline"},
            {"WORKSTATION-01", "192.168.1.20", "Windows 11", "Online"},
            {"WORKSTATION-02", "192.168.1.21", "Windows 11", "Online"},
            {"WORKSTATION-03", "192.168.1.22", "macOS", "Offline"},
            {"LAPTOP-01", "192.168.1.30", "macOS", "Online"},
            {"LAPTOP-02", "192.168.1.31", "Windows 11", "Online"},
            {"BACKUP-SERVER", "192.168.1.40", "Ubuntu Linux", "Online"},
            {"TEST-SERVER-01", "192.168.1.50", "Debian Linux", "Offline"},
            {"TEST-SERVER-02", "192.168.1.51", "Debian Linux", "Online"},
            {"DEV-SERVER-01", "192.168.1.60", "Ubuntu Linux", "Online"},
            {"DEV-SERVER-02", "192.168.1.61", "Ubuntu Linux", "Online"},
            {"PRINT-SERVER", "192.168.1.70", "Windows Server", "Online"},
            {"MONITOR-SERVER", "192.168.1.80", "Debian Linux", "Online"}
        };

        // Add each device to a new row of the GridPane.
        for (int row = 0; row < devices.length; row++) {

            for (int column = 0; column < devices[row].length; column++) {

                Label value = new Label(devices[row][column]);

                inventoryGrid.add(value, column, row + 1);
            }
        }

        // ScrollPane provides scrolling when content exceeds the viewport.
        ScrollPane scrollPane = new ScrollPane(inventoryGrid);

        scrollPane.setFitToWidth(true);
        scrollPane.setPannable(true);

        // VBox places the title above the scrollable inventory.
        Label heading = new Label("Computer System Inventory");
        heading.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        VBox root = new VBox(15);
        root.setPadding(new Insets(15));
        root.getChildren().addAll(heading, scrollPane);

        // The smaller window height demonstrates vertical scrolling.
        Scene scene = new Scene(root, 720, 350);

        primaryStage.setTitle("CSD402 Module 11.2 - System Inventory");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        // Launch the JavaFX application.
        launch(args);
    }
}
