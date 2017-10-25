package project.of.secret.bookreader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import project.of.secret.bookreader.preseneter.LoginContract;
import project.of.secret.bookreader.preseneter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {

    @BindView(R.id.et_id)
    EditText mEtId;
    @BindView(R.id.et_password)
    EditText mEtPassword;

    private LoginContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        new LoginPresenter(this);
    }

    @OnClick(R.id.btn_login)
    void onClickLogin() {
        mPresenter.onClickLogin(mEtId.getText().toString(), mEtPassword.getText().toString());
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void alertInvalidId() {

    }

    @Override
    public void alertInvalidPassword() {

    }

    @Override
    public void showLoginSucceed() {

    }

    @Override
    public void showLoginFailure() {

    }
}
