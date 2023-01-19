package com.xworkz.airport;

public class IronBox {

	public IronBox() {
		
	}
      public String Id ;
      public String color;
      public int price ;
      public String brandName;
      public String type;
     
  public IronBox(String IId,String clr,int prc,String bName,String typ) {
       System.out.println("Ironbox is constructor");
       Id = IId;
       color = clr ;
       price = prc;
      brandName = bName;
      type=typ;
      
        }
       
     
}


