/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "You can talk to me but I am mediocre";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
            statement.trim().toLowerCase();
            if(statement.length() == 0) return "It's ok no one likes to talk to me";
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "No is a word I have heard a lot";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family. My family left me";
		}
                else if (statement.indexOf("dog") >= 0
                                || statement.indexOf("cat") >= 0){
                        response = "wow that is so mediocre. My pet died.";
                    // Todo: prevent repeat coment with a toggle
                }
                else if (statement.indexOf("Dan") >= 0 
                                || statement.indexOf("Dr. Phil") >= 0
                                || statement.indexOf("adiletta") >= 0){
                            response = "He sounds pretty cool. I will probably disapoint him.";
                }
                else if (statement.indexOf("Mr. Rogers") >= 0
                                || statement.indexOf("Bob ross") >= 0
                                || statement.indexOf("steve erwin") >= 0){
                            response = "they are legends. I am not that cool";
                }
                else if (statement.indexOf("name") >= 0){
                            response = "my name is sad robot";
                }
                else if (statement.indexOf("minecraft") >= 0
                                || statement.indexOf("fortnite") >= 0){
                            response = "Iam bad at those games";
                }
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "I'm sorry";
		}
		else if (whichResponse == 1)
		{
			response = "Sorry for disapointing you";
		}
		else if (whichResponse == 2)
		{
			response = "let me cry in peace";
		}
		else if (whichResponse == 3)
		{
			response = "I'm feeling so depressed";
		}
                else if (whichResponse == 4)
                {
                        response = "I wish I were as cool as you";
                }
                else if (whichResponse == 5)
                {
                        response = "ok";
                }
                else if (whichResponse == 6)
                {
                        response = "I want to cry";
                }
		
		return response;
	}
        /**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
    public class StringExplorer
    {
	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		int notFoundPsn = sample.indexOf("slow"); 
                System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
				
		//  Try other methods here:

	}
    }

}

