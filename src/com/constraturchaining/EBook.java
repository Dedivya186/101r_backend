package com.constraturchaining;

class Book{
	String Title;
	Book(){
		System.out.println("Default Book Constructor");
	}
	Book(String Title){
		this.Title=Title;
		System.out.println("Book Title: "+this.Title);
	}
}

public class EBook extends Book{
	
      EBook(){
    	  this("Java Programming");
      }
      EBook(String Title){
    	  this.Title=Title;
  		System.out.println("EBook Title: "+this.Title);
      }
	public static void main(String[] args) {
       EBook e=new EBook();
	}

}
