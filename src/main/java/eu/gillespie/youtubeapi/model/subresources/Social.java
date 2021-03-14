package eu.gillespie.youtubeapi.model.subresources;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Social {

    // ToDo: Convert to ENUM
    private String type;
    private ResourceId resourceId;
    private String author;
    private String referenceUrl;
    private String imageUrl;

}
