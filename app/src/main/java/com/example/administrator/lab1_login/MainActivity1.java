package com.example.administrator.lab1_login;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/10/7 0007.
 */
public class MainActivity1 extends AppCompatActivity {
    private  Toast pauToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        final RadioButton radmin = (RadioButton) findViewById(R.id.radio_admin);
        final RadioButton rcor = (RadioButton) findViewById(R.id.radio_cor);
        final RadioButton rstu = (RadioButton) findViewById(R.id.radio_student);
        final RadioButton rtea = (RadioButton) findViewById(R.id.radio_tea);
        final EditText username = (EditText) findViewById(R.id.username_edit);
        final EditText password = (EditText) findViewById(R.id.password_edit);
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity1.this);

        builder.setTitle("提示");
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(pauToast!=null)
                    pauToast.cancel();
                pauToast=Toast.makeText(MainActivity1.this, "对话框\"取消\"被点击", Toast.LENGTH_SHORT);
                pauToast.show();
            }
        });
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(pauToast!=null)
                    pauToast.cancel();
                pauToast=Toast.makeText(MainActivity1.this, "对话框\"确定\"被点击", Toast.LENGTH_SHORT);
                pauToast.show();
            }
        });

        radmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pauToast!=null)
                     pauToast.cancel();
                pauToast=Toast.makeText(MainActivity1.this, "管理员选项被选中", Toast.LENGTH_SHORT);
                pauToast.show();
            }
        });
        rcor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pauToast!=null)
                    pauToast.cancel();
                pauToast=Toast.makeText(MainActivity1.this, "社团选项被选中", Toast.LENGTH_SHORT);
                pauToast.show();
            }
        });
        rstu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pauToast!=null)  pauToast.cancel();
                pauToast=Toast.makeText(MainActivity1.this, "学生选项被点击", Toast.LENGTH_SHORT);
                pauToast.show();
            }
        });
        rtea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pauToast!=null)  pauToast.cancel();
                pauToast=Toast.makeText(MainActivity1.this, "老师选项被选中", Toast.LENGTH_SHORT);
                pauToast.show();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pauToast!=null) pauToast.cancel();
                if (TextUtils.isEmpty(username.getText().toString())) {
                    pauToast=Toast.makeText(MainActivity1.this, "用户名不能为空", Toast.LENGTH_SHORT);
                } else if (TextUtils.isEmpty(password.getText().toString())) {
                    pauToast=Toast.makeText(MainActivity1.this, "密码不能为空", Toast.LENGTH_SHORT);
                } else if (password.getText().toString().equals("123456") && username.getText().toString().equals("Android")) {
                    pauToast=Toast.makeText(MainActivity1.this, "登陆成功", Toast.LENGTH_SHORT);
                    builder.setMessage("登陆成功");
                    builder.show();
                } else {
                    pauToast=Toast.makeText(MainActivity1.this, "密码错误", Toast.LENGTH_SHORT);
                    builder.setMessage("登陆失败");
                    builder.show();
                }
                pauToast.show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pauToast!=null) pauToast.cancel();
                if (radmin.isChecked())
                    pauToast=Toast.makeText(MainActivity1.this, "管理员身份注册功能尚未开启", Toast.LENGTH_SHORT);
                else if (rcor.isChecked())
                    pauToast=Toast.makeText(MainActivity1.this, "社团身份注册功能尚未开启", Toast.LENGTH_SHORT);
                else if (rstu.isChecked())
                    pauToast=Toast.makeText(MainActivity1.this, "学生身份注册功能尚未开启", Toast.LENGTH_SHORT);
                else if (rtea.isChecked())
                    pauToast=Toast.makeText(MainActivity1.this, "老师身份注册功能尚未开启", Toast.LENGTH_SHORT);
                pauToast.show();
            }
        });
    }
}
