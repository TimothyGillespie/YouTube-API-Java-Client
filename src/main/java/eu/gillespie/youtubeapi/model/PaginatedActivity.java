package eu.gillespie.youtubeapi.model;

import java.util.List;

public class PaginatedActivity extends Paginated {

    public List<Activity> getItems() {
        return super._getItems(Activity.class);
    }

    @Override
    public String toString() {
        return "PaginatedActivity(" +
                "kind='" + kind + '\'' +
                ", etag='" + etag + '\'' +
                ", nextPageToken='" + nextPageToken + '\'' +
                ", prevPageToken='" + prevPageToken + '\'' +
                ", pageInfo=" + pageInfo +
                ", items=" + this.getItems().toString() +
                ')';
    }
}
