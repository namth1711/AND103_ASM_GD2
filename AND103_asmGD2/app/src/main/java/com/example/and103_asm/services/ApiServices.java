package com.example.and103_asm.services;

import com.example.and103_asm.model.GHNOrderRequest;
import com.example.and103_asm.model.GHNOrderRespone;
import com.example.and103_asm.model.ResponseGHN;
import com.example.and103_asm.model.Distributor;
import com.example.and103_asm.model.District;
import com.example.and103_asm.model.DistrictRequest;
import com.example.and103_asm.model.Fruit;
import com.example.and103_asm.model.GHNCancelRequest;
import com.example.and103_asm.model.GHNCancelResponse;
import com.example.and103_asm.model.GHNOrderRequest;
import com.example.and103_asm.model.GHNOrderRespone;
import com.example.and103_asm.model.Order;
import com.example.and103_asm.model.Page;
import com.example.and103_asm.model.Province;
import com.example.and103_asm.model.Response;
import com.example.and103_asm.model.ResponseGHN;
import com.example.and103_asm.model.User;
import com.example.and103_asm.model.Ward;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface ApiServices {
    public static String BASE_URL = "http://10.0.2.2:3000/api/";


    @GET("get-list-distributor")
        Call<Response<ArrayList<Distributor>>> getListDistributor();

    @GET("search-distributor")
        Call<Response<ArrayList<Distributor>>> searchDistributor(@Query("key") String key);

    @POST("add-distributor")
    Call<Response<Distributor>> addDistributor(@Body Distributor distributor);

    @PUT("update-distributor-by-id/{id}")
    Call<Response<Distributor>> updateDistributor(@Path("id") String id,@Body Distributor distributor);

    @DELETE("destroy-distributor-by-id/{id}")
    Call<Response<Distributor>> deleteDistributor(@Path("id") String id);

    //lab 6
    @Multipart
    @POST("register-send-email")
    Call<Response<User>> register(
            @Part("username") RequestBody username,
            @Part("password") RequestBody password,
            @Part("email") RequestBody email,
            @Part("name") RequestBody name,
            @Part MultipartBody.Part avartar

            );

    @POST("login")
    Call<Response<User>> login (@Body User user);

    @GET("get-list-fruit")
    Call<Response<ArrayList<Fruit>>> getListFruit(@Header("Authorization")String token);

    @Multipart
    @POST("add-fruit-with-file-image")
    Call<Response<Fruit>> addFruitWithFileImage(@PartMap Map<String, RequestBody> requestBodyMap,
                                                @Part ArrayList<MultipartBody.Part> ds_hinh
                                                );


    @GET("get-page-fruit")
    Call<Response<Page<ArrayList<Fruit>>>> getPageFruit( @QueryMap Map<String, String> stringMap);


    @Multipart
    @PUT("update-fruit-by-id/{id}")
    Call<Response<Fruit>> updateFruitWithFileImage(@PartMap Map<String, RequestBody> requestBodyMap,
                                                   @Path("id") String id,
                                                   @Part ArrayList<MultipartBody.Part> ds_hinh
    );

    @DELETE("destroy-fruit-by-id/{id}")
    Call<Response<Fruit>> deleteFruits(@Path("id") String id);

    @GET("get-fruit-by-id/{id}")
    Call<Response<Fruit>> getFruitById (@Path("id") String id);


    //API GHN

    @GET("/shiip/public-api/master-data/province")
    Call<ResponseGHN<ArrayList<Province>>> getListProvince();

    @POST("/shiip/public-api/master-data/district")
    Call<ResponseGHN<ArrayList<District>>> getListDistrict(@Body DistrictRequest districtRequest);

    @GET("/shiip/public-api/master-data/ward")
    Call<ResponseGHN<ArrayList<Ward>>> getListWard(@Query("district_id") int district_id);

    @POST("/shiip/public-api/v2/shipping-order/create")
    Call<ResponseGHN<GHNOrderRespone>> GHNOrder (@Body GHNOrderRequest ghnOrderRequest);

    @POST("add-order")
    Call<Response<Order>> order (@Body Order order);

    @GET("get-list-order")
    Call<Response<ArrayList<Order>>> getListOrder(@Query("id_user") String id_user);

    @POST("/shiip/public-api/v2/switch-status/cancel")
    Call<ResponseGHN<ArrayList<GHNCancelResponse>>> cancelOrder(@Body GHNCancelRequest ghnCancelRequest);

    @DELETE("delete-order/{order_code}")
    Call<Response<Order>> deleteOrder(@Path("order_code")String order_code);

}


