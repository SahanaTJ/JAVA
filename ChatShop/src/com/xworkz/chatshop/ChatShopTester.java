package com.xworkz.chatshop;

public class ChatShopTester {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String chatNames[]=new String[3];
          chatNames[0]="Panipuri";
          chatNames[1]="Gobi";
          chatNames[2]="Kachori";
          
          String staffNames[]=new String[3];
          staffNames[0]="Raju";
          staffNames[1]="Anu";
          staffNames[2]="Sangeetha";
          
          long staffContactNo[]=new long[3];
          staffContactNo[0]=67343783014421L;
          staffContactNo[1]=56454764673726L;	  
          staffContactNo[2]=65476356837458L;
          
          String billingMethod[]=new String[3];
          billingMethod[0]="Credit";
          billingMethod[1]="Debit";
          billingMethod[2]="UPI";
          
          ChatShop c=new ChatShop("27848249280","RajajiNagar","Raju",chatNames,staffNames,staffContactNo,billingMethod);
          c.display();
	}
}
