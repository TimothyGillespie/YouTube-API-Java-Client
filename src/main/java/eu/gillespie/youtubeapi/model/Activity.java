package eu.gillespie.youtubeapi.model;

import eu.gillespie.youtubeapi.model.snippet.ActivitySnippet;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString()
public class Activity {

    private String kind;
    private String etag;
    private String id;
    private ActivitySnippet snippet;

}
