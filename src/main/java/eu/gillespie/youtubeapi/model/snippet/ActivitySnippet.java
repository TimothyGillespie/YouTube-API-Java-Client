package eu.gillespie.youtubeapi.model.snippet;

import eu.gillespie.youtubeapi.model.enums.ActivityType;
import eu.gillespie.youtubeapi.model.subresources.ContentDetails;
import eu.gillespie.youtubeapi.model.subresources.ThumbnailCollection;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@ToString
public class ActivitySnippet {
    private Timestamp publishedAt;
    private String channelId;
    private String title;
    private String description;
    private ThumbnailCollection thumbnails;
    private String channelTitle;
    private ActivityType type;
    private String groupId;
    // Todo: update to proper class
    private ContentDetails contentDetails;
}
