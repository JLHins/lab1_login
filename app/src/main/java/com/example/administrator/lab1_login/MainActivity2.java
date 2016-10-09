package com.example.administrator.lab1_login;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.support.design.widget.Snackbar;
import android.text.TextUtils;
import android.view.View;

/**
 * Created by Administrator on 2016/10/7 0007.
 */
public class MainActivity2 extends AppCompatActivity{

    private RadioGroup radioGroup;
    private RadioButton btn_stu;
    private RadioButton btn_tea;
    private RadioButton btn_admin;
    private RadioButton btn_soc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn_login=(Button)findViewById(R.id.button1);
        Button btn_reg = (Button)findViewById(R.id.button2);
        final TextInputLayout username = (TextInputLayout)findViewById(R.id.more_username);
        final TextInputLayout password = (TextInputLayout)findViewById(R.id.more_password);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                if (TextUtils.isEmpty(username.getEditText().getText().toString())){
                    password.setErrorEnabled(false);
                    username.setErrorEnabled(true);
                    username.setError("用户名不能为空");
                }else if (TextUtils.isEmpty(password.getEditText().getText().toString())) {
                    username.setErrorEnabled(false);
                    password.setErrorEnabled(true);
                    password.setError("密码不能为空");
                }
                else{
                    username.setErrorEnabled(false);
                    password.setErrorEnabled(false);
                    if (TextUtils.equals(username.getEditText().getText().toString(),"Android")&&
                            TextUtils.equals(password.getEditText().getText().toString(),"123456")) {
                            Snackbar.make(v, "登陆成功", Snackbar.LENGTH_SHORT).setAction("按钮",new View.OnClickListener()
                            {
                                @Override
                                public void onClick(View view){
                                    Snackbar.make(v, "SnackBar的按钮被点击了", Snackbar.LENGTH_SHORT).show();
                                }
                            }).show();
                            }
                    else{
                        Snackbar.make(v, "登陆失败", Snackbar.LENGTH_SHORT).setAction("按钮",new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View view){
                                Snackbar.make(v, "SnackBar的按钮被点击了", Snackbar.LENGTH_SHORT).show();
                            }
                        }).show();
                    }
                }
            }
        });

        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn_stu.isChecked()){
                    Snackbar.make(v, "学生身份注册功能尚未开启", Snackbar.LENGTH_SHORT).setAction("按钮", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Snackbar.make(view, "SnackBar的按钮被点击了", Snackbar.LENGTH_SHORT).show();
                        }
                    }).show();

                }else if (btn_tea.isChecked()){
                    Snackbar.make(v, "老师身份注册功能尚未开启", Snackbar.LENGTH_SHORT).setAction("按钮", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Snackbar.make(view, "SnackBar的按钮被点击了", Snackbar.LENGTH_SHORT).show();
                        }
                    }).show();

                }else if(btn_soc.isChecked()){
                    Snackbar.make(v, "社团身份注册功能尚未开启", Snackbar.LENGTH_SHORT).setAction("按钮", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Snackbar.make(view, "SnackBar的按钮被点击了", Snackbar.LENGTH_SHORT).show();
                        }
                    }).show();
                }else{
                    Snackbar.make(v, "管理者身份注册功能尚未开启", Snackbar.LENGTH_SHORT).setAction("按钮", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Snackbar.make(view, "SnackBar的按钮被点击了", Snackbar.LENGTH_SHORT).show();
                        }
                    }).show();
                }
            }
        });
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        btn_stu=(RadioButton)findViewById(R.id.radio_student);
        btn_tea=(RadioButton)findViewById(R.id.radio_tea);
        btn_admin=(RadioButton)findViewById(R.id.radio_admin);
        btn_soc = (RadioButton)findViewById(R.id.radio_cor);
        RadioGroupListener Glistener=new RadioGroupListener();
        radioGroup.setOnCheckedChangeListener(Glistener);
    }

    class RadioGroupListener implements RadioGroup.OnCheckedChangeListener{
        @Override
        public void onCheckedChanged(RadioGroup radioGroup , int checkedId) {
            if(checkedId==btn_stu.getId()) {
                Snackbar.make(radioGroup, "学生身份被选中", Snackbar.LENGTH_SHORT).setAction("按钮", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            Snackbar.make(v, "SnackBar的按钮被点击了", Snackbar.LENGTH_SHORT).show();
                    }
                }).show();
            }else if(checkedId==btn_tea.getId()) {
                Snackbar.make(radioGroup, "老师身份被选中", Snackbar.LENGTH_SHORT).setAction("按钮", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(v, "SnackBar的按钮被点击了", Snackbar.LENGTH_SHORT).show();
                    }
                }).show();
            }else if(checkedId==btn_admin.getId()) {
                Snackbar.make(radioGroup, "管理者身份被选中", Snackbar.LENGTH_SHORT).setAction("按钮", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(v, "SnackBar的按钮被点击了", Snackbar.LENGTH_SHORT).show();
                    }
                }).show();
            }else if(checkedId==btn_soc.getId()) {
                Snackbar.make(radioGroup, "社团身份被选中", Snackbar.LENGTH_SHORT).setAction("按钮", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(v, "SnackBar的按钮被点击了", Snackbar.LENGTH_SHORT).show();
                    }
                }).show();
            }
        }
    }
}
