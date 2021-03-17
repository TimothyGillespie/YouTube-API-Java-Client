package eu.gillespie.youtubeapi.model.enums;

import com.google.gson.annotations.JsonAdapter;
import lombok.Getter;
import lombok.ToString;
import org.javawebstack.abstractdata.util.GsonEnum;
import org.javawebstack.abstractdata.util.GsonEnumAdapter;

@Getter
@ToString
public enum APIResourceType implements GsonEnum {

    ACTIVITY_LIST_RESPONSE("youtube#activityListResponse");

    private String apiString;

    private APIResourceType(String apiString) {
        this.apiString = apiString;
    }

    @Override
    public String gsonValue() {
        return this.apiString;
    }
}
