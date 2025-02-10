package vn.edu.tom.bt_android_2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET(".")
    Call<List<MessageModule>> getJsonData();
}
