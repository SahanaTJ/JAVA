package stringMethodsDTO;

public class Tablet {
   
	public Tablet(){
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
		Tablet tb=(Tablet) obj;
		if(this.getName().equals(tb.getName())) {
			return true;
			
		}
		return false;
		
	}
	private Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Tablet - {Id="+this.getId()+",Name="+this.getName()+"}";
	}

	private String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	


}


