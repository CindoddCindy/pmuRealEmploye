package cindy.sirihpinang.pmuempreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class RegisterActivity extends AppCompatActivity {

    ImageView imageView_regis_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        imageView_regis_image=findViewById(R.id.regis_gif);

        Glide.with(RegisterActivity.this)
                // LOAD URL DARI LOKAL DRAWABLE
                .load(R.drawable.user_register)
                //.asGif()
                //PENGATURAN CACHE
                //.diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(imageView_regis_image);

    }
}
