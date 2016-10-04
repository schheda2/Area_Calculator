package com.example.himanshu.inclass2a;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

float first_length=0,second_length=0;
    TextView result_display;
    EditText length1,length2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       length1=(EditText)findViewById(R.id.length1_value);
        length2=(EditText) findViewById(R.id.length2_value);


        Button area_of_triangle=(Button)findViewById(R.id.triangle_calculation_button);
        area_of_triangle.setOnClickListener(this);

        Button area_of_square=(Button)findViewById(R.id.square_calculation_button);
        area_of_square.setOnClickListener(this);


        Button area_of_circle=(Button)findViewById(R.id.circle_area_calculation);
        area_of_circle.setOnClickListener(this);

        Button area_of_rectangle=(Button)findViewById(R.id.rectangle_area_calculation);
        area_of_rectangle.setOnClickListener(this);

        Button clear_all=(Button)findViewById(R.id.clear_button);
        clear_all.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
int id=v.getId();
        if(id==R.id.triangle_calculation_button)
        {

           try {

               if (length1.getText().toString() != "" || length2.getText().toString() != "") {

                   first_length = Float.valueOf(length1.getText().toString());
                   second_length = Float.valueOf(length2.getText().toString());
                   result_display = (TextView) findViewById(R.id.result_display);
                   double area = 0.5 * first_length * second_length;
                   result_display.setText(Double.toString(area));
               }

           }
           catch(Exception e)
           {
               Toast.makeText(getApplicationContext(),"Enter the lengths properly",Toast.LENGTH_LONG).show();

           }

        }


        else if(id==R.id.square_calculation_button)
        {
try {
    if (length1.getText().toString() != "") {

        first_length = Float.valueOf(length1.getText().toString());
        length2.setText("");
        result_display = (TextView) findViewById(R.id.result_display);
        double area = first_length * first_length;
        result_display.setText(Double.toString(area));
    }

}
            catch(Exception e)
            {
                Toast.makeText(getApplicationContext(),"Enter the lengths properly",Toast.LENGTH_LONG).show();

            }

        }

        else if(id==R.id.circle_area_calculation)
        {

            try {
                if (length1.getText().toString() != "") {

                    first_length = Float.valueOf(length1.getText().toString());
                    length2.setText("");
                    result_display = (TextView) findViewById(R.id.result_display);
                    double area = 3.14 * first_length;
                    result_display.setText(Double.toString(area));
                }

            }
            catch(Exception e)
            {
                Toast.makeText(getApplicationContext(),"Enter the lengths properly",Toast.LENGTH_LONG).show();

            }


        }

        else if(id==R.id.rectangle_area_calculation)
        {
            try {
                if (length1.getText().toString() != "" || length2.getText().toString() != "") {

                    first_length = Float.valueOf(length1.getText().toString());
                    second_length = Float.valueOf(length2.getText().toString());
                    result_display = (TextView) findViewById(R.id.result_display);
                    double area = first_length * second_length;
                    result_display.setText(Double.toString(area));
                }

            }
            catch(Exception e)
            {
                Toast.makeText(getApplicationContext(),"Enter the lengths properly",Toast.LENGTH_LONG).show();

            }
        }

        else
        {

            length1.setText("");
            length2.setText("");
            result_display.setText("");
        }

    }
}
