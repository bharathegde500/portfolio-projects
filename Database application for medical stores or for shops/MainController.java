package application;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class MainController {

	@FXML 
	private Label lblStatus;  
	
	@FXML 
	private TextField txtUserName;  
	
	@FXML 
	private TextField txtPassword;   

	
	
//	*******************************************
	
    @FXML
    private TableView<medicine> table_users;
    
    
    @FXML
    private TableColumn<medicine, Integer> col_id;
    
    @FXML
    private TableColumn<medicine, String> col_name;

    @FXML
    private TableColumn<medicine, String> col_mfd;

    @FXML
    private TableColumn<medicine, String> col_exp;

    @FXML
    private TableColumn<medicine, String> col_price;
    
    @FXML
    private TableColumn<medicine, String> col_avl;
    
    @FXML
    private TableColumn<medicine, String> col_type;
    
    @FXML
    private TextField filterField;
    
    ObservableList<medicine> listM;
    ObservableList<medicine> dataList;
    
   static Connection conn =null;
   static ResultSet rs = null;
   static PreparedStatement pst = null;
    
//    *****************************************************************************

	
	public void Login(ActionEvent event) throws Exception {
		if(txtUserName.getText().equals("ppp") && txtPassword.getText().equals("ppp"))  {
			lblStatus.setText("login success");
			Stage primaryStage = new Stage();
			primaryStage.setTitle("Search Page");
			
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root,900,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
	
		}
		else {
			lblStatus.setText("invalid username or password");
		     }
	}
					
		public void DataEntry(ActionEvent event) throws Exception {
			Stage primaryStage = new Stage();
			primaryStage.setTitle("Data Entry Page");
			Parent root = FXMLLoader.load(getClass().getResource("ModifyData.fxml"));
			Scene scene = new Scene(root,900,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();		
		}
			public void StorageTable(ActionEvent event) throws Exception {
				
				Stage primaryStage = new Stage();
				primaryStage.setTitle("Storage ans stock Details Page");
				
				Parent root = FXMLLoader.load(getClass().getResource("/application/Storage.fxml"));
				Scene scene = new Scene(root,900,600);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
							
			}
			
			public void SellerTable(ActionEvent event) throws Exception {
				Stage primaryStage = new Stage();
				primaryStage.setTitle("Seller Contact Details");
				
				Parent root = FXMLLoader.load(getClass().getResource("/application/Seller.fxml"));
				Scene scene = new Scene(root,900,600);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
		
			}
			public void RecordTable(ActionEvent event) throws Exception {
				Stage primaryStage = new Stage();
				primaryStage.setTitle("Seller Contact Details");
				
				Parent root = FXMLLoader.load(getClass().getResource("/application/Record.fxml"));
				Scene scene = new Scene(root,900,600);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
								
			}
			public void ModifyData(ActionEvent event) throws Exception {
				Stage primaryStage = new Stage();
				primaryStage.setTitle("Modify Data");
				
				Parent root = FXMLLoader.load(getClass().getResource("/application/ModifyData.fxml"));
				Scene scene = new Scene(root,900,600);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
				
			}
			public void SignOut(ActionEvent event) throws Exception {
		       System.exit(0);
				
			}

		    public void Display(){
		        col_id.setCellValueFactory(new PropertyValueFactory<medicine,Integer>("med_id"));
		        col_name.setCellValueFactory(new PropertyValueFactory<medicine,String>("name_of_item"));
		        col_mfd.setCellValueFactory(new PropertyValueFactory<medicine,String>("mfd_date"));
		        col_exp.setCellValueFactory(new PropertyValueFactory<medicine,String>("exp_date"));
		        col_price.setCellValueFactory(new PropertyValueFactory<medicine,String>("price"));
		        col_avl.setCellValueFactory(new PropertyValueFactory<medicine,String>("avl_quantity"));
		        col_type.setCellValueFactory(new PropertyValueFactory<medicine,String>("type_of_med"));
        
		       
		        
		        listM =mysqlconnect.getDatausers();
		        ///
		        //
		        //
		        table_users.setItems(listM);
		    }
		    @FXML
		    public  void search_user() {          
		        col_id.setCellValueFactory(new PropertyValueFactory<medicine,Integer>("med_id"));
		        col_name.setCellValueFactory(new PropertyValueFactory<medicine,String>("name_of_item"));
		        col_mfd.setCellValueFactory(new PropertyValueFactory<medicine,String>("mfd_date"));
		        col_exp.setCellValueFactory(new PropertyValueFactory<medicine,String>("exp_date"));
		        col_price.setCellValueFactory(new PropertyValueFactory<medicine,String>("price"));
		        col_avl.setCellValueFactory(new PropertyValueFactory<medicine,String>("avl_quantity"));
		        col_type.setCellValueFactory(new PropertyValueFactory<medicine,String>("type_of_med"));
		           
		           ObservableList<medicine> dataList = mysqlconnect.getDatausers();
		           table_users.setItems(dataList);
		           FilteredList<medicine> filteredData = new FilteredList<>(dataList, b -> true);  
			filterField.textProperty().addListener((observable, oldValue, newValue) -> {
		    filteredData.setPredicate(person -> {
		       if (newValue == null || newValue.isEmpty()) {
		        return true;
		       }    
		       String lowerCaseFilter = newValue.toLowerCase();
		       
		       if (person.getName_of_item().toLowerCase().indexOf(lowerCaseFilter) != -1 ) {
		        return true;
		       }                      
		            else  
		             return false;
		      });
		     });  
		     SortedList<medicine> sortedData = new SortedList<>(filteredData);  
		     sortedData.comparatorProperty().bind(table_users.comparatorProperty());  
		     table_users.setItems(sortedData);      
		       }
		    
		    public void refresh(ActionEvent e) {
		    	Display();
		    	search_user();
		    }

}
