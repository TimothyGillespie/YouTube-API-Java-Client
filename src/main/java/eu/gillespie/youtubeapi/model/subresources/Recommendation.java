package eu.gillespie.youtubeapi.model.subresources;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Recommendation {
    private ResourceId resourceId;
    // ToDo: Convert to ENUM
    private String reason;
    private ResourceId seedResourceId;
}
