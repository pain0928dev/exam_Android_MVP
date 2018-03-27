package pain0928dev.com.exammvp;

import pain0928dev.com.exammvp.util.BasePresenter;
import pain0928dev.com.exammvp.util.BaseView;

/**
 * Created by ljh0928 on 2018. 3. 27..
 */

public interface MainContract {

    public interface View extends BaseView<Presenter> {
        void showLoadingLable();
        void showResultLable(String label);
        void showStartButton();
        void showStopButton();
    }

    public interface Presenter extends BasePresenter {
        public void loadTask(boolean forceUpdate);
    }
}
