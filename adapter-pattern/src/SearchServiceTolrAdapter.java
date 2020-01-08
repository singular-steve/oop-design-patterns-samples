import java.util.ArrayList;
import java.util.List;

public class SearchServiceTolrAdapter implements SearchService {

  private TolrClient tolrClient = new TolrClient();

  @Override
  public SearchResult search(String keyword) {
    TolrQuery tolrQuery = new TolrQuery(keyword);
    QueryResponse response = tolrClient.query(tolrQuery);
    SearchResult result = convertToResult(response);
    return result;
  }

  private SearchResult convertToResult(QueryResponse response) {
    List<TolrDocument> tolrDocs = response.getDocumentList();
    List<SearchDocument> docs = new ArrayList<>();
    for (TolrDocument tolrDoc : tolrDocs) {
      docs.add(new SearchDocument(tolrDoc.getId(), tolrDoc.getContent()));
    }
    return new SearchResult(docs);
  }
}
