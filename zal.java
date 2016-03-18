
public class zal extends Kinoteatr  {
	
		String name_zal;
		String film_name;
		String time_of_seanse;
		
		public zal(String name_Kinoteatr, String address, int numofzal,String name_zal, String film_name, String time_of_seanse){
			super (name_Kinoteatr, address, numofzal);
			this.name_zal=name_zal;
			this.film_name=film_name;
			this.time_of_seanse = time_of_seanse;
		}
		
		public String getname_zal() {
		    return name_zal;
		}
		public void setname_zal(String name_zal) {
		    this.name_zal=name_zal;
		}
		public String getFilm_name() {
			return film_name;
		}
		public void setFilm_name(String film_name) {
			this.film_name = film_name;
		}
		public String getTime_of_seanse() {
			return time_of_seanse;
		}
		public void setTime_of_seanse(String time_of_seanse) {
			this.time_of_seanse = time_of_seanse;
		}

		@Override
		public String toString() {
			 return super.toString()+"zal [name_zal=" + name_zal + ", film_name=" + film_name + ", time_of_seanse=" + time_of_seanse
						+ "]";
		}
		
		}
