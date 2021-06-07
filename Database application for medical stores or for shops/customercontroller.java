package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class customercontroller implements Initializable {
	
	@FXML
    private TableView<customer> customer_table;
    
	  
    @FXML
    private TableColumn<customer, Integer> ccol_id;
    
    @FXML
    private TableColumn<customer, String> ccol_name;
    
    @FXML 
    private TableColumn<customer, String> ccol_ph;

    @FXML
    private TableColumn<customer, String> ccol_date;
    
    @FXML
    private TableColumn<customer, String> ccol_pur;
    
    @FXML
    private TableColumn<customer, String> ccol_total;
    
    ObservableList<customer> listC;
    
    Connection conn =null;
    ResultSet rs = null;
    PreparedStatement pst = null;
	
	
	public void DisplayCustomer() {
		    	ccol_id.setCellValueFactory(new PropertyValueFactory<customer,Integer>("c_id"));
		    	ccol_name.setCellValueFactory(new PropertyValueFactory<customer,String>("c_name"));
		    	ccol_ph.setCellValueFactory(new PropertyValueFactory<customer,String>("c_ph"));
		    	ccol_date.setCellValueFactory(new PropertyValueFactory<customer,String>("pur_date"));
		    	ccol_pur.setCellValueFactory(new PropertyValueFactory<customer,String>("pur_items"));
				ccol_total.setCellValueFactory(new PropertyValueFactory<customer,String>("amt"));
		    	
		    	
		    	listC =mysqlconnect.getCustomer();
		    	///
		    	//
		    	//
		    	customer_table.setItems(listC);
		    }
		

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		DisplayCustomer();
		
	}

}
