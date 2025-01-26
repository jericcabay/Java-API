package api_projects;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

public class Twitter_API {
	public static void main(String[] args) {
		// Configure OAuth
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("YOUR_APIKEY")
		  .setOAuthConsumerSecret("YOUR_API_SECRET")
		  .setOAuthAccessToken("YOUR_ACCESS_TOKEN")
		  .setOAuthAccessTokenSecret("YOUR_ACCESS_TOKEN_SECRET");
	
		// Initialize twitter instance
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		
		try {
			// Post a tweet
			Status status = twitter.updateStatus("Hello twitter! #MyFirst Twitter");
			System.out.println("Successfully posted tweet: " + status.getText());
		} catch (TwitterException e) {
			e.printStackTrace();
		}
	}

}
