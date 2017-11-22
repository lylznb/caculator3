package com.example.administrator.caculator3;

import android.content.Intent;
import android.icu.math.BigDecimal;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class kexuejisuan extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_kexuejisuan);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btn10 = (Button) findViewById(R.id.btn10);
        Button btn11 = (Button) findViewById(R.id.btn11);
        Button btn12 = (Button) findViewById(R.id.btn12);
        Button btn13 = (Button) findViewById(R.id.btn13);
        Button btn14 = (Button) findViewById(R.id.btn14);
        Button btn15 = (Button) findViewById(R.id.btn15);
        Button btn16 = (Button) findViewById(R.id.btn16);
        Button btn17 = (Button) findViewById(R.id.btn17);
        Button btn18 = (Button) findViewById(R.id.btn18);
        Button btn19 = (Button) findViewById(R.id.btn19);
        Button btn20 = (Button) findViewById(R.id.btn20);
        Button btn21 = (Button) findViewById(R.id.btn21);
        Button btn22 = (Button) findViewById(R.id.btn22);
        Button btn23 = (Button) findViewById(R.id.btn23);
        Button btn24 = (Button) findViewById(R.id.btn24);
        Button btn25 = (Button) findViewById(R.id.btn25);
        Button btn26 = (Button) findViewById(R.id.btn26);
        Button btn27 = (Button) findViewById(R.id.btn27);
        Button btn28 = (Button) findViewById(R.id.btn28);
        Button btn29 = (Button) findViewById(R.id.btn29);
        Button btn30 = (Button) findViewById(R.id.btn30);
        Button btn31 = (Button) findViewById(R.id.btn31);
        Button btn32 = (Button) findViewById(R.id.btn32);
        Button btn33 = (Button) findViewById(R.id.btn33);
        Button btn34 = (Button) findViewById(R.id.btn34);
        Button btn35 = (Button) findViewById(R.id.btn35);
        final TextView tv = (TextView) findViewById(R.id.tv2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("0");
                }
                String s=tv.getText().toString();
                double a=Double.parseDouble(s);
                a=a/180;
                a=Math.sin(Math.PI*a);

                BigDecimal b   =   new   BigDecimal(a);
                double   f1   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
                if(f1==0){tv.setText("0");}
                else{
                    String str =Double.toString(f1);
                    tv.setText(str);}
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=tv.getText().toString();
                double a=Double.parseDouble(s);
                a=a/180;
                a=Math.cos(Math.PI*a);

                BigDecimal b   =   new   BigDecimal(a);
                double   f1   =   b.setScale(7,   BigDecimal.ROUND_HALF_UP).doubleValue();
                if(f1==0){tv.setText("0");}
                else{
                String str =Double.toString(f1);
                tv.setText(str);}
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=tv.getText().toString();
                double a=Double.parseDouble(s);
                a=a/180;
                a=Math.tan(Math.PI*a);

                BigDecimal b   =   new   BigDecimal(a);
                double   f1   =   b.setScale(7,   BigDecimal.ROUND_HALF_UP).doubleValue();
                if(f1==0){tv.setText("0");}
                else{
                    String str =Double.toString(f1);
                    tv.setText(str);}
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("7");
                } else {
                    tv.setText(tv.getText() + "7");
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("8");
                } else {
                    tv.setText(tv.getText() + "8");
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("9");
                } else {
                    tv.setText(tv.getText() + "9");
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("+");
                } else {
                    tv.setText(tv.getText() + "+");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("0");
                } else {
                    String s = tv.getText().toString();
                    double a = Double.parseDouble(s);
                    a = Math.log(a);
                    String str =Double.toString(a);
                    tv.setText(str);}
                }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("3.1415926535");
                } else {
                    tv.setText(tv.getText() + "3.1415926535");
                }
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("0");
                } else {
                    String s = tv.getText().toString();
                    double a = Double.parseDouble(s);
                    double j=1;
                    for(int i=1;i<=a;i++)
                    {
                       j=j*i;}
                    String str =Double.toString(j);
                    tv.setText(str);
                }
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("4");
                } else {
                    tv.setText(tv.getText() + "4");
                }
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("5");
                } else {
                    tv.setText(tv.getText() + "5");
                }
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("6");
                } else {
                    tv.setText(tv.getText() + "6");
                }
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("-");
                } else {
                    tv.setText(tv.getText() + "-");
                }
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0"))
                {tv.setText("0");}
                else {
                int i = Integer.valueOf(tv.getText().toString()).intValue();
                String str3 = Integer.toBinaryString(i);
                String s = String.valueOf(str3);
                tv.setText(s);
            }
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0"))
                {tv.setText("0");}
                else {
                    int i = Integer.valueOf(tv.getText().toString()).intValue();
                    String str3 = Integer.toOctalString(i);
                    String s = String.valueOf(str3);
                    tv.setText(s);
                }
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0"))
                {tv.setText("0");}
                else {
                    int i = Integer.valueOf(tv.getText().toString()).intValue();
                    String str3 = Integer.toHexString(i);
                    String s = String.valueOf(str3);
                    tv.setText(s);
                }
            }
        });

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("1");
                } else {
                    tv.setText(tv.getText() + "1");
                }
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("2");
                } else {
                    tv.setText(tv.getText() + "2");
                }
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("3");
                } else {
                    tv.setText(tv.getText() + "3");
                }
            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("x");
                } else {
                    tv.setText(tv.getText() + "x");
                }
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("0");
                } else {
                    String s = tv.getText().toString();
                    double a = Double.parseDouble(s);
                    a = Math.pow(a,0.5);
                    String str =Double.toString(a);
                    tv.setText(str);}
            }
        });
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("0");
                } else {
                    String s = tv.getText().toString();
                    double a = Double.parseDouble(s);
                    a = Math.pow(a,0.33333);
                    BigDecimal b   =   new   BigDecimal(a);
                    double   f1   =   b.setScale(3,   BigDecimal.ROUND_HALF_UP).doubleValue();
                    String str =Double.toString(f1);
                    tv.setText(str);}
            }
        });
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("0");
                } else {
                    String s = tv.getText().toString();
                    double a = Double.parseDouble(s);
                    a=a*a;
                    String str =Double.toString(a);
                    tv.setText(str);
                }
            }
        });
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText(".");
                } else {
                    tv.setText(tv.getText() + ".");
                }
            }
        });
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                } else {
                    tv.setText(tv.getText() + "0");
                }
            }
        });
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Str=tv.getText().toString();
                tv.setText(caculate(Str));
            }
        });
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("/");
                } else {
                    tv.setText(tv.getText() + "/");
                }
            }
        });
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("0");
                } else {
                    String s = tv.getText().toString();
                    double a = Double.parseDouble(s);
                    u=a;
                    tv.setText("0");
                }
            }
        });
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("1");
                } else {
                    String s = tv.getText().toString();
                    double a = Double.parseDouble(s);
                    double j=1;
                    for(int i=0;i<a;i++)
                    {
                        j=j*10;}
                    String str =Double.toString(j);
                    tv.setText(str);
                }
            }
        });
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("0");
        } else {
            String s = tv.getText().toString();
            double a = Double.parseDouble(s);
            double b =a*a;
            b=b*a;
            String str =Double.toString(b);
            tv.setText(str);
        }
    }
        });
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("(");
                } else {
                    tv.setText(tv.getText() + "(");
                }
            }
        });
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText(")");
                } else {
                    tv.setText(tv.getText() + ")");
                }
            }
        });
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Str=tv.getText().toString();
                if(Str.length()==1){tv.setText("0");}
                else{tv.setText(Str.substring(0, Str.length()-1));}
            }
        });
        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("0");
            }

        });
    }
     double u=0;
    @Override
    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        super.onOptionsItemSelected(item);

        switch (item.getItemId()){
            case R.id.item1:
                startActivity(new Intent(kexuejisuan.this,MainActivity.class));break;
            case R.id.item2:break;
            case R.id.item3:
                startActivity(new Intent(kexuejisuan.this,danweihuansuan.class));break;
            case R.id.item4:
                Toast.makeText(this,"这是帮助",Toast.LENGTH_SHORT).show();break;
            case R.id.item5:
                System.exit(0);break;
        }
        return true;
    }
    public String caculate(String s){
        if(u!=0){
            TextView tv=(TextView)findViewById(R.id.tv2);
            if (tv.getText().equals("0")) {
                u=0;
                return "1";
            } else {
                String st = tv.getText().toString();
                double a = Double.parseDouble(st);
                double j=1;
                for(int i=0;i<a;i++)
                {   j=j*u;}
                String str =Double.toString(j);
                u=0;
                return str;
            }
        }else{
        s=s.trim();
        double[] str1=new double[10];
        String str2="#";int j=0;
        s+='#';
        if(s != null && !"".equals(s)){
            int k=10;double n=1,m=1;int i=0;
            while(s.charAt(i)!='#'||str2.charAt(str2.length()-1)!='#'){

                if(s.charAt(i)>=48 && s.charAt(i)<=57){
                    int x=s.charAt(i)-48;
                    str1[j]=str1[j]*k+x*n;n=n*m;i++;if((s.charAt(i)<48 || s.charAt(i)>57)&&s.charAt(i)!=46){j++;}
                } else if(s.charAt(i)==46){k=1;n=0.1;;m=0.1;i++;}
                else{
                    k=10;n=1;m=1;i++;
                    switch (precede(str2.charAt(str2.length()-1),s.charAt(i-1))){
                        case'<':
                            str2+=s.charAt(i-1);break;
                        case '=':
                            str2=str2.substring(0,str2.length()-1);break;
                        case'>':
                            char c=str2.charAt(str2.length()-1);
                            str2=str2.substring(0,str2.length()-1);
                            double a=str1[j-1];str1[j-1]=0;
                            double b=str1[j-2];str1[j-2]=0;
                            j=j-2;i--;
                            str1[j]=operate(b,c,a);
                            j++;
                    }
                }
            }
        }
        if(str1[0]==0){return "0";}
        else {return Double.toString(str1[0]);}
        }
    }
    public  char precede(char a,char b){
        int x=0,y=0; char[][] c ={{'>','>','<','<','<','>','>'},
                {'>','>','<','<','<','>','>'},
                {'>','>','>','>','<','>','>'},
                {'>','>','>','>','<','>','>'},
                {'<','<','<','<','<','=',' '},
                {'>','>','>','>',' ','>','>'},
                {'<','<','<','<','<',' ','='}};
        if(a=='+'){x=0;}if(a=='-'){x=1;}if(a=='*'){x=2;}if(a=='/'){x=3;}if(a=='('){x=4;}if(a==')'){x=5;}if(a=='#'){x=6;}
        if(b=='+'){y=0;}if(b=='-'){y=1;}if(b=='*'){y=2;}if(b=='/'){y=3;}if(b=='('){y=4;}if(b==')'){y=5;}if(b=='#'){y=6;}
        return c[x][y];
    }
    public double operate(double a,char c,double b){
        double i=0;
        if(c=='+'){i= a+b;}
        if(c=='-'){i= a-b;}
        if(c=='x'){i= a*b;}
        if(c=='/'){i= a/b;}
        return i;
    }
}
