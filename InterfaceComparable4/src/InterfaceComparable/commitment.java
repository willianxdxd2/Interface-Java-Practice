package InterfaceComparable;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class commitment implements Comparable<commitment>{

	private String description;
	private LocalDateTime datehour;
	
	public commitment() {
	}
	
	public commitment(String description, LocalDateTime datehour) {
		super();
		this.description = description;
		this.datehour = datehour;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getDatehour() {
		return datehour;
	}
	public void setDatehour(LocalDateTime datehour) {
		this.datehour = datehour;
	}
	@Override
	public int compareTo(commitment o) {
		
		return this.datehour.compareTo(o.datehour);
	}	
	@Override 
	public String toString() {
		

		DateTimeFormatter fmt = 
				DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return "Description: " + description + "\n on date: " + datehour.format(fmt);
	}
	
	
}
