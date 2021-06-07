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

public class sellercontroller implements Initializable {
	
	    @FXML
	    private TableView<company> seller_table;
	    
	  
	    @FXML
	    private TableColumn<company, Integer> secol_med_id;
	    @FXML
	    private TableColumn<company, Integer> secol_id;
	    
	    @FXML
	    private TableColumn<company, String> secol_name;

	    @FXML
	    private TableColumn<company, String> secol_phno;

	    @FXML
	    private TableColumn<company, String> secol_add;
	    @FXML
	    private TableColumn<company, String> secol_pur;
	    @FXML
	    private TableColumn<company, String> secol_date;
	    
	    ObservableList<company> listSe;
	    
	    Connection conn =null;
	    ResultSet rs = null;
	    PreparedStatement pst = null;
	    
	    
	    public void DisplaySeller(){
	    	secol_med_id.setCellValueFactory(new PropertyValueFactory<company,Integer>("med_id"));
	    	secol_id.setCellValueFactory(new PropertyValueFactory<company,Integer>("com_id"));
	    	secol_name.setCellValueFactory(new PropertyValueFactory<company,String>("com_name"));
	    	secol_phno.setCellValueFactory(new PropertyValueFactory<company,String>("com_ph"));
	    	secol_add.setCellValueFactory(new PropertyValueFactory<company,String>("com_add"));
	    	secol_pur.setCellValueFactory(new PropertyValueFactory<company,String>("units_pur"));
	    	secol_date.setCellValueFactory(new PropertyValueFactory<company,String>("pur_date"));
	    	
	    	listSe =mysqlconnect.getSeller();
	    	///
	    	//
	    	//
	    	seller_table.setItems(listSe);
	    }


		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			DisplaySeller();
			
		}

}
