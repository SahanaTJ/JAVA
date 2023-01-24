package com.xworkz.app;

public class Beaches {
    //static string beachnames
static String beachNames[]={null,null,null,null,null};

static int index;

//saveBeach,storeBeachName
//beach="marina"
public static boolean addBeachNames(String beachName){
System.out.println("inside addBeachNames");
//beachNames[0]="marina";
//beachNames[1]="malpe";
//beachNames[2]="goa"
//beachNames[3]="gokarna";
//beachNames[4]="murdeswara";
if(beachNames.length<5){

beachNames[index]=beachName;
index++;
return true;
}
else{
System.out.println("can not add beachnames");
}

System.out.println("end of addBeachNames");
return true;
}

//Read operation
public  static void getBeachNames(boolean value){
if(value==true){
for (int index=0;index<beachNames.length;index++){
String ref=beachNames[index];
System.out.println("Beach name is " + ref );
}
}
else if(value==false){
System.out.println("The given condition is false");
}
}
}
public static void findBeachNames(String beachNames)
System.out.println("Inside  findBeachNames");
for (int index=0;index<beachNames.length;index++){
String ref=beachNames[index];
System.out.println("Beach name is " + ref );
}
System.out.println("No Beach name find")
}
}    

