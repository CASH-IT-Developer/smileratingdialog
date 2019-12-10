package com.cashit.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cashit.ratingdialog.BottomsheetRateDlg;
import com.cashit.ratingdialog.Interface.DlgInterface;

public class MainActivity extends AppCompatActivity {


    BottomsheetRateDlg bottomSheetMaterialDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Simple BottomSheet Material Dialog
                bottomSheetMaterialDialog = new BottomsheetRateDlg.Builder(MainActivity.this)
                        .setTitle("Delete?")
                        .setMessage("Are you sure want to delete this file?")
                        .setCancelable(false)
                        .setPositiveButton("Delete", R.drawable.ic_delete, new BottomsheetRateDlg.OnClickListener() {
                            @Override
                            public void onClick(DlgInterface dlgInterface, int i) {
                                Toast.makeText(getApplicationContext(), "Deleted!", Toast.LENGTH_SHORT).show();
                                dlgInterface.dismiss();
                            }
                        })
                        .setNegativeButton("Cancel", R.drawable.ic_close, new BottomsheetRateDlg.OnClickListener() {
                            @Override
                            public void onClick(DlgInterface dlgInterface, int which) {
                                Toast.makeText(getApplicationContext(), "Cancelled!", Toast.LENGTH_SHORT).show();
                                dlgInterface.dismiss();
                            }
                        })
                        .build();

                bottomSheetMaterialDialog.show();
            }
        });
    }
}
