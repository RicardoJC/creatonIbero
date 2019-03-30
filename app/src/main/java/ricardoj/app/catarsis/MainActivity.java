package ricardoj.app.catarsis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        HashMap<String,String> map = new HashMap<String, String>();
        map.put("id","ANA001");


        JsonObjectRequest objectRequest = new JsonObjectRequest(Request.Method.POST, "https://9xjscc3yu3.execute-api.us-west-2.amazonaws.com/Release", new JSONObject(map), new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.e("cadena",response.toString());
                Toast.makeText(getApplicationContext(),"Paso algo " + response.toString(),Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        queue.add(objectRequest);


    }
}
