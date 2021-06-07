package application;

public class stock {
	int med_id;
	String avail_qua,sold_qua,total_qua;
	
	public int getMed_id() {
		return med_id;
	}
	
	 public String getAvail_qua() {
	        return avail_qua;
	    }

	    public String getSold_qua() {
	        return sold_qua;
	    }

	    public String getTotal_qua() {
	        return total_qua;
	    }
	        public void setMed_id(int med_id) {
	            this.med_id = med_id;
	        }

	        public void setAvail_qua(String avail_qua) {
	            this.avail_qua = avail_qua;
	        }

	        public void setTotal_qua(String total_qua) {
	            this.total_qua = total_qua;
	        }

	        public void setSold_qua(String sold_qua) {
	            this.sold_qua = sold_qua;
	        }

	        public stock(int med_id, String avail_qua, String total_qua, String sold_qua) {
	            this.med_id = med_id;
	            this.total_qua = total_qua;	            
	            this.sold_qua= sold_qua;
	            this.avail_qua=avail_qua;
	
	        }
	             
}
