





public class Assignment01 {
	
	
		
		//this is the state
		
		double num;
		
		
		//this is the constructor
		public Assignment01(double num){
			
			this.num = num;
			
		}
		
		
		
		

        //this is the method to get the square root
		//we also use the math library
		public void squareroots(){
			
			double sqrt = Math.sqrt(num);
			System.out.println(sqrt);
			
		}
		
		//this is the method to get the cubed square root
		//also using the math library
        public void csqrroot(){
			
        	double csqrt = Math.cbrt(num);
        	System.out.println(csqrt);
			
		}
		
		
		
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Thid is declaring the sqroot variable and assigning the class to it
		Assignment01 sqroot = new Assignment01(54);
		
		
		//these are giving the square root and cubed square root
		System.out.print("The square root of the number is : ");
		sqroot.squareroots();
		System.out.print("The cubed square root of the number is : ");
		sqroot.csqrroot();
		
	

	}

}
