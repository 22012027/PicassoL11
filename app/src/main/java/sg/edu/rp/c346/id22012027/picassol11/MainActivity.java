package sg.edu.rp.c346.id22012027.picassol11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv= findViewById(R.id.iv);

        String imageUrl= "http://i.imgyr.com/tGbaZCY.jpg";
        Picasso.with(this).load(imageUrl).into(iv);
    }
}