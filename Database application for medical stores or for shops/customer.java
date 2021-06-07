package application;

public class customer {
	
	int c_id;
	String c_name,pur_date,pur_items,amt,c_ph;

	public customer(int c_id, String c_name,String c_ph, String pur_date, String pur_items, String amt) {
		   this.c_id = c_id;
           this.c_name = c_name;
           this.c_ph=c_ph;
           this.pur_date= pur_date;
           this.pur_items=pur_items;
           this.amt=amt;
          

	}
	
	public int getC_id() {
		return c_id;
	}
	
	 public String getC_name() {
	        return c_name;
	    }

	    public String getC_ph() {
	        return c_ph;
	    }

	    public String getPur_date() {
	        return pur_date;
	    }
	    public String getPur_items() {
	    	return pur_items;
	    }
	    public String getAmt() {
	    	return amt;
	    }
	        public void setC_id(int c_id) {
	            this.c_id = c_id;
	        }

	        public void setC_name(String c_name) {
	            this.c_name = c_name;
	        }

	        public void setPur_date(String pur_date) {
	        	this.pur_date = pur_date;
	        }
	        public void setC_ph(String c_ph) {
	        	this.c_ph = c_ph;
	        }

	        public void setPur_items(String pur_items) {
	            this.pur_items = pur_items;
	        }
	        public void setAmt(String amt) {
	        	this.amt = amt;
	        }


}
