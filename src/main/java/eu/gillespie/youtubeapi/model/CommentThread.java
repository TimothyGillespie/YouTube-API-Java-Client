package eu.gillespie.youtubeapi.model;


import eu.gillespie.youtubeapi.model.snippet.CommentThreadSnippet;
import eu.gillespie.youtubeapi.model.subresources.CommentThreadReplies;
import lombok.Getter;

@Getter
public class CommentThread {
    private String kind;
    private String etag;
    private String id;

    private CommentThreadSnippet snippet;
    private CommentThreadReplies replies;
}
