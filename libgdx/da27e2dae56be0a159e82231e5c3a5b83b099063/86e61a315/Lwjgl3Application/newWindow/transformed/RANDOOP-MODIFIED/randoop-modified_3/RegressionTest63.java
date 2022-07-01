import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest63 {

    public static boolean debug = false;

    @Test
    public void test31501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31501");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (-1), 0, 0);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', 0, (int) (byte) 100, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) 1, 10, (int) '4');
    }

    @Test
    public void test31502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31502");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '#', (int) '#', 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) 10, 1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 1, 2, (int) '#');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) -1, 3, 2);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, 0, (int) 'a', (-1));
    }

    @Test
    public void test31503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31503");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
    }

    @Test
    public void test31504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31504");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (short) -1, (int) '4', 1);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
    }

    @Test
    public void test31505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31505");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 100, (int) (byte) 100, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) 'a', 3, 2);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (short) -1, (int) (byte) -1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener41);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (-1));
    }

    @Test
    public void test31506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31506");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 0, 2, 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) 1, (int) (short) 10, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31507");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) (byte) 100, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test31508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31508");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, 100, (int) (short) 100, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
    }

    @Test
    public void test31509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31509");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '#', (int) '#', 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 2);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener42);
    }

    @Test
    public void test31510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31510");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 3);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (short) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
    }

    @Test
    public void test31511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31511");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 100, (int) (byte) 100, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) ' ');
    }

    @Test
    public void test31512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31512");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test31513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31513");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (short) 0, (int) '4', (-1));
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test31514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31514");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 0, 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
    }

    @Test
    public void test31515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31515");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 1, (int) '#', (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
    }

    @Test
    public void test31516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31516");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (short) 0, (int) (short) 1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', 0, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test31517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31517");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 100, (int) 'a', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, 0);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) (byte) 100, (int) ' ', 2);
    }

    @Test
    public void test31518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31518");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) '4', 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (short) -1, (int) (byte) 1, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) '#', 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) '#', 2, (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test31519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31519");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
    }

    @Test
    public void test31520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31520");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) (byte) 100, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 3, 2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (short) 0, (int) (short) 1, 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 0, 3, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (-1), 10, (int) (byte) -1);
    }

    @Test
    public void test31521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31521");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (short) -1, 0, 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
    }

    @Test
    public void test31522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31522");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 0, 1, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, 2, (int) (short) -1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', 100, 2, 100);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color42 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color42);
    }

    @Test
    public void test31523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31523");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 100, 3, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) '4', (int) (short) 100, 2);
    }

    @Test
    public void test31524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31524");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 2, 1, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (short) 0, (-1), 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (-1));
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test31525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31525");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) 100);
    }

    @Test
    public void test31526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31526");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test31527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31527");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 100, (int) (byte) 10, 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 10);
    }

    @Test
    public void test31528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31528");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) -1, 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (byte) 0, 0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) 10, (int) (byte) -1, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
    }

    @Test
    public void test31529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31529");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 100, (int) 'a', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) '#', (int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition(0, 2);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 10);
    }

    @Test
    public void test31530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31530");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 100, 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass19 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test31531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31531");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (-1));
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31532");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) '#');
    }

    @Test
    public void test31533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31533");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (short) -1, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test31534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31534");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 100, (int) (byte) 100, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 0);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 3);
    }

    @Test
    public void test31535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31535");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) ' ', (int) (byte) 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test31536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31536");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 100);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test31537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31537");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 100, (int) (short) 10, 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test31538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31538");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 100, 100, 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (short) 100, 100, 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 0, 3, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31539");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) ' ', 10, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (-1));
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test31540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31540");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test31541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31541");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        java.lang.Class<?> wildcardClass9 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test31542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31542");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) '#', (int) (byte) -1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
    }

    @Test
    public void test31543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31543");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (-1), (-1), (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test31544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31544");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, 10, (-1), 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 0, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test31545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31545");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31546");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 3);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', 0, (-1), (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31547");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
    }

    @Test
    public void test31548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31548");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) -1, (-1), 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (short) 10, (int) (short) 0, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color41);
    }

    @Test
    public void test31549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31549");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31550");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) '#', (int) (byte) -1, 2);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (byte) 1);
    }

    @Test
    public void test31551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31551");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 1, 0, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
    }

    @Test
    public void test31552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31552");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 1, 0, 0);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
    }

    @Test
    public void test31553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31553");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) (byte) 100, 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) 0, (int) '#', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (byte) 100, (int) (short) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode40);
        com.badlogic.gdx.graphics.Color color42 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color42);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener44 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener44);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) ' ', (int) 'a', (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode51 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode51);
    }

    @Test
    public void test31554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31554");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test31555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31555");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 3);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (-1));
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 0, 10, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 2, 100, (int) (byte) 1);
    }

    @Test
    public void test31556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31556");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        java.lang.Class<?> wildcardClass17 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test31557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31557");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 1, 100, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
    }

    @Test
    public void test31558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31558");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (short) -1, (int) '4', 1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test31559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31559");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 100, 0, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
    }

    @Test
    public void test31560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31560");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31561");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) (byte) 100, 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) 'a');
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (byte) 0);
    }

    @Test
    public void test31562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31562");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) 0, (-1), (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) '#', (-1), (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31563");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 0, (int) (byte) 100, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 100, (int) (byte) 1, 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test31564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31564");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) 10, (int) '#', 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 100);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener37);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) ' ');
    }

    @Test
    public void test31565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31565");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition(0, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 1, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass36 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test31566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31566");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) '#', (int) (byte) -1, 2);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        java.lang.Class<?> wildcardClass35 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test31567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31567");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 100, (int) (byte) 100, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 10, 100, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) 10, 2, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 0, 3, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) ' ');
    }

    @Test
    public void test31568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31568");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 100, (int) ' ', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 0);
    }

    @Test
    public void test31569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31569");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (byte) 100, (int) (short) 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31570");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) '4', 100, 0);
    }

    @Test
    public void test31571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31571");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) -1, (int) (byte) 1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (byte) -1, (int) (byte) 1, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color52 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color52);
        java.lang.Class<?> wildcardClass54 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test31572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31572");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (-1), (int) (byte) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, (int) (short) 1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test31573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31573");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(2, 2);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
    }

    @Test
    public void test31574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31574");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        java.lang.Class<?> wildcardClass13 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test31575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31575");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31576");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) -1, (int) (short) 10, 0);
    }

    @Test
    public void test31577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31577");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 3);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) -1, (int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31578");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 0, 1, 3);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) 1, 10, (-1));
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 1, (int) '#', (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31579");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (short) 10, (int) 'a', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test31580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31580");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) ' ', (int) (byte) 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) '#', (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test31581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31581");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test31582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31582");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31583");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) 1, (-1), 0);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test31584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31584");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 100, (int) 'a', 1);
    }

    @Test
    public void test31585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31585");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test31586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31586");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31587");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31588");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 100, (int) ' ', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31589");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', 1, 3, (int) ' ');
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
    }

    @Test
    public void test31590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31590");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 100, 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) '#', (int) '#', 3);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 2, 2, 0);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31591");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (byte) 1, (int) 'a', 0);
    }

    @Test
    public void test31592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31592");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test31593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31593");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 100, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 1, 0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (short) 1, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test31594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31594");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test31595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31595");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (byte) 1, (int) (byte) 1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', 0, (int) (short) 1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) '#');
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test31596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31596");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) (byte) 100, 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
    }

    @Test
    public void test31597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31597");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) 1, (-1), 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
    }

    @Test
    public void test31598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31598");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test31599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31599");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, 3, 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test31600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31600");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (short) 0, (int) (short) 1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (byte) 0, (int) 'a', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) 10, 10, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 2, 10, 3);
    }

    @Test
    public void test31601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31601");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) ' ', (int) (byte) 100, (int) '#');
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test31602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31602");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (-1));
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 0);
    }

    @Test
    public void test31603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31603");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition(0, 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '#', (int) (short) 1, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode(2, 10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31604");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(0, (-1));
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
    }

    @Test
    public void test31605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31605");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) '#');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (-1));
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) -1);
    }

    @Test
    public void test31606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31606");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) '4', (int) (short) 1, 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test31607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31607");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (-1), (int) (byte) 100, 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (short) 0, (int) (byte) 1, 2);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test31608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31608");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass25 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test31609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31609");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test31610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31610");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test31611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31611");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test31612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31612");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 3);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31613");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31614");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', 0, (int) (byte) -1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (short) 100, 3, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (-1), 1, 2);
    }

    @Test
    public void test31615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31615");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) 1, (-1), 0);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) 0, 10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31616");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31617");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) '4', (int) (byte) 10, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (short) 1, (int) (short) 1, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
    }

    @Test
    public void test31618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31618");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, 10, (-1), 0);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) -1, (int) ' ', (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
    }

    @Test
    public void test31619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31619");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (short) -1, 2, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test31620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31620");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 2, (int) (byte) 0, 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
    }

    @Test
    public void test31621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31621");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test31622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31622");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) (byte) 100, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 3, 2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test31623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31623");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
    }

    @Test
    public void test31624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31624");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test31625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31625");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 3);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
    }

    @Test
    public void test31626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31626");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test31627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31627");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 3);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 10);
    }

    @Test
    public void test31628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31628");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (-1), (-1), (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass20 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test31629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31629");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) (byte) 100, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 3, 2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test31630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31630");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31631");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) '4');
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test31632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31632");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 0, (int) (byte) 100, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 1);
    }

    @Test
    public void test31633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31633");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (byte) 100, (-1), (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test31634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31634");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 2);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (-1), (int) 'a', (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (short) 0, (int) (short) 0, 3);
    }

    @Test
    public void test31635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31635");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 10, 3, 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', 0, (int) (byte) 10, (int) 'a');
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) ' ');
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color44);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) ' ', (int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31636");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 0, (int) (short) 10, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) '4', (int) '4', (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test31637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31637");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test31638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31638");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (-1), 10, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) '4', (int) (short) -1, 0);
    }

    @Test
    public void test31639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31639");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) 'a', (int) (byte) 100, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) ' ', (int) '#', (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) '4', (int) (short) 1, 1);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) '#', (int) (byte) -1, 1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener38);
        com.badlogic.gdx.graphics.Color color40 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color40);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 0);
    }

    @Test
    public void test31640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31640");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 3, 1, 0);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 1);
    }

    @Test
    public void test31641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31641");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 100, (int) (short) -1, 3);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test31642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31642");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) '4', (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass25 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test31643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31643");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 100, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (short) 0, 3, (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
    }

    @Test
    public void test31644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31644");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) (byte) -1, (int) '#', (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
    }

    @Test
    public void test31645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31645");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test31646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31646");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) 0, (int) (byte) 1, 2);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) ' ', (int) ' ', 100);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 0, (int) (byte) 1, 0);
    }

    @Test
    public void test31647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31647");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 1);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener37);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color41);
    }

    @Test
    public void test31648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31648");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) '#', (int) (short) 0, (-1));
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test31649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31649");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (-1), (int) '4', 0);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 10, (-1), 2);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test31650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31650");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 100, (int) (byte) 100, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31651");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
    }

    @Test
    public void test31652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31652");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31653");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) (byte) 100, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 3, 2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) -1, (int) (byte) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener47 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener47);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color51 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color51);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31654");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) '4', (-1), (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31655");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 100, (int) (byte) 100, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 0);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 3);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31656");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color6);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 0);
    }

    @Test
    public void test31657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31657");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) ' ', (int) '#', (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 10, (int) '#', (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
    }

    @Test
    public void test31658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31658");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 3);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 1, 2, (int) (byte) 0);
    }

    @Test
    public void test31659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31659");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (byte) 1, (int) 'a', (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 1, 10, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode48 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode48);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test31660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31660");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '#', (int) '#', 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 1, (int) ' ', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
    }

    @Test
    public void test31661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31661");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) ' ', (int) (byte) 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener40 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener40);
    }

    @Test
    public void test31662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31662");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31663");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (short) -1, (-1), (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 0);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
    }

    @Test
    public void test31664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31664");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) 100, (int) (byte) 100, 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 0, (int) 'a', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test31665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31665");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) '4', 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (short) -1, (int) (byte) 1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 0);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) -1);
    }

    @Test
    public void test31666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31666");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 1);
    }

    @Test
    public void test31667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31667");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 100, (int) 'a', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (-1), (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test31668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31668");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) 'a', (int) (byte) 100, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) ' ', (int) '#', (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31669");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) '#', (int) (short) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test31670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31670");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 100, (int) (short) -1, 3);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (-1), (int) (byte) 100, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31671");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31672");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test31673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31673");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 10, 3, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 0);
    }

    @Test
    public void test31674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31674");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test31675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31675");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 0, 1, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31676");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 2, (int) (byte) 10, 2);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 2);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color44);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test31677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31677");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 2);
    }

    @Test
    public void test31678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31678");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 100, (int) ' ', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (short) -1, (int) '4', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (short) -1, (int) (short) 10, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) 1);
    }

    @Test
    public void test31679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31679");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
    }

    @Test
    public void test31680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31680");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 2, (int) (byte) -1, 3);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 1, 2, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener42);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) ' ', 100, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode49 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode49);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) '#', (int) '#', (int) (short) -1);
    }

    @Test
    public void test31681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31681");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '#', (int) '#', 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) 0);
    }

    @Test
    public void test31682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31682");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31683");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 1);
    }

    @Test
    public void test31684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31684");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, 2, (int) (short) 1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode(3, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (-1));
    }

    @Test
    public void test31685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31685");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) (byte) 100, 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 100, (int) (byte) 100, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color38);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode42 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode42);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31686");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 100, (int) 'a', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
    }

    @Test
    public void test31687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31687");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '#', (int) '#', 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 10);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition(100, 100);
    }

    @Test
    public void test31688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31688");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
    }

    @Test
    public void test31689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31689");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test31690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31690");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(2, 2);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (-1));
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test31691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31691");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) (short) 1, (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test31692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31692");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 100, (int) (byte) 100, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 0);
    }

    @Test
    public void test31693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31693");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) '#');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31694");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 100, (int) ' ', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 0, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener42);
    }

    @Test
    public void test31695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31695");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test31696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31696");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 1);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 2);
    }

    @Test
    public void test31697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31697");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31698");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 0);
    }

    @Test
    public void test31699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31699");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 2, (int) (byte) 1, 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test31700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31700");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 100, (int) ' ', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test31701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31701");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass20 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test31702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31702");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) '4');
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 2, 0, 1);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test31703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31703");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 100, (int) (byte) 100, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 2);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 10, 3, 1);
    }

    @Test
    public void test31704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31704");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) 'a');
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, 1, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test31705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31705");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(0, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 10, (int) ' ', 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener41);
        java.lang.Class<?> wildcardClass43 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test31706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31706");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31707");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test31708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31708");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 10, 100, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 0, 10, (int) (short) 100);
    }

    @Test
    public void test31709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31709");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) '4', 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31710");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color6);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
    }

    @Test
    public void test31711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31711");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '#', (int) '#', 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test31712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31712");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) 'a', (int) (short) 1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        java.lang.Class<?> wildcardClass18 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test31713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31713");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test31714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31714");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) ' ', 10, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (-1));
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test31715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31715");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 100, (int) (byte) 1, 0);
    }

    @Test
    public void test31716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31716");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 100);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 2);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31717");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (-1), (-1), (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
    }

    @Test
    public void test31718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31718");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
    }

    @Test
    public void test31719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31719");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, 2, 100, (int) (byte) 10);
    }

    @Test
    public void test31720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31720");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test31721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31721");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 100, (int) 'a', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test31722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31722");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) -1, (int) '#', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 1, 1, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
    }

    @Test
    public void test31723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31723");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (short) 10, (int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (-1), 1, 2);
    }

    @Test
    public void test31724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31724");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) '4', 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (short) -1, (int) (byte) 1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (-1), (int) (short) 100, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 100, (int) (byte) -1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener43 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener43);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) 'a', (int) (byte) 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 0);
    }

    @Test
    public void test31725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31725");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (-1), (int) '4', 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test31726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31726");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(0, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 10, (int) ' ', 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener41);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', 3, 0, 2);
        com.badlogic.gdx.Graphics.DisplayMode displayMode48 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode48);
    }

    @Test
    public void test31727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31727");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
    }

    @Test
    public void test31728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31728");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) '4', (int) (short) 100, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (byte) 10, (int) (byte) 100, (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (short) 0, (-1), (int) '4');
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31729");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) 1, (-1), 0);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (short) 1, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test31730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31730");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
        java.lang.Class<?> wildcardClass37 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test31731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31731");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) 'a');
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (byte) 1, 0, (int) (byte) -1);
    }

    @Test
    public void test31732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31732");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 2, (int) (byte) -1, 3);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 1, 2, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color37);
    }

    @Test
    public void test31733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31733");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 10, 3, 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 1, 10, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31734");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 100, 0, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
    }

    @Test
    public void test31735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31735");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31736");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (-1), 10, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
    }

    @Test
    public void test31737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31737");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '4', 1, (int) (byte) 10);
    }

    @Test
    public void test31738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31738");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test31739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31739");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
    }

    @Test
    public void test31740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31740");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 0, (int) (byte) 100, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 3);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
    }

    @Test
    public void test31741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31741");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) 10, (-1), (int) (short) 100);
        java.lang.Class<?> wildcardClass36 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test31742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31742");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 10, 10, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test31743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31743");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 100, (int) (byte) 100, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color40 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color40);
    }

    @Test
    public void test31744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31744");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 100, (int) ' ', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (byte) 100, 0, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 10);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
    }

    @Test
    public void test31745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31745");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
    }

    @Test
    public void test31746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31746");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test31747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31747");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test31748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest63.test31748");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, 2, (int) (short) 1, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3WindowConfiguration0.setResizable(true);
    }
}

