package com.xworkz.airport;

public class Footwear {
public Footwear() {
		
	}
    public String Id ;
    public String color ;
    public String model;
    public int  price;
    public String brandName;
     
  public Footwear(String fId,String clr,String mdl,int prc,String bName) {
       System.out.println("Footwear is used constructor") ;
       
       Id = fId;
       color = clr ;
       model = mdl;
       price = prc;
      brandName = bName;
     
 }
       
     }


