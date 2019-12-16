package cindy.sirihpinang.pmuempreal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imageView_sp_opening;
    private int waktu_loading=5000;

    //4000=4 detik


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      imageView_sp_opening   = (ImageView)findViewById(R.id.img_opening);

        Glide.with(MainActivity.this)
                // LOAD URL DARI LOKAL DRAWABLE
                .load(R.drawable.sp_opening)
                //.asGif()
                //PENGATURAN CACHE
                //.diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(imageView_sp_opening);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);


    }
}
