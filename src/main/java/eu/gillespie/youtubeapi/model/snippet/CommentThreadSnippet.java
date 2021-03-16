package eu.gillespie.youtubeapi.model.snippet;

import eu.gillespie.youtubeapi.model.Comment;
import lombok.Getter;

@Getter
public class CommentThreadSnippet {

    private String channelId;
    private String videoId;

    private Comment topLevelComment;
    private boolean canReply;
    private Integer totalReplyCount;
    private boolean isPublic;
}
