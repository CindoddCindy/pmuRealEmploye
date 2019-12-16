package cindy.sirihpinang.pmuempreal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class RegisterActivity extends AppCompatActivity {

    ImageView imageView_regis_image;

    TextView textView_regis_to_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        imageView_regis_image=findViewById(R.id.regis_gif);
        textView_regis_to_profile=findViewById(R.id.btn_after_regis);

        textView_regis_to_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,UserActivity.class);
                startActivity(intent);
            }
        });

        Glide.with(RegisterActivity.this)
                // LOAD URL DARI LOKAL DRAWABLE
                .load(R.drawable.user_register)
                //.asGif()
                //PENGATURAN CACHE
                //.diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(imageView_regis_image);

    }
}
