package codeguru.fragmenttest;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.robolectric.shadows.support.v4.SupportFragmentTestUtil.startFragment;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class FragmentUnitTest {
    @Test
    public void testFragment() throws Exception {
        Fragment fragment = new MainFragment();
        startFragment(fragment);
        assertNotNull(fragment);
    }

    @Test
    public void testTextView() throws Exception {
        Fragment fragment = new MainFragment();
        startFragment(fragment);
        assertNotNull(fragment);
        View view = fragment.getView();
        assertNotNull(view);
        TextView hello = (TextView) view.findViewById(R.id.hello_text);
        assertNotNull(hello);
        assertEquals("Hello, Android!", hello.getText().toString());
    }
}
