package com.learn2crack.filedownload;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Streaming;

public interface RetrofitInterface {

    @GET("SapleVideos/VideoPlayandDownload.apk")
    @Streaming
    Call<ResponseBody> downloadFile();
}
