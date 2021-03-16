package eu.gillespie.youtubeapi;

import eu.gillespie.youtubeapi.model.PaginatedActivity;
import eu.gillespie.youtubeapi.model.PaginatedCommentThread;
import lombok.AccessLevel;
import lombok.Getter;
import org.javawebstack.httpclient.HTTPClient;
import org.javawebstack.httpclient.HTTPRequest;

import java.util.logging.Level;
import java.util.logging.Logger;

public class YouTubeApiV3 {

    @Getter(AccessLevel.NONE)
    private String apiKey;

    @Getter
    private int quotaCostIncurred;

    private static final String API_BASE_URL = "https://www.googleapis.com/youtube/v3";
    private final HTTPClient client;

    public YouTubeApiV3(String apiKey) {
        this.apiKey = apiKey;
        this.client = new HTTPClient(API_BASE_URL);
    }

    public PaginatedActivity getActivitiesByChannelId(String channelId) {
        HTTPRequest response = this.client
                .get("/activities")
                .query("key", this.apiKey)
                .query("channelId", channelId)
                .query("part", "snippet")
                .execute();

        if (!handleErrorCases(response))
            return null;

        return response.object(PaginatedActivity.class);
    }

    public PaginatedCommentThread getCommentThreadsByVideoId(String videoId) {
        HTTPRequest response = this.client
                .get("/commentThreads")
                .query("key", this.apiKey)
                .query("videoId", videoId)
                .query("part", "id,snippet,replies")
                .execute();

        if (!handleErrorCases(response))
            return null;

        return response.object(PaginatedCommentThread.class);
    }

    public int addQuotaCost(int cost) {
        this.quotaCostIncurred += cost;
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(
                Level.INFO,
                () -> String.format("Quota cost of %d has been added. New total: %d", cost, this.quotaCostIncurred)
        );
        return this.quotaCostIncurred;
    }

    private boolean handleErrorCases(HTTPRequest request) {

        if (!(request.status() >= 200 && request.status() < 300)) {
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(
                    Level.SEVERE,
                    "Request was unsuccessful: " + request.toString()
            );

            return false;
        }

        return true;
    }

}
