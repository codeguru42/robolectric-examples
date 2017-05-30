package codeguru.robolectricexamples;

import android.app.Activity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class ActivityUnitTest {
    @Test
    public void testActivity() {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        assertNotNull(activity);
    }
}