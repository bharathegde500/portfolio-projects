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

public class storagecontroller implements  Initializable {
	 @FXML
	    private TableView<storage> storage_table;
	    
	  
	    @FXML
	    private TableColumn<storage, Integer> scol_id;
	    
	    @FXML
	    private TableColumn<storage, String> scol_room;

	    @FXML
	    private TableColumn<storage, String> scol_comp;

	    @FXML
	    private TableColumn<storage, String> scol_ref;
	    
	    ObservableList<storage> listS;
//	    ******************************************************
	    @FXML
	    private TableView<stock> stock_table;
	    
	    
	    @FXML
	    private TableColumn<stock, Integer> stcol_id;
	    
	    @FXML
	    private TableColumn<stock, String> stcol_avl;
	    
	    @FXML
	    private TableColumn<stock, String> stcol_total;
	    
	    @FXML
	    private TableColumn<stock, String> stcol_sold;
	    
	    ObservableList<stock> listSt;
//	    ******************************************************;
	    
	    Connection conn =null;
	    ResultSet rs = null;
	    PreparedStatement pst = null;
	    
	    
	    public void DisplayStorage(){
	    	scol_id.setCellValueFactory(new PropertyValueFactory<storage,Integer>("med_id"));
	    	scol_room.setCellValueFactory(new PropertyValueFactory<storage,String>("room_no"));
	    	scol_comp.setCellValueFactory(new PropertyValueFactory<storage,String>("comp_no"));
	    	scol_ref.setCellValueFactory(new PropertyValueFactory<storage,String>("ref_id"));

	    	listS =mysqlconnect.getStorage();
	    	///
	    	//
	    	//
	    	storage_table.setItems(listS);
	    }
	    public void DisplayStock(){
	    	stcol_id.setCellValueFactory(new PropertyValueFactory<stock,Integer>("med_id"));
	    	stcol_avl.setCellValueFactory(new PropertyValueFactory<stock,String>("avail_qua"));
	    	stcol_sold.setCellValueFactory(new PropertyValueFactory<stock,String>("total_qua"));
	    	stcol_total.setCellValueFactory(new PropertyValueFactory<stock,String>("sold_qua"));
	    	
	    	listSt =mysqlconnect.getStock();
	    	///
	    	//
	    	//
	    	stock_table.setItems(listSt);
	    }


		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			DisplayStorage();
			DisplayStock();
			
		}
	    

}
