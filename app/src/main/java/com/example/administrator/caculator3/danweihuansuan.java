package com.example.administrator.caculator3;


import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class danweihuansuan extends AppCompatActivity
{
    private Spinner danweiSpinner = null;  //单位
    private Spinner danwei1Spinner = null;     //单位1
    private Spinner danwei2Spinner = null;    //单位2
    ArrayAdapter<String> danweiAdapter = null;  //单位适配器
    ArrayAdapter<String> danwei1Adapter = null;    //单位1适配器
    ArrayAdapter<String> danwei2Adapter = null;    //单位2适配器



    //单位选项值
    private String[] danwei = new String[] {"长度","面积","体积","质量","速度",};
    //单位1选项值
    private String[][] danwei1 = new String[][]
            {
                    { "千米 km", "米 m", "分米 dm", "厘米 cm", "毫米 mm" },
                    { "平方千米 km2", "平方米 m2", "平方分米 dm2"  },
                    { "立方米 m3", "立方分米 dm3", "立方厘米 cm3" },
                    {"吨 t","千克 kg","克 g","毫克 mg"},
                    {"米/秒 m/s","千米/小时 km/h","千米/秒 km/s"}
            };

    //单位2选项值
    private String[][] danwei2 = new String[][]
            {
                    { "千米 km", "米 m", "分米 dm", "厘米 cm", "毫米 mm" },
                    { "平方千米 km2", "平方米 m2", "平方分米 dm2" },
                    { "立方米 m3", "立方分米 dm3", "立方厘米 cm3" },
                    {"吨 t","千克 kg","克 g","毫克 mg"},
                    {"米/秒 m/s","千米/小时 km/h","千米/秒 km/s"}
            };
    private double[][] length=new double[][]{
            {1,1000,10000,100000,1000000},
            {0.001,1,10,100,1000},
            {0.0001,0.1,1,10,100},
            {0.00001,0.01,0.1,1,10},
            {0.000001,0.001,0.01,0.1,1}
    };
    private double [][] area=new double [][]{
        {1,1000000,100000000},
        {0.000001,1,100},
        {0.00000001,0.01,1},
};
    private double [][] volume=new double [][]{
            {1,1000,1000000},
            {0.001,1,1000},
            {0.000001,0.001,1},
    };

    private double[][] mass=new double[][]{
            {1,1000,1000000,1000000000},
            {0.001,1,1000,1000000},
            {0.000001,0.001,1,1000},
            {0.000000001,0.000001,0.001,1},
    };

    private double [][] speed=new double [][]{
            {1,3.6,0.001},
            {1/3.6,1,0.036},
            {1000,3600,1},
    };

    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danweihuansuan);

        danweiSpinner = (Spinner) findViewById(R.id.spin1);
        danwei1Spinner = (Spinner) findViewById(R.id.spin2);
        danwei2Spinner = (Spinner) findViewById(R.id.spin3);

        //绑定适配器和值
        danweiAdapter = new ArrayAdapter<String>(danweihuansuan.this,
                android.R.layout.simple_spinner_item, danwei);
        danweiSpinner.setAdapter(danweiAdapter);
        danweiSpinner.setSelection(0, true);  //设置默认选中项，此处为默认选中第4个值

        danwei1Adapter = new ArrayAdapter<String>(danweihuansuan.this,
                android.R.layout.simple_spinner_item, danwei1[0]);
        danwei1Spinner.setAdapter(danwei1Adapter);
        danwei1Spinner.setSelection(0, true);  //默认选中第0个

        danwei2Adapter = new ArrayAdapter<String>(danweihuansuan.this,
                android.R.layout.simple_spinner_item, danwei2[0]);
        danwei2Spinner.setAdapter(danwei2Adapter);
        danwei2Spinner.setSelection(0, true);
        Button btn = (Button) findViewById(R.id.btn);
        final TextView tv = (TextView) findViewById(R.id.tv);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                tv.setText(transfor());
            }
        });


        //单位下拉框监听
        danweiSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            // 表示选项被改变的时候触发此方法，主要实现办法：动态改变单位1适配器的绑定值
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long arg3) {
                //position为当前单位选中的值的序号

                //将单位1适配器的值改变为单位1[position]中的值
                danwei1Adapter = new ArrayAdapter<String>(
                        danweihuansuan.this, android.R.layout.simple_spinner_item, danwei1[position]);
                // 设置单位1下拉列表的选项内容适配器
                danwei1Spinner.setAdapter(danwei1Adapter);
                danwei2Adapter = new ArrayAdapter<String>(
                        danweihuansuan.this, android.R.layout.simple_spinner_item, danwei2[position]);
                // 设置单位2下拉列表的选项内容适配器
                danwei2Spinner.setAdapter(danwei2Adapter);
                final int a=position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }

        });

        //单位1下拉监听
        danwei1Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int position, long arg3) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
        //单位2下拉监听
        danwei2Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int position, long arg3) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
    }
    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        super.onOptionsItemSelected(item);

        switch (item.getItemId()){
            case R.id.item1:
                startActivity(new Intent(danweihuansuan.this,MainActivity.class));break;
            case R.id.item2:
                startActivity(new Intent(danweihuansuan.this,kexuejisuan.class));break;
            case R.id.item3:break;
            case R.id.item4:
                Toast.makeText(this,"这是帮助",Toast.LENGTH_SHORT).show();break;
            case R.id.item5:
                System.exit(0);break;
        }
        return true;
    }
    public String transfor(){
        Spinner sp1=(Spinner)findViewById(R.id.spin1);
        Spinner sp2=(Spinner)findViewById(R.id.spin2);
        Spinner sp3=(Spinner)findViewById(R.id.spin3);
        int a=(int)sp1.getSelectedItemId();
        int b=(int)sp2.getSelectedItemId();
        int c=(int)sp3.getSelectedItemId();
        EditText ed=(EditText)findViewById(R.id.ed);
        String s=ed.getText().toString();
        int m=Integer.valueOf(s).intValue();
        double n=0;
        if (a==0) n=m*length[b][c];
        else if (a==1) n=m*area[b][c];
        else if (a==2) n=m*volume[b][c];
        else if (a==3) n=m*mass[b][c];
        else if (a==4) n=m*speed[b][c];
        String s1=String.valueOf(n);
        return s1;
    }
}


