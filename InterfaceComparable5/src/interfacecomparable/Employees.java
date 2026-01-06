package interfacecomparable;

import java.time.LocalDate;

public class Employees implements Comparable<Employees>{

	private String name;
	private LocalDate contractiondate;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getContractiondate() {
		return contractiondate;
	}

	public void setContractiondate(LocalDate contractiondate) {
		this.contractiondate = contractiondate;
	}

	
	public String toString() {
		
		return "Employ name: " + this.name +  "Date: " + this.contractiondate; 
	
	}
	
	@Override
	public int compareTo(Employees o) {
		
		 if(contractiondate.equals(o.contractiondate)) {
			 return name.compareTo(o.name);
			
		}else {
			return this.contractiondate.compareTo(o.getContractiondate());
		}
		
		 
		 
		 
	}

	public Employees(String name, LocalDate contractiondate) {
		this.name = name;
		this.contractiondate = contractiondate;
	}
	public Employees() {

	}
	
	
}
