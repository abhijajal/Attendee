package com.example.attendee.attendee;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.attendee.attendee.R.id.activity_chooser_view_content;
import static com.example.attendee.attendee.R.id.activity_main;
import static com.example.attendee.attendee.R.id.right_side;
import static com.example.attendee.attendee.R.id.text;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearMain;
    CheckBox checkBox;
    ArrayList<String> selectedItems=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Developed By :- 14CE043",Toast.LENGTH_SHORT).show();

        linearMain =(LinearLayout) findViewById(R.id.activity_main);
        ListView ch1=(ListView) findViewById(R.id.checkable_list);
        ch1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        int i;
        ArrayList<String> al=new ArrayList<String>();
/*
        String prefix="14CE";
        for(i=2;i<=175;i++)
        {
            EditText edt=(EditText) findViewById(R.id.prefix);
            if(i<=9)
            {
                prefix=prefix+"00";
            }
            else if(i<=99) {
                prefix = prefix + "0";
            }
            al.add(prefix+i);
            if(i==147)
                prefix="D15CE";
        }
  */
        al.add("14CE002");
        al.add("14CE003");
        al.add("14CE004");
        al.add("14CE005");
        al.add("14CE006");
        al.add("14CE007");
        al.add("14CE008");
        al.add("14CE009");
        al.add("14CE011");
        al.add("14CE012");
        al.add("14CE013");
        al.add("14CE014");
        al.add("14CE015");
        al.add("14CE016");
        al.add("14CE017");
        al.add("14CE018");
        al.add("14CE019");
        al.add("14CE020");
        al.add("14CE021");
        al.add("14CE022");
        al.add("14CE023");
        al.add("14CE024");
        al.add("14CE025");
        al.add("14CE026");
        al.add("14CE027");
        al.add("14CE028");
        al.add("14CE029");
        al.add("14CE030");
        al.add("14CE031");
        al.add("14CE032");
        al.add("14CE033");
        al.add("14CE034");
        al.add("14CE035");
        al.add("14CE037");
        al.add("14CE038");
        al.add("14CE039");
        al.add("14CE040");
        al.add("14CE041");
        al.add("14CE042");
        al.add("14CE043");
        al.add("14CE044");
        al.add("14CE045");
        al.add("14CE046");
        al.add("14CE047");
        al.add("14CE048");
        al.add("14CE049");
        al.add("14CE050");
        al.add("14CE051");
        al.add("14CE052");
        al.add("14CE053");
        al.add("14CE054");
        al.add("14CE055");
        al.add("14CE056");
        al.add("14CE057");
        al.add("14CE058");
        al.add("14CE059");
        al.add("14CE060");
        al.add("14CE062");
        al.add("14CE063");
        al.add("14CE064");
        al.add("14CE065");
        al.add("14CE066");
        al.add("14CE067");
        al.add("14CE068");
        al.add("14CE069");
        al.add("14CE070");
        al.add("14CE071");
        al.add("14CE072");
        al.add("14CE073");
        al.add("14CE074");
        al.add("14CE075");
        al.add("14CE076");
        al.add("14CE077");
        al.add("14CE078");
        al.add("14CE079");
        al.add("14CE080");
        al.add("14CE081");
        al.add("14CE082");
        al.add("14CE083");
        al.add("14CE086");
        al.add("14CE087");
        al.add("14CE088");
        al.add("14CE089");
        al.add("14CE090");
        al.add("14CE091");
        al.add("14CE093");
        al.add("14CE094");
        al.add("14CE095");
        al.add("14CE096");
        al.add("14CE098");
        al.add("14CE099");
        al.add("14CE100");
        al.add("14CE101");
        al.add("14CE102");
        al.add("14CE103");
        al.add("14CE105");
        al.add("14CE106");
        al.add("14CE107");
        al.add("14CE108");
        al.add("14CE109");
        al.add("14CE110");
        al.add("14CE111");
        al.add("14CE112");
        al.add("14CE113");
        al.add("14CE114");
        al.add("14CE115");
        al.add("14CE116");
        al.add("14CE117");
        al.add("14CE119");
        al.add("14CE120");
        al.add("14CE121");
        al.add("14CE122");
        al.add("14CE123");
        al.add("14CE124");
        al.add("14CE125");
        al.add("14CE126");
        al.add("14CE127");
        al.add("14CE128");
        al.add("14CE129");
        al.add("14CE130");
        al.add("14CE131");
        al.add("14CE132");
        al.add("14CE133");
        al.add("14CE135");
        al.add("14CE136");
        al.add("14CE138");
        al.add("14CE140");
        al.add("14CE141");
        al.add("14CE142");
        al.add("14CE143");
        al.add("14CE144");
        al.add("14CE145");
        al.add("14CE147");
        al.add("D14CE149");
        al.add("D15CE148");
        al.add("D15CE149");
        al.add("D15CE150");
        al.add("D15CE151");
        al.add("D15CE152");
        al.add("D15CE153");
        al.add("D15CE154");
        al.add("D15CE155");
        al.add("D15CE156");
        al.add("D15CE157");
        al.add("D15CE158");
        al.add("D15CE159");
        al.add("D15CE160");
        al.add("D15CE161");
        al.add("D15CE162");
        al.add("D15CE163");
        al.add("D15CE164");
        al.add("D15CE165");
        al.add("D15CE166");
        al.add("D15CE167");
        al.add("D15CE168");
        al.add("D15CE169");
        al.add("D15CE170");
        al.add("D15CE171");
        al.add("D15CE172");
        al.add("D15CE173");
        al.add("D15CE174");
        al.add("D15CE175");
        al.add("11CE093");
        al.add("12CE121");
        al.add("13CE018");
        al.add("13CE049");
        al.add("13CE053");
        al.add("13CE092");
        al.add("13CE104");

        al.toArray();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.rowlayout,R.id.txt_lan,al);
        ch1.setAdapter(adapter);
        ch1.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem=((TextView)view).getText().toString();
                if (selectedItems.contains(selectedItem)) {
                    selectedItems.remove(selectedItem);
                }
                else
                {
                    selectedItems.add(selectedItem);
                }
            }
        });
    }
    public void show(View view)
    {
        String items="";
        for(String item:selectedItems)
        {
            items+="-"+item+"\n";
        }
        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText("Present ids are :- \n"+items);
        Toast.makeText(this,"Copied To Clipboard !",Toast.LENGTH_SHORT).show();
    }
    public void reset(View view)
    {
        //selectedItems.removeAll(selectedItems);
        //Intent intent=new Intent(this,MainActivity.class);
       /* Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage( getBaseContext().getPackageName() );
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
*/
        Intent i = new Intent(this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);

    }

}
