
public class ExceptionHandling {
	public static void main(String args[]) {
		try{
			int data = 50 / 0;
		}
		catch(Exception e)
		{
		e.printStackTrace();
		System.out.println(e.getClass().getSimpleName());
		System.out.println(e.getClass().getName());
		System.out.println(e.getClass().getCanonicalName());
		System.out.println(e.getMessage());
		System.out.println(e.toString());
		System.out.println(e.getCause());//null
		}
		finally {
			System.out.println("Bye");
		}
		System.out.println("rest of the code...");
	}
}
