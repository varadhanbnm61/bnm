package namakal1;//throw keyword-user defined exception

public class AmountException extends RuntimeException{

	public AmountException()
	{
		System.out.println("negative amount");

	}

}
