package eu.gillespie.youtubeapi;

import eu.gillespie.youtubeapi.model.Activity;
import eu.gillespie.youtubeapi.model.Paginated;
import eu.gillespie.youtubeapi.model.PaginatedActivity;
import org.javawebstack.httpclient.HTTPClient;

public class YouTubeApiV3 {

    private String apiKey;

    private static final String API_BASE_URL = "https://www.googleapis.com/youtube/v3";
    private final HTTPClient client;

    public YouTubeApiV3(String apiKey) {
        this.apiKey = apiKey;
        this.client = new HTTPClient(API_BASE_URL);
    }

    public PaginatedActivity getActivities() {
        return this.client
                .get("/activities")
                .query("key", this.apiKey)
                .query("channelId", "UCCGZK5dPJk6p6x2n6obqULg")
                .query("part", "snippet")
                .execute()
                .object(PaginatedActivity.class);
    }

}
