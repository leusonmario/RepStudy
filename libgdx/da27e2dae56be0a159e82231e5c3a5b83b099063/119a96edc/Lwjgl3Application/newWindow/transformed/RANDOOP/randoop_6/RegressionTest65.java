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
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition(10, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test32502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32502");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
    }

    @Test
    public void test32503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32503");
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
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
    }

    @Test
    public void test32504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32504");
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
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test32505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32505");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test32506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32506");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test32507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32507");
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
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) 'a');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test32508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32508");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) (short) 10);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) '4');
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '#');
    }

    @Test
    public void test32509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32509");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
    }

    @Test
    public void test32510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32510");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) ' ');
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color28);
    }

    @Test
    public void test32511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32511");
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
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
    }

    @Test
    public void test32512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32512");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener39);
    }

    @Test
    public void test32513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32513");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode(0, (-1));
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test32514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32514");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 0);
    }

    @Test
    public void test32515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32515");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test32516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32516");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 2);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, 2);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test32517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32517");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode(2, 3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test32518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32518");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) ' ');
    }

    @Test
    public void test32519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32519");
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
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode(10, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test32520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32520");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
    }

    @Test
    public void test32521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32521");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test32522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32522");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 10);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3WindowConfiguration0.setWindowedMode(1, (int) ' ');
    }

    @Test
    public void test32523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32523");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
    }

    @Test
    public void test32524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32524");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) '#');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test32525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32525");
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
        lwjgl3WindowConfiguration0.setWindowedMode(10, 0);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test32526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32526");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
    }

    @Test
    public void test32527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32527");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) -1);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 10);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test32528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32528");
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
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test32529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32529");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test32530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32530");
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
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test32531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32531");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 0);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (short) 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test32532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32532");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setWindowedMode(100, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (-1));
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test32533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32533");
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
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode29);
    }

    @Test
    public void test32534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32534");
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
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test32535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32535");
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
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
    }

    @Test
    public void test32536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32536");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) ' ');
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(false);
    }

    @Test
    public void test32537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32537");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) 'a', (int) (short) 1);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test32538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32538");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowedMode(3, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode19);
    }

    @Test
    public void test32539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32539");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener35);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test32540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32540");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 3);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition(0, 100);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test32541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32541");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test32542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32542");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 2);
    }

    @Test
    public void test32543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32543");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 2);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test32544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32544");
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
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test32545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32545");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (-1));
    }

    @Test
    public void test32546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32546");
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
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, 3);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode32);
    }

    @Test
    public void test32547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32547");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowedMode(10, 0);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
    }

    @Test
    public void test32548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32548");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test32549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32549");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test32550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32550");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test32551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32551");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', 1);
    }

    @Test
    public void test32552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32552");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, 1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test32553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32553");
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
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test32554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32554");
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
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode30);
    }

    @Test
    public void test32555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32555");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) '4', (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 3);
    }

    @Test
    public void test32556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32556");
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
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
    }

    @Test
    public void test32557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32557");
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
        lwjgl3WindowConfiguration0.setWindowPosition((-1), 100);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) -1, (int) '#');
    }

    @Test
    public void test32558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32558");
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
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test32559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32559");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass23 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test32560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32560");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass26 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test32561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32561");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), 1);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test32562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32562");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition(2, 0);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test32563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32563");
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
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 2);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test32564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32564");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 10, (int) '4');
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3WindowConfiguration0.setWindowedMode((int) ' ', 100);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 100, 1);
        lwjgl3WindowConfiguration0.setResizable(true);
    }

    @Test
    public void test32565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32565");
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
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test32566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32566");
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
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test32567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32567");
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
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode17);
    }

    @Test
    public void test32568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32568");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 1);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color38);
    }

    @Test
    public void test32569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32569");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) 'a');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color20);
    }

    @Test
    public void test32570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32570");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 0);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test32571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32571");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3WindowConfiguration0.setWindowPosition(3, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3WindowConfiguration0.setWindowedMode(0, 0);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, 2);
    }

    @Test
    public void test32572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32572");
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
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass33 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test32573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32573");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) (short) 1);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener16);
    }

    @Test
    public void test32574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32574");
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
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener31);
    }

    @Test
    public void test32575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32575");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) -1);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
    }

    @Test
    public void test32576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32576");
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
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setWindowedMode((int) 'a', (int) '#');
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowedMode(100, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
    }

    @Test
    public void test32577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32577");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3WindowConfiguration0.setWindowPosition(3, 3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) -1, 100);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) ' ');
        lwjgl3WindowConfiguration0.setWindowPosition(0, 100);
    }

    @Test
    public void test32578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32578");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color24);
    }

    @Test
    public void test32579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32579");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(0, (int) (byte) 0);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 1, (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test32580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32580");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 100);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener26);
    }

    @Test
    public void test32581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32581");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode22);
    }

    @Test
    public void test32582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32582");
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
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setTitle("");
    }

    @Test
    public void test32583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32583");
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
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3WindowConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, 10);
    }

    @Test
    public void test32584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32584");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3WindowConfiguration0.setWindowedMode((-1), (int) (short) 100);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setDecorated(true);
    }

    @Test
    public void test32585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32585");
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
        lwjgl3WindowConfiguration0.setWindowPosition(10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3WindowConfiguration0.setWindowedMode(1, 1);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 10, (int) 'a');
        lwjgl3WindowConfiguration0.setWindowPosition((-1), (int) (byte) 10);
    }

    @Test
    public void test32586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32586");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 1, (int) 'a');
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3WindowConfiguration0.setWindowPosition(2, 3);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test32587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32587");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = lwjgl3WindowConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test32588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32588");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode20);
    }

    @Test
    public void test32589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32589");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (short) -1);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 1, (-1));
    }

    @Test
    public void test32590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32590");
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
        lwjgl3WindowConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test32591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32591");
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
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setWindowPosition(1, 100);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test32592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32592");
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
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) (byte) 0);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) '#', (int) (byte) 0);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3WindowConfiguration0.setWindowPosition(2, (int) (byte) -1);
    }

    @Test
    public void test32593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32593");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (byte) 0, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3WindowConfiguration0.setWindowedMode(0, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3WindowConfiguration0.setTitle("hi!");
    }

    @Test
    public void test32594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32594");
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
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test32595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32595");
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
        lwjgl3WindowConfiguration0.setWindowedMode(100, (-1));
        lwjgl3WindowConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3WindowConfiguration0.setResizable(false);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, 0);
    }

    @Test
    public void test32596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32596");
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
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        lwjgl3WindowConfiguration0.setWindowPosition(1, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test32597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32597");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3WindowConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
        lwjgl3WindowConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3WindowConfiguration0.setTitle("hi!");
        lwjgl3WindowConfiguration0.setDecorated(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setResizable(true);
        lwjgl3WindowConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color27);
    }

    @Test
    public void test32598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32598");
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
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3WindowConfiguration0.setFullscreenMode(displayMode27);
    }

    @Test
    public void test32599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32599");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration lwjgl3WindowConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration();
        lwjgl3WindowConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 0);
        lwjgl3WindowConfiguration0.setDecorated(false);
        lwjgl3WindowConfiguration0.setTitle("");
        lwjgl3WindowConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3WindowConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3WindowConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3WindowConfiguration0.setWindowPosition((int) (short) -1, (-1));
    }
}

