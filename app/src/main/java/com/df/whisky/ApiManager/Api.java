package com.df.whisky.ApiManager;
import com.df.whisky.models.Distillery;
import com.df.whisky.models.Whisky;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface   Api {
    String BASE_URL = "https://whiskyhunter.net/api/";
    @GET("auctions_info")
    Call<List<Whisky>> getWiskys();

    @GET("distilleries_info")
    Call<List<Distillery>> getDistilleries();
}
