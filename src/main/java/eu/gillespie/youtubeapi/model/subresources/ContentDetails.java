package eu.gillespie.youtubeapi.model.subresources;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ContentDetails {
    private Upload upload;
    private Like like;
    private Favorite favorite;
    private Comment comment;
    private Subscription subscription;
    private PlaylistItem playlistItem;
    private Recommendation recommendation;
    private Social social;
    private ChannelItem channelItem;
}
