package pain0928dev.com.exammvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainContract.View {


    @Bind(R.id.tvLabel)
    TextView tvLable;

    final String TAG = "MainActivity";

    MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showLoadingLable() {

    }

    @Override
    public void showResultLable(String label) {

    }

    @Override
    public void showStartButton() {

    }

    @Override
    public void showStopButton() {

    }
}
