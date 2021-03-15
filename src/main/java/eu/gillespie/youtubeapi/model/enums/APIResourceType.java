package eu.gillespie.youtubeapi.model.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum APIResourceType {
    ACTIVITY_LIST_RESPONSE("youtube#activityListResponse");

    private String apiString;

    private APIResourceType(String apiString) {
        this.apiString = apiString;
    }

}
