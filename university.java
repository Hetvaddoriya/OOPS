class university
{
  static int totalstudent;
   static String universityname;
  static
	{
	   universityname="gtu";
     	   totalstudent=0;
	  System.out.println(" static block executed:");
	}
        {
         System.out.println("instance block executed");
}
       university()
     		   {
			totalstudent++;
			 System.out.println("constructor executed");
			}
		static int gettotalstudent()
			{
				 return totalstudent;
				}
			public static void main(String [] args)
				{
					System.out.println("main method started");
					System.out.println("unversity"+universityname);
					university s1=new university();
					university s2=new university();
					university s3=new university();
  					System.out.println("\n total student"+gettotalstudent());

				}
}