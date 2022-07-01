import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest51 {

    public static boolean debug = false;

    @Test
    public void test25501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25501");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) '4', (int) (short) 0, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (byte) 1);
    }

    @Test
    public void test25502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25502");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (short) 100, (int) 'a', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) 'a');
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test25503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25503");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 100, (int) (short) 10, 1);
    }

    @Test
    public void test25504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25504");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, 10, (int) (byte) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25505");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 0, 3, 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25506");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (-1));
    }

    @Test
    public void test25507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25507");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
    }

    @Test
    public void test25508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25508");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (byte) 0, (int) (short) 10, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 1, (int) (short) 10, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test25509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25509");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25510");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
    }

    @Test
    public void test25511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25511");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 1, 0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 10);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25512");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25513");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 2);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) '4');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
    }

    @Test
    public void test25514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25514");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
    }

    @Test
    public void test25515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25515");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) -1, (int) 'a', 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 0);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 0);
    }

    @Test
    public void test25516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25516");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) ' ');
    }

    @Test
    public void test25517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25517");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (short) 0, 1, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 10, 3, 2);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (short) -1, 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode53 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode53);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25518");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 0, (int) (short) 10, (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 2);
    }

    @Test
    public void test25519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25519");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25520");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
    }

    @Test
    public void test25521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25521");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) '#', (int) (short) 100, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 2, (int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode39);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25522");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 0, (int) (byte) -1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener41);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color49);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 10, (int) (short) 100, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 1);
    }

    @Test
    public void test25523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25523");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (-1), (int) (byte) 1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (byte) 100, 0, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25524");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (byte) 100, 1, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 3, (int) (byte) -1, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode41 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode41);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25525");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 1, (int) ' ', (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
    }

    @Test
    public void test25526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25526");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) 0, 2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) '4', (int) 'a', 100);
    }

    @Test
    public void test25527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25527");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test25528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25528");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 10, 3, 10);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25529");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) ' ', 10, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 1, (int) (short) 10, 2);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (-1), (int) '#', 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener41);
    }

    @Test
    public void test25530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25530");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (byte) 10, (int) ' ', (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 100, (int) (short) -1, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25531");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 3);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
    }

    @Test
    public void test25532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25532");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) 'a', (int) 'a', 0);
    }

    @Test
    public void test25533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25533");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 1, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test25534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25534");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) -1, (int) 'a', 1);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 1, (int) (short) -1, (int) ' ');
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color37);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass48 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test25535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25535");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test25536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25536");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 1, 0, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '4', (int) (short) -1, (int) '#');
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
    }

    @Test
    public void test25537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25537");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (byte) 100, (int) (byte) 1, 3);
    }

    @Test
    public void test25538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25538");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (short) 1, (int) (short) 100, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (-1), (int) (byte) 1, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25539");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
    }

    @Test
    public void test25540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25540");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 0);
    }

    @Test
    public void test25541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25541");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) -1, (int) 'a', (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25542");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, 0, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test25543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25543");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) '#', (int) (short) 100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition(2, 1);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener44 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener44);
    }

    @Test
    public void test25544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25544");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 10, (int) (byte) 100, 2);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) ' ', 3, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode47 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode47);
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color49);
    }

    @Test
    public void test25545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25545");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (short) -1, (int) (short) 10, 1);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25546");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 2);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 2);
    }

    @Test
    public void test25547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25547");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
    }

    @Test
    public void test25548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25548");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) ' ', 10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
    }

    @Test
    public void test25549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25549");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test25550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25550");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 2);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) 10);
    }

    @Test
    public void test25551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25551");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(1, 10);
    }

    @Test
    public void test25552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25552");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 100, 1, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', 0, (int) (short) 0, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25553");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass16 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test25554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25554");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 100, (int) (byte) -1, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 0);
    }

    @Test
    public void test25555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25555");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25556");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
    }

    @Test
    public void test25557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25557");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) '4', (int) (byte) -1, 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 100);
    }

    @Test
    public void test25558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25558");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test25559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25559");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25560");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, (-1), (int) '#', (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test25561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25561");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (byte) 10, (int) ' ', (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 100, (int) (short) -1, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 2);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test25562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25562");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25563");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 2, (int) (short) 10, 10);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25564");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 1);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25565");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (byte) -1);
    }

    @Test
    public void test25566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25566");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 2);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) 0, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test25567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25567");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test25568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25568");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25569");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 0);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
    }

    @Test
    public void test25570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25570");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
    }

    @Test
    public void test25571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25571");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (-1), (int) (byte) 1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25572");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) '#', (-1), (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25573");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25574");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
    }

    @Test
    public void test25575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25575");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25576");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) -1, (int) 'a', 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (-1), (int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener47 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener47);
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color49);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25577");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) 'a', 3, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) '4', (int) ' ', (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25578");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
    }

    @Test
    public void test25579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25579");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) 'a');
    }

    @Test
    public void test25580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25580");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25581");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 1, 1, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 0, 0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 10, 2, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
    }

    @Test
    public void test25582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25582");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) ' ');
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 0);
    }

    @Test
    public void test25583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25583");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (short) 0, (int) (byte) -1, (int) '#');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) 'a', (int) 'a', 3);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25584");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test25585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25585");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 100, (int) (byte) -1, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '#');
    }

    @Test
    public void test25586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25586");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) -1, (int) 'a', 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
    }

    @Test
    public void test25587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25587");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (byte) 1, 0, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (short) -1);
    }

    @Test
    public void test25588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25588");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25589");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) -1, (int) 'a', 1);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, (int) (short) 10, (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener43 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener43);
        com.badlogic.gdx.Graphics.DisplayMode displayMode45 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode45);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener47 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener47);
    }

    @Test
    public void test25590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25590");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) -1, (int) (byte) 100, 1);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (-1), 0, (int) (short) 10);
    }

    @Test
    public void test25591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25591");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 3);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '#');
    }

    @Test
    public void test25592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25592");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(2, (-1));
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (-1));
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test25593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25593");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) -1, 100, (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
    }

    @Test
    public void test25594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25594");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) 10, (int) (byte) 0, (-1));
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25595");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 2);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) ' ');
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
    }

    @Test
    public void test25596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25596");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '#');
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
    }

    @Test
    public void test25597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25597");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 0, (int) (byte) -1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 2);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (-1));
        com.badlogic.gdx.graphics.Color color48 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color48);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25598");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 0, (int) ' ', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) '4', (int) ' ', (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (short) -1, (int) (short) -1, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color38);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) '#');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25599");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 0, (-1), 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 0, (int) (short) 0, (-1));
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (-1), (int) (short) 0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode47 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode47);
    }

    @Test
    public void test25600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25600");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
    }

    @Test
    public void test25601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25601");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
    }

    @Test
    public void test25602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25602");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 1, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test25603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25603");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
    }

    @Test
    public void test25604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25604");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) 'a', (int) (short) 1, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) ' ', (int) (short) -1, 3);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode40);
    }

    @Test
    public void test25605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25605");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 2, (int) (short) 10, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass35 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test25606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25606");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) ' ', (int) 'a', 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 2);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) '4');
    }

    @Test
    public void test25607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25607");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (short) 0, 1, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) 1, 1, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
    }

    @Test
    public void test25608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25608");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (short) -1, (int) (byte) -1, 1);
    }

    @Test
    public void test25609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25609");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 3);
    }

    @Test
    public void test25610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25610");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) '#', (-1), (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (-1), 3, (-1));
        java.lang.Class<?> wildcardClass36 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test25611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25611");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test25612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25612");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) 1, 100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (-1), 0, 100);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(10, 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (short) 1, (-1), 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 0);
    }

    @Test
    public void test25613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25613");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, 2, (int) 'a', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) 'a', 0, (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color39);
    }

    @Test
    public void test25614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25614");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(10, 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25615");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25616");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25617");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 1, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test25618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25618");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) '#', 0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25619");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode41 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode41);
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode43);
    }

    @Test
    public void test25620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25620");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', 0, 100, 2);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) 'a');
    }

    @Test
    public void test25621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25621");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 0, (int) 'a', (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
    }

    @Test
    public void test25622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25622");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) ' ', 10, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (-1));
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 0);
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test25623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25623");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
    }

    @Test
    public void test25624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25624");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
    }

    @Test
    public void test25625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25625");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) -1, (int) 'a', (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 2, (int) (byte) -1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test25626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25626");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 1, (int) (short) -1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) -1, (int) (byte) 10, (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode39);
    }

    @Test
    public void test25627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25627");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
    }

    @Test
    public void test25628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25628");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) -1);
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener46 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener46);
    }

    @Test
    public void test25629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25629");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 10, 0, 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) 'a', 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25630");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (-1), (int) '4', (int) (short) 1);
    }

    @Test
    public void test25631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25631");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) '#', 0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) 10, (int) (short) 10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener38);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener40 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener40);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25632");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '#');
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
    }

    @Test
    public void test25633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25633");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (short) 0, (int) '#', (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (short) 10, 1, 2);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 0, (int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) '#');
    }

    @Test
    public void test25634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25634");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
    }

    @Test
    public void test25635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25635");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 0);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
    }

    @Test
    public void test25636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25636");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test25637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25637");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 10, (int) (byte) 0, 0);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 1);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass37 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test25638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25638");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25639");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) 10, 10, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) 'a', (int) (byte) 100, 100);
    }

    @Test
    public void test25640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25640");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) 'a', 2, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) '#');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (byte) 0, 2, 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 10, (int) (short) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode41 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode41);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 1);
    }

    @Test
    public void test25641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25641");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (byte) -1);
    }

    @Test
    public void test25642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25642");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 1, (int) (byte) -1, 100);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25643");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25644");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25645");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25646");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (byte) 100, (int) (byte) 10, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
    }

    @Test
    public void test25647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25647");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 1, 0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25648");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) 'a', (int) (byte) -1, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 1);
    }

    @Test
    public void test25649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25649");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 0, (int) (short) -1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 3);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25650");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 3);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
    }

    @Test
    public void test25651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25651");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 2);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (-1), (int) ' ', (int) 'a');
    }

    @Test
    public void test25652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25652");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) 'a', 0, 0);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 2);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) '4');
    }

    @Test
    public void test25653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25653");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25654");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) 1, 100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) -1, (int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color39);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 100);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25655");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 1);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test25656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25656");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) (short) 100, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25657");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25658");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 0, (int) ' ', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) '4', (int) ' ', (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (short) -1, (int) (short) -1, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color38);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode40);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (short) 0, (int) ' ', 10);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) 'a');
        com.badlogic.gdx.graphics.Color color58 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color58);
    }

    @Test
    public void test25659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25659");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) 'a', (int) (byte) -1, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) 1, 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25660");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 3, 10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 3);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, 0, 0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test25661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25661");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test25662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25662");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode37);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color39);
    }

    @Test
    public void test25663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25663");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 1);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) '#');
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test25664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25664");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 0, (int) (short) 1, 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 10, 0, 10);
    }

    @Test
    public void test25665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25665");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) -1);
    }

    @Test
    public void test25666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25666");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (byte) 10, (int) ' ', (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 100, (int) (short) -1, (int) '#');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
    }

    @Test
    public void test25667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25667");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, 0, (int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test25668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25668");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25669");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 10, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test25670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25670");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 10);
    }

    @Test
    public void test25671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25671");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) '#', 0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) 10, (int) (short) 10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) 100, 10, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode46 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode46);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass56 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test25672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25672");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 1, 3, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) 100, 0, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) -1, (int) '4', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25673");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (-1), 0, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 1, (int) (byte) 100, (int) 'a');
        com.badlogic.gdx.graphics.Color color42 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color42);
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color44);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25674");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode37);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, 2, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test25675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25675");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (short) -1, (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) 'a', 0, 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass44 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test25676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25676");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25677");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 100, 1, 0);
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test25678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25678");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 10);
    }

    @Test
    public void test25679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25679");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25680");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 10, 0, 1);
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test25681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25681");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25682");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) ' ', 10, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
    }

    @Test
    public void test25683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25683");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 1, 0, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 10, (int) '#', 100);
    }

    @Test
    public void test25684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25684");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) 'a');
    }

    @Test
    public void test25685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25685");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 0, (int) (byte) -1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener41);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode46 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode46);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener48 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener48);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, 2, (int) (byte) 0, 0);
    }

    @Test
    public void test25686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25686");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 2);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
    }

    @Test
    public void test25687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25687");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25688");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
    }

    @Test
    public void test25689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25689");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
    }

    @Test
    public void test25690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25690");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 10);
    }

    @Test
    public void test25691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25691");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25692");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 0);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25693");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 2);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25694");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 1, 0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 100);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (byte) 1, 10, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 0);
    }

    @Test
    public void test25695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25695");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 0, (int) (short) 1, (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
    }

    @Test
    public void test25696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25696");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (byte) 10, (int) (byte) 1, 1);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25697");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (short) -1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 0, (int) 'a', (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) 'a');
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color44);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 0);
    }

    @Test
    public void test25698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25698");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) -1, 0, (int) ' ');
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 0);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
    }

    @Test
    public void test25699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25699");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 10, (-1), 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
    }

    @Test
    public void test25700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25700");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) 'a', (int) (short) 1, (-1));
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test25701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25701");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) 1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) 'a', (int) '4', (int) (byte) 100);
    }

    @Test
    public void test25702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25702");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 2);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 1);
    }

    @Test
    public void test25703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25703");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 100, (int) '#', (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass30 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test25704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25704");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 1, 0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 100);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (byte) 1, (int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (short) 10, (int) (byte) -1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25705");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) 'a', 0, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 10);
    }

    @Test
    public void test25706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25706");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 10, (int) (byte) 0, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (short) 100, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test25707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25707");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) ' ');
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25708");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 100);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
    }

    @Test
    public void test25709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25709");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 2);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 100);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test25710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25710");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 2);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25711");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (byte) 0, (int) (short) 10, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 1, (int) (short) 10, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (short) 100, 100, 10);
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass38 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test25712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25712");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 0, (int) ' ', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) '4', (int) ' ', (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (short) -1, (int) (short) -1, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color38);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode40);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode48 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode48);
        com.badlogic.gdx.graphics.Color color50 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color50);
        com.badlogic.gdx.graphics.Color color52 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color52);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25713");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (byte) 0, (int) (short) 10, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (short) 1, (int) (short) 1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 100, (int) (short) -1, 2);
    }

    @Test
    public void test25714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25714");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 10);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) ' ', (int) (short) 100, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test25715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25715");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test25716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25716");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 0, (int) ' ', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 3);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
    }

    @Test
    public void test25717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25717");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (short) 1, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test25718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25718");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 1);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) 'a', (int) '4', 3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25719");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (-1), (int) (short) 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25720");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 0, 0, (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25721");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 0);
        java.lang.Class<?> wildcardClass25 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test25722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25722");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) -1, (int) 'a', 1);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, 2, 1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 0, (int) (byte) 100, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25723");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 1);
    }

    @Test
    public void test25724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25724");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) -1, (int) 'a', 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (short) 100, (int) (short) 10, 2);
        com.badlogic.gdx.Graphics.DisplayMode displayMode47 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode47);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 10, (int) (byte) -1, 100);
    }

    @Test
    public void test25725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25725");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test25726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25726");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) '4', (int) '#', (-1));
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 10, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test25727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25727");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 100);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
    }

    @Test
    public void test25728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25728");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25729");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 100);
    }

    @Test
    public void test25730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25730");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 0, (int) (short) -1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
    }

    @Test
    public void test25731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25731");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 0, (int) (short) 1, (int) 'a');
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (short) 10, (int) (short) 10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) ' ', (int) (short) 10, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
    }

    @Test
    public void test25732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25732");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25733");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 1);
    }

    @Test
    public void test25734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25734");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 0);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) '#');
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test25735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25735");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (byte) 1, (int) (byte) 100, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25736");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25737");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (byte) 0, (int) (short) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) 'a', 2, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25738");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) '4', (int) (byte) -1, 1);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode(2, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) 'a', (int) (byte) 100, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 100);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 2);
        java.lang.Class<?> wildcardClass40 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test25739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25739");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) '#', (int) (byte) 10, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (byte) 0, 2, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) '#', 2, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (-1), (int) (short) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25740");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) -1);
    }

    @Test
    public void test25741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25741");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener41);
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode43);
        java.lang.Class<?> wildcardClass45 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test25742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25742");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 0, (-1), (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25743");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (byte) 100, 1, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode40);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25744");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 3, 100, 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (-1), (int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (byte) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25745");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 100, (int) (byte) 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
    }

    @Test
    public void test25746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25746");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (short) 100, 100, 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25747");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
    }

    @Test
    public void test25748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25748");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
    }

    @Test
    public void test25749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25749");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) '#', (int) (short) 100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) -1, (int) '4', (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) 100, (int) 'a', 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color43);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener47 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener47);
    }

    @Test
    public void test25750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25750");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25751");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25752");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (-1), (int) 'a', (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25753");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
    }

    @Test
    public void test25754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25754");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test25755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25755");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) 0, (-1), 100);
    }

    @Test
    public void test25756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25756");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) -1, (int) (short) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) 'a', (int) (short) 0, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
    }

    @Test
    public void test25757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25757");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) 0, 0, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) '#', (int) '4', 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test25758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25758");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) 'a', 2, 0);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
    }

    @Test
    public void test25759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25759");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
    }

    @Test
    public void test25760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25760");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25761");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25762");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, 1, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test25763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25763");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) -1, (int) 'a', 1);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass37 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test25764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25764");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) -1, 0, (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test25765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25765");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 100, 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25766");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) 'a', (int) (short) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) 1);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test25767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25767");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 2);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25768");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 1, (int) 'a', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) 'a', 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 100, (int) (short) 100, 10);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25769");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (byte) 1, (int) (short) 0, 100);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25770");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 0, (int) (byte) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
    }

    @Test
    public void test25771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25771");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) ' ', 10, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
    }

    @Test
    public void test25772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25772");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, 3, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test25773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25773");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 1, (int) (short) -1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) -1, (int) (byte) 10, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color41);
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode43);
    }

    @Test
    public void test25774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25774");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25775");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) 0, 0, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 0, 100, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (byte) -1, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test25776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25776");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (short) 10, 10, 3);
    }

    @Test
    public void test25777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25777");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 1, 0, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 0, (-1), (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 100);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
    }

    @Test
    public void test25778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25778");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) '#', (-1), (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color41);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25779");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (byte) -1, (int) '4', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (short) 1);
        java.lang.Class<?> wildcardClass38 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test25780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25780");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25781");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 2);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, (int) (short) 0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '4');
    }

    @Test
    public void test25782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25782");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 100);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25783");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (byte) 100, 100, (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25784");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (short) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) -1);
        java.lang.Class<?> wildcardClass35 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test25785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25785");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 10, (int) (byte) 100, 2);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener42);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25786");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (short) -1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 0, (int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color38);
        com.badlogic.gdx.graphics.Color color40 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color40);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener42);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, 2);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 0);
    }

    @Test
    public void test25787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25787");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) -1, 100, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 1);
    }

    @Test
    public void test25788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25788");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 0, (int) ' ', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) '4', (int) ' ', (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (short) -1, (int) (short) -1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, 3, (int) (short) -1, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color43);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener48 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener48);
    }

    @Test
    public void test25789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25789");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) 0, 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 0, 2, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test25790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25790");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
    }

    @Test
    public void test25791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25791");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
    }

    @Test
    public void test25792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25792");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (byte) -1, (int) '4', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
    }

    @Test
    public void test25793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25793");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass41 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test25794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25794");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 2);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
    }

    @Test
    public void test25795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25795");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) ' ', (int) 'a', 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25796");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) -1, (int) 'a', 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) 0, 2, 100);
    }

    @Test
    public void test25797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25797");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, 10, (int) ' ', (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode40);
    }

    @Test
    public void test25798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25798");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25799");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25800");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 100);
    }

    @Test
    public void test25801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25801");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 3, (int) (byte) 0, 2);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25802");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (byte) 100, 10, 100);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 3, 1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25803");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 1, (int) (short) 0, 1);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25804");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) '#', 0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) 10, (int) (short) 10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 2);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) 0, (int) '#', (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', 0, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test25805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25805");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 1, (int) (byte) 0, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (short) -1, (int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass35 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test25806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25806");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass23 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test25807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25807");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 0);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
    }

    @Test
    public void test25808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25808");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) '#');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 0, (int) (byte) 100, 100);
        java.lang.Class<?> wildcardClass20 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test25809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25809");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 10, 1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
    }

    @Test
    public void test25810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25810");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 2);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 2, (-1), (int) (short) 100);
    }

    @Test
    public void test25811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25811");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
    }

    @Test
    public void test25812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25812");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test25813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25813");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 0);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (-1), (int) (byte) 100, (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener40 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener40);
    }

    @Test
    public void test25814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25814");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 10, (-1), 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) -1, (int) (byte) 100, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 2);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass41 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test25815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25815");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
    }

    @Test
    public void test25816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25816");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25817");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 1, (int) 'a', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(1, 100);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25818");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 1);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test25819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25819");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (short) 100, (-1), (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode46 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode46);
        com.badlogic.gdx.Graphics.DisplayMode displayMode48 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode48);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener50 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener50);
        com.badlogic.gdx.Graphics.DisplayMode displayMode52 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode52);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) ' ');
    }

    @Test
    public void test25820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25820");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) '#', (-1), (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener40 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener40);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener42);
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color44);
    }

    @Test
    public void test25821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25821");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test25822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25822");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) 'a', 2, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) '#');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (byte) 0, 2, 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (byte) 10, (int) (byte) 10, 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (byte) 1, 100, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (short) 1, 1, 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener50 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener50);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25823");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 2, (int) (short) 10, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25824");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 1, 0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
    }

    @Test
    public void test25825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25825");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 0, (int) (short) 100, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
    }

    @Test
    public void test25826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25826");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) 'a', (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test25827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25827");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, 2, (int) (short) 10, 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
    }

    @Test
    public void test25828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25828");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 10);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (byte) 10);
    }

    @Test
    public void test25829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25829");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) -1, (int) (byte) 0, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
    }

    @Test
    public void test25830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25830");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color37);
    }

    @Test
    public void test25831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25831");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25832");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (-1));
        java.lang.Class<?> wildcardClass12 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test25833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25833");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 1, 100, (int) '#');
    }

    @Test
    public void test25834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25834");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 0, (int) ' ', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) '4', (int) ' ', (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (short) -1, (int) (short) -1, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color38);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener43 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener43);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 0);
    }

    @Test
    public void test25835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25835");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (short) 10, 100, (-1));
    }

    @Test
    public void test25836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25836");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 2);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 3, (int) (short) 1, (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 100);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25837");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) 'a', 2, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 1);
    }

    @Test
    public void test25838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25838");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (-1), (int) (short) -1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25839");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 0, (int) (short) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
    }

    @Test
    public void test25840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25840");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 10);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25841");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 1, (int) (short) -1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test25842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25842");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) '#', (-1), (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color41);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25843");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 100, (int) '4', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
    }

    @Test
    public void test25844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25844");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 0, (int) (short) 100, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 2, 2, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) '4', 1, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode40);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener42);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (-1));
    }

    @Test
    public void test25845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25845");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test25846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25846");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) '#', (-1), (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, (int) 'a', 0);
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color41);
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color43);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (byte) 0, (int) (short) 10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25847");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 3);
    }

    @Test
    public void test25848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25848");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 100);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25849");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 2);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 0);
    }

    @Test
    public void test25850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25850");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass20 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test25851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25851");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 1, (int) (short) -1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 2);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 1, (int) 'a', (-1));
    }

    @Test
    public void test25852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25852");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (byte) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) 0, (int) (byte) 100, (-1));
    }

    @Test
    public void test25853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25853");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25854");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 100, (int) 'a', (int) 'a');
    }

    @Test
    public void test25855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25855");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (byte) 0, (int) (short) 10, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (byte) 0, 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test25856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25856");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
    }

    @Test
    public void test25857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25857");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (byte) 100, 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass34 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test25858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25858");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (byte) 1, (int) (short) 100, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25859");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
    }

    @Test
    public void test25860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25860");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 0, (int) (short) 100, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (-1));
    }

    @Test
    public void test25861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25861");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) -1, (int) 'a', (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 2, (int) (byte) -1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) (byte) 1, (-1), (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test25862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25862");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 0, 3, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25863");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', 100, (int) (short) 10, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (byte) 10, (int) (short) 10, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color39);
    }

    @Test
    public void test25864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25864");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25865");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) 1, 100, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener38);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) '#', (int) (byte) 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (byte) 10, 1, (int) ' ');
        java.lang.Class<?> wildcardClass50 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test25866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25866");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(10, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
    }

    @Test
    public void test25867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25867");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (byte) 100, 10, 100);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', 2, 3, (int) (short) 1);
    }

    @Test
    public void test25868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25868");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test25869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25869");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (short) 100, (int) '#', (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25870");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 100, (int) (byte) 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 100);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 10);
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test25871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25871");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test25872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25872");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) 10, (int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (short) 100);
    }

    @Test
    public void test25873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25873");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) -1, (int) 'a', 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode43);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25874");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 2);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener41);
    }

    @Test
    public void test25875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25875");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (short) 0, (int) '#', (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25876");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) 10, (int) (short) -1, 100);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25877");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (byte) -1, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test25878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25878");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 1, (int) (byte) 10, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) 'a', 0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
    }

    @Test
    public void test25879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25879");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 10, 1, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25880");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 0, (-1), (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) '#', (-1), 100);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener40 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener40);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener45 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener45);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25881");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        java.lang.Class<?> wildcardClass22 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test25882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25882");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) ' ', (int) '#', (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (short) 10, 1, (int) (short) 1);
    }

    @Test
    public void test25883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25883");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '#');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', 10, (int) (byte) 1, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
    }

    @Test
    public void test25884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25884");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (short) -1, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
        com.badlogic.gdx.graphics.Color color40 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color40);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 0);
    }

    @Test
    public void test25885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25885");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) -1, (int) 'a', (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 2, (int) (byte) -1, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25886");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 1, 1, 3);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25887");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) '#', (int) (short) 100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) -1, (int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color38);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener42);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 2);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 2);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25888");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
    }

    @Test
    public void test25889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25889");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 10);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25890");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
    }

    @Test
    public void test25891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25891");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
    }

    @Test
    public void test25892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25892");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test25893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25893");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) '4');
    }

    @Test
    public void test25894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25894");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) ' ', (int) 'a', 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 2);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25895");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 2);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition(100, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25896");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) 1, 100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (short) 1, 0, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 1);
        com.badlogic.gdx.graphics.Color color45 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color45);
        java.lang.Class<?> wildcardClass47 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test25897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25897");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass36 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test25898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25898");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 0, (-1), (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode37);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode46 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode46);
        com.badlogic.gdx.Graphics.DisplayMode displayMode48 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode48);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
    }

    @Test
    public void test25899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25899");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) ' ', 10, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) '#', (int) (short) 10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) 'a', (int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 2);
        com.badlogic.gdx.Graphics.DisplayMode displayMode45 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode45);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test25900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25900");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
    }

    @Test
    public void test25901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25901");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 0, 100, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition(3, (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
    }

    @Test
    public void test25902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25902");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 100);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', 1, (int) (byte) 10, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener38);
    }

    @Test
    public void test25903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25903");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) 0, (-1), 2);
    }

    @Test
    public void test25904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25904");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 0, (int) ' ', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) '4', (int) ' ', (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (short) -1, (int) (short) -1, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color38);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color49);
    }

    @Test
    public void test25905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25905");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) -1, (int) 'a', (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 2, (int) (byte) -1, (int) ' ');
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) 0);
    }

    @Test
    public void test25906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25906");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color37);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) -1, (int) (byte) 0, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test25907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25907");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', 10, 100, 2);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '4', (int) (short) 10, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test25908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25908");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (byte) 0, (int) (short) -1, (int) '#');
    }

    @Test
    public void test25909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25909");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) 'a', (int) (short) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
    }

    @Test
    public void test25910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25910");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (-1));
    }

    @Test
    public void test25911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25911");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (short) 1, (int) (byte) 1, 3);
    }

    @Test
    public void test25912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25912");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 2, (int) (short) 10, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 3);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (-1), (int) ' ', (int) (short) 1);
    }

    @Test
    public void test25913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25913");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) -1, (int) 'a', 1);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, 2, 1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode40);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (short) 0);
    }

    @Test
    public void test25914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25914");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 100, 0, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (short) -1, (int) (short) 0, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 1, (int) '4', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener46 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener46);
    }

    @Test
    public void test25915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25915");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 100, 2, 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25916");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 0, (int) (byte) -1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 1, (int) (byte) -1, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode48 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode48);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) 100, 1, (int) '#');
    }

    @Test
    public void test25917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25917");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (short) -1, 100, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
    }

    @Test
    public void test25918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25918");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 0, (int) ' ', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25919");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
    }

    @Test
    public void test25920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25920");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 1, (int) (short) -1, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 100, 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
    }

    @Test
    public void test25921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25921");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25922");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 100, (int) (byte) 100, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
    }

    @Test
    public void test25923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25923");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) '#', (-1), (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 10);
    }

    @Test
    public void test25924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25924");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) '#', (int) (short) 100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) -1, (int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 100, 0, (-1));
        com.badlogic.gdx.graphics.Color color46 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color46);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener48 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener48);
    }

    @Test
    public void test25925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25925");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) '4');
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25926");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 0, (int) (short) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) -1, (int) (byte) -1, (-1));
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, (-1), (int) (byte) -1, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener46 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener46);
    }

    @Test
    public void test25927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25927");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 3, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test25928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25928");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) ' ', 10, 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (-1));
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test25929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25929");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) '#');
    }

    @Test
    public void test25930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25930");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
    }

    @Test
    public void test25931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25931");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 10, (int) (byte) 100, 2);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color42 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color42);
        com.badlogic.gdx.Graphics.DisplayMode displayMode44 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener46 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener46);
        java.lang.Class<?> wildcardClass48 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test25932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25932");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
    }

    @Test
    public void test25933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25933");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 1, 0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25934");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (-1));
    }

    @Test
    public void test25935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25935");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, 0, (int) '4', 1);
    }

    @Test
    public void test25936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25936");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) ' ', 3, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, 100, (int) (byte) 1, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
        lwjgl3WindowConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass42 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test25937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25937");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) 100, (int) (byte) 0, 3);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
    }

    @Test
    public void test25938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25938");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (-1));
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) '4');
    }

    @Test
    public void test25939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25939");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25940");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) ' ', 10, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
    }

    @Test
    public void test25941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25941");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 1, (int) (short) 0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 1, (int) '4', (-1));
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test25942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25942");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 10, (int) (byte) 100, 2);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener42);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25943");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) 'a', 2, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
    }

    @Test
    public void test25944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25944");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25945");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test25946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25946");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (byte) 10, (int) (short) 1, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test25947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25947");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 100);
    }

    @Test
    public void test25948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25948");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (byte) -1, (int) '4', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25949");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 0);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) '#', (int) (byte) -1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25950");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 100);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 3);
    }

    @Test
    public void test25951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25951");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 3, 10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25952");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition(3, 0);
    }

    @Test
    public void test25953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25953");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 0, (int) ' ', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) '4', (int) ' ', (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (short) -1, (int) (short) -1, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color38);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode44 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener46 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener46);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25954");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) '#', (-1), (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, (int) 'a', 0);
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color41);
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color43);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (byte) 0, (int) (short) 10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 2);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25955");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 10);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 2);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener43 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener43);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25956");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) '4', (int) (short) 10, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 1);
    }

    @Test
    public void test25957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25957");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 1, (int) (short) 10, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 100);
    }

    @Test
    public void test25958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25958");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test25959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25959");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 2);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test25960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25960");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
    }

    @Test
    public void test25961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25961");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) 'a', 2, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (byte) 100);
    }

    @Test
    public void test25962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25962");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test25963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25963");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 0, (int) (short) 10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) 'a');
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25964");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) 100, (int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25965");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) 10, (int) (short) 1, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test25966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25966");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
    }

    @Test
    public void test25967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25967");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 2, 1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (short) 0, (int) (short) 1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 0, 100, (int) (short) -1);
    }

    @Test
    public void test25968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25968");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) -1, (int) 'a', 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) 1);
    }

    @Test
    public void test25969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25969");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (byte) 10, 0, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (byte) 1, (int) (byte) 10, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25970");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 0, (int) (short) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test25971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25971");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25972");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) ' ', 10, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (short) 100, (int) (byte) 1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25973");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 2, (int) (short) -1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) '#');
    }

    @Test
    public void test25974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25974");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 100, (int) (byte) 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) '#', (int) ' ', (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 10, 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode(1, 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) '4', 3, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener45 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener45);
    }

    @Test
    public void test25975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25975");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 3, 0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25976");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) '4', (int) '#', (-1));
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (short) 10);
    }

    @Test
    public void test25977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25977");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 0, (int) (short) 1, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test25978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25978");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test25979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25979");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) ' ');
    }

    @Test
    public void test25980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25980");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) 'a', 2, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass25 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test25981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25981");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 0, 3, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 10);
    }

    @Test
    public void test25982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25982");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
    }

    @Test
    public void test25983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25983");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) 'a', 2, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) '#');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (byte) 0, 2, 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (byte) 10, (int) (byte) 10, 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (byte) 1, 100, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (short) 1, 1, 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color52 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color52);
    }

    @Test
    public void test25984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25984");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (-1));
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (short) 10);
    }

    @Test
    public void test25985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25985");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 0, (int) (byte) -1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode43);
        com.badlogic.gdx.Graphics.DisplayMode displayMode45 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode45);
        com.badlogic.gdx.Graphics.DisplayMode displayMode47 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode47);
        com.badlogic.gdx.Graphics.DisplayMode displayMode49 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode49);
    }

    @Test
    public void test25986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25986");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) -1, (int) 'a', 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 100);
    }

    @Test
    public void test25987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25987");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 0, (int) (short) 10, (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) '4');
    }

    @Test
    public void test25988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25988");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (byte) 0, (int) (short) 10, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 2, 10, 2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 1, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test25989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25989");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 0, (int) (byte) -1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode44 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode44);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (short) 0, (int) 'a', (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 0, (int) 'a', (int) (short) 1);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode58 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode58);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass62 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test25990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25990");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) 10, (int) (byte) 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
    }

    @Test
    public void test25991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25991");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test25992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25992");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (byte) 0, (int) (short) 10, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 0, (int) (byte) -1, 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 2);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 10, (int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test25993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25993");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test25994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25994");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 0, (int) ' ', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 10);
    }

    @Test
    public void test25995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25995");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, 1, 3, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition(100, 10);
    }

    @Test
    public void test25996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25996");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test25997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25997");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) ' ', 10, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (short) 100, (int) (byte) 1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
    }

    @Test
    public void test25998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25998");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '4', (int) '#', (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (byte) 1, (-1), (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 1, (int) (byte) -1, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener46 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener46);
    }

    @Test
    public void test25999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25999");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) 1, 100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode40);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test26000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test26000");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (short) 1, 1, 0);
    }
}

