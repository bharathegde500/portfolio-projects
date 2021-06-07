package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;

public class mysqlconnect {
    
    Connection conn = null;
    public static Connection ConnectDb(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//             please nodify below statement appropriatly before use
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseName","username","password");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    }
    public static ObservableList<medicine> getDatausers(){
        Connection conn = ConnectDb();
        ObservableList<medicine> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from medicine;");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){   
                list.addAll( new medicine(Integer.parseInt(rs.getString("med_id")), rs.getString("name_of_item"), rs.getString("mfd_date"), rs.getString("exp_date"), rs.getString("price"), rs.getString("avl_quantity"), rs.getString("type_of_med")));               
            }
        } catch (Exception e) {
        }
        return list;
    }
    public static ObservableList<storage> getStorage(){
    	Connection conn2 = ConnectDb();
    	ObservableList<storage> list2 = FXCollections.observableArrayList();
    	try {
    		PreparedStatement ps2 = conn2.prepareStatement("select * from storage;");
    		ResultSet rs2 = ps2.executeQuery();
    		
    		while (rs2.next()){   
    			list2.addAll( new storage(Integer.parseInt(rs2.getString("med_id")), rs2.getString("room_no"), rs2.getString("comp_no"), rs2.getString("ref_id")));               
    		}
    	} catch (Exception e) {
    	}
    	return list2;
    }
    public static ObservableList<stock> getStock(){
    	Connection conn3 = ConnectDb();
    	ObservableList<stock> list3 = FXCollections.observableArrayList();
    	try {
    		PreparedStatement ps3 = conn3.prepareStatement("select * from stock;");
    		ResultSet rs3 = ps3.executeQuery();
    		
    		while (rs3.next()){   
    			list3.addAll( new stock(Integer.parseInt(rs3.getString("med_id")), rs3.getString("total_qua"), rs3.getString("sold_qua"), rs3.getString("avail_qua")));               
    		}
    	} catch (Exception e) {
    	}
    	return list3;
    }
    public static ObservableList<company> getSeller(){
    	Connection conn4= ConnectDb();
    	ObservableList<company> list4 = FXCollections.observableArrayList();
    	try {
    		PreparedStatement ps4 = conn4.prepareStatement("select * from company;");
    		ResultSet rs4 = ps4.executeQuery();
    		
    		while (rs4.next()){   
    			list4.addAll( new company(Integer.parseInt(rs4.getString("med_id")),Integer.parseInt(rs4.getString("com_id")), rs4.getString("com_name"), rs4.getString("com_ph"), rs4.getString("com_add"),rs4.getString("units_pur"),rs4.getString("pur_date")));               
    		}
    	} catch (Exception e) {
    	}
    	return list4;
    }
    public static ObservableList<customer> getCustomer(){
    	Connection conn5= ConnectDb();
    	ObservableList<customer> list5 = FXCollections.observableArrayList();
    	try {
    		PreparedStatement ps5 = conn5.prepareStatement("select * from customer;");
    		ResultSet rs5 = ps5.executeQuery();
    		
    		while (rs5.next()){   
    			list5.addAll( new customer(Integer.parseInt(rs5.getString("c_id")), rs5.getString("c_name"),rs5.getString("c_ph"), rs5.getString("pur_date"), rs5.getString("pur_items"),rs5.getString("amt")));               
    		}
    	} catch (Exception e) {
    	}
    	return list5;
    }
}
