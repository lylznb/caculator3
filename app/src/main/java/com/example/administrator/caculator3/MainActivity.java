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


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        final TextView tv = (TextView) findViewById(R.id.tv1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("7");
                } else {
                    tv.setText(tv.getText() + "7");
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("8");
                } else {
                    tv.setText(tv.getText() + "8");
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("9");
                } else {
                    tv.setText(tv.getText() + "9");
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("+");
                } else {
                    tv.setText(tv.getText() + "+");
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("4");
                } else {
                    tv.setText(tv.getText() + "4");
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("5");
                } else {
                    tv.setText(tv.getText() + "5");
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("6");
                } else {
                    tv.setText(tv.getText() + "6");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("-");
                } else {
                    tv.setText(tv.getText() + "-");
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("1");
                } else {
                    tv.setText(tv.getText() + "1");
                }
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("2");
                } else {
                    tv.setText(tv.getText() + "2");
                }
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("3");
                } else {
                    tv.setText(tv.getText() + "3");
                }
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("x");
                } else {
                    tv.setText(tv.getText() + "x");
                }
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText(".");
                } else {
                    tv.setText(tv.getText() + ".");
                }
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                } else {
                    tv.setText(tv.getText() + "0");
                }
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Str=tv.getText().toString();
                tv.setText(caculate(Str));
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("/");
                } else {
                    tv.setText(tv.getText() + "/");
                }
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText("(");
                } else {
                    tv.setText(tv.getText() + "(");
                }
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv.getText().equals("0")) {
                    tv.setText(")");
                } else {
                    tv.setText(tv.getText() + ")");
                }
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Str=tv.getText().toString();
                if(Str.length()==1){tv.setText("0");}
                else{tv.setText(Str.substring(0, Str.length()-1));}
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("0");
            }

        });
    }
    @Override
    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        super.onOptionsItemSelected(item);

        switch (item.getItemId()){
            case R.id.item1:break;
            case R.id.item2:
                startActivity(new Intent(MainActivity.this,kexuejisuan.class));break;
            case R.id.item3:
                startActivity(new Intent(MainActivity.this,danweihuansuan.class));break;
            case R.id.item4:
                Toast.makeText(this,"这是帮助",Toast.LENGTH_SHORT).show();break;
            case R.id.item5:
                System.exit(0);break;

        }
        return true;
    }
    public String caculate(String s){
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
