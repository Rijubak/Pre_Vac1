package com.anything.final_sem_lec;

import android.app.DownloadManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1;
  public static int a = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     b1 = (Button) findViewById(R.id.b1);


        View.OnClickListener b1Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri url = Uri.parse("http://www.nuevopudahuel.cl/sites/default/files/sample%20-%20copia_0.pdf");
                DownloadManager download_manager ;                                        //uniform resource i...
                download_manager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE); //Download manager is a class
                 DownloadManager.Request request = new DownloadManager.Request(url)
                         .setTitle("Sample PDF")
                         .setDescription("Random_Description")
                         .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                        // .setMimeType()
                         ;                     //a request is what we want to download
                         download_manager.enqueue(request);

            }
        };
        b1.setOnClickListener(b1Listener);
       //Log.e("RIJU_ERROR : ","err_msg");
    }
}
