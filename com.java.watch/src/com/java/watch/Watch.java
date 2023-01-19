package com.java.watch;


public class Watch {

   public Watch() {
		
	}
  static  public String Id ;
  static  public String color;
  static  public String price ;
  static  public String brandName;
  static  public String type;
     
  public Watch(String wId,String clr,String prc,String bName,String type) {
       System.out.println("used smart watch");
       Id = wId;
       color = clr ;
       price = prc;
      brandName = bName;
      type=type;
      
        }
       
       
       public void  toTakeUseEnjoy () {
    	 System.out.println("Super alla");
     }
}
