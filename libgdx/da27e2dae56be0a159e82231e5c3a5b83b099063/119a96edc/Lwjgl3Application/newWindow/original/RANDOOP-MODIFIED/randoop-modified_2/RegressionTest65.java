import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest65 {

    public static boolean debug = false;

    @Test
    public void test32501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32501");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, 1);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, 10);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass39 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test32502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32502");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test32503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32503");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 1);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
    }

    @Test
    public void test32504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32504");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) 'a');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test32505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32505");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test32506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32506");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (short) 0);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) ' ');
    }

    @Test
    public void test32507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32507");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) '#');
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test32508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32508");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test32509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32509");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (-1));
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 1);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) ' ');
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode35);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color37);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode39);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener46 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener46);
    }

    @Test
    public void test32510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32510");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) 1);
    }

    @Test
    public void test32511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32511");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test32512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32512");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test32513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32513");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test32514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32514");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test32515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32515");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test32516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32516");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, 10);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
    }

    @Test
    public void test32517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32517");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', (int) (byte) 0);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
    }

    @Test
    public void test32518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32518");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color32);
    }

    @Test
    public void test32519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32519");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (short) 0);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3WindowConfiguration0.setWindowPosition((int) ' ', 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode38);
        com.badlogic.gdx.graphics.Color color40 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color40);
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test32520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32520");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', 1);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 1);
        java.lang.Class<?> wildcardClass30 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test32521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32521");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
    }

    @Test
    public void test32522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32522");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) ' ');
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
    }

    @Test
    public void test32523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32523");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 10);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 3);
    }

    @Test
    public void test32524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32524");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, 0);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, 2);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) 100);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode36);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 0);
    }

    @Test
    public void test32525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32525");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
    }

    @Test
    public void test32526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32526");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) 100);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test32527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32527");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode(2, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (short) 1);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test32528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32528");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 3);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 1);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) 'a');
    }

    @Test
    public void test32529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32529");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, 2);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test32530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32530");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 3);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition(100, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 3);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test32531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32531");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (short) -1);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }
}

