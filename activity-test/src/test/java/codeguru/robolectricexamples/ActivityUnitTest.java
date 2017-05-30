package codeguru.robolectricexamples;

import android.app.Activity;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class ActivityUnitTest {
    @Test
    public void testActivity() {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        assertNotNull(activity);
    }

    @Test
    public void testTextView() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        TextView hello = (TextView) activity.findViewById(R.id.hello_text);
        assertNotNull(hello);
        assertEquals("Hello, World", hello.getText().toString());
    }
}
