package info.bolun.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by bolun on 11/24/15.
 */
public class BaseActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
