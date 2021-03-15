package eu.gillespie.youtubeapi;

import eu.gillespie.youtubeapi.model.PaginatedActivity;
import org.javawebstack.httpclient.HTTPClient;

public class YouTubeApiV3 {

    private String apiKey;
    private int quotaCostIncurred;

    private static final String API_BASE_URL = "https://www.googleapis.com/youtube/v3";
    private final HTTPClient client;

    public YouTubeApiV3(String apiKey) {
        this.apiKey = apiKey;
        this.client = new HTTPClient(API_BASE_URL);
    }

    public PaginatedActivity getActivitiesByChannelId(String channelId) {
        return this.client
                .get("/activities")
                .query("key", this.apiKey)
                .query("channelId", channelId)
                .query("part", "snippet")
                .execute()
                .object(PaginatedActivity.class);
    }

    public int addQuotaCost(int cost) {
        // ToDo: All Logger here
        this.quotaCostIncurred += cost;
        return this.quotaCostIncurred;
    }

}
