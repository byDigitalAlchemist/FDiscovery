package boston.dc.com.fdiscovery;

import java.util.List;

import boston.dc.com.fdiscovery.model.Repo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Digital Alchemist on 7/30/2017.
 */

public interface Webservices {
    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);
}
