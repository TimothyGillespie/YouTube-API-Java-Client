package eu.gillespie.youtubeapi.model.subresources;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ResourceId {
    private String kind;
    private String videoId;
    private String channelId;
    private String playlistId;
    private String playlistItemId;
}
