import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
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
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 10, (int) ' ', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 10);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) '#', (int) '#', (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener44 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener44);
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass41 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
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
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 10);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (short) 10, (int) (byte) -1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) 100, (int) (byte) 10, (int) '#');
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (byte) -1, 0, (int) (byte) 100);
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 0, (int) (byte) 1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) -1, (int) (short) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
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
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 3);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        java.lang.Class<?> wildcardClass16 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
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
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) 'a', (int) (byte) -1, 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (byte) -1, 10, 3);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass22 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
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
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode42 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode42);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass46 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass23 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 0, (int) (byte) -1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 100, 0, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) '#');
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        java.lang.Class<?> wildcardClass18 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
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
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 0, (-1), (int) (short) 0);
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) '#', 2, (int) (short) 0);
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 0);
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) 'a', (int) (short) 100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) '#');
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode40);
        java.lang.Class<?> wildcardClass42 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color38);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) -1, (int) (byte) -1, (-1));
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, 0, (-1), (int) (byte) 10);
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass23 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener43 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener43);
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
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
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
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
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', 1, (int) (short) -1, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) -1, (int) ' ', 2);
        java.lang.Class<?> wildcardClass51 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) ' ', (int) 'a', (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 100);
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
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
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 10);
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 100, 0, (int) (byte) 0);
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 10, 100, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 0);
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 1, (int) (short) 1, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 1, (-1), (int) ' ');
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener46 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener46);
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (short) 0, (int) (short) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        java.lang.Class<?> wildcardClass27 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
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
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) '4', (int) '4', 2);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 2, 10, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 2);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) -1, (int) ' ', (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) '4', (int) (short) -1, 2);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) -1);
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode40);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
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
        lwjgl3WindowConfiguration0.setWindowPosition(3, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode41 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode41);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) (short) 10, (int) (short) -1, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color48 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color48);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color52 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color52);
        java.lang.Class<?> wildcardClass54 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) '#');
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 10);
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) 'a', (int) (short) 10, (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) ' ');
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (byte) 0, 3, 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 0, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, 2, (int) '4', (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (byte) 100, (int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass35 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
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
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (short) 0, (int) (byte) 0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass38 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
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
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 0, (int) (byte) 100, (int) ' ');
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (-1));
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) ' ', (int) 'a', 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode46 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode46);
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
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
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
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
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', 1, (int) (short) -1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 0);
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
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
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 1, (int) (short) 1, 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (short) 0, 100, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
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
        lwjgl3WindowConfiguration0.setWindowPosition(10, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode(0, 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass35 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 0, (int) (byte) 100, 2);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 1, 0, (int) (byte) 0);
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
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
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass25 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
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
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color41);
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (-1), (int) '#', (-1));
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        java.lang.Class<?> wildcardClass10 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener41);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 100, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) ' ', (int) (short) 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) '#');
        java.lang.Class<?> wildcardClass37 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 10);
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, 2, (int) ' ', 2);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 1, (int) (short) 10, 100);
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) '4');
        java.lang.Class<?> wildcardClass22 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) '4', (int) '#', (-1));
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', 100, 0, (int) (short) 100);
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) 0, (int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass27 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) 1, (int) (byte) 1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (-1));
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 10, 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) 1, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) 0, 2, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 1, 100, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) ' ', (int) ' ', (-1));
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
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
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
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
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color39);
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (byte) 10, (int) '#', (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 10);
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) 10, (int) (short) 100, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass17 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (byte) 0, 2, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (byte) 100);
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) '#');
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 100);
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        java.lang.Class<?> wildcardClass30 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (-1));
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
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
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 0, 0, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) 10, (int) (byte) -1, 2);
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener45 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener45);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) '#', 3, 0);
        java.lang.Class<?> wildcardClass52 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
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
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 0);
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
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
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) 1, (int) (short) -1, (int) '#');
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color39);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) '#', (int) (short) 0, 0);
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 0, (int) (byte) 1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', 1, (int) (short) -1, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
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
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 2);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 0, (int) '4', (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) -1);
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 100, (int) ' ', 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) '4', 3, (int) (short) 100);
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) -1, 10, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) 1, (int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) ' ', (int) (short) -1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener46 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener46);
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) 0, 2, (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (short) 100, (int) '#', (int) (byte) -1);
        java.lang.Class<?> wildcardClass43 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color44);
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
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
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 10, 0, 3);
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (byte) 1, (int) (byte) 100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) ' ', (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 10, 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (short) 10, (int) (short) 1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) ' ', (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 10, (int) 'a', 0);
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (-1));
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) (byte) 100, (int) (short) 10, 3);
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 10, 1, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) 'a', 0, 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 0);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) '#', 1, 0);
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) ' ');
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 10, (int) (short) 100, 2);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color37);
        java.lang.Class<?> wildcardClass39 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
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
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color37);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass40 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 0);
        java.lang.Class<?> wildcardClass38 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
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
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) '4', (int) '#', (-1));
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
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
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass30 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
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
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (short) 0, (int) (byte) 0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
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
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 3, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
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
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) '#', 100, (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (byte) 1, (int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass36 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
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
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color39);
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, 1, (int) (short) 1, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (byte) -1, (int) (byte) 10, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 10, 2, (int) ' ');
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) '#', (int) (byte) 1, 2);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
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
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 100, 0, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (-1));
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        java.lang.Class<?> wildcardClass23 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 100, 0, 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 10);
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (byte) 0, (int) (byte) 0, 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) 1, 0, 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) '4');
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) 'a', 2, 2);
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 0, (int) (short) 10, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color38);
        com.badlogic.gdx.graphics.Color color40 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color40);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (short) 1, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode39);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener41);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 10, (int) (short) -1, 2);
        java.lang.Class<?> wildcardClass53 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass27 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) '4');
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        java.lang.Class<?> wildcardClass27 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
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
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 3);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color40 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color40);
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
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
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
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
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 1, (-1), 10);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) '#', 10, 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, 2, 0, 0);
        com.badlogic.gdx.graphics.Color color46 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color46);
        java.lang.Class<?> wildcardClass48 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass35 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
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
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener38);
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
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
        lwjgl3WindowConfiguration0.setWindowPosition(3, 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) 0, (int) (short) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) -1, (int) (byte) -1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 100, 2, (int) (short) 100);
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 2);
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
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
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 10);
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode(100, 3);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
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
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 1, 0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
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
        lwjgl3WindowConfiguration0.setWindowPosition(2, 0);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener40 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener40);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
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
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
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
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) -1, 1, 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 10);
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) '4');
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 0);
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
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
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 10, (int) (short) 0, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 1);
        java.lang.Class<?> wildcardClass35 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) -1);
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (int) (short) 100, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) '4', (int) (short) -1, 2);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 10);
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
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
        java.lang.Class<?> wildcardClass27 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 1);
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (short) 0, (int) (short) 0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (-1));
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode(100, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (byte) -1, (int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass45 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 1);
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        java.lang.Class<?> wildcardClass30 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (-1));
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass25 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 0, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 0, (int) '4', (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (byte) 1, (int) '4', (int) (byte) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
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
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 10, (int) ' ', 3);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (-1));
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (byte) 100, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 1, 3, 0);
        java.lang.Class<?> wildcardClass42 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
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
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) '#');
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (byte) 0, 0, 2);
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) (byte) 100, (int) (short) 1, 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass25 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass37 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 10, 2, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (-1), (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
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
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) 100, 1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setWindowPosition(100, 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) '#');
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) 1, 3, (int) '#');
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (short) -1, 100, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 1, (int) (short) 1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (short) 100);
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode40);
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 1, (int) (short) 10, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) 'a');
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
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
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (short) -1, (int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (byte) -1, (int) '4', (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowPosition(10, 0);
        com.badlogic.gdx.graphics.Color color42 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color42);
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 1, (int) (short) 1, 2);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 2);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
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
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (short) 10);
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, 1, (int) '#', (-1));
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass45 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 3, (int) (short) 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 0, (int) (byte) 1, 1);
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) '4');
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (byte) 100, (-1), (-1));
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) ' ', (int) (byte) -1, 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color37);
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) 0, 2, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 0, (int) ' ', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 1);
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
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
        lwjgl3WindowConfiguration0.setWindowPosition(3, 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 100);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 100);
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color41);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener43 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener43);
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
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
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 10, (int) ' ', (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
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
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
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
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
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
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', 1, (int) (short) -1, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) ' ', (int) (byte) 1, 1, (int) 'a');
        java.lang.Class<?> wildcardClass38 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) (short) 0, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
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
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        java.lang.Class<?> wildcardClass36 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
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
        lwjgl3WindowConfiguration0.setWindowPosition(3, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 3);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        java.lang.Class<?> wildcardClass18 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 1, (int) (short) 1, 2);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) (byte) 10, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, 2);
        java.lang.Class<?> wildcardClass36 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (-1), (int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color35);
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
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
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
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
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', 3, (-1), (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (-1));
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 0);
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (-1), 2, (int) ' ');
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass21 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) 'a', 3, (int) (short) -1);
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) ' ', 1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        java.lang.Class<?> wildcardClass19 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) '#', (int) '4', (int) '4');
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
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
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 100);
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) -1, (int) (byte) 100, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass36 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
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
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) '#');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) ' ');
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 10, (int) (byte) 1, (-1));
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 1, (int) ' ', 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (short) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 1, (int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 10, (int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode47 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode47);
        java.lang.Class<?> wildcardClass49 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (short) 0, 0, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        java.lang.Class<?> wildcardClass19 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 2, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 100);
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, 100, (int) (byte) 10, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', 100, (int) (byte) 10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) 1, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass47 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, 100, (int) (byte) -1, 3);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 0);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 100);
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
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
        java.lang.Class<?> wildcardClass27 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass27 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) '4', (-1), (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 1);
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 0, (int) (short) -1, 2);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, 3);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color37);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener41);
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) '4', 0, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (short) 0, 100, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) ' ');
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) (byte) 10, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (short) 1, 2, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) ' ');
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color45 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color45);
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
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
        java.lang.Class<?> wildcardClass18 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 2, 10, (int) '#');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass40 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) -1, (int) 'a', (int) '4');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, 2, (int) (byte) -1, (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) '4', (int) (short) 100, (-1));
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass38 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode45 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode45);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) '#');
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
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
        lwjgl3WindowConfiguration0.setWindowedMode(100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (short) 1, (int) (byte) 10, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener45 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener45);
        com.badlogic.gdx.graphics.Color color47 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color47);
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) 'a', (int) (byte) 10, (-1));
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, 2);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) '4', (-1), (int) '#');
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color41);
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 2);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass36 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
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
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 100);
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener43 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener43);
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
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
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 2);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (byte) 10, 100, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 10, (int) ' ', 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (-1), 2, (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (byte) -1, (-1), (int) ' ');
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 100);
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, 2, 0, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, 2, (int) (short) 1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) ' ', (int) '#', 2);
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) ' ', (int) (short) 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass34 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) -1, (int) (byte) 100, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (short) -1, 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass34 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 0);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 2);
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
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
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        java.lang.Class<?> wildcardClass24 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 10);
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) '#', 10, 0);
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, 0, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
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
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, 3, (int) (byte) 100, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(10, (int) (short) 10, (int) ' ', 3);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(1, 0);
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
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
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) (byte) 1, (int) (byte) 100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, 2, (int) (short) -1, 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 0, 0, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 10, 3, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 10);
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 3, 1, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener37);
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
        java.lang.Class<?> wildcardClass34 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
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
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass18 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
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
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) ' ', 1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition(100, 2);
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 10);
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
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
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, 3, (int) (short) 10, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) '4', (int) (short) 10, 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (short) 1, 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) 'a');
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
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
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color43);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) '4');
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
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
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass22 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
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
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 3);
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) '4', (int) '#', (-1));
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 3, (int) ' ', 2);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) 100, (int) (byte) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
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
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener38);
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 0, 1, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) '#');
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
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
        lwjgl3WindowConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass29 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (-1), (int) (byte) 1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (byte) 100, 0, (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 10);
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color34);
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
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
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, 1, 10, (int) '4');
        lwjgl3WindowConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
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
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 0);
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
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
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', 0, (int) (short) -1, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass54 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (byte) 1, (int) '#', 0);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
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
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
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
        lwjgl3WindowConfiguration0.setWindowPosition(0, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (-1));
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (byte) 1, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color36);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, 2, 1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 1, 100, 1, (-1));
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 0, 2, (int) (byte) 10);
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) '4');
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (short) -1, 10, 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) (byte) 1, (int) (short) 0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', 1, (int) (short) -1, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) '#', (int) (byte) 100, 0);
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (int) (short) 10, (int) ' ', (int) (byte) 100);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 1);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition(0, 0);
        java.lang.Class<?> wildcardClass28 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 2);
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color44);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (-1), (int) (short) 0, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (-1), (int) (short) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass56 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
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
        java.lang.Class<?> wildcardClass37 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
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
        lwjgl3WindowConfiguration0.setWindowPosition(3, 100);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
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
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
        java.lang.Class<?> wildcardClass37 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener37);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (byte) 1);
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (byte) -1, 3, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 2);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (short) 1, (int) (short) 10, 0);
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
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
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 3, 2, 2);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        java.lang.Class<?> wildcardClass23 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (-1), (int) (short) 10, (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
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
        lwjgl3WindowConfiguration0.setWindowedMode(100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (short) 1, (int) (byte) 10, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) ' ');
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color43);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color47 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color47);
        com.badlogic.gdx.Graphics.DisplayMode displayMode49 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode49);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), 1, 2, 1);
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
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
        lwjgl3WindowConfiguration0.setWindowedMode(10, (-1));
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, 3, 0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
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
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 2, (int) (byte) -1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
        java.lang.Class<?> wildcardClass41 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 10, 1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass27 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (-1), (int) (short) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (short) 10, 1, 0);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
        java.lang.Class<?> wildcardClass41 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) 'a', (int) (byte) 10, (int) 'a', (int) (byte) 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (short) -1, 2, 2);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode48 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode48);
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(1, (int) (short) 0, (int) (short) 100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(0, (int) ' ', (int) (short) 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) '4', (int) '#', (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
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
        lwjgl3WindowConfiguration0.setWindowedMode(0, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
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
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
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
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', (int) '4');
        java.lang.Class<?> wildcardClass30 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode41 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode41);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color45 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color45);
        java.lang.Class<?> wildcardClass47 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) '#', 10, 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener43 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener43);
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
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
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode37);
        java.lang.Class<?> wildcardClass39 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setWindowedMode(3, 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass32 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color37);
        java.lang.Class<?> wildcardClass39 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
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
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
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
        lwjgl3WindowConfiguration0.setWindowPosition(3, 10);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) 0, (int) (byte) 0, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 100, (int) (short) 0, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 10);
        java.lang.Class<?> wildcardClass31 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 1, 0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 100);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) -1, (int) (short) 1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(3, (int) ' ', (int) (byte) 100, 10);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener41);
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode43);
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (short) -1, 0, 1);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) '4');
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (byte) 10);
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', (int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (short) 100, 0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) 'a');
        java.lang.Class<?> wildcardClass23 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((-1), (int) (byte) 1, 0, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 0);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 100);
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setWindowSizeLimits(2, (int) (short) 10, (-1), 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '4', (-1), (int) (short) 10, 100);
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 0, 2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) 'a');
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, 0, (int) 'a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass34 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener1 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener1);
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 10, (int) ' ', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
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
        lwjgl3WindowConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (short) 10, 10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener34);
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color39);
    }
}

