class ComplexNumber
{
	double real;
	double imaginary;

	public void setRealAndImaginary(double real,double imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}


	public void displayRealAndImaginary()
	{

	System.out.println(real+ "+" +imaginary+"i");
	}


	public  ComplexNumber sumOfComplexNumbers(ComplexNumber c1, ComplexNumber c2)
       	{
		ComplexNumber s=new ComplexNumber();
		s.real=c1.real+c2.real;	
		s.imaginary=c1.imaginary+c2.imaginary;	
		return s;
      }

	

}