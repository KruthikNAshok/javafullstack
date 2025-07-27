 class NewsPaper{
	 NewsPaper(){
		 System.out.println("NewsPaper constructor is invoked");
	 }
    
     NewsPaper(int newsPaperId){
	  System.out.println("Newspaper parameterized cons is invoked");
	  
	  this.newsPaperId=newsPaperId;
	 }
		 

	int newsPaperId;
	/* int noOfPages;
	 String language;
	 String date;
	 String day;
	 String companyName;*/
	 
   void getDetails(){	
	System.out.println("The newspaper id is "+newsPaperId);
	
	 
 }
 }