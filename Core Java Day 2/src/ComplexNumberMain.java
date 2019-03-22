class ComplexNumberMain
{
	public static void main(String args[])
	{
		
		ComplexNumber c1=new ComplexNumber();
		c1.setRealAndImaginary(5.8,3.5);
		c1.displayRealAndImaginary();

		ComplexNumber c2=new ComplexNumber();
		c2.setRealAndImaginary(4.8,2.4);
		c2.displayRealAndImaginary();
		ComplexNumber s=new ComplexNumber();
		s=s.sumOfComplexNumbers(c1,c2);
		

	System.out.println("Sum of 2 complex  numbers is-"+s.real+ "+"+s.imaginary+"i");

	}
}