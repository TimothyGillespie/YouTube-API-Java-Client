package eu.gillespie.youtubeapi.model;

import java.util.List;

public class PaginatedActivity extends Paginated {

    public List<Activity> getItems() {
        return super._getItems(Activity.class);
    }
}
