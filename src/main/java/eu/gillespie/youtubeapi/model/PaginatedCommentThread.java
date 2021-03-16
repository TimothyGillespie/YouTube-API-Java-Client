package eu.gillespie.youtubeapi.model;


import java.util.List;

public class PaginatedCommentThread extends Paginated {

    public List<CommentThread> getItems() {
        return super._getItems(CommentThread.class);
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
