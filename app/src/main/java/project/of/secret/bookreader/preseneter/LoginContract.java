package project.of.secret.bookreader.preseneter;

import android.support.annotation.NonNull;

/**
 * Created by ahn on 2017-10-25.
 */

public interface LoginContract {
    interface View {
        void setPresenter(Presenter presenter);

        void alertInvalidId();

        void alertInvalidPassword();

        void showLoginSucceed();

        void showLoginFailure();
    }

    interface Presenter {
        void onClickLogin(@NonNull String id, @NonNull String password);
    }
}
