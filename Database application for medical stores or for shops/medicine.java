package application;

public class medicine {
    
    int med_id ;
    String name_of_item, mfd_date, exp_date, price ,avl_quantity ,type_of_med;

    public int getMed_id() {
        return med_id;
    }

    public String getName_of_item() {
        return name_of_item;
    }

    public String getMfd_date() {
        return mfd_date;
    }

    public String getExp_date() {
        return exp_date;
    }

    public String getType_of_med() {
        return type_of_med;
    }
    
    public String getPrice() {
    	return price;
    }
    
    public String getAvl_quantity() {
    	return avl_quantity;
    }

    public void setMed_id(int med_id) {
        this.med_id = med_id;
    }

    public void setName_of_item(String name_of_item) {
        this.name_of_item = name_of_item;
    }

    public void setMfd_date(String mfd_date) {
        this.mfd_date = mfd_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }

    public void setType_of_med(String type_of_med) {
        this.type_of_med = type_of_med;
    }
    
    public void setPrice(String price) {
    	this.price = price;
    }
    
    public void setAvl_quantity(String avl_quantity) {
    	this.avl_quantity = avl_quantity;
    }


    public medicine(int med_id, String name_of_item, String mfd_date, String exp_date, String price,String avl_quantity,String type_of_med) {
        this.med_id = med_id;
        this.name_of_item = name_of_item;
        this.mfd_date=mfd_date;
        this.exp_date= exp_date;
        this.price = price;
        this.avl_quantity=avl_quantity;
        this.type_of_med=type_of_med;
    }
}