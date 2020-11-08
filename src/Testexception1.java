import java.util.Scanner;

public class Testexception1 {

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.print("Année de naissance : ");
			int anneeDeNaissance = sc.nextInt();
			System.out.println(anneeDeNaissance);
		}
		catch (Exception e) {
			System.out.println("Date incorrecte !");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("OK !");
		}
	}

}
