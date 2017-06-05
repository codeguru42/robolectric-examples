package codeguru.fragmenttest;

import android.support.v4.app.Fragment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertNotNull;
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
}
