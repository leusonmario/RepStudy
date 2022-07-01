import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28 {

    public static boolean debug = false;

    @Test
    public void test14001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14001");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 0, (int) (short) -1, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test14002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14002");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 3, 10, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        java.lang.Class<?> wildcardClass20 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test14003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14003");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) 0, (int) '4', 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14004");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14005");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14006");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) '4', (int) 'a', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode43);
    }

    @Test
    public void test14007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14007");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) 100);
    }

    @Test
    public void test14008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14008");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) (short) -1, 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode40);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14009");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        java.lang.Class<?> wildcardClass38 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test14010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14010");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 3);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 100);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14011");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 0, (-1), (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
    }

    @Test
    public void test14012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14012");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 2);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14013");
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
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 100);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color37);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color39);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (byte) 1);
    }

    @Test
    public void test14014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14014");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 0);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14015");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) '4', (int) (short) 0, 10);
    }

    @Test
    public void test14016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14016");
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
        lwjgl3WindowConfiguration0.setWindowPosition(10, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
    }

    @Test
    public void test14017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14017");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) 'a', (int) (byte) 100, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) ' ', (int) '#', (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (short) 0, (int) '4', (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14018");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
    }

    @Test
    public void test14019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14019");
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
        lwjgl3WindowConfiguration0.setWindowedMode(0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) 'a', (int) (short) 10, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) 1, 100, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (byte) 100, 1, (int) '4');
    }

    @Test
    public void test14020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14020");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 2, 1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
    }

    @Test
    public void test14021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14021");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 0);
    }

    @Test
    public void test14022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14022");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) -1, (int) (short) 100, 0);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14023");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 3);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 2, 10, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (byte) 1, 0, (int) '4');
    }

    @Test
    public void test14024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14024");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) '#');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) 'a', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) -1, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test14025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14025");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
    }

    @Test
    public void test14026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14026");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 0);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14027");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
    }

    @Test
    public void test14028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14028");
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
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (-1), (int) (short) -1, (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14029");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
    }

    @Test
    public void test14030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14030");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (short) 1, (int) '4', (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14031");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 10, (int) (byte) -1, 0);
    }

    @Test
    public void test14032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14032");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 3, (int) (short) 100, (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) '#', 0, (int) (byte) 0);
    }

    @Test
    public void test14033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14033");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 3, 2, 2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14034");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
    }

    @Test
    public void test14035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14035");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 0, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (-1));
    }

    @Test
    public void test14036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14036");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
    }

    @Test
    public void test14037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14037");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14038");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) 'a', (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test14039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14039");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) '#', (int) (short) 0, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition(100, 10);
    }

    @Test
    public void test14040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14040");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 1);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 0);
    }

    @Test
    public void test14041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14041");
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
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14042");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (byte) -1, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 1, 0, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test14043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14043");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 100, 100, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14044");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (byte) -1);
    }

    @Test
    public void test14045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14045");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) 1, (-1), 0);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 0, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test14046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14046");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (-1), (int) (short) 10, (int) '#');
    }

    @Test
    public void test14047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14047");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test14048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14048");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '#', (int) '#', 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test14049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14049");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 3);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 0);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14050");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 10);
    }

    @Test
    public void test14051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14051");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) ' ', (int) (short) 100, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 0, (int) (byte) 10, 0);
    }

    @Test
    public void test14052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14052");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test14053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14053");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, 0, (int) (byte) 0, 0);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
    }

    @Test
    public void test14054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14054");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, 0, (-1), (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) -1, 0, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
    }

    @Test
    public void test14055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14055");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) '4', (int) (byte) 10, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test14056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14056");
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
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color37);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14057");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (short) -1, (int) (byte) 10, (int) ' ');
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test14058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14058");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (short) 10, (int) (short) 100, (-1));
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (-1), (int) ' ', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14059");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 3);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (-1));
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) '4', (int) '#', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (byte) -1, (int) (byte) 0, 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode37);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) (short) 0, (int) (short) 1, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) 'a');
    }

    @Test
    public void test14060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14060");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test14061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14061");
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
        lwjgl3WindowConfiguration0.setWindowedMode(0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14062");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 0, 2, 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 1, 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        java.lang.Class<?> wildcardClass25 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test14063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14063");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, 1, (int) '#', (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 0);
    }

    @Test
    public void test14064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14064");
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
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 10, 0, 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
    }

    @Test
    public void test14065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14065");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) (byte) 100, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (byte) 0, (int) (short) 1, 0);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14066");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) '#', (int) 'a', 2);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 0, 10, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, 2, 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test14067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14067");
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
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (-1));
    }

    @Test
    public void test14068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14068");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 3, (int) (byte) 0, 100);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14069");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (-1));
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 100);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
    }

    @Test
    public void test14070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14070");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 10, 100, (int) (short) 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14071");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) 'a', 100, 10);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14072");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 0);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test14073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14073");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
    }

    @Test
    public void test14074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14074");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
    }

    @Test
    public void test14075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14075");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14076");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 2);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) 100, (-1), (int) (byte) -1);
        java.lang.Class<?> wildcardClass42 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test14077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14077");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color44);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color49);
    }

    @Test
    public void test14078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14078");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 1);
    }

    @Test
    public void test14079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14079");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14080");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (-1), (int) (byte) 100, 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (short) 0, (int) (byte) 1, 2);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (short) 100, 0, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14081");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (-1));
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
    }

    @Test
    public void test14082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14082");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) -1, (int) '#', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 1, 1, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14083");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (-1));
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) ' ', (int) (short) 10, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14084");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) 100);
    }

    @Test
    public void test14085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14085");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14086");
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
        java.lang.Class<?> wildcardClass17 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14087");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        java.lang.Class<?> wildcardClass23 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test14088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14088");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) 'a');
    }

    @Test
    public void test14089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14089");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) '4', (int) (byte) 10, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14090");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        java.lang.Class<?> wildcardClass20 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test14091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14091");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 3);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (byte) 10, (int) (byte) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) ' ', (int) (byte) -1, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
    }

    @Test
    public void test14092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14092");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) 1, (-1), 0);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
    }

    @Test
    public void test14093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14093");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 3);
    }

    @Test
    public void test14094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14094");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 10);
    }

    @Test
    public void test14095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14095");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test14096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14096");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (-1), (int) (short) -1, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (short) 100, 100, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
    }

    @Test
    public void test14097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14097");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (byte) 0, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14098");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (short) 1, (int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 2);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 1);
    }

    @Test
    public void test14099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14099");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (-1));
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14100");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
    }

    @Test
    public void test14101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14101");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test14102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14102");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (-1), (int) (short) -1, 3);
    }

    @Test
    public void test14103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14103");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 100);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) 'a');
    }

    @Test
    public void test14104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14104");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 3);
    }

    @Test
    public void test14105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14105");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) 'a');
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
    }

    @Test
    public void test14106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14106");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass23 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test14107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14107");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 2, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
    }

    @Test
    public void test14108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14108");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) 1, 10, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14109");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
    }

    @Test
    public void test14110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14110");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 3, (int) (short) 10, 2);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) '#');
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (byte) 10, (int) (byte) 1, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) 1, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test14111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14111");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (short) 100, 10, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) -1);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 1);
    }

    @Test
    public void test14112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14112");
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
        lwjgl3WindowConfiguration0.setWindowPosition(3, 3);
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test14113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14113");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
    }

    @Test
    public void test14114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14114");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) 1, (-1), 0);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) 'a', (int) (short) 100, (int) '#');
    }

    @Test
    public void test14115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14115");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) -1, (int) '#', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 1, 1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        java.lang.Class<?> wildcardClass22 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test14116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14116");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass16 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14117");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
    }

    @Test
    public void test14118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14118");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) ' ');
    }

    @Test
    public void test14119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14119");
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
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14120");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) '#', (int) 'a', (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (byte) 100, (int) (short) 100, 2);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 2);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14121");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', 1, (int) 'a', (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test14122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14122");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 1);
    }

    @Test
    public void test14123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14123");
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
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14124");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 2);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test14125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14125");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) '#', 2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test14126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14126");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 3);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14127");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 1, 0, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 1);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color39);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (-1));
    }

    @Test
    public void test14128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14128");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14129");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(3, 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14130");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 0, 0, (int) '#');
    }

    @Test
    public void test14131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14131");
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
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
    }

    @Test
    public void test14132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14132");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (short) -1, 3, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 0);
        java.lang.Class<?> wildcardClass18 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14133");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (short) 100, (int) '4', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14134");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (-1));
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 10, (int) 'a', (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test14135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14135");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 100, (int) (short) -1, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, 2, (-1), (int) (byte) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) ' ');
        java.lang.Class<?> wildcardClass25 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test14136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14136");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 2);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) '4', (int) (byte) 0, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14137");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 2);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) 0, (int) ' ', (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 2);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        java.lang.Class<?> wildcardClass35 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test14138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14138");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '#', (int) '#', 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '#');
        java.lang.Class<?> wildcardClass34 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test14139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14139");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) -1);
    }

    @Test
    public void test14140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14140");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass22 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test14141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14141");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test14142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14142");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 2);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
    }

    @Test
    public void test14143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14143");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 0);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (-1));
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (byte) 1);
    }

    @Test
    public void test14144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14144");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 0, (-1), (int) (byte) 10);
    }

    @Test
    public void test14145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14145");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 100, (int) (short) -1, 3);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
    }

    @Test
    public void test14146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14146");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 1, 0, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (byte) 10, (int) 'a', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14147");
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
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 1);
    }

    @Test
    public void test14148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14148");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) -1, (int) (short) 100, 2);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (-1), (-1), 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (-1), (int) (short) -1, (int) ' ');
    }

    @Test
    public void test14149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14149");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 100, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14150");
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
        lwjgl3WindowConfiguration0.setWindowedMode(2, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
    }

    @Test
    public void test14151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14151");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', 10, (int) (short) 100, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14152");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (short) 1, (int) '4');
    }

    @Test
    public void test14153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14153");
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
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) '#', 100, 0);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14154");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 100, 100, 10);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 1, (int) (byte) 10, 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) ' ', (int) (short) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass34 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test14155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14155");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 2);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) 0, (int) ' ', (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 2);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (-1));
    }

    @Test
    public void test14156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14156");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 0);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test14157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14157");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14158");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14159");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (short) 0, (int) (short) 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) 100, (int) 'a', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14160");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (-1));
    }

    @Test
    public void test14161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14161");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (byte) -1, (-1), (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) 100, 0, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
    }

    @Test
    public void test14162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14162");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14163");
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
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14164");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14165");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test14166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14166");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (-1));
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, 0, 2, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 2);
    }

    @Test
    public void test14167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14167");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) '#', (int) (short) 0, (-1));
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 1, (int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test14168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14168");
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
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
    }

    @Test
    public void test14169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14169");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 3);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass38 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test14170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14170");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition(0, 10);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (short) 1);
    }

    @Test
    public void test14171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14171");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test14172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14172");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
    }

    @Test
    public void test14173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14173");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
        com.badlogic.gdx.graphics.Color color40 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color40);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener42);
    }

    @Test
    public void test14174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14174");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (byte) -1, (int) (short) 10, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 2);
    }

    @Test
    public void test14175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14175");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14176");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
    }

    @Test
    public void test14177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14177");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
    }

    @Test
    public void test14178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14178");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) -1, (int) '#', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 1, 1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) -1, (int) (short) 1, 0);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
    }

    @Test
    public void test14179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14179");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (byte) -1, (int) (byte) 0, 3);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
    }

    @Test
    public void test14180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14180");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 100);
    }

    @Test
    public void test14181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14181");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test14182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14182");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (short) 1, (int) ' ', (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14183");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 3);
    }

    @Test
    public void test14184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14184");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 100);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) 100, (-1), 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, 2, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test14185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14185");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
    }

    @Test
    public void test14186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14186");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
    }

    @Test
    public void test14187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14187");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (byte) 100, 3, 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) -1, (int) (byte) 1, (-1));
    }

    @Test
    public void test14188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14188");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
    }

    @Test
    public void test14189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14189");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        java.lang.Class<?> wildcardClass20 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test14190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14190");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
    }

    @Test
    public void test14191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14191");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
    }

    @Test
    public void test14192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14192");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14193");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test14194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14194");
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
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        java.lang.Class<?> wildcardClass25 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test14195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14195");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 3);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14196");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14197");
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
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 1, (int) (byte) 0, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14198");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
    }

    @Test
    public void test14199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14199");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14200");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (byte) 100, (int) (short) 10, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
    }

    @Test
    public void test14201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14201");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14202");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
    }

    @Test
    public void test14203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14203");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', 100, (int) ' ', 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (byte) 1, 100, 10);
    }

    @Test
    public void test14204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14204");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color38);
    }

    @Test
    public void test14205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14205");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (byte) 0, (int) (byte) 1, (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14206");
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
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass36 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test14207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14207");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) 'a', (int) (short) 1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) -1, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test14208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14208");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 2);
    }

    @Test
    public void test14209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14209");
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
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14210");
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
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 3, (-1), (int) (byte) 100);
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test14211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14211");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (short) 10, 10, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
    }

    @Test
    public void test14212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14212");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) '4', (int) (byte) 10, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14213");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14214");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 0);
    }

    @Test
    public void test14215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14215");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test14216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14216");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 100, (-1), (int) ' ');
    }

    @Test
    public void test14217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14217");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
    }

    @Test
    public void test14218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14218");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test14219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14219");
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
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', 3, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14220");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) (byte) 100, 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) '4', (-1), (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 0);
    }

    @Test
    public void test14221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14221");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (-1), (int) (short) -1, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (short) 100, 100, 0);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
    }

    @Test
    public void test14222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14222");
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
        lwjgl3WindowConfiguration0.setWindowedMode(0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test14223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14223");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 1, (int) 'a', (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
    }

    @Test
    public void test14224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14224");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
    }

    @Test
    public void test14225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14225");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14226");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 0, (int) (byte) 0, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) '#', 0, 0);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (byte) 10, (int) ' ', 2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
    }

    @Test
    public void test14227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14227");
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
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition(3, (-1));
    }

    @Test
    public void test14228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14228");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14229");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test14230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14230");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color6);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) 'a', (-1), (int) (byte) 0);
    }

    @Test
    public void test14231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14231");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 0, (int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 0, 0, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) '#', 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test14232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14232");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 0, (int) (short) -1, (int) '#');
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) '4');
        java.lang.Class<?> wildcardClass36 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test14233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14233");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, (-1), (int) ' ', 10);
        java.lang.Class<?> wildcardClass35 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test14234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14234");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14235");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) 0, 2, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
    }

    @Test
    public void test14236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14236");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (short) -1, (-1), 0);
    }

    @Test
    public void test14237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14237");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14238");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (-1));
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, 3, 3, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14239");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 100, 3, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 10, (int) 'a', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 2);
    }

    @Test
    public void test14240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14240");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14241");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14242");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) '4', (int) (byte) 10, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) ' ', (int) (short) 100, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener42);
    }

    @Test
    public void test14243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14243");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (byte) -1, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test14244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14244");
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
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (short) 1, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test14245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14245");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) (short) 10, (int) (short) 1, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color40 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color40);
        java.lang.Class<?> wildcardClass42 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test14246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14246");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 0);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14247");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, 3, (int) '4', 3);
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test14248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14248");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 3, 10, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14249");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14250");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) '#', (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test14251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14251");
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
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test14252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14252");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 0, (int) (short) 100, 0);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
    }

    @Test
    public void test14253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14253");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (-1));
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
    }

    @Test
    public void test14254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14254");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) '4');
    }

    @Test
    public void test14255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14255");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 0, (int) (byte) 10, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 0);
    }

    @Test
    public void test14256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14256");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 100, 0, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 2);
    }

    @Test
    public void test14257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14257");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test14258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14258");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14259");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color42 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color42);
    }

    @Test
    public void test14260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14260");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (short) 10, (int) (short) 100, (-1));
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 1, (int) (byte) 1, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (short) 0, (int) (byte) -1, (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 1);
    }

    @Test
    public void test14261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14261");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
    }

    @Test
    public void test14262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14262");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (short) 1, 0, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (short) 100, (int) (short) 10, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 100, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test14263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14263");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) 'a', (int) (byte) 0, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (-1));
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
    }

    @Test
    public void test14264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14264");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode46 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode46);
    }

    @Test
    public void test14265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14265");
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
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 3);
    }

    @Test
    public void test14266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14266");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14267");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) '#', (int) (byte) 10, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener38);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 0, 1, 100);
    }

    @Test
    public void test14268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14268");
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
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) ' ');
    }

    @Test
    public void test14269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14269");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 3);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (byte) 10, (int) (byte) 10, 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) 10, 10, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14270");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (-1));
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) '4', (-1), 2);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (-1), (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test14271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14271");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) '#', (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test14272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14272");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 3);
    }

    @Test
    public void test14273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14273");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(100, 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) '#', 3, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) 'a', (int) (short) -1, (-1));
    }

    @Test
    public void test14274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14274");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 2);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test14275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14275");
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
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) ' ', (int) (byte) 1, (int) '#');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 3, 0, 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
    }

    @Test
    public void test14276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14276");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
    }

    @Test
    public void test14277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14277");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
    }

    @Test
    public void test14278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14278");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (-1));
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) -1, 10, 1);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 100);
    }

    @Test
    public void test14279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14279");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) 1, (-1), 0);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
    }

    @Test
    public void test14280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14280");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) 'a', (int) (byte) 100, (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test14281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14281");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 100);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
    }

    @Test
    public void test14282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14282");
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
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
    }

    @Test
    public void test14283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14283");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 0);
    }

    @Test
    public void test14284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14284");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test14285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14285");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 3);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14286");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) '#', (int) ' ', (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14287");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 100);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
    }

    @Test
    public void test14288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14288");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '#', (int) '#', 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '#', 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode(1, 0);
    }

    @Test
    public void test14289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14289");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass39 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test14290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14290");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) 100, 10, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener38);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) 'a', 0, 3);
    }

    @Test
    public void test14291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14291");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) -1, 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test14292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14292");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) ' ', 2, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) 'a', (-1), (int) (byte) -1);
    }

    @Test
    public void test14293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14293");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test14294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14294");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14295");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 100, (int) (short) -1, 3);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14296");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
    }

    @Test
    public void test14297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14297");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode37);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14298");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) '4', (-1), 0);
        java.lang.Class<?> wildcardClass18 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14299");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test14300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14300");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (-1));
    }

    @Test
    public void test14301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14301");
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
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) '4', (int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
    }

    @Test
    public void test14302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14302");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14303");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (-1));
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 0, 2, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, 0, (int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test14304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14304");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) ' ', 2, 2);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
    }

    @Test
    public void test14305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14305");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) '#');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) (byte) 0, 3, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14306");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) '#', (int) (byte) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
    }

    @Test
    public void test14307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14307");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
    }

    @Test
    public void test14308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14308");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color6);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, 3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
    }

    @Test
    public void test14309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14309");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (short) 0, (int) (byte) 1, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14310");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) 100, (int) (short) 1, 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        java.lang.Class<?> wildcardClass34 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test14311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14311");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
        java.lang.Class<?> wildcardClass23 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test14312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14312");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
    }

    @Test
    public void test14313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14313");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test14314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14314");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 0);
    }

    @Test
    public void test14315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14315");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 10, (int) (byte) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (byte) 10, (int) (byte) 1, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 0);
    }

    @Test
    public void test14316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14316");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) '#');
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (-1), 100, (int) (short) 100);
    }

    @Test
    public void test14317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14317");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (short) 1, (int) (byte) 10, (int) '#');
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 0);
        java.lang.Class<?> wildcardClass22 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test14318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14318");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) 'a', (int) (byte) 100, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) ' ', (int) '#', (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 3);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 100);
    }

    @Test
    public void test14319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14319");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 0);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test14320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14320");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (byte) 100, 3, 1);
    }

    @Test
    public void test14321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14321");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) 100, (int) (short) 10, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test14322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14322");
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
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
    }

    @Test
    public void test14323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14323");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (short) 100, 0, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
    }

    @Test
    public void test14324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14324");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '#', (int) '#', 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14325");
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
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) 1);
        java.lang.Class<?> wildcardClass43 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test14326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14326");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 0, (int) (byte) -1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test14327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14327");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 1, (int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
    }

    @Test
    public void test14328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14328");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        java.lang.Class<?> wildcardClass25 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test14329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14329");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 2, (int) (short) -1, 2);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) -1, (int) (byte) 1, 3);
    }

    @Test
    public void test14330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14330");
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
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (-1), (int) 'a', 2);
    }

    @Test
    public void test14331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14331");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) 'a', 0, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (short) 0, (int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 0);
    }

    @Test
    public void test14332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14332");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
    }

    @Test
    public void test14333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14333");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) -1, (int) '#', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) '4', 0, (int) ' ');
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) '#', 2, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14334");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 0);
    }

    @Test
    public void test14335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14335");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) -1, 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 0, 0, 2);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test14336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14336");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(2, 2);
    }

    @Test
    public void test14337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14337");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass35 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test14338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14338");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass41 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test14339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14339");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test14340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14340");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (short) -1, (int) '4', 0);
    }

    @Test
    public void test14341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14341");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode(0, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
    }

    @Test
    public void test14342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14342");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (byte) 100, (int) (byte) 10, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
    }

    @Test
    public void test14343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14343");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
    }

    @Test
    public void test14344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14344");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
    }

    @Test
    public void test14345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14345");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
    }

    @Test
    public void test14346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14346");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 0, (int) (short) -1, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) ' ');
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
    }

    @Test
    public void test14347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14347");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
    }

    @Test
    public void test14348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14348");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14349");
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
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 1);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14350");
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
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) -1, 1, (int) (short) 0);
    }

    @Test
    public void test14351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14351");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 0);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
    }

    @Test
    public void test14352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14352");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test14353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14353");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) -1);
    }

    @Test
    public void test14354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14354");
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
        lwjgl3WindowConfiguration0.setWindowedMode(0, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test14355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14355");
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
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) '4', (int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
        java.lang.Class<?> wildcardClass38 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test14356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14356");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(2, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14357");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 100);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
    }

    @Test
    public void test14358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14358");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 3, 10, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 0, (int) (short) 100, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (short) 0);
    }

    @Test
    public void test14359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14359");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (-1), 0, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14360");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
    }

    @Test
    public void test14361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14361");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) ' ');
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) 'a');
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14362");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
    }

    @Test
    public void test14363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14363");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 10);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 2);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 1);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14364");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color6);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (-1), (int) (short) 10, (int) ' ');
    }

    @Test
    public void test14365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14365");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 100, (int) (short) -1, 3);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) '#');
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14366");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 0);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        java.lang.Class<?> wildcardClass20 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test14367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14367");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) (byte) 100, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, 0);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
    }

    @Test
    public void test14368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14368");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 2);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) -1, (int) (short) 100, 0);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14369");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) ' ', (int) '4', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14370");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) 'a', (int) (byte) 0, (-1));
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, (int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 100, 10, (-1));
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14371");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 100, 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) '#', (int) '#', 3);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
    }

    @Test
    public void test14372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14372");
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
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14373");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) -1, (int) '#', 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 0, (int) (byte) 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) ' ', 0, (-1));
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14374");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (byte) -1, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14375");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) 'a', (-1), (int) (byte) 10);
    }

    @Test
    public void test14376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14376");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (short) 1, (int) (byte) 10, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 1, (int) (byte) 1, 1);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (short) 100);
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test14377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14377");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (byte) 0, (int) '4', (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (-1));
    }

    @Test
    public void test14378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14378");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (-1), (int) (short) -1, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 10);
    }

    @Test
    public void test14379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14379");
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
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 0);
    }

    @Test
    public void test14380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14380");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (-1));
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14381");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) '4');
    }

    @Test
    public void test14382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14382");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 2);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14383");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test14384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14384");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, 100, (int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) '4', (int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 100);
    }

    @Test
    public void test14385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14385");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) ' ');
    }

    @Test
    public void test14386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14386");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) '4', (int) (byte) 10, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
        java.lang.Class<?> wildcardClass36 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test14387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14387");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 100, (int) (short) -1, 3);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14388");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 100, 100, 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (short) 100, 100, 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 3);
    }

    @Test
    public void test14389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14389");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test14390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14390");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 10, (int) (short) 0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) (byte) 0, (int) 'a', 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener38);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14391");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 3);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
    }

    @Test
    public void test14392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14392");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
    }

    @Test
    public void test14393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14393");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test14394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14394");
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
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14395");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (-1));
    }

    @Test
    public void test14396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14396");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color6);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 10);
    }

    @Test
    public void test14397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14397");
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
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (short) 100, (int) (short) 1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14398");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
    }

    @Test
    public void test14399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14399");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14400");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 100, (int) ' ', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (byte) 1, (int) (byte) 100, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color37);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (byte) 100);
    }

    @Test
    public void test14401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14401");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 2);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
    }

    @Test
    public void test14402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14402");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 0, 2, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
    }

    @Test
    public void test14403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14403");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, 1, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test14404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14404");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) '4');
    }

    @Test
    public void test14405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14405");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) 1, (-1), 0);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (-1));
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test14406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14406");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (short) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) '#');
    }

    @Test
    public void test14407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14407");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) 'a');
    }

    @Test
    public void test14408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14408");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) '#', (-1), (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode46 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode46);
        java.lang.Class<?> wildcardClass48 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test14409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14409");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 1);
    }

    @Test
    public void test14410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14410");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '#', (int) '#', 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
    }

    @Test
    public void test14411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14411");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 1, 0, (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 1);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14412");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
    }

    @Test
    public void test14413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14413");
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
        lwjgl3WindowConfiguration0.setWindowedMode(0, 3);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (short) 100, (-1), (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (-1), (int) (short) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color39);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (short) 100);
        java.lang.Class<?> wildcardClass44 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test14414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14414");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) (byte) 100, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, 2, (int) (byte) -1, 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (short) 0, (int) ' ', (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 1, (int) (byte) 1, 2);
    }

    @Test
    public void test14415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14415");
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
        lwjgl3WindowConfiguration0.setWindowedMode(0, 3);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (short) 100, (-1), (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test14416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14416");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) '4');
    }

    @Test
    public void test14417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14417");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (-1), (int) (short) 100, 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14418");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
    }

    @Test
    public void test14419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14419");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 0, (int) (byte) 0, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) '#', 0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) ' ', 0, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) 'a');
    }

    @Test
    public void test14420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14420");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) 'a');
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 0, (int) (byte) -1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
    }

    @Test
    public void test14421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14421");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 10, 1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test14422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14422");
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
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) ' ');
    }

    @Test
    public void test14423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14423");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test14424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14424");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) 'a', (int) (short) 1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, 0, (int) (byte) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 100);
    }

    @Test
    public void test14425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14425");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, (int) (byte) 1, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14426");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) '4', (int) (byte) 10, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) '4', (int) (short) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) ' ', (int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 2);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (short) 100, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test14427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14427");
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
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) 100, (int) ' ', 0);
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test14428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14428");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 2);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) '4', (int) (byte) 1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
    }

    @Test
    public void test14429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14429");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14430");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) -1, (int) '#', 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) '#', (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test14431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14431");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) 1, 10, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) '4');
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test14432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14432");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
    }

    @Test
    public void test14433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14433");
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
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) 10, (-1), (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 0, 100, (int) 'a');
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 0);
        java.lang.Class<?> wildcardClass43 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test14434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14434");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
    }

    @Test
    public void test14435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14435");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14436");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 2);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) 'a');
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test14437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14437");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 3);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (byte) 10, (int) (byte) 10, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) ' ', (int) (byte) -1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 0);
    }

    @Test
    public void test14438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14438");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (short) 1, (int) '4', (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14439");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (short) 0, (int) ' ', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14440");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) 1, 10, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
        java.lang.Class<?> wildcardClass36 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test14441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14441");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14442");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14443");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
    }

    @Test
    public void test14444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14444");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14445");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) '#', (int) (short) 0, (-1));
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass30 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test14446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14446");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) -1, (int) '#', 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) -1, (-1), 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(1, 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14447");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (byte) 100, (int) ' ', (int) (short) 1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) 10, (int) (byte) -1, 0);
    }

    @Test
    public void test14448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14448");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 2);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
    }

    @Test
    public void test14449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14449");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) (byte) 100, 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (short) 1);
    }

    @Test
    public void test14450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14450");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (-1), 100, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 10, (int) (short) -1, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener38);
    }

    @Test
    public void test14451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14451");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) '#', (int) '#', 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
    }

    @Test
    public void test14452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14452");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (byte) -1, (int) (short) 1, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 0, (int) (byte) 100, 100);
    }

    @Test
    public void test14453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14453");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 3);
    }

    @Test
    public void test14454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14454");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 3);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (short) 100, 2, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
    }

    @Test
    public void test14455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14455");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) '#', (int) (byte) 10, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, (-1), 2, (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14456");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (short) 10);
    }

    @Test
    public void test14457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14457");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 0, (int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode39);
    }

    @Test
    public void test14458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14458");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (-1));
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test14459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14459");
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
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, 100, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test14460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14460");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', 1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, 1, (int) (short) 0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test14461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14461");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test14462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14462");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
    }

    @Test
    public void test14463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14463");
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
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '#');
    }

    @Test
    public void test14464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14464");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color6);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 0, (int) (byte) 1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) 'a', (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test14465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14465");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 0, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test14466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14466");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (byte) 10, (int) '4', (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (byte) 10);
    }

    @Test
    public void test14467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14467");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
    }

    @Test
    public void test14468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14468");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
    }

    @Test
    public void test14469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14469");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode39);
    }

    @Test
    public void test14470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14470");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 100, (int) (short) -1, 3);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 0);
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test14471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14471");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) '#');
    }

    @Test
    public void test14472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14472");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, 0, 3, (int) (byte) -1);
    }

    @Test
    public void test14473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14473");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 0, (int) (short) 1, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, 10, (int) (byte) 1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 10);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test14474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14474");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 0, 2, (-1));
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode37);
    }

    @Test
    public void test14475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14475");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
    }

    @Test
    public void test14476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14476");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) -1, 1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass23 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test14477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14477");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 3, 3, (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
    }

    @Test
    public void test14478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14478");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14479");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, 0);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 0, (int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14480");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        java.lang.Class<?> wildcardClass20 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test14481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14481");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition(2, (-1));
    }

    @Test
    public void test14482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14482");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 3);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) '4', (int) (byte) 10, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) '4', (int) (short) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) ' ', (int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test14483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14483");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (-1), 0, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (byte) 0, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test14484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14484");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) 'a', (int) '#', (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) -1, 100, 2);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 3, (int) (short) 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test14485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14485");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) 'a', (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 1, 1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
    }

    @Test
    public void test14486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14486");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 2);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) 0, (int) ' ', (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 2);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test14487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14487");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (-1), 0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) ' ', (-1), (-1));
    }

    @Test
    public void test14488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14488");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
        lwjgl3WindowConfiguration0.setWindowedMode(2, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 1, (int) (short) 1, 3);
    }

    @Test
    public void test14489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14489");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) '#', (int) (short) 0, (-1));
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 1, (int) (byte) 1, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test14490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14490");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) 'a', (int) '#', (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
    }

    @Test
    public void test14491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14491");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) '#', 10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
    }

    @Test
    public void test14492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14492");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test14493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14493");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 0);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
    }

    @Test
    public void test14494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14494");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (-1), (int) (short) 100, 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode39);
    }

    @Test
    public void test14495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14495");
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
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) '#', 3, 3);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) 'a');
    }

    @Test
    public void test14496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14496");
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
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14497");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 100, (int) (short) -1, 3);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) ' ', 1, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test14498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14498");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode4 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode4);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 2, 3, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        java.lang.Class<?> wildcardClass22 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test14499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14499");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
    }

    @Test
    public void test14500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14500");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (byte) -1, 0, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }
}

