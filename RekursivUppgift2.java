import java.io.IOException;
import java.io.InputStreamReader;
public class RekursivUppgift2 {
	static InputStreamReader input = new InputStreamReader(System.in);    //Vi skapar en buffered reader som kan användas som en getchar() i C. 

	public static void main(String[] args) throws IOException {    //Vi kastar in en IOException ifall programmet skulle göra något fel. 
		System.out.println("Write something: ");
		reverse();
		
		
		
		
	}
	
	public static void reverse() throws IOException
	{
		
		char a;
		if((a = (char) input.read()) != '\n')  // Den kör reverse-metoden i reverse-metoden fram tills att en newline printas ut. Då kommer den föregående reverse-metoden att gå till putchar-metoden och skriva ut tecknet osv
		{
			reverse();
			System.out.print(a);
		}
		
	}

}



