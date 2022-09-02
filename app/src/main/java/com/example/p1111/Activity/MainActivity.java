package com.example.p1111.Activity;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.p1111.Adapter.MyArrayAdapter;
import com.example.p1111.Domain.RetrofitClient;
import com.example.p1111.Interface.YelpApi;
import com.example.p1111.R;
import com.example.p1111.models.Business;
import com.example.p1111.models.Category;
import com.example.p1111.models.YelpBusinessesSearchResponse;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

}