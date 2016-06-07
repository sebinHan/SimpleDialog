package kr.hs.emirim.sbb9918.simpledialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.but_dialog);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("First Dialog");
        dialog.setMessage("This is message part");
        dialog.setIcon(R.drawable.jw1);
        dialog.setPositiveButton("OK",null);
        dialog.show();
    }
}
