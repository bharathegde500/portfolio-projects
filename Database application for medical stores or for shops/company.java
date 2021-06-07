package application;

public class company {
	
	int com_id,med_id;
	String com_name,com_ph,com_add,units_pur,pur_date;

	public company(int med_id,int com_id, String com_name, String com_ph, String com_add, String units_pur, String pur_date) {
    	   this.med_id = med_id;
		   this.com_id = com_id;
           this.com_name = com_name;	            
           this.com_add= com_add;
           this.units_pur=units_pur;
           this.pur_date=pur_date;

	}
	
	public int getMed_id() {
		return med_id;
	}
	public int getCom_id() {
		return com_id;
	}
	
	 public String getCom_name() {
	        return com_name;
	    }

	    public String getCom_ph() {
	        return com_ph;
	    }

	    public String getUnits_pur() {
	        return units_pur;
	    }
	    public String getPur_date() {
	    	return pur_date;
	    }
	    public String getCom_add() {
	    	return com_add;
	    }
	    public void setMed_id(int med_id) {
	    	this.med_id = med_id;
	    }
	        public void setCom_id(int com_id) {
	            this.com_id = com_id;
	        }

	        public void setCom_name(String com_name) {
	            this.com_name = com_name;
	        }

	        public void setCom_ph(String com_ph) {
	            this.com_ph = com_ph;
	        }

	        public void setUnits_pur(String units_pur) {
	            this.units_pur = units_pur;
	        }
	        public void setPur_date(String pur_date) {
	        	this.pur_date = pur_date;
	        }
	        public void setCom_add(String com_add) {
	        	this.com_add = com_add;
	        }

	
	

}