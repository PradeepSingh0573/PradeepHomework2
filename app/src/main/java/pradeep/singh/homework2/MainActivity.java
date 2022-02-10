package pradeep.singh.homework2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    int i=0;
    int image[]={R.drawable.image1,R.drawable.image2,R.drawable.image3};

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.onClickListener(){

        ImageButton btnOpen = findViewById(R.id.btnImg1);
        btnOpen.setOnClickListener(new View.OnClickListener(){
            @Override
           public void onClick(View view){
                openDialog();
               btnOpen.setImageResource(image[i]);
               i++;
               if(i==3)
                   i=0;
           }

        });
    }

    }

    private void openDialog() {
    }