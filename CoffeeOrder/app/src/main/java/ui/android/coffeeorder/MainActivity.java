package ui.android.coffeeorder;

import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public TextView getQuantityTextView(){
        return (TextView)findViewById(R.id.number_text_view);
    }


    public int getQuantity(){
        String quantityText= getQuantityTextView().getText().toString();
        int numOfCup=Integer.parseInt(quantityText);
        return numOfCup;
    }

    public void  increment(View view){

        getQuantityTextView().setText(""+(getQuantity()+1));
        calculatePrice(getQuantity());

    }
    public  void  decrement(View view){
        if(getQuantity()!=0){
        getQuantityTextView().setText(""+(getQuantity()-1));
        calculatePrice(getQuantity());
        }

    }
    public TextView getPriceTextView(){
        TextView priceTextView= (TextView)findViewById(R.id.price_text_view);

        return priceTextView;
    }
    public void calculatePrice(int numOfCup){
        int price=numOfCup*5;
        getPriceTextView().setText("$"+price);

    }

    public  void submitOrder(View view){


              Button b=(Button)findViewById(R.id.order_button);
    b.setEnabled(false);
      LinearLayout layout= (LinearLayout)findViewById(R.id.activity_main);
      TextView summary=new TextView(this);
       layout.addView(summary);
      String name= ((EditText)findViewById(R.id.name_edit_text)).getText().toString();
       summary.setText("Name: "+name+"\nQuantity: "+getQuantity()+"\nPrice: "+getPriceTextView().getText());


    }
}
