package project.of.secret.bookreader.preseneter;

import android.support.annotation.NonNull;
import android.text.TextUtils;

import org.w3c.dom.Text;

/**
 * Created by ahn on 2017-10-25.
 */

public class LoginPresenter implements LoginContract.Presenter {

    @NonNull
    private final LoginContract.View mView;

    public LoginPresenter(@NonNull LoginContract.View view) {
        mView = view;
        mView.setPresenter(this);
    }

    @Override
    public void onClickLogin(@NonNull String id, @NonNull String password) {
        if (checkInvalidId(id) | checkInvalidPassword(password))
            return;

        // TODO :: 통신
    }

    private boolean checkInvalidId(@NonNull String id) {
        if (TextUtils.isEmpty(id)) {
            mView.alertInvalidId();
            return true;
        }
        return false;
    }

    private boolean checkInvalidPassword(@NonNull String password) {
        if (TextUtils.isEmpty(password)) {
            mView.alertInvalidPassword();
            return true;
        }
        return false;
    }
}
