package cindy.sirihpinang.pmuempreal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class LoginActivity extends AppCompatActivity {
    ImageView imageView_login_dua;
    TextView textView_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        imageView_login_dua  = (ImageView)findViewById(R.id.login_user);
        textView_login=findViewById(R.id.btn_login);

        textView_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        Glide.with(LoginActivity.this)
                // LOAD URL DARI LOKAL DRAWABLE
                .load(R.drawable.user_login)
                //.asGif()
                //PENGATURAN CACHE
                //.diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(imageView_login_dua);

    }
}
