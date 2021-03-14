package eu.gillespie.youtubeapi.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.javawebstack.abstractdata.AbstractArray;
import org.javawebstack.abstractdata.AbstractMapper;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@ToString
public class Paginated {

    // ToDo: update to enumy
    private String kind;
    private String etag;
    private String nextPageToken;
    private String prevPageToken;
    private PageInfo pageInfo;
    @Getter(AccessLevel.NONE)
    private AbstractArray items;

    protected <T> List<T> _getItems(Class<T> type) {
        AbstractMapper mapper = new AbstractMapper();
        return items.stream().map(i -> mapper.fromAbstract(i, type)).collect(Collectors.toList());
    }

    @Getter
    private static class PageInfo {
        private int totalResults;
        private int resultsPerPage;
    }
}
