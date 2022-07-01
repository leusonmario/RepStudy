import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) 0);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 1);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowedMode(1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 0);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (short) -1);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) ' ');
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (-1));
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 100);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass25 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 1);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 2);
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 0);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 0);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass22 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color39);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (-1));
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 1);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '#');
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (byte) 100);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode40);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (short) 0);
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        java.lang.Class<?> wildcardClass18 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) '4');
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (byte) 0);
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) ' ');
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(100, 0);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass16 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 0);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(100, 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 3);
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        java.lang.Class<?> wildcardClass3 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass16 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 0);
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) '#');
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) 'a');
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setWindowedMode(1, 2);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        java.lang.Class<?> wildcardClass17 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 10);
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode41 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode41);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode(100, 100);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        java.lang.Class<?> wildcardClass23 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 3);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (-1));
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 0);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 10);
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) 'a');
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) -1);
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 2);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener37);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color41);
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 3);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 0);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 0);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 1);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 2);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) '4');
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) ' ');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 2);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener38);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '#');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) '#');
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) '#');
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) ' ');
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 0);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 1);
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) '#');
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16622");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16623");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16624");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
    }

    @Test
    public void test16625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16625");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16626");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(100, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
    }

    @Test
    public void test16627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16627");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 1);
    }

    @Test
    public void test16628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16628");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16629");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test16630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16630");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(0, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16631");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 10);
    }

    @Test
    public void test16632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16632");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 0);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
    }

    @Test
    public void test16633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16633");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
    }

    @Test
    public void test16634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16634");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
    }

    @Test
    public void test16635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16635");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
    }

    @Test
    public void test16636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16636");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass22 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test16637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16637");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test16638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16638");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 2);
    }

    @Test
    public void test16639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16639");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test16640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16640");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        java.lang.Class<?> wildcardClass14 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16641");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test16642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16642");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode(1, 2);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
    }

    @Test
    public void test16643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16643");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        java.lang.Class<?> wildcardClass16 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test16644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16644");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) -1);
    }

    @Test
    public void test16645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16645");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test16646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16646");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16647");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
    }

    @Test
    public void test16648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16648");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 10);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16649");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
    }

    @Test
    public void test16650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16650");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        java.lang.Class<?> wildcardClass34 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test16651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16651");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
    }

    @Test
    public void test16652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16652");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test16653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16653");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
    }

    @Test
    public void test16654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16654");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16655");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test16656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16656");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test16657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16657");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (-1));
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 3);
    }

    @Test
    public void test16658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16658");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode40);
    }

    @Test
    public void test16659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16659");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16660");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
    }

    @Test
    public void test16661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16661");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16662");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
    }

    @Test
    public void test16663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16663");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16664");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 2);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 2);
        java.lang.Class<?> wildcardClass23 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test16665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16665");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) -1);
    }

    @Test
    public void test16666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16666");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test16667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16667");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
    }

    @Test
    public void test16668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16668");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 3);
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass19 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16669");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test16670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16670");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
    }

    @Test
    public void test16671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16671");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
    }

    @Test
    public void test16672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16672");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
    }

    @Test
    public void test16673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16673");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16674");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16675");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
    }

    @Test
    public void test16676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16676");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode40);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener45 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener45);
        com.badlogic.gdx.graphics.Color color47 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color47);
    }

    @Test
    public void test16677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16677");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) ' ');
    }

    @Test
    public void test16678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16678");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16679");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 0);
    }

    @Test
    public void test16680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16680");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
    }

    @Test
    public void test16681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16681");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16682");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
    }

    @Test
    public void test16683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16683");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
    }

    @Test
    public void test16684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16684");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        java.lang.Class<?> wildcardClass15 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test16685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16685");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
    }

    @Test
    public void test16686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16686");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '#');
    }

    @Test
    public void test16687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16687");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 2);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 2);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        java.lang.Class<?> wildcardClass30 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test16688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16688");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16689");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
    }

    @Test
    public void test16690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16690");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) 10);
    }

    @Test
    public void test16691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16691");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 10);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test16692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16692");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16693");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
    }

    @Test
    public void test16694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16694");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16695");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 100);
    }

    @Test
    public void test16696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16696");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass35 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test16697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16697");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16698");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) '#');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
    }

    @Test
    public void test16699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16699");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test16700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16700");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16701");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16702");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
    }

    @Test
    public void test16703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16703");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16704");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
    }

    @Test
    public void test16705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16705");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 10);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16706");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16707");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 2);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
    }

    @Test
    public void test16708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16708");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test16709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16709");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 2);
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test16710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16710");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) 100);
    }

    @Test
    public void test16711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16711");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16712");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
    }

    @Test
    public void test16713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16713");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16714");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        java.lang.Class<?> wildcardClass25 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test16715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16715");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16716");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
    }

    @Test
    public void test16717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16717");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16718");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16719");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (-1));
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test16720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16720");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16721");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) '4');
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass30 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test16722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16722");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
    }

    @Test
    public void test16723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16723");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
    }

    @Test
    public void test16724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16724");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
    }

    @Test
    public void test16725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16725");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16726");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16727");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 2);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
        lwjgl3WindowConfiguration0.setWindowedMode(1, 0);
    }

    @Test
    public void test16728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16728");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 2);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener42);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16729");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 2);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
    }

    @Test
    public void test16730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16730");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 2);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
    }

    @Test
    public void test16731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16731");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16732");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
    }

    @Test
    public void test16733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16733");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16734");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
        java.lang.Class<?> wildcardClass38 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test16735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16735");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
    }

    @Test
    public void test16736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16736");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16737");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (-1));
    }

    @Test
    public void test16738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16738");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16739");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (-1));
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
    }

    @Test
    public void test16740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16740");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 2);
    }

    @Test
    public void test16741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16741");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
    }

    @Test
    public void test16742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16742");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
    }

    @Test
    public void test16743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16743");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 1);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test16744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16744");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16745");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) 'a');
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        java.lang.Class<?> wildcardClass25 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test16746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16746");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) 'a');
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
    }

    @Test
    public void test16747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16747");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
    }

    @Test
    public void test16748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16748");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
    }

    @Test
    public void test16749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16749");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
    }

    @Test
    public void test16750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16750");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 2);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (short) -1);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16751");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 10);
    }

    @Test
    public void test16752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16752");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
    }

    @Test
    public void test16753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16753");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
    }

    @Test
    public void test16754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16754");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test16755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16755");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
    }

    @Test
    public void test16756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16756");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(100, 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
    }

    @Test
    public void test16757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16757");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass11 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16758");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode(1, 10);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
    }

    @Test
    public void test16759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16759");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        java.lang.Class<?> wildcardClass35 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test16760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16760");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) '#');
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
    }

    @Test
    public void test16761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16761");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 2);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test16762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16762");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
    }

    @Test
    public void test16763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16763");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16764");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass30 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test16765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16765");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
    }

    @Test
    public void test16766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16766");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (byte) 0);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 100);
    }

    @Test
    public void test16767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16767");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16768");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (-1));
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 2);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
    }

    @Test
    public void test16769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16769");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 100);
    }

    @Test
    public void test16770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16770");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) ' ');
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color43);
    }

    @Test
    public void test16771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16771");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
    }

    @Test
    public void test16772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16772");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
    }

    @Test
    public void test16773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16773");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode(10, 2);
    }

    @Test
    public void test16774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16774");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) 'a');
    }

    @Test
    public void test16775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16775");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 2);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16776");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16777");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 2);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
    }

    @Test
    public void test16778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16778");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener37);
    }

    @Test
    public void test16779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16779");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 2);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test16780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16780");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 3);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
    }

    @Test
    public void test16781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16781");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16782");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test16783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16783");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) 'a');
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16784");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
    }

    @Test
    public void test16785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16785");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 0);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16786");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16787");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 2);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16788");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 100);
    }

    @Test
    public void test16789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16789");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16790");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16791");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16792");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        java.lang.Class<?> wildcardClass35 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test16793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16793");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass20 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test16794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16794");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16795");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test16796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16796");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16797");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test16798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16798");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 0);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16799");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
    }

    @Test
    public void test16800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16800");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
    }

    @Test
    public void test16801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16801");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 3);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16802");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
    }

    @Test
    public void test16803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16803");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(100, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
    }

    @Test
    public void test16804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16804");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test16805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16805");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
    }

    @Test
    public void test16806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16806");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 2);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test16807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16807");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 10);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
    }

    @Test
    public void test16808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16808");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 100);
    }

    @Test
    public void test16809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16809");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16810");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) '4');
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
    }

    @Test
    public void test16811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16811");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16812");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16813");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode41 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode41);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (-1));
        java.lang.Class<?> wildcardClass46 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test16814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16814");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test16815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16815");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 2);
    }

    @Test
    public void test16816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16816");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
    }

    @Test
    public void test16817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16817");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(1, (-1));
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '4');
    }

    @Test
    public void test16818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16818");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16819");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
    }

    @Test
    public void test16820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16820");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) '#');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16821");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 10);
    }

    @Test
    public void test16822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16822");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
    }

    @Test
    public void test16823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16823");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 100);
    }

    @Test
    public void test16824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16824");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test16825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16825");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
    }

    @Test
    public void test16826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16826");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 0);
    }

    @Test
    public void test16827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16827");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(100, 0);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16828");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 1);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
    }

    @Test
    public void test16829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16829");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test16830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16830");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
    }

    @Test
    public void test16831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16831");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, 0);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) 'a');
    }

    @Test
    public void test16832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16832");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
    }

    @Test
    public void test16833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16833");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16834");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16835");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
    }

    @Test
    public void test16836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16836");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color37);
    }

    @Test
    public void test16837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16837");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
    }

    @Test
    public void test16838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16838");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 0);
    }

    @Test
    public void test16839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16839");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 0);
    }

    @Test
    public void test16840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16840");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16841");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 2);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16842");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) ' ');
    }

    @Test
    public void test16843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16843");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 1);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
    }

    @Test
    public void test16844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16844");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) 'a');
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test16845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16845");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
    }

    @Test
    public void test16846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16846");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 0);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
    }

    @Test
    public void test16847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16847");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16848");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 0);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test16849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16849");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) ' ');
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16850");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16851");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (-1));
    }

    @Test
    public void test16852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16852");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16853");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16854");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16855");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
    }

    @Test
    public void test16856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16856");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16857");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16858");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16859");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 10);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
    }

    @Test
    public void test16860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16860");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) '#');
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16861");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16862");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test16863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16863");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 1);
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test16864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16864");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
    }

    @Test
    public void test16865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16865");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 2);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(100, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass34 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test16866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16866");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
    }

    @Test
    public void test16867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16867");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 0);
    }

    @Test
    public void test16868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16868");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 2);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 2);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
    }

    @Test
    public void test16869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16869");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test16870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16870");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16871");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) 10);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16872");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 0);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
    }

    @Test
    public void test16873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16873");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
    }

    @Test
    public void test16874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16874");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
    }

    @Test
    public void test16875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16875");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test16876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16876");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
    }

    @Test
    public void test16877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16877");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16878");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
    }

    @Test
    public void test16879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16879");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
    }

    @Test
    public void test16880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16880");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16881");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (-1));
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16882");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
    }

    @Test
    public void test16883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16883");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16884");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 100);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 0);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16885");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 1);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16886");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
    }

    @Test
    public void test16887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16887");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 1);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16888");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(3, (-1));
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        java.lang.Class<?> wildcardClass38 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test16889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16889");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test16890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16890");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
    }

    @Test
    public void test16891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16891");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 10);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
    }

    @Test
    public void test16892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16892");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition(100, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 1);
    }

    @Test
    public void test16893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16893");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) 'a');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
    }

    @Test
    public void test16894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16894");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        java.lang.Class<?> wildcardClass20 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test16895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16895");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 2);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 3);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 1);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 0);
    }

    @Test
    public void test16896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16896");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 0);
    }

    @Test
    public void test16897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16897");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 3);
    }

    @Test
    public void test16898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16898");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 3);
    }

    @Test
    public void test16899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16899");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 0);
    }

    @Test
    public void test16900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16900");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 3);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) 0);
    }

    @Test
    public void test16901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16901");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 2);
    }

    @Test
    public void test16902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16902");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
    }

    @Test
    public void test16903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16903");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
    }

    @Test
    public void test16904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16904");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
    }

    @Test
    public void test16905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16905");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
    }

    @Test
    public void test16906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16906");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16907");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16908");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (-1));
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (short) 10);
    }

    @Test
    public void test16909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16909");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(0, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        java.lang.Class<?> wildcardClass19 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16910");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 100);
    }

    @Test
    public void test16911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16911");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 0);
    }

    @Test
    public void test16912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16912");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16913");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (-1));
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color39);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, 3);
    }

    @Test
    public void test16914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16914");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) -1);
    }

    @Test
    public void test16915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16915");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
    }

    @Test
    public void test16916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16916");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test16917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16917");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass9 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test16918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16918");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16919");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16920");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test16921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16921");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test16922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16922");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        java.lang.Class<?> wildcardClass30 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test16923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16923");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) 'a');
    }

    @Test
    public void test16924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16924");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
    }

    @Test
    public void test16925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16925");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
    }

    @Test
    public void test16926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16926");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test16927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16927");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (byte) 0);
    }

    @Test
    public void test16928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16928");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16929");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test16930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16930");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
    }

    @Test
    public void test16931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16931");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass27 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test16932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16932");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 2);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener42);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16933");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        java.lang.Class<?> wildcardClass25 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test16934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16934");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 0);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test16935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16935");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (-1));
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
    }

    @Test
    public void test16936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16936");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
    }

    @Test
    public void test16937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16937");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 0);
    }

    @Test
    public void test16938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16938");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16939");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (-1));
    }

    @Test
    public void test16940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16940");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 0);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16941");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 2);
    }

    @Test
    public void test16942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16942");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16943");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16944");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
    }

    @Test
    public void test16945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16945");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (-1));
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 100);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
    }

    @Test
    public void test16946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16946");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) 'a');
    }

    @Test
    public void test16947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16947");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test16948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16948");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) 'a');
    }

    @Test
    public void test16949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16949");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
    }

    @Test
    public void test16950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16950");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 10);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color39);
    }

    @Test
    public void test16951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16951");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 2);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16952");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16953");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16954");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16955");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
    }

    @Test
    public void test16956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16956");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16957");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16958");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16959");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
    }

    @Test
    public void test16960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16960");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 10);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16961");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16962");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 0);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode44 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode44);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16963");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16964");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
    }

    @Test
    public void test16965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16965");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test16966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16966");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16967");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) '#');
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 1);
    }

    @Test
    public void test16968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16968");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test16969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16969");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass39 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test16970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16970");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16971");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 10);
    }

    @Test
    public void test16972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16972");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
        java.lang.Class<?> wildcardClass37 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test16973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16973");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
    }

    @Test
    public void test16974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16974");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16975");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16976");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
    }

    @Test
    public void test16977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16977");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (-1));
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
    }

    @Test
    public void test16978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16978");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (-1));
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16979");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
    }

    @Test
    public void test16980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16980");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 0);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16981");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
    }

    @Test
    public void test16982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16982");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
    }

    @Test
    public void test16983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16983");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
    }

    @Test
    public void test16984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16984");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test16985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16985");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
    }

    @Test
    public void test16986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16986");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 1);
    }

    @Test
    public void test16987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16987");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test16988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16988");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(100, 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) ' ');
        java.lang.Class<?> wildcardClass23 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test16989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16989");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test16990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16990");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) '#');
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test16991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16991");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test16992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16992");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test16993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16993");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test16994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16994");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test16995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16995");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (byte) 100);
    }

    @Test
    public void test16996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16996");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
    }

    @Test
    public void test16997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16997");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test16998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16998");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test16999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16999");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
    }

    @Test
    public void test17000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test17000");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 2);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }
}

