import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest47 {

    public static boolean debug = false;

    @Test
    public void test23501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23501");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 1, (int) 'a', (int) '4', (int) '#');
    }

    @Test
    public void test23502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23502");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, 100);
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType37);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode39);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (-1));
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (-1));
    }

    @Test
    public void test23503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23503");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener32);
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType35);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) ' ', (int) (short) 100, 0, 10, 0, (int) (short) 1);
    }

    @Test
    public void test23504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23504");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) (byte) 1, (int) (short) 100, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode32);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode34);
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType37);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 1, (int) (short) 1, 1, (int) (short) 0, 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (byte) 0);
    }

    @Test
    public void test23505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23505");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) '4', (int) (byte) -1, (int) (short) 10, (int) '4', (int) (short) -1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(10, (int) (short) -1, 100, (-1));
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration27.setDecorated(false);
        lwjgl3ApplicationConfiguration27.setWindowedMode((int) (byte) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration27.setWindowPosition(10, (int) (byte) -1);
        lwjgl3ApplicationConfiguration27.setWindowedMode((int) ' ', (int) '4');
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color43);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = null;
        lwjgl3ApplicationConfiguration45.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration45.useVsync(false);
        lwjgl3ApplicationConfiguration45.setResizable(false);
        lwjgl3ApplicationConfiguration45.disableAudio(true);
        lwjgl3ApplicationConfiguration45.useOpenGL3(false, 0, (int) (short) 100);
        lwjgl3ApplicationConfiguration45.disableAudio(false);
        lwjgl3ApplicationConfiguration45.setBackBufferConfig((int) (byte) -1, (int) ' ', (int) (byte) 10, (int) (byte) 100, (int) '#', (int) (short) 1, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration68.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener72 = null;
        lwjgl3ApplicationConfiguration68.setWindowListener(lwjgl3WindowListener72);
        lwjgl3ApplicationConfiguration68.setAudioConfig(100, (int) (short) -1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener78 = null;
        lwjgl3ApplicationConfiguration68.setWindowListener(lwjgl3WindowListener78);
        lwjgl3ApplicationConfiguration68.setWindowedMode((int) (short) 10, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration83 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode84 = null;
        lwjgl3ApplicationConfiguration83.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration83.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener89 = null;
        lwjgl3ApplicationConfiguration83.setWindowListener(lwjgl3WindowListener89);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode91 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration83.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration68.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration45.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode91);
        org.junit.Assert.assertTrue("'" + hdpiMode91 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode91.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23506");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode4);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) (byte) 10, 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23507");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) 'a');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType35);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color37);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color39);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener41);
    }

    @Test
    public void test23508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23508");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 100, (int) '#', (int) 'a', (int) (short) 1, 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (byte) 0, 1, (int) (short) 10, 0, (int) (short) 1, 0);
    }

    @Test
    public void test23509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23509");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 100, 0, (int) '#', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
    }

    @Test
    public void test23510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23510");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23511");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (short) 100, (int) (short) 1, (-1), 10, (-1), (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test23512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23512");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType23);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (short) -1, (int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (short) -1, (-1), 1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), (int) (byte) 100, (int) ' ', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 100, 0, (int) '4', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener49 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener49);
    }

    @Test
    public void test23513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23513");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', (int) (short) -1);
    }

    @Test
    public void test23514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23514");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) 'a', (int) (byte) 100, 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), (int) 'a', (int) (byte) -1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) (byte) 0, 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) (short) 0, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode34);
    }

    @Test
    public void test23515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23515");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = null;
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration22.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3ApplicationConfiguration22.setFullscreenMode(displayMode28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode35 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode35);
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode35);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode35);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener47 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener47);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode33 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode33.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode35 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode35.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23516");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 10, (int) ' ', 100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, (int) (byte) 100, (int) '4', (int) (short) 0, 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test23517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23517");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = null;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode14);
        lwjgl3ApplicationConfiguration13.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration13.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration13.disableAudio(false);
        lwjgl3ApplicationConfiguration13.setAudioConfig((int) ' ', 10, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = null;
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration37.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener43 = null;
        lwjgl3ApplicationConfiguration37.setWindowListener(lwjgl3WindowListener43);
        lwjgl3ApplicationConfiguration37.setDecorated(true);
        lwjgl3ApplicationConfiguration37.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener49 = null;
        lwjgl3ApplicationConfiguration37.setWindowListener(lwjgl3WindowListener49);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode51 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration13.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration56.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode59 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration56.setHdpiMode(hdpiMode59);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode61 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration56.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode51 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode51.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode59 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode59.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode61 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode61.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23518");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType14);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = null;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode21);
        lwjgl3ApplicationConfiguration20.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration20.setTitle("");
        lwjgl3ApplicationConfiguration20.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.setResizable(true);
        lwjgl3ApplicationConfiguration30.setAudioConfig((int) '4', 1, (-1));
        lwjgl3ApplicationConfiguration30.setWindowPosition((int) (byte) 1, 100);
        lwjgl3ApplicationConfiguration30.setDecorated(false);
        lwjgl3ApplicationConfiguration30.setAudioConfig((int) (byte) -1, (int) 'a', 10);
        lwjgl3ApplicationConfiguration30.setAudioConfig((-1), 0, (int) '#');
        lwjgl3ApplicationConfiguration30.setWindowedMode(0, (int) ' ');
        lwjgl3ApplicationConfiguration30.useOpenGL3(false, 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration30.useVsync(true);
        lwjgl3ApplicationConfiguration30.setWindowPosition((int) (byte) 10, 0);
        lwjgl3ApplicationConfiguration30.setAudioConfig((int) (short) -1, (int) (short) -1, 10);
        com.badlogic.gdx.Files.FileType fileType67 = null;
        lwjgl3ApplicationConfiguration30.setPreferencesConfig("", fileType67);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration69 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode70 = null;
        lwjgl3ApplicationConfiguration69.setHdpiMode(hdpiMode70);
        lwjgl3ApplicationConfiguration69.useVsync(false);
        lwjgl3ApplicationConfiguration69.setDecorated(false);
        lwjgl3ApplicationConfiguration69.setWindowSizeLimits((int) (short) 1, 0, (int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration69.disableAudio(true);
        lwjgl3ApplicationConfiguration69.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration85 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration85.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode89 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration85.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration69.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode89);
        org.junit.Assert.assertTrue("'" + hdpiMode89 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode89.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23519");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) ' ', (int) (byte) 0, (int) (short) 100, (int) (short) 0, (int) 'a', (-1));
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType36);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1), (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 100, 0, (int) ' ', (int) (byte) 0, (int) (short) 100, 0);
    }

    @Test
    public void test23520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23520");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 1, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) -1, 0, (int) (byte) 1, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener38);
    }

    @Test
    public void test23521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23521");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, (int) 'a', 1, 1, (int) (short) 1, (int) '4', 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType28);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener32);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode34);
    }

    @Test
    public void test23522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23522");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test23523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23523");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = null;
        lwjgl3ApplicationConfiguration10.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration10.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration10.setFullscreenMode(displayMode16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration10.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setResizable(true);
        lwjgl3ApplicationConfiguration34.useOpenGL3(false, (int) (short) 100, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color42 = null;
        lwjgl3ApplicationConfiguration41.setInitialBackgroundColor(color42);
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration41.setInitialBackgroundColor(color44);
        lwjgl3ApplicationConfiguration41.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode48 = null;
        lwjgl3ApplicationConfiguration41.setFullscreenMode(displayMode48);
        com.badlogic.gdx.graphics.Color color50 = null;
        lwjgl3ApplicationConfiguration41.setInitialBackgroundColor(color50);
        lwjgl3ApplicationConfiguration41.setBackBufferConfig((int) (short) 10, (int) (short) 1, 1, (int) ' ', (int) (short) 10, (int) (short) 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration41.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration62.setResizable(false);
        com.badlogic.gdx.graphics.Color color65 = null;
        lwjgl3ApplicationConfiguration62.setInitialBackgroundColor(color65);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration67 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode68 = null;
        lwjgl3ApplicationConfiguration67.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration67.useVsync(false);
        lwjgl3ApplicationConfiguration67.setDecorated(false);
        lwjgl3ApplicationConfiguration67.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration76 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration76.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode79 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration76.setHdpiMode(hdpiMode79);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode81 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration76.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration67.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode79 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode79.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode81 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode81.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23524");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) '#', (int) (byte) 0, 10, (int) 'a', (int) (short) 10, 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (byte) -1, (int) ' ', (int) (short) 10);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode35);
    }

    @Test
    public void test23525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23525");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) (short) 100, (int) '4');
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test23526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23526");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 100, (int) '#', (int) 'a', (int) (short) 1, 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test23527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23527");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) (byte) 10, (int) (byte) 100, 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, 10);
    }

    @Test
    public void test23528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23528");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode4);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) 'a', (int) (byte) -1, (int) (short) 0, (int) (byte) 1, (-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23529");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, 0, 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (short) 10, (int) (byte) -1, (int) (byte) 10, (int) '#', 100, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode6 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode6.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23530");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', (int) (short) 1);
    }

    @Test
    public void test23531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23531");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType19);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test23532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23532");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) '#');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
    }

    @Test
    public void test23533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23533");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) (byte) 10, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType21);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType24);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) (byte) 1, 0);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test23534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23534");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, (int) (byte) 0, (int) (byte) -1, 10, 1, (int) (short) 1, 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, 100, (int) (short) 100, (int) (short) 10, (int) (byte) 1, (int) (short) -1, (int) 'a');
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test23535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23535");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (byte) 100, (int) (short) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (short) 100, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color37);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + hdpiMode6 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode6.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23536");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) (byte) 1, (int) (short) 100, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (byte) 1, (int) (short) -1, (int) '4', (int) (byte) 1, (int) (byte) 10, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType47 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType47);
    }

    @Test
    public void test23537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23537");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (short) 1, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
    }

    @Test
    public void test23538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23538");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) '4', (-1), (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 0, (int) (short) 1, 0, 1, (int) (short) 10, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration44.setResizable(true);
        lwjgl3ApplicationConfiguration44.useOpenGL3(false, (int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration44.setResizable(false);
        lwjgl3ApplicationConfiguration44.useVsync(false);
        lwjgl3ApplicationConfiguration44.useOpenGL3(true, (int) (short) 1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color60 = null;
        lwjgl3ApplicationConfiguration59.setInitialBackgroundColor(color60);
        lwjgl3ApplicationConfiguration59.setWindowedMode(0, (int) (short) 100);
        lwjgl3ApplicationConfiguration59.setWindowSizeLimits((int) '#', 0, 0, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration70 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode71 = null;
        lwjgl3ApplicationConfiguration70.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration70.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode76 = null;
        lwjgl3ApplicationConfiguration70.setFullscreenMode(displayMode76);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration78 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration78.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode81 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration78.setHdpiMode(hdpiMode81);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode83 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration78.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration70.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + hdpiMode81 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode81.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode83 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode83.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23539");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 1, (-1));
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) 'a');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
    }

    @Test
    public void test23540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23540");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = null;
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration15.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration15.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration15.disableAudio(false);
        lwjgl3ApplicationConfiguration15.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.setResizable(true);
        lwjgl3ApplicationConfiguration27.setAudioConfig((int) '4', 1, (-1));
        lwjgl3ApplicationConfiguration27.setWindowPosition((int) (byte) 1, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3ApplicationConfiguration27.setWindowListener(lwjgl3WindowListener37);
        lwjgl3ApplicationConfiguration27.setWindowSizeLimits(10, (int) (byte) 1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = null;
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration44.useVsync(false);
        lwjgl3ApplicationConfiguration44.disableAudio(false);
        lwjgl3ApplicationConfiguration44.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener53 = null;
        lwjgl3ApplicationConfiguration44.setWindowListener(lwjgl3WindowListener53);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration55.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode58 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration55.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode58);
        org.junit.Assert.assertTrue("'" + hdpiMode58 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode58.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23541");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, 1, 0, 0, (int) (short) 10, 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) (byte) 10, (int) (short) 10);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
    }

    @Test
    public void test23542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23542");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (short) 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode38);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', 0, (-1));
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test23543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23543");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 1, 0, (int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', (int) ' ');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test23544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23544");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType13);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 0, (int) '#');
    }

    @Test
    public void test23545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23545");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (-1), (int) (byte) 1, 0, 0, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), (int) (byte) -1, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test23546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23546");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) -1, (int) 'a');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) 'a');
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode37);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 100);
        java.lang.Class<?> wildcardClass43 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test23547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23547");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = null;
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode15);
        lwjgl3ApplicationConfiguration14.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration14.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration14.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration14.setResizable(false);
        lwjgl3ApplicationConfiguration14.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = null;
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode33);
        lwjgl3ApplicationConfiguration32.useVsync(false);
        lwjgl3ApplicationConfiguration32.setDecorated(false);
        lwjgl3ApplicationConfiguration32.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration41.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) 'a');
        com.badlogic.gdx.graphics.Color color57 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color57);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass65 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test23548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23548");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) (byte) 1, (int) (short) 100, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '#', 100, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (short) 100, (-1));
    }

    @Test
    public void test23549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23549");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', (int) (short) -1);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) '4');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (short) 10, 1);
    }

    @Test
    public void test23550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23550");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) (byte) 0, (int) (short) -1, 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, 0, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test23551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23551");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, 0, (int) '4', (int) (short) 10, (int) '#', (int) (byte) 0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), (int) (short) 10, (int) (short) 1, 0);
    }

    @Test
    public void test23552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23552");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) ' ', (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode28);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener38);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (int) (byte) 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test23553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23553");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType9);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (short) 0, (int) '#', 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) '4', (int) (short) -1);
    }

    @Test
    public void test23554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23554");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) '#', 100, (int) 'a', (int) (short) 100, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType22);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test23555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23555");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) -1, (int) ' ', (int) (short) 100, 1);
    }

    @Test
    public void test23556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23556");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) 'a', (int) (short) 10, (int) (short) -1, 10, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', 100, (int) (short) 0, 0, (int) (short) 10, (int) '#', (int) (short) 10);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
    }

    @Test
    public void test23557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23557");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (short) -1, 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (short) 0);
    }

    @Test
    public void test23558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23558");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, 0, (int) 'a', (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, 100, (int) (byte) -1, 100);
    }

    @Test
    public void test23559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23559");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', (-1));
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType28);
    }

    @Test
    public void test23560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23560");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (byte) 1, (int) (short) 0, (int) '#', (int) (byte) 10, 0, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (short) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (-1), 100, 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (byte) -1, (int) (short) -1, 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test23561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23561");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) 'a', (int) (byte) 100, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test23562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23562");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) ' ', 1, 0, 100, 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) -1, (int) (short) 10, (int) (short) 10, 10, 1, 10);
    }

    @Test
    public void test23563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23563");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (short) -1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) '4', (int) (byte) 0);
        java.lang.Class<?> wildcardClass38 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test23564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23564");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (short) 100, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode43);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, (int) 'a');
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color49);
    }

    @Test
    public void test23565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23565");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (-1));
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener35);
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23566");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 10, (int) (short) 10, (int) '4', (-1), 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType27);
    }

    @Test
    public void test23567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23567");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) '#', (int) (byte) 10, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
    }

    @Test
    public void test23568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23568");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (-1), (int) (short) 100, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, (int) ' ');
    }

    @Test
    public void test23569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23569");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode25);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType35);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color39);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode25 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode25.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23570");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
    }

    @Test
    public void test23571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23571");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 100, (int) 'a', (-1), 100, (int) (short) 10, 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (short) 0, 0, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode41 = null;
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode41);
        lwjgl3ApplicationConfiguration40.useVsync(false);
        lwjgl3ApplicationConfiguration40.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode47 = null;
        lwjgl3ApplicationConfiguration40.setFullscreenMode(displayMode47);
        lwjgl3ApplicationConfiguration40.setWindowPosition((int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration40.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = null;
        lwjgl3ApplicationConfiguration54.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration54.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode60 = null;
        lwjgl3ApplicationConfiguration54.setFullscreenMode(displayMode60);
        lwjgl3ApplicationConfiguration54.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color66 = null;
        lwjgl3ApplicationConfiguration54.setInitialBackgroundColor(color66);
        lwjgl3ApplicationConfiguration54.setResizable(false);
        lwjgl3ApplicationConfiguration54.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration72 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode73 = null;
        lwjgl3ApplicationConfiguration72.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration72.useVsync(false);
        lwjgl3ApplicationConfiguration72.setDecorated(false);
        lwjgl3ApplicationConfiguration72.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration81 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration81.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode84 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration81.setHdpiMode(hdpiMode84);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode86 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration81.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration72.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration54.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + hdpiMode84 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode84.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode86 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode86.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23572");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration10.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration10.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration10.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration10.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration20.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration20.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = null;
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration30.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration30.setPreferencesConfig("hi!", fileType37);
        lwjgl3ApplicationConfiguration30.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3ApplicationConfiguration30.setFullscreenMode(displayMode43);
        lwjgl3ApplicationConfiguration30.disableAudio(false);
        lwjgl3ApplicationConfiguration30.setBackBufferConfig((int) (short) 0, (int) 'a', 1, 1, (int) (short) 1, (int) '4', 0);
        lwjgl3ApplicationConfiguration30.setWindowedMode(1, (int) '#');
        lwjgl3ApplicationConfiguration30.setAudioConfig((int) (byte) 0, (int) (short) 0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode63 = null;
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode63);
        lwjgl3ApplicationConfiguration62.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration62.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode78 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration10.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + hdpiMode78 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode78.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23573");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test23574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23574");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (short) -1, 100);
    }

    @Test
    public void test23575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23575");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = null;
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration11.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration11.setFullscreenMode(displayMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, 0, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23576");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (-1));
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
    }

    @Test
    public void test23577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23577");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (short) 1, (int) (byte) 0, (int) (byte) 100, (int) (short) 10, 0, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test23578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23578");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (byte) -1, 0, (int) (byte) -1, 100, (int) '4', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) 'a', (int) (short) 1);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType39);
    }

    @Test
    public void test23579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23579");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, 0, (int) (byte) 10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (short) 1, (int) (short) 1);
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType28);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) 'a', 1, 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23580");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (short) -1, (int) '4');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test23581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23581");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 1, (int) (short) 10, (int) '#', (int) (byte) 1, (int) (short) 10, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test23582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23582");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = null;
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode15);
        lwjgl3ApplicationConfiguration14.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration14.setPreferencesConfig("hi!", fileType21);
        lwjgl3ApplicationConfiguration14.setWindowPosition((int) 'a', (int) '#');
        lwjgl3ApplicationConfiguration14.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration28.setInitialBackgroundColor(color29);
        lwjgl3ApplicationConfiguration28.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3ApplicationConfiguration28.setWindowListener(lwjgl3WindowListener34);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration28.setInitialBackgroundColor(color36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = null;
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration38.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType45 = null;
        lwjgl3ApplicationConfiguration38.setPreferencesConfig("hi!", fileType45);
        lwjgl3ApplicationConfiguration38.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode51 = null;
        lwjgl3ApplicationConfiguration38.setFullscreenMode(displayMode51);
        lwjgl3ApplicationConfiguration38.disableAudio(false);
        lwjgl3ApplicationConfiguration38.setBackBufferConfig((int) (short) 0, (int) 'a', 1, 1, (int) (short) 1, (int) '4', 0);
        lwjgl3ApplicationConfiguration38.setWindowedMode(1, (int) '#');
        lwjgl3ApplicationConfiguration38.setAudioConfig((int) (byte) 0, (int) (short) 0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration70 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode71 = null;
        lwjgl3ApplicationConfiguration70.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration70.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration70.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode86 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration70.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode86 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode86.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23583");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType15);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (byte) 1, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode6 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode6.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23584");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) '4', (-1), (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (short) 1, 1, 10, (int) (byte) 10, (int) (short) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = null;
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration37.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration37.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration37.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration37.setWindowedMode((int) (short) -1, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode60 = null;
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode60);
        lwjgl3ApplicationConfiguration59.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode65 = null;
        lwjgl3ApplicationConfiguration59.setFullscreenMode(displayMode65);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration67 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration67.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode70 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration67.setHdpiMode(hdpiMode70);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode72 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration67.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, 10, (int) (short) 1, (int) (short) 10, (int) (short) -1, 10, 0);
        org.junit.Assert.assertTrue("'" + hdpiMode70 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode70.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode72 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode72.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23585");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) 'a');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (byte) -1);
    }

    @Test
    public void test23586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23586");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 100, (int) '#', (int) 'a', (int) (short) 1, 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
    }

    @Test
    public void test23587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23587");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) '4', (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType34);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) (byte) -1, (int) (byte) 10, (int) (short) 100, 10, (int) '#', (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener44 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener44);
    }

    @Test
    public void test23588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23588");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode14);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode14);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType18);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (short) 1, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType32);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode14 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode14.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23589");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) 'a', 1, 100, (-1));
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType32);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, (int) '#', (-1), (-1), (int) (short) 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, 0, 0, (int) (short) 100, 1, (int) (byte) 1, (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (byte) 10, 10, (int) (byte) 1, (int) (byte) -1, 1, (int) (byte) -1);
    }

    @Test
    public void test23590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23590");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType9);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (byte) -1, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) '#', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test23591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23591");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType23);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener34);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = null;
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration38.useVsync(false);
        lwjgl3ApplicationConfiguration38.setDecorated(false);
        lwjgl3ApplicationConfiguration38.setWindowSizeLimits((int) (byte) 10, (int) 'a', (int) (byte) 100, 10);
        lwjgl3ApplicationConfiguration38.setTitle("");
        lwjgl3ApplicationConfiguration38.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = null;
        lwjgl3ApplicationConfiguration54.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration54.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode60 = null;
        lwjgl3ApplicationConfiguration54.setFullscreenMode(displayMode60);
        lwjgl3ApplicationConfiguration54.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color66 = null;
        lwjgl3ApplicationConfiguration54.setInitialBackgroundColor(color66);
        lwjgl3ApplicationConfiguration54.setResizable(false);
        lwjgl3ApplicationConfiguration54.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType73 = null;
        lwjgl3ApplicationConfiguration54.setPreferencesConfig("hi!", fileType73);
        lwjgl3ApplicationConfiguration54.setAudioConfig((int) '#', (int) (short) -1, 100);
        lwjgl3ApplicationConfiguration54.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration81 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration81.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode84 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration81.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration54.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode84);
        com.badlogic.gdx.graphics.Color color89 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color89);
        org.junit.Assert.assertTrue("'" + hdpiMode84 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode84.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23592");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) '#');
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (short) 10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 1, (-1), (int) 'a', (int) (short) -1, (int) '#', (int) '#');
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType33);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener39);
        com.badlogic.gdx.Graphics.DisplayMode displayMode41 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode41);
    }

    @Test
    public void test23593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23593");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = null;
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode15);
        lwjgl3ApplicationConfiguration14.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration14.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration14.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration14.setResizable(false);
        lwjgl3ApplicationConfiguration14.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = null;
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode33);
        lwjgl3ApplicationConfiguration32.useVsync(false);
        lwjgl3ApplicationConfiguration32.setDecorated(false);
        lwjgl3ApplicationConfiguration32.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration41.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color57 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color57);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23594");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = null;
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration23.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration23.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration23.setWindowPosition(10, 100);
        lwjgl3ApplicationConfiguration23.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = null;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode37);
        lwjgl3ApplicationConfiguration36.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration36.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration36.disableAudio(false);
        lwjgl3ApplicationConfiguration36.setAudioConfig((int) ' ', 10, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode61 = null;
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration60.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener66 = null;
        lwjgl3ApplicationConfiguration60.setWindowListener(lwjgl3WindowListener66);
        lwjgl3ApplicationConfiguration60.setDecorated(true);
        lwjgl3ApplicationConfiguration60.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener72 = null;
        lwjgl3ApplicationConfiguration60.setWindowListener(lwjgl3WindowListener72);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode74 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode52 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode52.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode74 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode74.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23595");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) ' ', (int) ' ');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) '#');
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test23596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23596");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test23597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23597");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) '4');
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.setResizable(true);
        lwjgl3ApplicationConfiguration14.useOpenGL3(false, (int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration14.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration14.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration14.setWindowedMode((int) (byte) 1, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration28.setInitialBackgroundColor(color29);
        lwjgl3ApplicationConfiguration28.setWindowedMode(0, (int) (short) 100);
        lwjgl3ApplicationConfiguration28.setWindowSizeLimits((int) '#', 0, 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration28.setInitialBackgroundColor(color39);
        com.badlogic.gdx.Graphics.DisplayMode displayMode41 = null;
        lwjgl3ApplicationConfiguration28.setFullscreenMode(displayMode41);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = null;
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration43.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType50 = null;
        lwjgl3ApplicationConfiguration43.setPreferencesConfig("hi!", fileType50);
        lwjgl3ApplicationConfiguration43.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration43.setAudioConfig((int) (byte) 1, (int) (short) 0, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration60.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode63 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode63);
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode63);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode63);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode63);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode63);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', 10, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) (short) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + hdpiMode63 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode63.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23598");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 0, (int) '4', (int) (byte) -1, 100, (int) '4', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(10, (int) '#', (int) '#', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test23599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23599");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
    }

    @Test
    public void test23600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23600");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test23601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23601");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23602");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 10, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, 0, (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, (int) (short) 1, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test23603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23603");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) (byte) 10, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType21);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (int) 'a', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) ' ', (-1), (int) (byte) 0, (int) (byte) 0, (int) (byte) 1, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test23604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23604");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 1, (int) (byte) -1, (-1));
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
    }

    @Test
    public void test23605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23605");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 100, (int) '#', (int) 'a', (int) (short) 1, 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) '#', (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test23606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23606");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) ' ', (int) (byte) 10, 10, 0, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, (-1));
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test23607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23607");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) 'a');
    }

    @Test
    public void test23608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23608");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType13);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) 'a', (int) ' ', 0, 0, 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test23609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23609");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test23610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23610");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, 100);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.setResizable(true);
        lwjgl3ApplicationConfiguration21.setAudioConfig((int) '4', 1, (-1));
        lwjgl3ApplicationConfiguration21.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration21.setWindowListener(lwjgl3WindowListener30);
        lwjgl3ApplicationConfiguration21.useOpenGL3(true, 0, (int) ' ');
        lwjgl3ApplicationConfiguration21.useVsync(false);
        lwjgl3ApplicationConfiguration21.setDecorated(false);
        lwjgl3ApplicationConfiguration21.setAudioConfig((int) (short) -1, (int) ' ', (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = null;
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration44.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode50 = null;
        lwjgl3ApplicationConfiguration44.setFullscreenMode(displayMode50);
        lwjgl3ApplicationConfiguration44.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color56 = null;
        lwjgl3ApplicationConfiguration44.setInitialBackgroundColor(color56);
        lwjgl3ApplicationConfiguration44.setResizable(false);
        lwjgl3ApplicationConfiguration44.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode63 = null;
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode63);
        lwjgl3ApplicationConfiguration62.useVsync(false);
        lwjgl3ApplicationConfiguration62.setDecorated(false);
        lwjgl3ApplicationConfiguration62.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration71 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration71.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode74 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration71.setHdpiMode(hdpiMode74);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode76 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration71.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) -1, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + hdpiMode74 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode74.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode76 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode76.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23611");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, 0, (int) 'a', (int) (short) 10, (int) ' ', (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, 100, (int) (byte) -1, 1, (int) (short) 1, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test23612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23612");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (short) 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) '4', (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode43);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener47 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener47);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test23613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23613");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) 'a', 1, 100, (-1));
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType29);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) 100, (int) (byte) 100, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) '4', 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, 100, (int) (byte) 1, (int) (short) -1, (int) (short) 1, (int) (short) 1, (-1));
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 1, 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test23614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23614");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, (int) 'a', 1, 1, (int) (short) 1, (int) '4', 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) (short) 0, 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test23615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23615");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) -1, 10, 10, 0);
    }

    @Test
    public void test23616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23616");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (short) 0, 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) 'a', (int) (byte) -1, 1, (int) (byte) 100, (int) '#', 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener48 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener48);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', 1, (int) (byte) 1, (int) (short) 0, 10, 10, 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test23617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23617");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) (byte) 1, (int) (short) 100, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType40);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color44);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (short) -1, 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test23618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23618");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-1), (int) 'a');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) '4');
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color36);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType39);
    }

    @Test
    public void test23619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23619");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) ' ');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) ' ', (int) '4');
    }

    @Test
    public void test23620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23620");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', 100, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(10, 0, 10, (int) (byte) 10);
    }

    @Test
    public void test23621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23621");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = null;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode37);
        lwjgl3ApplicationConfiguration36.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType43 = null;
        lwjgl3ApplicationConfiguration36.setPreferencesConfig("hi!", fileType43);
        lwjgl3ApplicationConfiguration36.setWindowPosition((int) 'a', (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode48 = null;
        lwjgl3ApplicationConfiguration36.setFullscreenMode(displayMode48);
        lwjgl3ApplicationConfiguration36.setWindowPosition((int) '4', (int) ' ');
        lwjgl3ApplicationConfiguration36.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode56 = null;
        lwjgl3ApplicationConfiguration55.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration55.useVsync(false);
        lwjgl3ApplicationConfiguration55.setDecorated(false);
        lwjgl3ApplicationConfiguration55.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration64.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode67 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode67);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode69 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration55.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) '4', (int) (short) 0, 0, (int) 'a', 1, 10);
        com.badlogic.gdx.graphics.Color color82 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color82);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (byte) -1, (int) '4', 10, (int) (byte) 10, (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode67 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode67.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode69 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode69.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23622");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType20);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 10, (-1), (int) (byte) 0, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
    }

    @Test
    public void test23623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23623");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) ' ', (int) 'a', 100, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType26);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode28);
    }

    @Test
    public void test23624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23624");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) '4', (-1), (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) -1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(10, (int) (byte) 10, 0, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration38.setInitialBackgroundColor(color39);
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3ApplicationConfiguration38.setInitialBackgroundColor(color41);
        lwjgl3ApplicationConfiguration38.setDecorated(false);
        lwjgl3ApplicationConfiguration38.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration38.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        lwjgl3ApplicationConfiguration38.setAudioConfig((int) (short) 0, (int) (short) -1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color59 = null;
        lwjgl3ApplicationConfiguration58.setInitialBackgroundColor(color59);
        lwjgl3ApplicationConfiguration58.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode64 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration58.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (-1));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode73 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode73);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + hdpiMode64 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode64.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23625");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 10, (int) (short) 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) 'a', (int) (byte) 100, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) 'a', (int) (short) 10, (int) '#', (int) (short) 1, (int) '4', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color35);
    }

    @Test
    public void test23626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23626");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(1, 10, 0, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test23627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23627");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.setResizable(true);
        lwjgl3ApplicationConfiguration25.useOpenGL3(false, (int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration25.setResizable(false);
        lwjgl3ApplicationConfiguration25.useOpenGL3(true, 0, (int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration25.setPreferencesConfig("", fileType39);
        lwjgl3ApplicationConfiguration25.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = null;
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration43.useVsync(false);
        lwjgl3ApplicationConfiguration43.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode50 = null;
        lwjgl3ApplicationConfiguration43.setFullscreenMode(displayMode50);
        lwjgl3ApplicationConfiguration43.setWindowPosition((int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration43.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode58 = null;
        lwjgl3ApplicationConfiguration57.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration57.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode63 = null;
        lwjgl3ApplicationConfiguration57.setFullscreenMode(displayMode63);
        lwjgl3ApplicationConfiguration57.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color69 = null;
        lwjgl3ApplicationConfiguration57.setInitialBackgroundColor(color69);
        lwjgl3ApplicationConfiguration57.setResizable(false);
        lwjgl3ApplicationConfiguration57.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration75 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode76 = null;
        lwjgl3ApplicationConfiguration75.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration75.useVsync(false);
        lwjgl3ApplicationConfiguration75.setDecorated(false);
        lwjgl3ApplicationConfiguration75.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration84 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration84.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode87 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration84.setHdpiMode(hdpiMode87);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode89 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration84.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration75.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration57.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + hdpiMode87 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode87.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode89 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode89.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23628");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) 'a');
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType31);
    }

    @Test
    public void test23629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23629");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', 100, (-1), (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 0, 1, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test23630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23630");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color38);
    }

    @Test
    public void test23631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23631");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = null;
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration22.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3ApplicationConfiguration22.setFullscreenMode(displayMode28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode35 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode35);
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode35);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode35);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 10, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + hdpiMode33 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode33.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode35 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode35.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23632");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = null;
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration23.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration23.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration23.setAudioConfig((int) (short) -1, (int) ' ', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3ApplicationConfiguration23.setWindowListener(lwjgl3WindowListener35);
        lwjgl3ApplicationConfiguration23.useVsync(true);
        lwjgl3ApplicationConfiguration23.useVsync(false);
        lwjgl3ApplicationConfiguration23.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration43.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + hdpiMode47 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode47.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23633");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, (int) (byte) 1, (int) (byte) 10, 10, 100, (int) (byte) 1, (int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType33);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener38);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode40);
    }

    @Test
    public void test23634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23634");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 0, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) 'a', 0, 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (byte) 0, (int) (short) 1, (int) (short) -1, (int) '#', (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test23635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23635");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
    }

    @Test
    public void test23636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23636");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) -1, 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 100, (int) '4', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) -1, (-1), 0, (int) 'a');
    }

    @Test
    public void test23637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23637");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = null;
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration11.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration11.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration11.setPreferencesConfig("", fileType20);
        lwjgl3ApplicationConfiguration11.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = null;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration24.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration24.setFullscreenMode(displayMode30);
        lwjgl3ApplicationConfiguration24.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration24.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration24.setWindowPosition((int) (short) 100, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) '4', (int) (short) 0);
        com.badlogic.gdx.graphics.Color color55 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color55);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener57 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener57);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode47 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode47.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23638");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) -1, 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 100, (int) '4', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, 1, (int) (short) 1);
    }

    @Test
    public void test23639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23639");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) (byte) 1, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test23640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23640");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) '4', (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener36);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test23641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23641");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode38);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color42 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color42);
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23642");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 0, 0, (int) (byte) -1, (int) (byte) 100, 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) -1, (int) (byte) 10, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test23643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23643");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, (int) 'a', 1, 1, (int) (short) 1, (int) '4', 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) (short) 0, 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, 0, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, 1, (-1), (int) '4', (int) (short) 10, (int) (short) 0, 10);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode49 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode49);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) (short) 0, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test23644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23644");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType10);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, 10, 0, 0, (int) '4', (int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', 1, (int) '#', (int) (byte) 10, (int) (short) 1, (int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', 10, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color38);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test23645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23645");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType34);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test23646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23646");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) 'a');
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType35);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) 1, (int) '#', (int) '4');
        com.badlogic.gdx.graphics.Color color42 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color42);
    }

    @Test
    public void test23647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23647");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, 0);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test23648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23648");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) '#');
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (short) 10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test23649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23649");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) '#');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', 10);
    }

    @Test
    public void test23650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23650");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 10, (int) (short) -1, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = null;
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration31.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType38 = null;
        lwjgl3ApplicationConfiguration31.setPreferencesConfig("hi!", fileType38);
        lwjgl3ApplicationConfiguration31.setWindowPosition((int) 'a', (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3ApplicationConfiguration31.setFullscreenMode(displayMode43);
        lwjgl3ApplicationConfiguration31.setWindowPosition((int) '4', (int) ' ');
        lwjgl3ApplicationConfiguration31.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode51 = null;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration50.useVsync(false);
        lwjgl3ApplicationConfiguration50.setDecorated(false);
        lwjgl3ApplicationConfiguration50.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration59.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode62 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode62);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode64 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + hdpiMode62 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode62.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode64 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode64.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23651");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) 'a', 100, (int) (short) -1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 1, 0, (int) (short) 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 100, (-1), 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (int) (byte) 10, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener39);
    }

    @Test
    public void test23652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23652");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType23);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 100, (int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType32);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test23653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23653");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) (byte) 0, 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode34 = null;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode34);
        lwjgl3ApplicationConfiguration33.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3ApplicationConfiguration33.setWindowListener(lwjgl3WindowListener39);
        com.badlogic.gdx.Files.FileType fileType42 = null;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("", fileType42);
        lwjgl3ApplicationConfiguration33.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = null;
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration46.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode52 = null;
        lwjgl3ApplicationConfiguration46.setFullscreenMode(displayMode52);
        lwjgl3ApplicationConfiguration46.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration46.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration46.setWindowPosition((int) (short) 100, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode69 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode69 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode69.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23654");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) -1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 1, (int) '4');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (-1), 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) ' ', (int) ' ', (int) '4', (int) (short) -1, 1, 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, (int) '#');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
    }

    @Test
    public void test23655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23655");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType33);
    }

    @Test
    public void test23656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23656");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = null;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode14);
        lwjgl3ApplicationConfiguration13.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration13.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration13.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration13.setResizable(false);
        lwjgl3ApplicationConfiguration13.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("hi!", fileType32);
        lwjgl3ApplicationConfiguration13.setAudioConfig((int) '#', (int) (short) -1, 100);
        lwjgl3ApplicationConfiguration13.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration40.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1), (int) '#');
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23657");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (byte) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (-1), (int) (short) 1, (int) (short) 0, 0, (int) (short) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 10);
    }

    @Test
    public void test23658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23658");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 10, (int) ' ');
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType34);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) '4');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (byte) 10, 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 10, (int) (byte) 1, (int) '#', (int) 'a', 0, (int) 'a');
    }

    @Test
    public void test23659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23659");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (short) 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) '4', (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode40);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (short) 100, (int) (short) 10, 100, (int) (byte) 0, (int) (short) 1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) '#');
    }

    @Test
    public void test23660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23660");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) 'a', 1, 100, (-1));
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) (short) 1, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) ' ');
    }

    @Test
    public void test23661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23661");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType37);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test23662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23662");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) '#', (int) (byte) 0, 10, (int) 'a', (int) (short) 10, 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (byte) -1, (int) ' ', (int) (short) 10);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType26);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (byte) 0);
    }

    @Test
    public void test23663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23663");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) -1, 1, (int) (short) 0, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType19);
    }

    @Test
    public void test23664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23664");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (-1), (int) (byte) 100, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
    }

    @Test
    public void test23665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23665");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (-1));
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test23666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23666");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 0, (int) '#', (int) (short) 1, (int) (short) 0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '#', (int) '4', 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = null;
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration18.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration18.setPreferencesConfig("hi!", fileType25);
        lwjgl3ApplicationConfiguration18.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration18.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration18.disableAudio(false);
        lwjgl3ApplicationConfiguration18.setBackBufferConfig((int) (short) 0, (int) 'a', 1, 1, (int) (short) 1, (int) '4', 0);
        lwjgl3ApplicationConfiguration18.setWindowedMode(1, (int) '#');
        lwjgl3ApplicationConfiguration18.setAudioConfig((int) (byte) 0, (int) (short) 0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode51 = null;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration50.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration50.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode66 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) '4', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (-1));
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color79 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color79);
        org.junit.Assert.assertTrue("'" + hdpiMode66 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode66.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23667");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = null;
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration23.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration23.setPreferencesConfig("hi!", fileType30);
        lwjgl3ApplicationConfiguration23.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration23.setAudioConfig((int) (byte) 1, (int) (short) 0, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration40.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (byte) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) (short) -1);
        com.badlogic.gdx.Files.FileType fileType59 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType59);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23668");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 10, (int) (short) -1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 1, (int) (byte) -1, (int) (short) -1, 1, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test23669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23669");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23670");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener33);
    }

    @Test
    public void test23671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23671");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(10, (int) (byte) 100, 10, (int) 'a');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, 0, (-1), 10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) (byte) 100, (-1), (int) (byte) 0);
    }

    @Test
    public void test23672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23672");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(10, (int) (short) 0, (int) (byte) 100, (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 100, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode32);
        java.lang.Class<?> wildcardClass34 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test23673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23673");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) ' ', 1, (int) (byte) 1, 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener34);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color36);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType39);
        com.badlogic.gdx.Files.FileType fileType42 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType42);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test23674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23674");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 10, (int) (short) 10, (int) 'a', 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = null;
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration37.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3ApplicationConfiguration37.setFullscreenMode(displayMode43);
        lwjgl3ApplicationConfiguration37.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3ApplicationConfiguration37.setInitialBackgroundColor(color49);
        lwjgl3ApplicationConfiguration37.setResizable(false);
        lwjgl3ApplicationConfiguration37.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode56 = null;
        lwjgl3ApplicationConfiguration55.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration55.useVsync(false);
        lwjgl3ApplicationConfiguration55.setDecorated(false);
        lwjgl3ApplicationConfiguration55.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration64.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode67 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode67);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode69 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration55.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 100, 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', 0);
        com.badlogic.gdx.Files.FileType fileType85 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType85);
        org.junit.Assert.assertTrue("'" + hdpiMode67 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode67.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode69 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode69.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23675");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) (short) 100, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
    }

    @Test
    public void test23676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23676");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType15);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) '#');
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType25);
        org.junit.Assert.assertTrue("'" + hdpiMode6 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode6.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23677");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 1, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 1, (int) '4');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23678");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode30);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1), (-1));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, (int) (short) 100, (int) (short) 10, (int) (byte) -1, 10, (int) 'a', (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color45 = null;
        lwjgl3ApplicationConfiguration44.setInitialBackgroundColor(color45);
        com.badlogic.gdx.graphics.Color color47 = null;
        lwjgl3ApplicationConfiguration44.setInitialBackgroundColor(color47);
        lwjgl3ApplicationConfiguration44.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode51 = null;
        lwjgl3ApplicationConfiguration44.setFullscreenMode(displayMode51);
        lwjgl3ApplicationConfiguration44.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode56 = null;
        lwjgl3ApplicationConfiguration55.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration55.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode61 = null;
        lwjgl3ApplicationConfiguration55.setFullscreenMode(displayMode61);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration63.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode66 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration63.setHdpiMode(hdpiMode66);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode68 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration63.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration55.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode66 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode66.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode68 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode68.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23679");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 10, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test23680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23680");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test23681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23681");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) '#', 10);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) '#');
    }

    @Test
    public void test23682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23682");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) (short) 10, (int) (byte) 0, (int) '#');
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) '4', 0, 1, (int) '#', (int) (byte) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) 10, (int) '#', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = null;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration27.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration27.setWindowListener(lwjgl3WindowListener33);
        lwjgl3ApplicationConfiguration27.setAudioConfig((int) (short) -1, (int) ' ', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3ApplicationConfiguration27.setWindowListener(lwjgl3WindowListener39);
        lwjgl3ApplicationConfiguration27.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = null;
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration43.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener49 = null;
        lwjgl3ApplicationConfiguration43.setWindowListener(lwjgl3WindowListener49);
        lwjgl3ApplicationConfiguration43.setAudioConfig((int) (short) -1, (int) ' ', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener55 = null;
        lwjgl3ApplicationConfiguration43.setWindowListener(lwjgl3WindowListener55);
        lwjgl3ApplicationConfiguration43.useVsync(true);
        lwjgl3ApplicationConfiguration43.useVsync(false);
        lwjgl3ApplicationConfiguration43.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration63.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode67 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration63.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, (int) (short) -1, 1, (int) (short) 1, 1, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + hdpiMode67 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode67.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23683");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (-1));
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test23684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23684");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType9);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 10, 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) (byte) 100, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 0, 0);
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType32);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) 'a', (int) 'a', 100, (int) (short) 1, 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) '4', (int) ' ', (int) (byte) 1, (int) (byte) 0, (int) (byte) 100, 100);
    }

    @Test
    public void test23685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23685");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) 'a');
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType30);
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType33);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) 'a', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener39);
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23686");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, 1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(1, (int) (short) 0, 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) 'a', (int) (byte) 10, (int) '4', (int) 'a', 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', 1, 100, (int) (short) -1, (int) (byte) 100, (int) (byte) 10, 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test23687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23687");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, 0, 0, 0, (int) (short) 1, (int) (short) 100, (int) ' ');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, 1, (int) '4', 10, (int) (short) 100, (int) (short) 0, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener42);
    }

    @Test
    public void test23688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23688");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) 0, (int) 'a', (int) 'a');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (byte) 10, (int) 'a', (int) '#', (int) '4', (int) (short) -1, 10);
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType32);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, 10);
    }

    @Test
    public void test23689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23689");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) '#');
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType24);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, 10);
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test23690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23690");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) '4', (-1), (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, 0);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test23691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23691");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType15);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) -1, 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test23692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23692");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) '4', (-1), (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) -1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, 100, (int) (byte) -1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener46 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener46);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color50 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color50);
        com.badlogic.gdx.Files.FileType fileType53 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType53);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) ' ', (int) '4', (int) (byte) -1, 1);
    }

    @Test
    public void test23693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23693");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 1, (int) (short) 10, (int) '#', (int) (byte) 1, (int) (short) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) '#', 10, (int) '4', 10, (-1));
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (short) 10, (int) '4', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
    }

    @Test
    public void test23694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23694");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType9);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test23695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23695");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 100, (int) (short) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener39);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode43);
        com.badlogic.gdx.Graphics.DisplayMode displayMode45 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode45);
    }

    @Test
    public void test23696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23696");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) 'a', (int) (short) 1, 0, (int) (byte) 100, 0, (int) (short) 100);
    }

    @Test
    public void test23697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23697");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, 1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) ' ');
    }

    @Test
    public void test23698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23698");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType24);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) (short) 10, (int) (short) 1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode34 = null;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode34);
        lwjgl3ApplicationConfiguration33.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3ApplicationConfiguration33.setFullscreenMode(displayMode39);
        lwjgl3ApplicationConfiguration33.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration33.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration33.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration33.disableAudio(false);
        com.badlogic.gdx.graphics.Color color58 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color58);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener60 = null;
        lwjgl3ApplicationConfiguration33.setWindowListener(lwjgl3WindowListener60);
        lwjgl3ApplicationConfiguration33.useOpenGL3(true, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration33.setWindowedMode((int) (byte) 1, 100);
        com.badlogic.gdx.Files.FileType fileType70 = null;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("", fileType70);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener72 = null;
        lwjgl3ApplicationConfiguration33.setWindowListener(lwjgl3WindowListener72);
        lwjgl3ApplicationConfiguration33.setDecorated(true);
        lwjgl3ApplicationConfiguration33.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType79 = null;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("", fileType79);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration81 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode82 = null;
        lwjgl3ApplicationConfiguration81.setHdpiMode(hdpiMode82);
        lwjgl3ApplicationConfiguration81.useVsync(false);
        lwjgl3ApplicationConfiguration81.disableAudio(false);
        lwjgl3ApplicationConfiguration81.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener90 = null;
        lwjgl3ApplicationConfiguration81.setWindowListener(lwjgl3WindowListener90);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration92 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration92.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode95 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration92.setHdpiMode(hdpiMode95);
        lwjgl3ApplicationConfiguration81.setHdpiMode(hdpiMode95);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode95);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode95);
        org.junit.Assert.assertTrue("'" + hdpiMode95 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode95.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23699");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 1, (int) (byte) 100, 0, 0, (int) 'a', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) '4', (int) (byte) 0, 100);
    }

    @Test
    public void test23700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23700");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) 'a', (int) (short) 1, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) ' ');
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (short) 10, (int) (short) 0, 1);
    }

    @Test
    public void test23701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23701");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 0, (int) (short) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) '4');
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType20);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType23);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) (byte) 0, (int) (byte) 0, (int) (byte) 100, 0, 1, (int) (byte) 100);
    }

    @Test
    public void test23702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23702");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test23703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23703");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 10, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) 'a', (int) (short) -1, (-1), (int) (byte) 1, 100, 10);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color39);
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color41);
    }

    @Test
    public void test23704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23704");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) 'a', 1, 100, (-1));
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, 0, (-1), (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) '4');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test23705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23705");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) (short) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test23706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23706");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration19.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration19.setResizable(true);
        lwjgl3ApplicationConfiguration19.setTitle("");
        lwjgl3ApplicationConfiguration19.setWindowedMode((int) (short) 100, 1);
        lwjgl3ApplicationConfiguration19.setAudioConfig(100, (int) '#', 10);
        lwjgl3ApplicationConfiguration19.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color41);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration43.setInitialBackgroundColor(color44);
        lwjgl3ApplicationConfiguration43.setWindowPosition((int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration43.setWindowSizeLimits((int) '#', (int) (short) -1, (int) (byte) -1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration43.useVsync(false);
        lwjgl3ApplicationConfiguration43.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color59 = null;
        lwjgl3ApplicationConfiguration58.setInitialBackgroundColor(color59);
        com.badlogic.gdx.graphics.Color color61 = null;
        lwjgl3ApplicationConfiguration58.setInitialBackgroundColor(color61);
        lwjgl3ApplicationConfiguration58.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode66 = null;
        lwjgl3ApplicationConfiguration65.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration65.useVsync(false);
        lwjgl3ApplicationConfiguration65.setDecorated(false);
        lwjgl3ApplicationConfiguration65.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration74 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration74.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode77 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration74.setHdpiMode(hdpiMode77);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode79 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration74.setHdpiMode(hdpiMode79);
        lwjgl3ApplicationConfiguration65.setHdpiMode(hdpiMode79);
        lwjgl3ApplicationConfiguration58.setHdpiMode(hdpiMode79);
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode79);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode79);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode79);
        com.badlogic.gdx.Graphics.DisplayMode displayMode86 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode86);
        org.junit.Assert.assertTrue("'" + hdpiMode77 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode77.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode79 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode79.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23707");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 10, 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener34);
    }

    @Test
    public void test23708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23708");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 1, 0, (int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23709");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', 10, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = null;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration24.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration24.setWindowListener(lwjgl3WindowListener30);
        lwjgl3ApplicationConfiguration24.setDecorated(true);
        lwjgl3ApplicationConfiguration24.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration24.setWindowListener(lwjgl3WindowListener36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(10, (int) (byte) 10, (int) '#', 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) (byte) 10, (int) '#', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode60 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode60);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23710");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType22);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) (byte) 10, (-1));
    }

    @Test
    public void test23711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23711");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 1, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        org.junit.Assert.assertTrue("'" + hdpiMode6 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode6.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23712");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (byte) 0, 100, (-1));
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType26);
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType29);
    }

    @Test
    public void test23713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23713");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) '#', 0, (int) (short) 0, 100, 0, 100);
    }

    @Test
    public void test23714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23714");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (byte) 10, (int) (short) 100, (int) '#', 100, (int) (byte) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener43 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener43);
        com.badlogic.gdx.graphics.Color color45 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color45);
        com.badlogic.gdx.graphics.Color color47 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color47);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        com.badlogic.gdx.Files.FileType fileType55 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType55);
    }

    @Test
    public void test23715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23715");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType29);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color33);
    }

    @Test
    public void test23716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23716");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test23717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23717");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) (byte) -1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) (short) -1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, 100, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode35);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, (int) 'a');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) (short) 0, 100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) 0);
    }

    @Test
    public void test23718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23718");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) (short) 1, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) -1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test23719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23719");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
    }

    @Test
    public void test23720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23720");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) ' ', 1, (int) (byte) 1, 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode35);
    }

    @Test
    public void test23721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23721");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) -1, 0, 0, (int) (short) -1);
    }

    @Test
    public void test23722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23722");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = null;
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration15.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration15.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration15.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration15.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration15.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration15.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3ApplicationConfiguration40.setInitialBackgroundColor(color41);
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3ApplicationConfiguration40.setInitialBackgroundColor(color43);
        lwjgl3ApplicationConfiguration40.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode48 = null;
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode48);
        lwjgl3ApplicationConfiguration47.useVsync(false);
        lwjgl3ApplicationConfiguration47.setDecorated(false);
        lwjgl3ApplicationConfiguration47.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration56.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode59 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration56.setHdpiMode(hdpiMode59);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode61 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration56.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType70 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType70);
        org.junit.Assert.assertTrue("'" + hdpiMode59 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode59.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode61 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode61.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23723");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 0, (int) (byte) 10, (int) (short) 0, 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener39);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener41);
    }

    @Test
    public void test23724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23724");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType22);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test23725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23725");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) '4', (-1), (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = null;
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration37.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType44 = null;
        lwjgl3ApplicationConfiguration37.setPreferencesConfig("hi!", fileType44);
        lwjgl3ApplicationConfiguration37.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration37.setAudioConfig((int) (byte) 1, (int) (short) 0, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration54.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode57 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration54.setHdpiMode(hdpiMode57);
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode57);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode57);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + hdpiMode57 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode57.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23726");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType17);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (-1), 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, 10, (int) '4');
    }

    @Test
    public void test23727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23727");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) 'a', (int) (short) 1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 10, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test23728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23728");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, 100);
    }

    @Test
    public void test23729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23729");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) -1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration20.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode26);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType30);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType37);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) (short) 0, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) 'a', (int) (short) -1, 0, 0, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23730");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) (byte) -1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) '#', (int) (byte) 0, (int) ' ', (int) (short) -1, (int) (short) 100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) '4');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode40);
    }

    @Test
    public void test23731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23731");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) -1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration20.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode26);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType30);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) (byte) 0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration40.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode43);
        com.badlogic.gdx.graphics.Color color46 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color46);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23732");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) '#', (int) (byte) 10, (-1));
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = null;
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration23.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration23.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration23.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration23.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration23.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration23.disableAudio(false);
        com.badlogic.gdx.graphics.Color color48 = null;
        lwjgl3ApplicationConfiguration23.setInitialBackgroundColor(color48);
        lwjgl3ApplicationConfiguration23.useVsync(true);
        lwjgl3ApplicationConfiguration23.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = null;
        lwjgl3ApplicationConfiguration54.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration54.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType61 = null;
        lwjgl3ApplicationConfiguration54.setPreferencesConfig("hi!", fileType61);
        lwjgl3ApplicationConfiguration54.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener65 = null;
        lwjgl3ApplicationConfiguration54.setWindowListener(lwjgl3WindowListener65);
        com.badlogic.gdx.Files.FileType fileType68 = null;
        lwjgl3ApplicationConfiguration54.setPreferencesConfig("", fileType68);
        lwjgl3ApplicationConfiguration54.setBackBufferConfig(0, (int) (short) 1, (int) ' ', (int) (byte) 0, 100, (int) '4', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration78 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode79 = null;
        lwjgl3ApplicationConfiguration78.setHdpiMode(hdpiMode79);
        lwjgl3ApplicationConfiguration78.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode84 = null;
        lwjgl3ApplicationConfiguration78.setFullscreenMode(displayMode84);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration86 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration86.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode89 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration86.setHdpiMode(hdpiMode89);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode91 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration86.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration78.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration54.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass99 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode89 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode89.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode91 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode91.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test23733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23733");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) ' ', (int) ' ', (int) (short) 100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', 1, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener37);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23734");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) -1, (int) 'a', (int) (short) -1, 1, 0, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType15);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (short) 0, 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 100, (-1), (int) (byte) 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test23735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23735");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) '4', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
    }

    @Test
    public void test23736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23736");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType17);
        org.junit.Assert.assertTrue("'" + hdpiMode6 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode6.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23737");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType22);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType30);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 1, 100, (int) (short) 1, (int) (byte) 100, (int) (byte) 10, (int) ' ');
        com.badlogic.gdx.Files.FileType fileType43 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType43);
    }

    @Test
    public void test23738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23738");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(10, (int) 'a', (int) (short) 100, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration11.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration11.setResizable(true);
        lwjgl3ApplicationConfiguration11.setTitle("");
        lwjgl3ApplicationConfiguration11.setResizable(true);
        lwjgl3ApplicationConfiguration11.useOpenGL3(false, (int) '#', (int) (byte) 0);
        lwjgl3ApplicationConfiguration11.setAudioConfig((int) (byte) 0, (int) '4', (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode35 = null;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode35);
        lwjgl3ApplicationConfiguration34.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3ApplicationConfiguration34.setFullscreenMode(displayMode40);
        lwjgl3ApplicationConfiguration34.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color46 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color46);
        lwjgl3ApplicationConfiguration34.setResizable(false);
        lwjgl3ApplicationConfiguration34.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = null;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration52.useVsync(false);
        lwjgl3ApplicationConfiguration52.setDecorated(false);
        lwjgl3ApplicationConfiguration52.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration61.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode64 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode64);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode66 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode66);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode72 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 0, 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color83 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color83);
        org.junit.Assert.assertTrue("'" + hdpiMode64 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode64.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode66 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode66.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23739");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 0, (int) (short) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType18);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) 'a', (int) (short) 1, (int) (short) 1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (-1), 0, (int) ' ', (int) (short) 10, 1, (int) ' ');
    }

    @Test
    public void test23740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23740");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, 100, 0, (int) (short) 100, (int) (byte) 100, (int) (byte) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(1, (int) (byte) 100, (int) (byte) 100, 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) '4');
    }

    @Test
    public void test23741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23741");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) '#', (int) (byte) 10, (-1));
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType22);
    }

    @Test
    public void test23742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23742");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = null;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode14);
        lwjgl3ApplicationConfiguration13.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("hi!", fileType20);
        lwjgl3ApplicationConfiguration13.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration13.setAudioConfig((int) (byte) 1, (int) (short) 0, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode33);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode33);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode33);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, (int) '#', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) ' ', (int) (byte) 1, (int) '#', (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode46);
        org.junit.Assert.assertTrue("'" + hdpiMode33 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode33.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23743");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (byte) 10, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration16.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration25.setInitialBackgroundColor(color26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration25.setInitialBackgroundColor(color28);
        lwjgl3ApplicationConfiguration25.setDecorated(false);
        lwjgl3ApplicationConfiguration25.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration25.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration25.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration25.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode52 = null;
        lwjgl3ApplicationConfiguration25.setFullscreenMode(displayMode52);
        lwjgl3ApplicationConfiguration25.useVsync(false);
        lwjgl3ApplicationConfiguration25.setWindowedMode((int) (short) 10, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode60 = null;
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode60);
        lwjgl3ApplicationConfiguration59.useVsync(false);
        lwjgl3ApplicationConfiguration59.disableAudio(false);
        lwjgl3ApplicationConfiguration59.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener68 = null;
        lwjgl3ApplicationConfiguration59.setWindowListener(lwjgl3WindowListener68);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration70 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration70.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode73 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration70.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode73);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener79 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener79);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, 100, (-1), 0, (int) (byte) 100, (int) '4', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + hdpiMode73 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode73.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23744");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) (byte) -1, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test23745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23745");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (byte) 100, 10, (int) 'a', 0, 0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, 0);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType24);
        java.lang.Class<?> wildcardClass26 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test23746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23746");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test23747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23747");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType34);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode38);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode42 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode42);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener44 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener44);
    }

    @Test
    public void test23748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23748");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 1, 0, (int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, (int) (short) 0, (int) (byte) 1, (int) (short) 0, (int) (short) 1, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test23749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23749");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration8.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) (byte) 0, 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, 0, (int) (short) 1, (int) (byte) 100, (int) (short) 10, 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23750");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) '#');
    }

    @Test
    public void test23751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23751");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) 'a');
    }

    @Test
    public void test23752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23752");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) '4', (-1), (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, 100);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color37);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) ' ', 0, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode47 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode47);
    }

    @Test
    public void test23753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23753");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType15);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) -1, 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color28);
        lwjgl3ApplicationConfiguration27.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration27.setWindowListener(lwjgl3WindowListener33);
        lwjgl3ApplicationConfiguration27.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3ApplicationConfiguration27.setWindowListener(lwjgl3WindowListener37);
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration27.setPreferencesConfig("", fileType40);
        lwjgl3ApplicationConfiguration27.disableAudio(false);
        lwjgl3ApplicationConfiguration27.setWindowedMode(0, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode48 = null;
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode48);
        lwjgl3ApplicationConfiguration47.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType54 = null;
        lwjgl3ApplicationConfiguration47.setPreferencesConfig("hi!", fileType54);
        lwjgl3ApplicationConfiguration47.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener58 = null;
        lwjgl3ApplicationConfiguration47.setWindowListener(lwjgl3WindowListener58);
        com.badlogic.gdx.Files.FileType fileType61 = null;
        lwjgl3ApplicationConfiguration47.setPreferencesConfig("", fileType61);
        lwjgl3ApplicationConfiguration47.setBackBufferConfig(0, (int) (short) 1, (int) ' ', (int) (byte) 0, 100, (int) '4', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration71 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode72 = null;
        lwjgl3ApplicationConfiguration71.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration71.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode77 = null;
        lwjgl3ApplicationConfiguration71.setFullscreenMode(displayMode77);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration79 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration79.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode82 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration79.setHdpiMode(hdpiMode82);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode84 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration79.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration71.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode84);
        com.badlogic.gdx.Graphics.DisplayMode displayMode90 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode90);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode82 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode82.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode84 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode84.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23754");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (short) 1, (int) (short) 0, (int) (short) 1, 1, (int) '4', (int) 'a');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) (byte) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener32);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) 10, 0, (int) '4', (int) (short) 0, (int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), 0);
    }

    @Test
    public void test23755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23755");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (byte) 100, (int) 'a', (int) (byte) 1, (int) (byte) 0, (int) (byte) 0, 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType41 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType41);
    }

    @Test
    public void test23756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23756");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (short) 100, (int) (short) 1, (int) '4', (int) (short) 1, (int) (short) 10, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (-1), (int) (short) 1, 0, (int) (short) 0, 0, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode43);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType50 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType50);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test23757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23757");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, 0, (int) (short) 1, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = null;
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration15.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration15.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration15.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration15.setWindowSizeLimits(100, (int) '4', (-1), (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3ApplicationConfiguration15.setWindowListener(lwjgl3WindowListener39);
        lwjgl3ApplicationConfiguration15.setWindowedMode((int) (short) -1, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = null;
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration44.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType51 = null;
        lwjgl3ApplicationConfiguration44.setPreferencesConfig("hi!", fileType51);
        lwjgl3ApplicationConfiguration44.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration44.setAudioConfig((int) (byte) 1, (int) (short) 0, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration61.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode64 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode64 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode64.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23758");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener3 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23759");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 10);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType23);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 10, (-1));
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 10, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) ' ', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) 'a');
    }

    @Test
    public void test23760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23760");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, 0, (int) (short) 100, 0);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color36);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (byte) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test23761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23761");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 100, 100, (int) (short) 1, (int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, 1, 0, 1, (int) (byte) 0, (-1), (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test23762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23762");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (short) 1, (int) (short) 0, (int) (short) 1, 1, (int) '4', (int) 'a');
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23763");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType26);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode31);
    }

    @Test
    public void test23764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23764");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) '#');
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType13);
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 0, 10, (int) '4', (int) (byte) 10, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test23765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23765");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test23766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23766");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType21);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType26);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) ' ', (-1));
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) 'a', (int) (byte) -1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode41 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode41);
    }

    @Test
    public void test23767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23767");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) '4', (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = null;
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration23.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration23.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration23.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration23.setInitialBackgroundColor(color35);
        lwjgl3ApplicationConfiguration23.setResizable(false);
        lwjgl3ApplicationConfiguration23.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode42 = null;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode42);
        lwjgl3ApplicationConfiguration41.useVsync(false);
        lwjgl3ApplicationConfiguration41.setDecorated(false);
        lwjgl3ApplicationConfiguration41.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration50.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode53);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType63 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType63);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener69 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener69);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, (int) (short) 10, (int) (byte) 1, (int) (short) -1, (int) (byte) 100, 100, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + hdpiMode53 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode53.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23768");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) -1, (int) 'a', (int) (short) -1, 1, 0, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 1, (int) '4', (int) (short) 0, (int) (byte) 100, 0, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 1, (int) (short) 100);
    }

    @Test
    public void test23769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23769");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test23770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23770");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType9);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test23771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23771");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode14);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, 10, (int) (byte) 10, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType32);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode14 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode14.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23772");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) (short) 1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 100, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color35);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color37);
    }

    @Test
    public void test23773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23773");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType25);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test23774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23774");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '#', (int) (short) -1, (int) (byte) -1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, 1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 10, (-1), (int) (byte) 100);
    }

    @Test
    public void test23775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23775");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) 'a', 0, 10, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', 0, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
    }

    @Test
    public void test23776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23776");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', 10, (int) (short) 100, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode14);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType17);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode3 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode3.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test23777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23777");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) (byte) 0, (int) (short) -1, 0, (int) (short) -1, 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 10, (int) (byte) 0, 1, (int) (byte) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener38);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode40);
    }

    @Test
    public void test23778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23778");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) '4', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test23779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23779");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) 'a', 1, 100, (-1));
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (short) 10, (int) (short) -1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (short) 0);
    }

    @Test
    public void test23780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23780");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType18);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test23781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23781");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) (short) 100, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType14);
        org.junit.Assert.assertTrue("'" + hdpiMode3 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode3.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23782");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 0, 0, (int) (byte) -1, (int) (byte) 100, 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) -1, (int) (byte) 10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, 1, (int) '#', 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, (int) ' ');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (-1), (int) (byte) 10, (int) (byte) 100, (int) (short) -1, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test23783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23783");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 1, (int) (short) 10, (int) '#', (int) (byte) 1, (int) (short) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) '#', 10, (int) '4', 10, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) ' ', (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (int) '#', (-1));
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color37);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode43);
    }

    @Test
    public void test23784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23784");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 1, (int) (byte) 10);
    }

    @Test
    public void test23785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23785");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode14);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode14 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode14.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23786");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, (int) 'a', 1, 1, (int) (short) 1, (int) '4', 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, 10);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) ' ', (int) (short) 0, (int) 'a', (int) (byte) 1, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) '4', (int) (short) 1, (int) (short) -1, (int) (byte) -1, (-1), (int) 'a');
    }

    @Test
    public void test23787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23787");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) 'a', (int) (short) 1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 10, 10, 100);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration22.setInitialBackgroundColor(color23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration22.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration22.setDecorated(false);
        lwjgl3ApplicationConfiguration22.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration22.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        lwjgl3ApplicationConfiguration22.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode41 = null;
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode41);
        lwjgl3ApplicationConfiguration40.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration40.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration40.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration40.setWindowedMode((int) (short) -1, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode63 = null;
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode63);
        lwjgl3ApplicationConfiguration62.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode68 = null;
        lwjgl3ApplicationConfiguration62.setFullscreenMode(displayMode68);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration70 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration70.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode73 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration70.setHdpiMode(hdpiMode73);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode75 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration70.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode75);
        com.badlogic.gdx.graphics.Color color81 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color81);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color87 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color87);
        org.junit.Assert.assertTrue("'" + hdpiMode73 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode73.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode75 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode75.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23788");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) (short) -1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, 0, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23789");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1), 1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), (int) (short) 100, (int) ' ', (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) 'a');
    }

    @Test
    public void test23790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23790");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (byte) 100, 10, (int) 'a', 0, 0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
    }

    @Test
    public void test23791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23791");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) '4', (-1), (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) -1, 100, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test23792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23792");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test23793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23793");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test23794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23794");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (short) 100, (int) (short) 1, (int) '4', (int) (short) 1, (int) (short) 10, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, (int) (short) 1, (int) (byte) 0, (int) '4', 0, (int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode46 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode46);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (byte) 10, 10, 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23795");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener40 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener40);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', 1);
    }

    @Test
    public void test23796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23796");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration7.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration7.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration7.setWindowListener(lwjgl3WindowListener13);
        lwjgl3ApplicationConfiguration7.setDecorated(true);
        lwjgl3ApplicationConfiguration7.setDecorated(false);
        lwjgl3ApplicationConfiguration7.setResizable(false);
        lwjgl3ApplicationConfiguration7.useOpenGL3(false, (int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration7.disableAudio(true);
        lwjgl3ApplicationConfiguration7.setWindowedMode((int) 'a', (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = null;
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration30.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration30.setPreferencesConfig("hi!", fileType37);
        lwjgl3ApplicationConfiguration30.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration30.setAudioConfig((int) (byte) 1, (int) (short) 0, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration47.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration7.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + hdpiMode50 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode50.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23797");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) '#', (int) (byte) 0, 10, (int) 'a', (int) (short) 10, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) 'a', 1, (int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test23798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23798");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 10, (int) (short) 10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test23799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23799");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test23800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23800");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType16);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, (int) (short) 10, (int) (short) 1, (int) '#', (int) (short) 100, 10, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test23801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23801");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color38);
    }

    @Test
    public void test23802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23802");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) 'a', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (short) 100, (int) (short) 10, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) (byte) 0, (-1));
    }

    @Test
    public void test23803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23803");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test23804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23804");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (short) 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener41);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test23805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23805");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (-1), (int) '4');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 1, 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test23806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23806");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (short) -1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) -1, 1, 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 10);
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType33);
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener38);
    }

    @Test
    public void test23807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23807");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, (int) '4');
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType20);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test23808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23808");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) (short) 100, (int) 'a', (int) (byte) 0, (int) '4', 10, 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass34 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test23809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23809");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) (short) 10, 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = null;
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration25.useVsync(false);
        lwjgl3ApplicationConfiguration25.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration25.setFullscreenMode(displayMode32);
        lwjgl3ApplicationConfiguration25.setWindowPosition((int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration25.setAudioConfig(10, (int) (byte) -1, (int) ' ');
        lwjgl3ApplicationConfiguration25.setAudioConfig(0, 0, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23810");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', 100, (int) 'a');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test23811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23811");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) -1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration20.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) '4');
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23812");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) 'a', 1, 100, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, 1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test23813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23813");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 100, (int) '#', (int) 'a', (int) (short) 1, 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = null;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode37);
        lwjgl3ApplicationConfiguration36.useVsync(false);
        lwjgl3ApplicationConfiguration36.setDecorated(false);
        lwjgl3ApplicationConfiguration36.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration45.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode48 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration45.setHdpiMode(hdpiMode48);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration45.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType57 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType57);
        org.junit.Assert.assertTrue("'" + hdpiMode48 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode48.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode50 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode50.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23814");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '#', 0, 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) (byte) 0, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
    }

    @Test
    public void test23815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23815");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) '4', (-1), (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) -1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(10, (int) (byte) 10, 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) (short) 1, (int) (short) 100, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test23816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23816");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) (short) 100);
    }

    @Test
    public void test23817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23817");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType9);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (byte) -1, 0);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
    }

    @Test
    public void test23818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23818");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 1, (-1));
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, 1, (int) (short) 0, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        lwjgl3ApplicationConfiguration16.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration16.setFullscreenMode(displayMode22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener35);
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test23819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23819");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType9);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType24);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) '#', (int) '4');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) (short) 10);
    }

    @Test
    public void test23820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23820");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test23821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23821");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 1, (-1));
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 100);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (byte) -1, 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (short) 10, (int) (byte) -1, (int) (byte) 100, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test23822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23822");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) 'a', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test23823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23823");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) -1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration20.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode26);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType30);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) ' ', 0, (int) (byte) 0, (int) '4', (int) '4', 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, (int) (byte) 1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (byte) 1, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23824");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 0, (int) (byte) 10, (int) (short) 0, 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode37);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode39);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 0, (-1));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 1, (int) (byte) 0, (-1), (-1), (int) (short) 100, 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test23825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23825");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', 1, (int) (byte) 100, (int) '#', 10, (int) (byte) 100, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType41 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType41);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23826");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (short) 1, (int) '4');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 1, 0, (int) (byte) -1, (int) (byte) 100, (int) (byte) 10, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', (int) (byte) 1);
    }

    @Test
    public void test23827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23827");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', 10, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = null;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration24.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration24.setWindowListener(lwjgl3WindowListener30);
        lwjgl3ApplicationConfiguration24.setDecorated(true);
        lwjgl3ApplicationConfiguration24.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration24.setWindowListener(lwjgl3WindowListener36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(10, (int) (byte) 10, (int) '#', 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) (byte) 10, (int) '#', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode60 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode60);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, 0, (int) '4', (int) (short) 1, 0, (int) (byte) -1, 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23828");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) 1, (int) 'a', (int) (short) 100, (int) (byte) -1, 10, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode39);
        com.badlogic.gdx.Files.FileType fileType42 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType42);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) '4', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode52);
    }

    @Test
    public void test23829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23829");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, (-1));
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (short) -1, (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, (int) (short) 100, (int) (short) -1, (int) (short) -1, (int) (short) 10, 0, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 0, (int) ' ', (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test23830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23830");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) 'a');
    }

    @Test
    public void test23831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23831");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) (short) 1, (-1));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (byte) 0, (int) (short) 0, (int) (byte) 100, (int) ' ', (int) (byte) 100, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 10, (int) (short) 0, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test23832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23832");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) -1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration20.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode26);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType30);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 1, (int) (short) -1, (int) (byte) 100, (int) 'a', (int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color40 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color40);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 0, (int) (byte) 10, (int) (byte) 1, (int) '4', (int) '#', 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23833");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration27.setDecorated(false);
        lwjgl3ApplicationConfiguration27.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration27.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        lwjgl3ApplicationConfiguration27.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = null;
        lwjgl3ApplicationConfiguration45.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration45.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration45.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration45.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration45.setWindowedMode((int) (short) -1, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration67 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode68 = null;
        lwjgl3ApplicationConfiguration67.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration67.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode73 = null;
        lwjgl3ApplicationConfiguration67.setFullscreenMode(displayMode73);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration75 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration75.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode78 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration75.setHdpiMode(hdpiMode78);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode80 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration75.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration67.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration45.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener88 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener88);
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + hdpiMode78 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode78.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode80 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode80.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23834");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) '4', (int) '4', (int) (short) 1, (int) (short) 100, (int) '4', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) -1, (int) '#', (-1), (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test23835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23835");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '#', (int) (short) -1, (int) (byte) -1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (short) 100, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (short) 0, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test23836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23836");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType30);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) 'a', 0, 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test23837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23837");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 0, (int) (short) 10, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) '4', 1);
    }

    @Test
    public void test23838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23838");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '#', (int) '#', (int) (byte) 1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test23839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23839");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = null;
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration31.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType38 = null;
        lwjgl3ApplicationConfiguration31.setPreferencesConfig("hi!", fileType38);
        lwjgl3ApplicationConfiguration31.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3ApplicationConfiguration31.setWindowListener(lwjgl3WindowListener42);
        com.badlogic.gdx.Files.FileType fileType45 = null;
        lwjgl3ApplicationConfiguration31.setPreferencesConfig("", fileType45);
        lwjgl3ApplicationConfiguration31.setBackBufferConfig(0, (int) (short) 1, (int) ' ', (int) (byte) 0, 100, (int) '4', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode56 = null;
        lwjgl3ApplicationConfiguration55.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration55.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode61 = null;
        lwjgl3ApplicationConfiguration55.setFullscreenMode(displayMode61);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration63.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode66 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration63.setHdpiMode(hdpiMode66);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode68 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration63.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration55.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, 0, 1, (int) '#', (-1), 100, (int) '4');
        org.junit.Assert.assertTrue("'" + hdpiMode66 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode66.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode68 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode68.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23840");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) (short) -1, (int) (short) 10, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) -1, (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + hdpiMode6 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode6.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23841");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, 1, 1, 10, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test23842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23842");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, 10, 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) (byte) -1, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test23843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23843");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) -1, (int) (byte) 10, (int) (short) 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) 'a', (int) (short) 10, (int) (short) -1, 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (byte) 1, (int) (short) 0, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 100, (int) (byte) 10, 1, (int) (byte) 10, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test23844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23844");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener35);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test23845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23845");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) (byte) 0, 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode34 = null;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode34);
        lwjgl3ApplicationConfiguration33.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3ApplicationConfiguration33.setWindowListener(lwjgl3WindowListener39);
        com.badlogic.gdx.Files.FileType fileType42 = null;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("", fileType42);
        lwjgl3ApplicationConfiguration33.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = null;
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration46.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode52 = null;
        lwjgl3ApplicationConfiguration46.setFullscreenMode(displayMode52);
        lwjgl3ApplicationConfiguration46.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration46.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration46.setWindowPosition((int) (short) 100, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode69 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + hdpiMode69 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode69.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23846");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) '#', (-1));
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test23847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23847");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) -1, (int) 'a', (int) (short) -1, 1, 0, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType15);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (short) 0, 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 100, (-1), (int) (byte) 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) '#', 1, (int) (short) 100, (int) '#', 10, (int) (byte) 0);
    }

    @Test
    public void test23848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23848");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
    }

    @Test
    public void test23849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23849");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode43);
    }

    @Test
    public void test23850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23850");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1), 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 0);
    }

    @Test
    public void test23851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23851");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType30);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (short) 10);
    }

    @Test
    public void test23852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23852");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '#', (int) (short) 0, (int) (short) 10, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration19.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration19.setWindowListener(lwjgl3WindowListener25);
        lwjgl3ApplicationConfiguration19.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration19.setWindowListener(lwjgl3WindowListener29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = null;
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration31.setDecorated(true);
        lwjgl3ApplicationConfiguration31.useVsync(true);
        lwjgl3ApplicationConfiguration31.setDecorated(true);
        lwjgl3ApplicationConfiguration31.setBackBufferConfig((int) (byte) -1, (int) (short) 0, 0, (int) (byte) -1, (int) (byte) 100, 1, (int) 'a');
        lwjgl3ApplicationConfiguration31.useVsync(false);
        lwjgl3ApplicationConfiguration31.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = null;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration52.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration52.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration52.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration52.setWindowedMode((int) (short) -1, (int) (short) -1);
        com.badlogic.gdx.Files.FileType fileType75 = null;
        lwjgl3ApplicationConfiguration52.setPreferencesConfig("", fileType75);
        lwjgl3ApplicationConfiguration52.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode79 = null;
        lwjgl3ApplicationConfiguration52.setFullscreenMode(displayMode79);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration81 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration81.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode85 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration81.setHdpiMode(hdpiMode85);
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode85);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode85);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode85);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode85);
        com.badlogic.gdx.Graphics.DisplayMode displayMode91 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode91);
        org.junit.Assert.assertTrue("'" + hdpiMode85 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode85.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23853");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 100, (int) (short) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener39);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test23854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23854");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test23855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23855");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-1), (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode25 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode25.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23856");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType28);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) (byte) 10, 100, (int) (byte) 100, 10, 1, (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) ' ', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) ' ', (int) (byte) 0, (int) (byte) 0, 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test23857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23857");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType19);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (short) 0, 100);
    }

    @Test
    public void test23858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23858");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 10, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23859");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(1, (int) (short) 100, (int) (short) 10, (int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType24);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (byte) 100, (-1), (int) ' ', (int) 'a', (int) 'a', (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color34);
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType37);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener43 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener43);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (short) 1);
    }

    @Test
    public void test23860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23860");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test23861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23861");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', 10, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = null;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration24.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration24.setWindowListener(lwjgl3WindowListener30);
        lwjgl3ApplicationConfiguration24.setDecorated(true);
        lwjgl3ApplicationConfiguration24.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration24.setWindowListener(lwjgl3WindowListener36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener43 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener43);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener45 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener45);
        com.badlogic.gdx.graphics.Color color47 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color47);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23862");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (short) 1, (int) (byte) 0, (int) (byte) 100, (int) (short) 10, 0, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test23863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23863");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) 'a', 1, 100, (-1));
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (-1));
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) '4');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode42 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode42);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (short) 0, (-1), (int) (short) 1);
    }

    @Test
    public void test23864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23864");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (byte) 10, 0, (int) '4', 0, (int) (byte) -1, 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) (byte) 0, (int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + hdpiMode3 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode3.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23865");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType9);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = null;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode14);
        lwjgl3ApplicationConfiguration13.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration13.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration13.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration13.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration13.setWindowPosition((int) (short) 100, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, 100, (int) (byte) 1, (int) '4');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType49 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType49);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23866");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) ' ');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 1, 10, (int) 'a', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23867");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) 'a', (int) (short) 1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test23868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23868");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) '#', (int) (short) 100, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration19.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration19.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration19.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color31);
        lwjgl3ApplicationConfiguration19.setResizable(false);
        lwjgl3ApplicationConfiguration19.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = null;
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration37.useVsync(false);
        lwjgl3ApplicationConfiguration37.setDecorated(false);
        lwjgl3ApplicationConfiguration37.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration46.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode49 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode49);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode51 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode51);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color56 = null;
        lwjgl3ApplicationConfiguration55.setInitialBackgroundColor(color56);
        com.badlogic.gdx.graphics.Color color58 = null;
        lwjgl3ApplicationConfiguration55.setInitialBackgroundColor(color58);
        lwjgl3ApplicationConfiguration55.setDecorated(false);
        lwjgl3ApplicationConfiguration55.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration55.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        lwjgl3ApplicationConfiguration55.setAudioConfig((int) (short) 0, (int) (short) -1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration75 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color76 = null;
        lwjgl3ApplicationConfiguration75.setInitialBackgroundColor(color76);
        lwjgl3ApplicationConfiguration75.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode81 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration75.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration55.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode81);
        java.lang.Class<?> wildcardClass86 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode49 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode49.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode51 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode51.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode81 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode81.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test23869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23869");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType22);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) (short) 10, 1, (int) ' ', (int) ' ', (int) 'a', 0);
    }

    @Test
    public void test23870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23870");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), 1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test23871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23871");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 100, (int) (byte) 1, (int) (short) -1, (int) (short) 10, 10, 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode39);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test23872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23872");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) '4', (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 100, (int) 'a');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) (short) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode30);
    }

    @Test
    public void test23873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23873");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType16);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test23874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23874");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) '#');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test23875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23875");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
    }

    @Test
    public void test23876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23876");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) ' ', 100, 1, (int) (short) 100, 100, (int) ' ');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode40);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) ' ', (int) 'a', (int) (short) 100, 1, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (short) 1, (int) (byte) 10, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color55 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color55);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', 0);
        com.badlogic.gdx.graphics.Color color60 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color60);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) ' ', (int) '#', (int) (short) 10, (-1), (int) (short) 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test23877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23877");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) 'a', 1, 100, (-1));
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 0);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType30);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) '#', (int) (short) 1);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType39);
        java.lang.Class<?> wildcardClass41 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test23878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23878");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23879");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 10, 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) ' ', 0, 1, (int) (byte) 1);
    }

    @Test
    public void test23880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23880");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) (byte) -1, (int) (short) 100, (int) '4');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 1, (int) (byte) 100, (int) (byte) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (short) 10, 0);
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color44);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, 1);
    }

    @Test
    public void test23881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23881");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) 'a', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType25);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) (byte) 1, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23882");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) -1, (int) 'a', (int) (short) -1, 1, 0, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1), (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (short) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, 10);
    }

    @Test
    public void test23883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23883");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (byte) 10, (int) (short) 100, (int) '#', 100, (int) (byte) 100, (-1));
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener45 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener45);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode49 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode49);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass54 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test23884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23884");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, (int) 'a', 1, 1, (int) (short) 1, (int) '4', 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener36);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', 0);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode43);
    }

    @Test
    public void test23885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23885");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
    }

    @Test
    public void test23886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23886");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        java.lang.Class<?> wildcardClass14 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test23887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23887");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType10);
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType13);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(10, (int) ' ', (int) ' ', (-1));
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 0, (int) ' ', (-1), 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener33);
    }

    @Test
    public void test23888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23888");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (short) 100, (int) (short) 1, (int) '4', (int) (short) 1, (int) (short) 10, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (-1), (int) (short) 1, 0, (int) (short) 0, 0, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode43);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener45 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener45);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (short) 10, (-1), 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 10, 0, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass60 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test23889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23889");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) ' ', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test23890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23890");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (byte) 10, 0, (int) '4', 0, (int) (byte) -1, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), 10, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode38);
        org.junit.Assert.assertTrue("'" + hdpiMode3 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode3.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23891");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(1, 10, (int) (short) 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 100, (-1), 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '#', (int) (byte) 0, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test23892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23892");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', 1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (byte) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) '#', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) '#');
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener34);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-1), (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test23893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23893");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) '#');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) (byte) 0, 1);
    }

    @Test
    public void test23894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23894");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = null;
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode15);
        lwjgl3ApplicationConfiguration14.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration14.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration14.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration14.setResizable(false);
        lwjgl3ApplicationConfiguration14.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = null;
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode33);
        lwjgl3ApplicationConfiguration32.useVsync(false);
        lwjgl3ApplicationConfiguration32.setDecorated(false);
        lwjgl3ApplicationConfiguration32.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration41.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, 0, (int) (short) 10, 10, (int) '4', (int) (byte) 1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Files.FileType fileType68 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType68);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23895");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) 'a', (int) (byte) 100, 10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, 1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test23896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23896");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 100, (int) (short) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener39);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode43);
        com.badlogic.gdx.Files.FileType fileType46 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType46);
        java.lang.Class<?> wildcardClass48 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test23897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23897");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 10, (int) ' ', 100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType19);
    }

    @Test
    public void test23898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23898");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType19);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test23899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23899");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) (byte) 1, (int) (short) 100, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode35);
    }

    @Test
    public void test23900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23900");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, 100, 0, (int) (short) 100, (int) (byte) 100, (int) (byte) 0, (int) (short) 1);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType24);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test23901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23901");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, 1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(1, (int) (short) 0, 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) 'a', (int) (byte) 10, (int) '4', (int) 'a', 100);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (int) '4', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test23902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23902");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration23.setInitialBackgroundColor(color24);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration23.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration23.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration23.setFullscreenMode(displayMode30);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration23.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration23.setAudioConfig((int) (short) -1, 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration23.setWindowedMode((int) (short) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration23.setWindowPosition((int) (byte) 100, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = null;
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration44.useVsync(false);
        lwjgl3ApplicationConfiguration44.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener51 = null;
        lwjgl3ApplicationConfiguration44.setWindowListener(lwjgl3WindowListener51);
        lwjgl3ApplicationConfiguration44.disableAudio(false);
        lwjgl3ApplicationConfiguration44.setAudioConfig((int) (short) -1, (int) (byte) 100, (int) (short) 100);
        lwjgl3ApplicationConfiguration44.setBackBufferConfig(0, 0, (int) 'a', (int) '4', (int) (short) -1, 0, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode67 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode67);
        org.junit.Assert.assertTrue("'" + hdpiMode67 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode67.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23903");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', 10);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (byte) -1, (int) (byte) 1, (int) '#');
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
    }

    @Test
    public void test23904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23904");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 1, (int) (byte) 1, (int) (short) 1, (int) (byte) 100, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) (byte) 10, (int) 'a', 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, 1, (int) 'a', (int) (byte) 100, 100, (-1), (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23905");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 0, (int) (byte) 10, (int) (short) 0, 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test23906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23906");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (byte) 10, 0, (int) '4', 0, (int) (byte) -1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertTrue("'" + hdpiMode3 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode3.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23907");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener35);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, (int) (short) 10, 0, (int) 'a', (int) '4', (int) (short) 0, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (-1), 1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType54 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType54);
        com.badlogic.gdx.Graphics.DisplayMode displayMode56 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode56);
    }

    @Test
    public void test23908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23908");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 10, (int) (byte) 0, (-1), (int) (byte) 100, 0, 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test23909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23909");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) -1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration20.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode26);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType30);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 1, (int) (short) -1, (int) (byte) 100, (int) 'a', (int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color40 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color40);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener52 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener52);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 1, 0, (int) 'a', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener67 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener67);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23910");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', 1, 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test23911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23911");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) '#', 10);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType23);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
    }

    @Test
    public void test23912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23912");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 10, 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) 0, 100, (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, 0, 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 0, 100);
        java.lang.Class<?> wildcardClass51 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test23913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23913");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) ' ', 0, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode25 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode25.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23914");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) '#');
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test23915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23915");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, 0, (int) '4', (int) 'a', (int) ' ', 100, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType19);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test23916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23916");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, 10, (int) (short) 0, (int) 'a', (int) (short) 10, (int) 'a', 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) ' ', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass39 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test23917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23917");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) -1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 1, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', 100);
    }

    @Test
    public void test23918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23918");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (-1));
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
    }

    @Test
    public void test23919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23919");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode30);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1), (-1));
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '#', (int) '#', (int) '4', (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode46 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode46);
    }

    @Test
    public void test23920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23920");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (short) -1, (int) ' ', 100, 10, (int) (byte) 100, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test23921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23921");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) (byte) -1, (int) (short) -1, (int) 'a', 0, 0, 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (short) -1, 10, (int) (byte) -1, (int) (byte) 100, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test23922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23922");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) -1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration20.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, 10, (-1), 100, 0, (int) (byte) 1, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener37);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23923");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (short) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, 0, (int) '4', (int) ' ', 10, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode42 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode42);
    }

    @Test
    public void test23924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23924");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) ' ', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 100, 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration32.setResizable(true);
        lwjgl3ApplicationConfiguration32.useOpenGL3(false, (int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration32.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3ApplicationConfiguration32.setWindowListener(lwjgl3WindowListener41);
        lwjgl3ApplicationConfiguration32.setWindowedMode((int) (byte) 1, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color47 = null;
        lwjgl3ApplicationConfiguration46.setInitialBackgroundColor(color47);
        lwjgl3ApplicationConfiguration46.setWindowedMode(0, (int) (short) 100);
        lwjgl3ApplicationConfiguration46.setWindowSizeLimits((int) '#', 0, 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color57 = null;
        lwjgl3ApplicationConfiguration46.setInitialBackgroundColor(color57);
        com.badlogic.gdx.Graphics.DisplayMode displayMode59 = null;
        lwjgl3ApplicationConfiguration46.setFullscreenMode(displayMode59);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode62 = null;
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode62);
        lwjgl3ApplicationConfiguration61.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType68 = null;
        lwjgl3ApplicationConfiguration61.setPreferencesConfig("hi!", fileType68);
        lwjgl3ApplicationConfiguration61.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration61.setAudioConfig((int) (byte) 1, (int) (short) 0, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration78 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration78.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode81 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration78.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode81);
        org.junit.Assert.assertTrue("'" + hdpiMode81 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode81.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23925");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 1, (-1));
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 100, 1, (-1), (int) '4');
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType15);
    }

    @Test
    public void test23926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23926");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test23927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23927");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration15.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration15.setWindowedMode(0, (int) (short) 100);
        lwjgl3ApplicationConfiguration15.setWindowSizeLimits((int) '#', 0, 0, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = null;
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration26.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration26.setFullscreenMode(displayMode32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (short) 0, (int) (byte) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode37 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode37.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23928");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) ' ', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, 1, 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
    }

    @Test
    public void test23929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23929");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) '4', (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, 0, (int) (byte) 100, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener38);
        com.badlogic.gdx.graphics.Color color40 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color40);
    }

    @Test
    public void test23930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23930");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', 0, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) (short) 1, (int) (short) 0, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (byte) 0, (int) (short) 100, (int) '4', (int) ' ', (int) (short) 1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (byte) 10, (int) (byte) -1, 0, (int) (byte) 0, (int) (byte) 100, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test23931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23931");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) (short) 0, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (byte) -1, 100, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, 10, (int) '4', (int) (short) 0);
    }

    @Test
    public void test23932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23932");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode14);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) '#', (int) (byte) -1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode30);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '#', (int) '4', 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) '4', 0);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode14 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode14.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23933");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) '4', (-1), (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) -1, 100, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode37);
        lwjgl3ApplicationConfiguration33.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3ApplicationConfiguration33.setWindowListener(lwjgl3WindowListener41);
        lwjgl3ApplicationConfiguration33.setWindowSizeLimits((int) (short) 0, (int) (byte) -1, (int) (byte) 10, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration48.setResizable(true);
        lwjgl3ApplicationConfiguration48.setAudioConfig((int) '4', 1, (-1));
        lwjgl3ApplicationConfiguration48.useVsync(false);
        lwjgl3ApplicationConfiguration48.setWindowSizeLimits(0, 1, (int) (short) 0, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode62 = null;
        lwjgl3ApplicationConfiguration48.setFullscreenMode(displayMode62);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode65 = null;
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode65);
        lwjgl3ApplicationConfiguration64.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode70 = null;
        lwjgl3ApplicationConfiguration64.setFullscreenMode(displayMode70);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration72 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration72.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode75 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration72.setHdpiMode(hdpiMode75);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode77 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration72.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 0, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + hdpiMode37 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode37.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode75 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode75.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode77 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode77.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23934");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 1, (-1));
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test23935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23935");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = null;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration27.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration27.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration27.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration27.setWindowSizeLimits(100, (int) '4', (-1), (int) (short) 0);
        lwjgl3ApplicationConfiguration27.setWindowSizeLimits((int) (short) 0, (int) (byte) -1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration27.useOpenGL3(false, (int) ' ', (int) (byte) 1);
        lwjgl3ApplicationConfiguration27.setWindowSizeLimits((int) (byte) 1, 100, (int) (byte) -1, (-1));
        lwjgl3ApplicationConfiguration27.setAudioConfig((int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode69 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode69);
        com.badlogic.gdx.graphics.Color color72 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color72);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener76 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener76);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, 100);
        org.junit.Assert.assertTrue("'" + hdpiMode69 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode69.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23936");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, 100, (int) (short) 10, (int) (byte) -1, (-1), (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener32);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', (int) (byte) -1);
    }

    @Test
    public void test23937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23937");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) 'a');
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', 0);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', 100);
    }

    @Test
    public void test23938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23938");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) '4', (-1), (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 0, (int) (byte) -1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, 100, (int) (byte) -1, (-1));
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode40);
        com.badlogic.gdx.Files.FileType fileType43 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType43);
        com.badlogic.gdx.graphics.Color color45 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color45);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) -1, (int) (byte) 100, (int) 'a');
        java.lang.Class<?> wildcardClass52 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test23939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23939");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) '4');
    }

    @Test
    public void test23940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23940");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (short) 0, 10);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) 0);
    }

    @Test
    public void test23941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23941");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test23942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23942");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType14);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, 1);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test23943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23943");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', 0, (-1));
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test23944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23944");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (short) 1, (int) (short) 100, 10, 0, (int) '4', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) '4');
    }

    @Test
    public void test23945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23945");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 1, (int) (short) 10, (int) '#', (int) (byte) 1, (int) (short) 10, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration19.disableAudio(false);
        lwjgl3ApplicationConfiguration19.useOpenGL3(true, 0, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration31.setResizable(true);
        lwjgl3ApplicationConfiguration31.useOpenGL3(true, 100, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = null;
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration38.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener44 = null;
        lwjgl3ApplicationConfiguration38.setWindowListener(lwjgl3WindowListener44);
        lwjgl3ApplicationConfiguration38.setDecorated(true);
        lwjgl3ApplicationConfiguration38.setDecorated(false);
        lwjgl3ApplicationConfiguration38.setResizable(false);
        lwjgl3ApplicationConfiguration38.useOpenGL3(false, (int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration38.disableAudio(true);
        lwjgl3ApplicationConfiguration38.setWindowedMode((int) 'a', (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode62 = null;
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode62);
        lwjgl3ApplicationConfiguration61.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType68 = null;
        lwjgl3ApplicationConfiguration61.setPreferencesConfig("hi!", fileType68);
        lwjgl3ApplicationConfiguration61.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration61.setAudioConfig((int) (byte) 1, (int) (short) 0, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration78 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration78.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode81 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration78.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode81);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener88 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener88);
        com.badlogic.gdx.Graphics.DisplayMode displayMode90 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode90);
        org.junit.Assert.assertTrue("'" + hdpiMode81 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode81.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23946");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (short) 1, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode35);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test23947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23947");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) ' ', 1, (int) (byte) 1, 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (byte) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test23948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23948");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 0, (int) (byte) 10, (int) (short) 0, 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (short) 100, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener44 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener44);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener48 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener48);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (byte) 10, 0, (-1));
    }

    @Test
    public void test23949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23949");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 1);
    }

    @Test
    public void test23950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23950");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (-1), (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (short) 10, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 100, (int) ' ');
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType23);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test23951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23951");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, (int) 'a', 1, 1, (int) (short) 1, (int) '4', 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) (short) 0, (int) ' ', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, (int) '4', 100, (int) (byte) 1, 0, (int) (byte) 100, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (byte) 1);
    }

    @Test
    public void test23952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23952");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType26);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (byte) 100, (int) (short) 100, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test23953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23953");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) '#', 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
    }

    @Test
    public void test23954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23954");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType10);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, 10, 0, 0, (int) '4', (int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', 1, (int) '#', (int) (byte) 10, (int) (short) 1, (int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', 10, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color38);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test23955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23955");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = null;
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode15);
        lwjgl3ApplicationConfiguration14.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration14.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration14.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration14.setResizable(false);
        lwjgl3ApplicationConfiguration14.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = null;
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode33);
        lwjgl3ApplicationConfiguration32.useVsync(false);
        lwjgl3ApplicationConfiguration32.setDecorated(false);
        lwjgl3ApplicationConfiguration32.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration41.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 1, (int) '#', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23956");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) '4', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) ' ', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType23);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) '#');
    }

    @Test
    public void test23957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23957");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration25.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration25.setWindowedMode(0, (int) (short) 100);
        lwjgl3ApplicationConfiguration25.setWindowSizeLimits((int) '#', 0, 0, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = null;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode37);
        lwjgl3ApplicationConfiguration36.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode42 = null;
        lwjgl3ApplicationConfiguration36.setFullscreenMode(displayMode42);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration44.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode47);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode49 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + hdpiMode47 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode47.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode49 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode49.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23958");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) 'a', (int) (byte) 100, 10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test23959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23959");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) -1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration20.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23960");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (byte) 10, (int) (byte) 100, (int) (byte) 100, (int) (byte) 1, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, 0, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test23961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23961");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode5 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode5);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) '#', (-1));
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 1, (-1));
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        org.junit.Assert.assertTrue("'" + hdpiMode3 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode3.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode5 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode5.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23962");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) ' ', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 100, 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) ' ', 0);
    }

    @Test
    public void test23963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23963");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) (byte) 100, (int) (short) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener39);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode43);
        com.badlogic.gdx.Files.FileType fileType46 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType46);
        com.badlogic.gdx.Files.FileType fileType49 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType49);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), 0);
    }

    @Test
    public void test23964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23964");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode14);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 100, (int) '#', (int) (byte) -1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType29);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', 10);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode14 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode14.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23965");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) '4', (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 100, (int) 'a');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) (short) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test23966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23966");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 1, (int) (short) 10, (int) '#', (int) (byte) 1, (int) (short) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) '#', 10, (int) '4', 10, (-1));
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 100, (int) (short) 10, (int) '4', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test23967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23967");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 1, (-1));
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) '4');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, 100);
    }

    @Test
    public void test23968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23968");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) -1, (int) ' ', (int) '#', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test23969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23969");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 1, (int) (short) 10, (int) '#', (int) (byte) 1, (int) (short) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) '#', 10, (int) '4', 10, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test23970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23970");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', 100, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (-1), (int) (short) -1, (int) (short) 10, (-1), (int) (byte) 0, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color42 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color42);
    }

    @Test
    public void test23971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23971");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 10, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType32);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color34);
    }

    @Test
    public void test23972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23972");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType23);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) -1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test23973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23973");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 1, (-1));
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23974");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, 0, (-1), 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1), (int) (byte) -1);
    }

    @Test
    public void test23975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23975");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) 'a');
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', 1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test23976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23976");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode4 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode4);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        org.junit.Assert.assertTrue("'" + hdpiMode4 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode4.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23977");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) ' ', (int) (short) 0, (int) (byte) 100, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test23978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23978");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) -1, 1, (int) ' ', (int) 'a');
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode42 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode42);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode46 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode46);
    }

    @Test
    public void test23979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23979");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = null;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration24.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration24.setPreferencesConfig("hi!", fileType31);
        lwjgl3ApplicationConfiguration24.setBackBufferConfig((int) (byte) 0, 1, (int) (short) 10, (int) '#', (int) (byte) 1, (int) (short) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration24.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) '#', 10, (int) '4', 10, (-1));
        lwjgl3ApplicationConfiguration24.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color52 = null;
        lwjgl3ApplicationConfiguration51.setInitialBackgroundColor(color52);
        lwjgl3ApplicationConfiguration51.setWindowedMode(0, (int) (short) 100);
        lwjgl3ApplicationConfiguration51.setWindowSizeLimits((int) '#', 0, 0, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color62 = null;
        lwjgl3ApplicationConfiguration51.setInitialBackgroundColor(color62);
        com.badlogic.gdx.Graphics.DisplayMode displayMode64 = null;
        lwjgl3ApplicationConfiguration51.setFullscreenMode(displayMode64);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration66 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode67 = null;
        lwjgl3ApplicationConfiguration66.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration66.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType73 = null;
        lwjgl3ApplicationConfiguration66.setPreferencesConfig("hi!", fileType73);
        lwjgl3ApplicationConfiguration66.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration66.setAudioConfig((int) (byte) 1, (int) (short) 0, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration83 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration83.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode86 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration83.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration66.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode86);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener92 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener92);
        com.badlogic.gdx.graphics.Color color94 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color94);
        org.junit.Assert.assertTrue("'" + hdpiMode86 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode86.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23980");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 10, (-1), (int) (byte) 0, (int) '#', 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 10, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) '4', (int) (short) 0, 1, 100, (int) (byte) 100, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode39);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 1);
        com.badlogic.gdx.Files.FileType fileType56 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType56);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (byte) -1);
    }

    @Test
    public void test23981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23981");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode14);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode14);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration24.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration24.setWindowPosition((int) (byte) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration24.setWindowListener(lwjgl3WindowListener30);
        lwjgl3ApplicationConfiguration24.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color35);
        lwjgl3ApplicationConfiguration34.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener40 = null;
        lwjgl3ApplicationConfiguration34.setWindowListener(lwjgl3WindowListener40);
        com.badlogic.gdx.graphics.Color color42 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color42);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = null;
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration44.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType51 = null;
        lwjgl3ApplicationConfiguration44.setPreferencesConfig("hi!", fileType51);
        lwjgl3ApplicationConfiguration44.setAudioConfig((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode57 = null;
        lwjgl3ApplicationConfiguration44.setFullscreenMode(displayMode57);
        lwjgl3ApplicationConfiguration44.disableAudio(false);
        lwjgl3ApplicationConfiguration44.setBackBufferConfig((int) (short) 0, (int) 'a', 1, 1, (int) (short) 1, (int) '4', 0);
        lwjgl3ApplicationConfiguration44.setWindowedMode(1, (int) '#');
        lwjgl3ApplicationConfiguration44.setAudioConfig((int) (byte) 0, (int) (short) 0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration76 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode77 = null;
        lwjgl3ApplicationConfiguration76.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration76.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration76.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode92 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration76.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode14 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode14.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode92 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode92.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test23982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23982");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test23983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23983");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 0, 0, (int) (byte) -1, (int) (byte) 100, 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = null;
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration21.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration21.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration21.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration21.setWindowedMode((int) (short) -1, (int) (short) -1);
        com.badlogic.gdx.Files.FileType fileType44 = null;
        lwjgl3ApplicationConfiguration21.setPreferencesConfig("", fileType44);
        lwjgl3ApplicationConfiguration21.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode48 = null;
        lwjgl3ApplicationConfiguration21.setFullscreenMode(displayMode48);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration50.setWindowPosition((int) '#', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode54 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode54 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode54.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23984");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = null;
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration11.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration11.setFullscreenMode(displayMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23985");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 0, (int) (byte) 10, (int) (short) 0, 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) '4', (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 10, 1, (int) (byte) 1);
    }

    @Test
    public void test23986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23986");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) ' ', (int) ' ', (int) (byte) 10, 1, (int) (byte) 100, (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, 0, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) '#', 0, (int) 'a', (-1));
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test23987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23987");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) -1);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType23);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener34);
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType37);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23988");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) 'a', (int) (short) 1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 10, 10, 100);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration22.setInitialBackgroundColor(color23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration22.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration22.setDecorated(false);
        lwjgl3ApplicationConfiguration22.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration22.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        lwjgl3ApplicationConfiguration22.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode41 = null;
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode41);
        lwjgl3ApplicationConfiguration40.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration40.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration40.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration40.setWindowedMode((int) (short) -1, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode63 = null;
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode63);
        lwjgl3ApplicationConfiguration62.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode68 = null;
        lwjgl3ApplicationConfiguration62.setFullscreenMode(displayMode68);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration70 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration70.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode73 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration70.setHdpiMode(hdpiMode73);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode75 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration70.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) '#', (int) '4');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode73 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode73.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode75 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode75.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23989");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType10);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, 10, 0, 0, (int) '4', (int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType30);
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType33);
    }

    @Test
    public void test23990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23990");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = null;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode21);
        lwjgl3ApplicationConfiguration20.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration20.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3ApplicationConfiguration20.setFullscreenMode(displayMode36);
        lwjgl3ApplicationConfiguration20.setWindowPosition((int) (short) 0, (int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType42 = null;
        lwjgl3ApplicationConfiguration20.setPreferencesConfig("", fileType42);
        lwjgl3ApplicationConfiguration20.setWindowedMode((int) (short) 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration20.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType50 = null;
        lwjgl3ApplicationConfiguration20.setPreferencesConfig("hi!", fileType50);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color53 = null;
        lwjgl3ApplicationConfiguration52.setInitialBackgroundColor(color53);
        com.badlogic.gdx.graphics.Color color55 = null;
        lwjgl3ApplicationConfiguration52.setInitialBackgroundColor(color55);
        lwjgl3ApplicationConfiguration52.setDecorated(false);
        lwjgl3ApplicationConfiguration52.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration52.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration52.setWindowSizeLimits((int) (byte) 10, (int) (byte) -1, (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration52.setResizable(false);
        lwjgl3ApplicationConfiguration52.setBackBufferConfig((int) (short) 0, 0, 0, (int) (byte) 10, (int) (short) 0, 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration52.useVsync(true);
        lwjgl3ApplicationConfiguration52.setWindowSizeLimits((int) (byte) 0, (int) (byte) -1, 100, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode94 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode94);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode94);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode94);
        org.junit.Assert.assertTrue("'" + hdpiMode94 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode94.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23991");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, (int) ' ');
    }

    @Test
    public void test23992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23992");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 0, 0, (int) (byte) -1, (int) (byte) 100, 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (-1));
    }

    @Test
    public void test23993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23993");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (byte) 1, (int) (short) 0, (-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode25);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, 1);
        java.lang.Class<?> wildcardClass43 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode25 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode25.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test23994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23994");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 1, (int) (byte) 1, (int) (short) 1, (int) (byte) 100, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(0, (int) (byte) 10, (int) 'a', 0);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test23995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23995");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) -1, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((-1), 0, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, (int) '#');
    }

    @Test
    public void test23996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23996");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (-1));
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test23997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23997");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = null;
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode15);
        lwjgl3ApplicationConfiguration14.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration14.useOpenGL3(true, (int) '4', 10);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration14.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration14.setResizable(false);
        lwjgl3ApplicationConfiguration14.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = null;
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode33);
        lwjgl3ApplicationConfiguration32.useVsync(false);
        lwjgl3ApplicationConfiguration32.setDecorated(false);
        lwjgl3ApplicationConfiguration32.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration41.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test23998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23998");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits(100, (int) 'a', (int) (short) 1, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, 10, (int) (short) 1, (int) 'a', (int) (short) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test23999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23999");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, (-1));
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
    }

    @Test
    public void test24000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test24000");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType14);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (short) 1, (int) ' ', (int) (byte) 0, 100, (int) '4', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = null;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration24.setWindowedMode((int) (byte) 10, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration24.setFullscreenMode(displayMode30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration32.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode35 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode37);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode37);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode37);
        com.badlogic.gdx.Files.FileType fileType42 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType42);
        com.badlogic.gdx.Files.FileType fileType45 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType45);
        lwjgl3ApplicationConfiguration0.setWindowSizeLimits((int) (short) 10, (int) ' ', (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '4');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + hdpiMode35 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode35.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode37 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode37.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }
}

