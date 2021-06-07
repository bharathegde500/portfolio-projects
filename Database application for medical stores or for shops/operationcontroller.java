package application;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;



public class operationcontroller implements Initializable{	
	
	@FXML 
	private TextField medicine_id_delete; 
	@FXML 
	private TextField medicine_id; 
	
	@FXML 
	private TextField medicine_name; 
	
	@FXML 
	private TextField medicine_avl; 

	@FXML 
	private TextField medicine_mfd; 
	
	@FXML 
	private TextField medicine_exp; 
	
	@FXML 
	private TextField medicine_price; 
	
	@FXML 
	private TextField medicine_type;
	
	@FXML 
	private TextField storage_room; 
	
	@FXML 
	private TextField storage_comp; 
	
	@FXML 
	private TextField storage_ref; 
	
	@FXML 
	private TextField seller_name; 
	
	@FXML 
	private TextField seller_address; 
	
	@FXML 
	private TextField seller_ph; 
	
	@FXML 
	private TextField seller_purchased; 
	
	@FXML 
	private TextField seller_date;
	
    Connection conn =null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
	
    public void Add_medicine(){  	
        conn = mysqlconnect.ConnectDb();
        String sql = "insert into medicine (med_id,name_of_item, mfd_date, exp_date, price, avl_quantity, type_of_med)values(?,?,?,?,?,?,?);";
        try {
            pst = conn.prepareStatement(sql);
           
            pst.setString(1, medicine_id.getText());
            pst.setString(2, medicine_name.getText());
            pst.setString(3, medicine_mfd.getText());
            pst.setString(4, medicine_exp.getText());
            pst.setString(5, medicine_price.getText());
            pst.setString(6, medicine_avl.getText());
            pst.setString(7, medicine_type.getText());
            pst.execute();
            
        }
            
        catch (Exception exc) {
			exc.printStackTrace();
        }
     
   }
    public void Add_seller(){  	
    	conn = mysqlconnect.ConnectDb();
    	String sql = "insert into company (med_id,com_id,com_name, com_ph, com_add, units_pur, pur_date)values(?,?,?,?,?,?,?);";
    	try {
    		pst = conn.prepareStatement(sql);
    		pst.setString(1, medicine_id.getText());
    		pst.setString(2, medicine_id.getText());
    		pst.setString(3, seller_name.getText());
    		pst.setString(4, seller_ph.getText());
    		pst.setString(5, seller_address.getText());
    		pst.setString(6, seller_purchased.getText());
    		pst.setString(7, seller_date.getText());
    		pst.execute();
    		
    	}
    	
    	catch (Exception exc) {
    		exc.printStackTrace();
    	}
    	
    }


    public void Add_storage(){  	
    	conn = mysqlconnect.ConnectDb();
    	String sql = "insert into storage (med_id,room_no, comp_no, ref_id)values(?,?,?,?);";
    	try {
    		pst = conn.prepareStatement(sql);
    		pst.setString(1, medicine_id.getText());
    		pst.setString(2, storage_room.getText());
    		pst.setString(3, storage_comp.getText());
    		pst.setString(4, storage_ref.getText());
    		pst.execute();
    		 JOptionPane.showMessageDialog(null, "Insertion Successful");
    	}
    	
    	catch (Exception exc) {
    		exc.printStackTrace();
    	}
    	
    }
    
//    public void Delete_medicine(ActionEvent e){
//    	conn = mysqlconnect.ConnectDb();
//    	String sql = "delete from medicine where med_id = ?;";
//    	try {
//    		pst = conn.prepareStatement(sql);
//    		pst.setString(1, medicine_id.getText());
//    		pst.execute();
//    	} catch (Exception e1) {
//    		JOptionPane.showMessageDialog(null, e1);
//    	}
//    	
//    }
    public void Delete_medicine(){
    	conn = mysqlconnect.ConnectDb();
    	String sql = "delete from medicine where med_id = ?;";
    	try {
    		pst = conn.prepareStatement(sql);
    		pst.setString(1, medicine_id.getText());
    		pst.execute();
    	} catch (Exception e1) {
    		JOptionPane.showMessageDialog(null, e1);
    	}
    	
    }
    
//    public void Delete_seller(ActionEvent e){
//    	conn = mysqlconnect.ConnectDb();
//    	String sql = "delete from company where com_id = ?;";
//    	try {
//    		pst = conn.prepareStatement(sql);
//    		pst.setString(1, medicine_id.getText());
//    		pst.execute();
//
//    	} catch (Exception e1) {
//    		e1.printStackTrace();
//    		JOptionPane.showMessageDialog(null, e1);
//    	}
//    	
//    }
    public void Delete_seller(){
    	conn = mysqlconnect.ConnectDb();
    	String sql = "delete from company where com_id = ?;";
    	try {
    		pst = conn.prepareStatement(sql);
    		pst.setString(1, medicine_id.getText());
    		pst.execute();
    		
    	} catch (Exception e1) {
    		e1.printStackTrace();
    		JOptionPane.showMessageDialog(null, e1);
    	}
    	
    }
//    public void Delete_storage(ActionEvent e){
//    	conn = mysqlconnect.ConnectDb();
//    	String sql = "delete from storage where med_id= ?;";
//    	try {
//    		pst = conn.prepareStatement(sql);
//    		pst.setString(1, medicine_id.getText());
//    		pst.execute();
//    	} catch (Exception e1) {
//    		JOptionPane.showMessageDialog(null, e1);
//    	}
//    	
//    }  
    public void Delete_storage(){
    	conn = mysqlconnect.ConnectDb();
    	String sql = "delete from storage where med_id= ?;";
    	try {
    		pst = conn.prepareStatement(sql);
    		pst.setString(1, medicine_id.getText());
    		pst.execute();
    	} catch (Exception e1) {
    		JOptionPane.showMessageDialog(null, e1);
    	}
    	
    }  
//    public void Delete_stock(ActionEvent e){
//    	conn = mysqlconnect.ConnectDb();
//    	String sql = "delete from stock where med_id= ?;";
//    	try {
//    		pst = conn.prepareStatement(sql);
//    		pst.setString(1, medicine_id.getText());
//    		pst.execute();
//    		
//    	} catch (Exception e1) {
//    		JOptionPane.showMessageDialog(null, e1);
//    	}
//    	
//    }  
    public void Delete_stock(){
    	conn = mysqlconnect.ConnectDb();
    	String sql = "delete from stock where med_id= ?;";
    	try {
    		pst = conn.prepareStatement(sql);
    		pst.setString(1, medicine_id.getText());
    		pst.execute();
    		
    	} catch (Exception e1) {
    		JOptionPane.showMessageDialog(null, e1);
    	}
    	
    }  
    
    public void insertbutton(ActionEvent event) throws Exception {
				Add_medicine();
     			Add_storage();
				Add_seller();
	}
    
    public void DeleteButton(ActionEvent e) throws Exception {
    	
             Delete_medicine();
             Delete_seller();
             Delete_storage();
             Delete_stock();
    
    }


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
