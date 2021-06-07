package application;

public class storage {
	int med_id;
	String room_no,comp_no,ref_id;
	
	public int getMed_id() {
		return med_id;
	}
	
	 public String getRoom_no() {
	        return room_no;
	    }

	    public String getComp_no() {
	        return comp_no;
	    }

	    public String getRef_id() {
	        return ref_id;
	    }
	        public void setMed_id(int med_id) {
	            this.med_id = med_id;
	        }

	        public void setRoom_no(String room_no) {
	            this.room_no = room_no;
	        }

	        public void setComp_no(String comp_no) {
	            this.comp_no = comp_no;
	        }

	        public void setRef_id(String ref_id) {
	            this.ref_id = ref_id;
	        }

	        public storage(int med_id, String room_no, String comp_no, String ref_id) {
	            this.med_id = med_id;
	            this.room_no = room_no;
	            this.comp_no=comp_no;
	            this.ref_id= ref_id;
	
	        }
	             
}
