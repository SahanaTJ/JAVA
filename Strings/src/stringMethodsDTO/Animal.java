package stringMethodsDTO;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Animal {
  
	public Animal(){
		System.out.println(this.getClass().getSimpleName()+"object is created");
	}
	
	private int id;
	private String name;
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Animal an=(Animal) obj;
		if(this.getName().equals(an.getName())) {
			return true;
			
		}
		return false;
		
	}
	@Override
	public String toString() {
		return "Animal - {Id="+this.getId()+",Name="+this.getName()+"}";
	}
	

}

