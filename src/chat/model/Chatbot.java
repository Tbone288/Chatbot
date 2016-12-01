package chat.model;

import java.util.ArrayList;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided.
 * Students will complete methods as part * of the project. 
 * @author Tyler Odom
 * @version 1.0 10/14/16
 */
public class Chatbot
{
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private String userName;
	private String content;

	/**
	 * * Creates an instance of the Chatbot with the supplied username. * @param
	 * userName The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		this.memesList = new ArrayList<String>();
		this.userName = userName;
		this.politicalTopicList = new ArrayList<String>();
		this.content = new String("Skiing");
		this.buildMemesList();
		this.buildPoliticalTopicsList();
	}

	private void buildMemesList()
	{
		memesList.add("doge");
		memesList.add("cute animals");
		memesList.add("grumpy cat");
		memesList.add("dat boi");
		memesList.add("willy wonka");
		memesList.add("harambe");
		memesList.add("john cena");
		memesList.add("spongegar");
		memesList.add("patgar");
		memesList.add("doodlebob");
		memesList.add("trumps wall");
		memesList.add("deleted emails");
		memesList.add("damn daniel");
		memesList.add("zodiac killer");
		memesList.add("spicy boys");
		memesList.add("pepe");
		memesList.add("another one");
		memesList.add("clowns");
	}

	private void buildPoliticalTopicsList()
	{
		politicalTopicList.add("Trump");
		politicalTopicList.add("Hillary");
		politicalTopicList.add("Democrat");
		politicalTopicList.add("Republican");
		politicalTopicList.add("11/8/16");
		politicalTopicList.add("conservative");
		politicalTopicList.add("liberal");
		politicalTopicList.add("Kaine");
		politicalTopicList.add("Pence");
		politicalTopicList.add("Stein");
		politicalTopicList.add("Johnson");
		politicalTopicList.add("election");
		politicalTopicList.add("Ken Bone");
		politicalTopicList.add("voting");
		politicalTopicList.add("nasty woman");
		politicalTopicList.add("putin");
		politicalTopicList.add("independent");
		politicalTopicList.add("Clinton");
								
		
	}

	/**
	 * * Checks the length of the supplied string. Returns false if the supplied
	 * String is empty or null, otherwise returns true. * @param currentInput * @return
	 * A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		
		if(currentInput != null && currentInput.length() > 0)
		{
			hasLength = true;
		}
		
		return hasLength;
	}

	/**
	 * * Checks if the supplied String matches the content area for this Chatbot
	 * instance.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked. * @return Whether it
	 *            matches the content area.
	 */
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;
		
		String temp = "💩";
		System.out.println(temp + temp.toLowerCase());
		
		if(currentInput.toLowerCase().contains(content.toLowerCase()))
		{
			hasContent = true;
		}
		
		return hasContent;
	}

	/**
	 * * Checks if supplied String matches ANY of the topics in the
	 * politicalTopicsList. Returns true if it does find a match and false if it
	 * does not match.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked. * @return Whether the
	 *            String is contained in the ArrayList.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		boolean isAPoliticalTopic = false;
		
		for (String currentPoliticalTopic: politicalTopicList)
		{
			if (currentPoliticalTopic.equals(currentInput))
			{
				isAPoliticalTopic = true;
			}
		}
		return isAPoliticalTopic;	
		
	}

	/**
	 * * Checks to see that the supplied String value is in the current
	 * memesList variable.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked. * @return Whether the
	 *            supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean isAMeme = false;
		
		for (String currentMeme: memesList)
		{
			if (currentMeme.equalsIgnoreCase(currentInput))
			{
				isAMeme = true;
			}
			
		}
		return isAMeme;
	}
	
	public boolean keyboardMashChecker(String currentInput)
	{
		boolean didMash = false;
		
		if((currentInput.contains("sdf") || currentInput.contains("derf") || currentInput.contains("asdf") || currentInput.contains("dfg") || currentInput.contains(",./")))
		{
			didMash = true;
		}
		return didMash;
	}
	
	public boolean inputHTMLChecker (String currentInput)
	{
		boolean html = false;
		String firstOne;
		int a = currentInput.indexOf(">");
		if(a >= 0)
		{
			String trimmed = currentInput.replaceAll(" ", "");
			int b = currentInput.length();
			firstOne = currentInput.substring(0, a++);
			a = currentInput.indexOf(">");
			String secondOne = currentInput.substring(a++);
			
			if((currentInput.equalsIgnoreCase("<P>") || secondOne.contains("<") && secondOne.contains(">")) &&(trimmed.length() > 2 
					&& !currentInput.endsWith("  ") && firstOne.length() > 2 && !currentInput.endsWith("F> </a>") && firstOne.contains("<")))
					{
						html = true;
					}
					
		}
		return html;
	}
	
	public boolean quitChecker(String currentInput)
	{
		boolean didQuit = false;
		
		if(currentInput.equalsIgnoreCase("Quit"))
		{
			didQuit = true;
		}
		return didQuit;
	}

	/**
	 * * Returns the username of this Chatbot instance. * @return The username
	 * of the Chatbot.
	 */
	public String getUserName()
	{
		return userName;
	}

	/**
	 * * Returns the content area for this Chatbot instance. * @return The
	 * content area for this Chatbot instance.
	 */
	public String getContent()
	{
		return content;
	}

	/**
	 * * Getter method for the memesList object. * @return The reference to the
	 * meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		return memesList;
	}

	/**
	 * * Getter method for the politicalTopicList object. * @return The
	 * reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return politicalTopicList;
	}

	/**
	 * * Updates the content area for this Chatbot instance. * @param content
	 * The updated value for the content area.
	 */
	public void setContent(String content)
	{
		this.content = content;
	}

}