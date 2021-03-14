package eu.gillespie.youtubeapi.model.subresources;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Getter;

@Getter
public class ThumbnailCollection {

    // default is a protected name; therefore we need to manually set getter and to string
    @SerializedName("default")
    @Getter(AccessLevel.NONE)
    private Thumbnail _default;
    private Thumbnail medium;
    private Thumbnail high;
    private Thumbnail standard;
    private Thumbnail maxres;

    public Thumbnail getDefault() {
        return this._default;
    }

    @Override
    public String toString() {
        return "ThumbnailCollection(" +
                "default=" + _default +
                ", medium=" + medium +
                ", high=" + high +
                ", standard=" + standard +
                ", maxres=" + maxres +
                ')';
    }
}
