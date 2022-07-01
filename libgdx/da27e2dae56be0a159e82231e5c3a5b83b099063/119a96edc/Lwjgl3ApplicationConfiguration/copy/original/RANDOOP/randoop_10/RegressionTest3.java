import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) 'a', 0, 10, (int) (byte) 100, (int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', 100, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) (short) 100, 10, 10, (int) (short) 10, (int) 'a', 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color41);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, (int) (short) 10, (int) (short) 1, (int) '#', (int) (short) 100, 10, (int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.setResizable(false);
        lwjgl3ApplicationConfiguration18.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration18.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration18.setInitialVisible(false);
        lwjgl3ApplicationConfiguration18.useOpenGL3(true, (int) (byte) 10, (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration18.setFullscreenMode(displayMode31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.setResizable(false);
        lwjgl3ApplicationConfiguration33.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration38.setInitialBackgroundColor(color39);
        lwjgl3ApplicationConfiguration38.setTitle("");
        lwjgl3ApplicationConfiguration38.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.setResizable(false);
        lwjgl3ApplicationConfiguration24.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color34);
        lwjgl3ApplicationConfiguration33.setTitle("");
        lwjgl3ApplicationConfiguration33.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration47.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color52 = null;
        lwjgl3ApplicationConfiguration51.setInitialBackgroundColor(color52);
        lwjgl3ApplicationConfiguration51.setTitle("");
        lwjgl3ApplicationConfiguration51.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode58 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration47.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration47.setWindowedMode(0, 10);
        lwjgl3ApplicationConfiguration47.useVsync(false);
        lwjgl3ApplicationConfiguration47.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode72 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode72);
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode58 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode58.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode72 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode72.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '#');
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType7);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType10);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) '4', (int) 'a');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, (-1), (int) ' ', (int) (short) 100, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (byte) 1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '4', 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("hi!", fileType35);
        lwjgl3ApplicationConfiguration33.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration33.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration33.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration33.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType50 = null;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("hi!", fileType50);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color53 = null;
        lwjgl3ApplicationConfiguration52.setInitialBackgroundColor(color53);
        lwjgl3ApplicationConfiguration52.setTitle("");
        lwjgl3ApplicationConfiguration52.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode59 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode59);
        lwjgl3ApplicationConfiguration52.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener65 = null;
        lwjgl3ApplicationConfiguration52.setWindowListener(lwjgl3WindowListener65);
        lwjgl3ApplicationConfiguration52.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration69 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration69.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color72 = null;
        lwjgl3ApplicationConfiguration69.setInitialBackgroundColor(color72);
        com.badlogic.gdx.Graphics.DisplayMode displayMode74 = null;
        lwjgl3ApplicationConfiguration69.setFullscreenMode(displayMode74);
        lwjgl3ApplicationConfiguration69.setInitialVisible(true);
        lwjgl3ApplicationConfiguration69.setWindowedMode(100, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration81 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color82 = null;
        lwjgl3ApplicationConfiguration81.setInitialBackgroundColor(color82);
        lwjgl3ApplicationConfiguration81.setTitle("");
        lwjgl3ApplicationConfiguration81.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode88 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration81.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration69.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode88);
        org.junit.Assert.assertTrue("'" + hdpiMode59 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode59.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode88 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode88.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', 0, (int) ' ', (int) (byte) -1, (int) (short) 0, (int) (short) 0, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, 0, (int) ' ', (int) (byte) 10, (int) ' ', (int) (byte) 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode21);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (-1));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, 0, 1, (int) ' ', (int) '4', 0, (int) '4');
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) (byte) 10, (int) (byte) -1, 10, (int) (byte) 1, (-1), (int) ' ');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (short) 10, 1);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) 'a', (int) 'a', (int) '#', (int) (short) 1, (int) (short) 100, 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) 'a');
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType31);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 0, (int) (short) 10, (int) '#', (int) (short) 10, (int) ' ', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) 100, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass45 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (-1), (int) (short) -1, (int) (short) -1, 100, (int) (short) 100, (int) ' ');
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        java.lang.Class<?> wildcardClass34 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.setResizable(false);
        lwjgl3ApplicationConfiguration15.useVsync(false);
        lwjgl3ApplicationConfiguration15.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration15.useOpenGL3(true, (int) (short) 1, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration15.setFullscreenMode(displayMode27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration29.setPreferencesConfig("hi!", fileType31);
        lwjgl3ApplicationConfiguration29.useVsync(true);
        lwjgl3ApplicationConfiguration29.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3ApplicationConfiguration37.setInitialBackgroundColor(color38);
        lwjgl3ApplicationConfiguration37.setTitle("");
        lwjgl3ApplicationConfiguration37.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration37.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color50 = null;
        lwjgl3ApplicationConfiguration49.setInitialBackgroundColor(color50);
        lwjgl3ApplicationConfiguration49.setTitle("");
        lwjgl3ApplicationConfiguration49.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode56 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode56 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode56.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', 0, (-1));
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 1);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType8);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType13);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, (int) (byte) 1, 10, (int) (byte) 0, (int) 'a', (int) (byte) -1, 0);
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color34);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 1, (int) (short) 100, (int) (short) 1, (int) (short) 100, (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 100, (int) (byte) 1, (int) (short) -1, 10, (int) (byte) 1, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 0, (int) (short) 10, (int) '#', (int) (short) 10, (int) ' ', (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass41 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (short) 0, (int) (short) 0, (int) (byte) 1, (int) (short) -1, (int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass38 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 0);
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType13);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (short) 1, (int) ' ', (int) (byte) 0, 100, (int) '4', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (short) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, 0);
        java.lang.Class<?> wildcardClass41 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) (byte) 100, (-1), (int) 'a', (int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 100, (int) (byte) 100, (int) (short) 0, (int) (byte) 10, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) (short) -1, (-1));
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, (int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType28);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration19.setTitle("");
        lwjgl3ApplicationConfiguration19.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration15.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3ApplicationConfiguration32.setInitialBackgroundColor(color33);
        lwjgl3ApplicationConfiguration32.setTitle("");
        lwjgl3ApplicationConfiguration32.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration32.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color45 = null;
        lwjgl3ApplicationConfiguration44.setInitialBackgroundColor(color45);
        lwjgl3ApplicationConfiguration44.setTitle("");
        lwjgl3ApplicationConfiguration44.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode51 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener58 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener58);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode51 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode51.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (-1), 0, 0, 0, (int) (short) 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (byte) 100, (int) ' ');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration25.setPreferencesConfig("hi!", fileType27);
        lwjgl3ApplicationConfiguration25.useVsync(true);
        lwjgl3ApplicationConfiguration25.setTitle("hi!");
        lwjgl3ApplicationConfiguration25.setWindowPosition((int) ' ', 1);
        lwjgl3ApplicationConfiguration25.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3ApplicationConfiguration25.setFullscreenMode(displayMode38);
        lwjgl3ApplicationConfiguration25.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType43 = null;
        lwjgl3ApplicationConfiguration25.setPreferencesConfig("", fileType43);
        lwjgl3ApplicationConfiguration25.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration47.setResizable(false);
        lwjgl3ApplicationConfiguration47.setDecorated(false);
        lwjgl3ApplicationConfiguration47.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration47.disableAudio(false);
        lwjgl3ApplicationConfiguration47.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color60 = null;
        lwjgl3ApplicationConfiguration59.setInitialBackgroundColor(color60);
        lwjgl3ApplicationConfiguration59.setTitle("");
        lwjgl3ApplicationConfiguration59.setResizable(true);
        lwjgl3ApplicationConfiguration59.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color69 = null;
        lwjgl3ApplicationConfiguration68.setInitialBackgroundColor(color69);
        lwjgl3ApplicationConfiguration68.setTitle("");
        lwjgl3ApplicationConfiguration68.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode75 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration68.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode75);
        com.badlogic.gdx.Files.FileType fileType82 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType82);
        org.junit.Assert.assertTrue("'" + hdpiMode75 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode75.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration13.setTitle("");
        lwjgl3ApplicationConfiguration13.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration13.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration25.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration25.setTitle("");
        lwjgl3ApplicationConfiguration25.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode36);
        java.lang.Class<?> wildcardClass38 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', 100);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (byte) -1, (int) (byte) 100, (int) (byte) 0, (int) (byte) 1, (int) (byte) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass44 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 1, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) '#', (int) (byte) 1, (int) (byte) 0, (int) 'a', (int) ' ', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, 1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) (short) 100, (int) 'a');
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) (byte) 0, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, (int) 'a', (int) (byte) 10, (int) (byte) 100, (int) '4', (int) 'a', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, 1);
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.setResizable(false);
        lwjgl3ApplicationConfiguration15.useVsync(false);
        lwjgl3ApplicationConfiguration15.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration15.useOpenGL3(true, (int) (short) 1, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration15.setFullscreenMode(displayMode27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration29.setPreferencesConfig("hi!", fileType31);
        lwjgl3ApplicationConfiguration29.useVsync(true);
        lwjgl3ApplicationConfiguration29.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3ApplicationConfiguration37.setInitialBackgroundColor(color38);
        lwjgl3ApplicationConfiguration37.setTitle("");
        lwjgl3ApplicationConfiguration37.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration37.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color50 = null;
        lwjgl3ApplicationConfiguration49.setInitialBackgroundColor(color50);
        lwjgl3ApplicationConfiguration49.setTitle("");
        lwjgl3ApplicationConfiguration49.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode56 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode56);
        java.lang.Class<?> wildcardClass62 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode56 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode56.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (short) 0, (int) '#', (int) 'a', 10, (int) (byte) 0, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType23);
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (int) '4', (int) ' ');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', 10, (int) (short) 1, 10, (int) (short) 1, (int) (byte) 0, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType33);
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (byte) 1, (int) (byte) 1, (int) ' ', (int) (short) 1, (int) '#', 1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType27);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, (int) (short) 10, (int) (short) 1, (int) '#', (int) (short) 100, 10, (int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, 10, (int) 'a', (int) 'a', (int) (byte) 10, (int) (byte) 100, 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (short) 100, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode39);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) (short) -1, 100);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (byte) 10, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode32);
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) '4', (int) '4', (int) (short) 1, (int) (short) 100, (int) '4', (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType16);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration9.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration9.setTitle("");
        lwjgl3ApplicationConfiguration9.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.setResizable(false);
        lwjgl3ApplicationConfiguration19.useVsync(false);
        lwjgl3ApplicationConfiguration19.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration19.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration19.disableAudio(false);
        lwjgl3ApplicationConfiguration19.setTitle("");
        lwjgl3ApplicationConfiguration19.useOpenGL3(true, (int) (short) 1, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType41 = null;
        lwjgl3ApplicationConfiguration39.setPreferencesConfig("hi!", fileType41);
        lwjgl3ApplicationConfiguration39.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration39.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration39.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration57.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color62 = null;
        lwjgl3ApplicationConfiguration61.setInitialBackgroundColor(color62);
        lwjgl3ApplicationConfiguration61.setTitle("");
        lwjgl3ApplicationConfiguration61.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode68 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration57.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration39.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode68 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode68.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 10, (int) (short) -1, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (byte) -1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode35);
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) '#', 10, (int) '4', 10, (-1));
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode36);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (short) -1, (-1), 0, (int) (byte) 1, (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass48 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType10);
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType13);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (short) 100);
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) '4', (int) 'a');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, (-1), (int) ' ', (int) (short) 100, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (byte) 1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '4', 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) '4', (int) (byte) 1, 10, (int) (byte) 100, (int) (byte) -1, (-1));
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 0, (int) (short) 10, (int) '#', (int) (short) 10, (int) ' ', (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (byte) 100, (int) (short) 10, (int) (short) 10, 0, (int) (byte) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 0, (int) '4', (int) (byte) -1, 100, (int) '4', (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode53 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode53);
        com.badlogic.gdx.graphics.Color color55 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color55);
        com.badlogic.gdx.graphics.Color color57 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color57);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (short) 1, (int) '#', (-1), (int) '#', (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration16.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration16.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration16.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration16.setDecorated(false);
        lwjgl3ApplicationConfiguration16.setResizable(false);
        lwjgl3ApplicationConfiguration16.useOpenGL3(true, 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration16.useVsync(true);
        com.badlogic.gdx.graphics.Color color46 = null;
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color46);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration48.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color51 = null;
        lwjgl3ApplicationConfiguration48.setInitialBackgroundColor(color51);
        com.badlogic.gdx.Graphics.DisplayMode displayMode53 = null;
        lwjgl3ApplicationConfiguration48.setFullscreenMode(displayMode53);
        lwjgl3ApplicationConfiguration48.setInitialVisible(true);
        lwjgl3ApplicationConfiguration48.setWindowedMode(100, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color61 = null;
        lwjgl3ApplicationConfiguration60.setInitialBackgroundColor(color61);
        lwjgl3ApplicationConfiguration60.setTitle("");
        lwjgl3ApplicationConfiguration60.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode67 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode67);
        java.lang.Class<?> wildcardClass72 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode67 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode67.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType26);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (short) 100, (int) (byte) -1, (int) ' ', (int) (byte) 100, 10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (short) -1, (int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType30);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (byte) 100);
        java.lang.Class<?> wildcardClass36 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration18.setPreferencesConfig("hi!", fileType20);
        lwjgl3ApplicationConfiguration18.useVsync(true);
        lwjgl3ApplicationConfiguration18.setTitle("hi!");
        lwjgl3ApplicationConfiguration18.setWindowPosition((int) ' ', 1);
        lwjgl3ApplicationConfiguration18.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration18.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration18.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration18.setPreferencesConfig("", fileType36);
        lwjgl3ApplicationConfiguration18.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration40.setResizable(false);
        lwjgl3ApplicationConfiguration40.setDecorated(false);
        lwjgl3ApplicationConfiguration40.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration40.disableAudio(false);
        lwjgl3ApplicationConfiguration40.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color53 = null;
        lwjgl3ApplicationConfiguration52.setInitialBackgroundColor(color53);
        lwjgl3ApplicationConfiguration52.setTitle("");
        lwjgl3ApplicationConfiguration52.setResizable(true);
        lwjgl3ApplicationConfiguration52.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color62 = null;
        lwjgl3ApplicationConfiguration61.setInitialBackgroundColor(color62);
        lwjgl3ApplicationConfiguration61.setTitle("");
        lwjgl3ApplicationConfiguration61.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode68 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener76 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener76);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, 0, 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, 1);
        org.junit.Assert.assertTrue("'" + hdpiMode68 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode68.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration16.setTitle("");
        lwjgl3ApplicationConfiguration16.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration27.setPreferencesConfig("hi!", fileType29);
        lwjgl3ApplicationConfiguration27.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration27.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration27.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration27.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode54 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, 1);
        com.badlogic.gdx.Files.FileType fileType61 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType61);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode54 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode54.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 100, (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) 'a', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType36);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType22);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) '4');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', 0, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener33);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType8);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (short) 1, 1, (int) '#', (int) (byte) 10, (int) (byte) 1, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) -1);
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, 0, 1, 100, (int) (byte) 100, (int) '#', 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 0, (int) (short) 10, (int) '#', (int) (short) 10, (int) ' ', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) 100, 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass43 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 10);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType20);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (short) 10, (int) (short) 100, (int) '4', (int) (short) 10, (int) (byte) 100, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode30);
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType33);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration22.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration22.setTitle("");
        lwjgl3ApplicationConfiguration22.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode35);
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode27);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType30);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) '4');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType8);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, (-1), (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, 100);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener31);
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, 1, (int) '4', (int) '#', (int) 'a', 10, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '4', (int) 'a');
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass26 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType7);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass14 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (short) 100, (int) (byte) -1, (int) ' ', (int) (byte) 100, 10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (short) 0, 10, 1, (-1), (int) (byte) 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (short) 100, 10);
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType40);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, 0, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (byte) 1, (int) '4', (int) (byte) 1, (int) 'a', (int) (short) 1, (int) '4');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (short) -1);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (byte) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration17.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration17.setTitle("");
        lwjgl3ApplicationConfiguration17.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration17.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration29.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration29.setTitle("");
        lwjgl3ApplicationConfiguration29.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color42 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color42);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (byte) 1, (int) (short) 10, 0, (-1), (int) 'a', (int) '#');
        java.lang.Class<?> wildcardClass52 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) ' ', (int) '#');
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType32);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration9.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration9.setTitle("");
        lwjgl3ApplicationConfiguration9.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration9.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration21.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration21.setTitle("");
        lwjgl3ApplicationConfiguration21.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) ' ');
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode28 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode28.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 1);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener31);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType25);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType11);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) ' ', (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, 0, (int) (byte) 10, (int) (byte) 100, (int) (byte) 1, 1, (int) '4');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType24);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode33);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (byte) 0);
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) (byte) 100, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (byte) 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, 0);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration17.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration17.useVsync(true);
        lwjgl3ApplicationConfiguration17.setTitle("hi!");
        lwjgl3ApplicationConfiguration17.setWindowPosition((int) ' ', 1);
        lwjgl3ApplicationConfiguration17.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration17.setFullscreenMode(displayMode30);
        lwjgl3ApplicationConfiguration17.setInitialVisible(false);
        lwjgl3ApplicationConfiguration17.setResizable(false);
        lwjgl3ApplicationConfiguration17.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration17.setPreferencesConfig("hi!", fileType39);
        com.badlogic.gdx.Graphics.DisplayMode displayMode41 = null;
        lwjgl3ApplicationConfiguration17.setFullscreenMode(displayMode41);
        lwjgl3ApplicationConfiguration17.setWindowPosition((int) (short) 100, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration46.setResizable(false);
        lwjgl3ApplicationConfiguration46.setDecorated(false);
        lwjgl3ApplicationConfiguration46.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration46.setTitle("hi!");
        lwjgl3ApplicationConfiguration46.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode58 = null;
        lwjgl3ApplicationConfiguration46.setFullscreenMode(displayMode58);
        com.badlogic.gdx.Files.FileType fileType61 = null;
        lwjgl3ApplicationConfiguration46.setPreferencesConfig("", fileType61);
        lwjgl3ApplicationConfiguration46.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration65.setResizable(false);
        lwjgl3ApplicationConfiguration65.setDecorated(false);
        lwjgl3ApplicationConfiguration65.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration65.disableAudio(false);
        lwjgl3ApplicationConfiguration65.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration77 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color78 = null;
        lwjgl3ApplicationConfiguration77.setInitialBackgroundColor(color78);
        lwjgl3ApplicationConfiguration77.setTitle("");
        lwjgl3ApplicationConfiguration77.setResizable(true);
        lwjgl3ApplicationConfiguration77.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration86 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color87 = null;
        lwjgl3ApplicationConfiguration86.setInitialBackgroundColor(color87);
        lwjgl3ApplicationConfiguration86.setTitle("");
        lwjgl3ApplicationConfiguration86.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode93 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration86.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration77.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration65.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode93);
        org.junit.Assert.assertTrue("'" + hdpiMode93 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode93.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (byte) -1, (int) (short) 0, 1, (int) (short) 0, 100, (int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType20);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.setResizable(false);
        lwjgl3ApplicationConfiguration25.useVsync(false);
        lwjgl3ApplicationConfiguration25.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration25.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration25.disableAudio(false);
        lwjgl3ApplicationConfiguration25.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType43 = null;
        lwjgl3ApplicationConfiguration41.setPreferencesConfig("hi!", fileType43);
        lwjgl3ApplicationConfiguration41.useVsync(true);
        lwjgl3ApplicationConfiguration41.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color50 = null;
        lwjgl3ApplicationConfiguration49.setInitialBackgroundColor(color50);
        lwjgl3ApplicationConfiguration49.setTitle("");
        lwjgl3ApplicationConfiguration49.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode56 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration49.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color62 = null;
        lwjgl3ApplicationConfiguration61.setInitialBackgroundColor(color62);
        lwjgl3ApplicationConfiguration61.setTitle("");
        lwjgl3ApplicationConfiguration61.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode68 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode68);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration72 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration72.setResizable(false);
        lwjgl3ApplicationConfiguration72.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration77 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color78 = null;
        lwjgl3ApplicationConfiguration77.setInitialBackgroundColor(color78);
        lwjgl3ApplicationConfiguration77.setTitle("");
        lwjgl3ApplicationConfiguration77.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode84 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration77.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration72.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode84);
        org.junit.Assert.assertTrue("'" + hdpiMode56 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode56.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode68 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode68.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode84 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode84.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, 10, (int) ' ', (int) (short) 0, (int) (byte) 1, (int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 0, (int) (byte) 10, (int) (short) 0, 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (short) -1, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType26);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 10, (int) (byte) 100, 0, (int) (byte) 10, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType17);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (short) 1, (int) (byte) -1, (int) (short) 10, (int) ' ', (int) (byte) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, 10, (int) ' ', (int) (byte) 100, (-1), (int) (short) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color34);
        lwjgl3ApplicationConfiguration33.setTitle("");
        lwjgl3ApplicationConfiguration33.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode40);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3ApplicationConfiguration33.setWindowListener(lwjgl3WindowListener42);
        lwjgl3ApplicationConfiguration33.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color47 = null;
        lwjgl3ApplicationConfiguration46.setInitialBackgroundColor(color47);
        lwjgl3ApplicationConfiguration46.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration46.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration46.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType65 = null;
        lwjgl3ApplicationConfiguration63.setPreferencesConfig("hi!", fileType65);
        lwjgl3ApplicationConfiguration63.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration75 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration75.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration79 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color80 = null;
        lwjgl3ApplicationConfiguration79.setInitialBackgroundColor(color80);
        lwjgl3ApplicationConfiguration79.setTitle("");
        lwjgl3ApplicationConfiguration79.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode86 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration79.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration75.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration63.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode86);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode86);
        com.badlogic.gdx.Graphics.DisplayMode displayMode93 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode93);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode86 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode86.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setResizable(true);
        lwjgl3ApplicationConfiguration12.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration21.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration21.setTitle("");
        lwjgl3ApplicationConfiguration21.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', 10, 0, (int) (short) 10, 0, (int) 'a', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + hdpiMode28 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode28.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) 'a', (int) (byte) -1, (int) (short) 100, (int) '4', (int) (byte) 0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.Files.FileType fileType5 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType5);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 1, (int) (byte) 10);
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (short) 10, 1, (int) (short) 10, (int) (byte) 0, (int) (byte) 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType22);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration20.setPreferencesConfig("hi!", fileType22);
        lwjgl3ApplicationConfiguration20.useVsync(true);
        lwjgl3ApplicationConfiguration20.disableAudio(false);
        lwjgl3ApplicationConfiguration20.useVsync(false);
        lwjgl3ApplicationConfiguration20.setTitle("hi!");
        lwjgl3ApplicationConfiguration20.setWindowPosition(1, (int) ' ');
        lwjgl3ApplicationConfiguration20.setWindowPosition((int) (short) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration20.setResizable(true);
        lwjgl3ApplicationConfiguration20.setBackBufferConfig((int) ' ', (int) (short) 0, (int) (byte) 0, 0, (int) (byte) 0, 0, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3ApplicationConfiguration48.setInitialBackgroundColor(color49);
        com.badlogic.gdx.Graphics.DisplayMode displayMode51 = null;
        lwjgl3ApplicationConfiguration48.setFullscreenMode(displayMode51);
        lwjgl3ApplicationConfiguration48.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color56 = null;
        lwjgl3ApplicationConfiguration48.setInitialBackgroundColor(color56);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType60 = null;
        lwjgl3ApplicationConfiguration58.setPreferencesConfig("hi!", fileType60);
        lwjgl3ApplicationConfiguration58.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration58.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration58.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration76 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration76.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration80 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color81 = null;
        lwjgl3ApplicationConfiguration80.setInitialBackgroundColor(color81);
        lwjgl3ApplicationConfiguration80.setTitle("");
        lwjgl3ApplicationConfiguration80.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode87 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration80.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration76.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration58.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode87);
        java.lang.Class<?> wildcardClass94 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode87 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode87.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 0, (int) 'a', 0, (int) (short) 100, (int) (byte) 100, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, 1, (int) (byte) 1, (int) '#', (-1), (-1), (int) (byte) 0);
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType30);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', 1);
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (byte) -1, (int) (short) 0, 1, (int) (short) 0, 100, (int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration9.setPreferencesConfig("hi!", fileType11);
        lwjgl3ApplicationConfiguration9.useVsync(true);
        lwjgl3ApplicationConfiguration9.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration17.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration17.setTitle("");
        lwjgl3ApplicationConfiguration17.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration17.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration29.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration29.setTitle("");
        lwjgl3ApplicationConfiguration29.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (byte) 10, (int) ' ', (-1), (int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color49);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, 1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration13.setTitle("");
        lwjgl3ApplicationConfiguration13.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration13.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration25.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration25.setTitle("");
        lwjgl3ApplicationConfiguration25.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) ' ', 100, (int) '#', (int) (byte) 10, (int) (byte) 0, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener52 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener52);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType21);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType26);
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.Files.FileType fileType5 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType5);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 100, 0);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (byte) 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) '4', (int) (byte) 0, (int) 'a', (int) (byte) 0, (int) (byte) 100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (byte) 1, (int) (short) 100, (int) (short) -1, (int) (short) -1, (int) 'a', 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener47 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener47);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.setResizable(false);
        lwjgl3ApplicationConfiguration21.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration21.setWindowListener(lwjgl3WindowListener26);
        lwjgl3ApplicationConfiguration21.setInitialVisible(false);
        lwjgl3ApplicationConfiguration21.disableAudio(false);
        lwjgl3ApplicationConfiguration21.useVsync(false);
        lwjgl3ApplicationConfiguration21.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration21.disableAudio(false);
        lwjgl3ApplicationConfiguration21.setTitle("hi!");
        lwjgl3ApplicationConfiguration21.useOpenGL3(true, (int) '#', 100);
        lwjgl3ApplicationConfiguration21.setDecorated(true);
        lwjgl3ApplicationConfiguration21.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration50.setResizable(false);
        lwjgl3ApplicationConfiguration50.setDecorated(false);
        lwjgl3ApplicationConfiguration50.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration50.disableAudio(false);
        lwjgl3ApplicationConfiguration50.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color63 = null;
        lwjgl3ApplicationConfiguration62.setInitialBackgroundColor(color63);
        lwjgl3ApplicationConfiguration62.setTitle("");
        lwjgl3ApplicationConfiguration62.setResizable(true);
        lwjgl3ApplicationConfiguration62.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration71 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color72 = null;
        lwjgl3ApplicationConfiguration71.setInitialBackgroundColor(color72);
        lwjgl3ApplicationConfiguration71.setTitle("");
        lwjgl3ApplicationConfiguration71.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode78 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration71.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode78);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener84 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener84);
        com.badlogic.gdx.graphics.Color color86 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color86);
        org.junit.Assert.assertTrue("'" + hdpiMode78 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode78.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setResizable(true);
        lwjgl3ApplicationConfiguration12.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration21.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration21.setTitle("");
        lwjgl3ApplicationConfiguration21.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode28);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass38 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode28 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode28.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode21);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass36 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) 'a', (int) (short) 10, (int) '#', (int) (short) 1, (int) '4', 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 1, 1);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) '#', 10, (int) '4', 10, (-1));
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode27);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType30);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (byte) 10, (int) (byte) 100, (int) (short) 10, 0, (int) (byte) 100, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, 0);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (short) 100, (int) (short) -1, (int) (short) 100, 1, (int) (byte) 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, 1);
        java.lang.Class<?> wildcardClass31 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (short) 0);
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration23.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration23.setTitle("");
        lwjgl3ApplicationConfiguration23.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode30);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode30);
        lwjgl3ApplicationConfiguration19.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color37);
        lwjgl3ApplicationConfiguration36.setTitle("");
        lwjgl3ApplicationConfiguration36.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration36.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3ApplicationConfiguration48.setInitialBackgroundColor(color49);
        lwjgl3ApplicationConfiguration48.setTitle("");
        lwjgl3ApplicationConfiguration48.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass67 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode30 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode30.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType18);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) -1, (int) (byte) 10, (int) (short) 0, 10, (int) 'a', (-1));
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, 1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType35);
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        java.lang.Class<?> wildcardClass23 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration19.setTitle("");
        lwjgl3ApplicationConfiguration19.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration15.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3ApplicationConfiguration32.setInitialBackgroundColor(color33);
        lwjgl3ApplicationConfiguration32.setTitle("");
        lwjgl3ApplicationConfiguration32.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration32.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color45 = null;
        lwjgl3ApplicationConfiguration44.setInitialBackgroundColor(color45);
        lwjgl3ApplicationConfiguration44.setTitle("");
        lwjgl3ApplicationConfiguration44.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode51 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode51 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode51.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration8.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration8.setInitialBackgroundColor(color11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration8.disableAudio(false);
        lwjgl3ApplicationConfiguration8.setWindowPosition((int) ' ', 0);
        lwjgl3ApplicationConfiguration8.setTitle("hi!");
        lwjgl3ApplicationConfiguration8.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration24.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration24.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration24.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration24.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType43 = null;
        lwjgl3ApplicationConfiguration41.setPreferencesConfig("hi!", fileType43);
        lwjgl3ApplicationConfiguration41.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration53 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration53.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color58 = null;
        lwjgl3ApplicationConfiguration57.setInitialBackgroundColor(color58);
        lwjgl3ApplicationConfiguration57.setTitle("");
        lwjgl3ApplicationConfiguration57.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode64 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration57.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration53.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode64);
        com.badlogic.gdx.graphics.Color color71 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color71);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 0, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + hdpiMode64 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode64.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) 'a');
        java.lang.Class<?> wildcardClass12 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (byte) -1, (int) (byte) 100, (int) ' ', 1, (int) (byte) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType27);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 1, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType26);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', 10);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType7);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (short) 100, (int) '#', 100, 1, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, (int) 'a', (int) (byte) -1, (int) 'a', (int) (short) -1, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) 'a', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, 100, 0, (int) (short) 100, (int) (byte) 100, (int) (byte) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', 0, (int) (short) -1, (int) (byte) 100, 10, (int) (short) 10, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color43);
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) ' ', (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener32);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color34);
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 0, (int) '4');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color37);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) 'a', (int) '4', (int) (byte) 1, (int) (byte) 10, (int) (short) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (-1), 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration17.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration17.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color34);
        lwjgl3ApplicationConfiguration33.setTitle("");
        lwjgl3ApplicationConfiguration33.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color48 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color48);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, 0, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 10, 10, 100, (int) (byte) 0, (int) '#', (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (short) -1, 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration16.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration16.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration16.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("hi!", fileType35);
        lwjgl3ApplicationConfiguration33.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration45.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color50 = null;
        lwjgl3ApplicationConfiguration49.setInitialBackgroundColor(color50);
        lwjgl3ApplicationConfiguration49.setTitle("");
        lwjgl3ApplicationConfiguration49.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode56 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration45.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode56);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode56);
        com.badlogic.gdx.Files.FileType fileType63 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType63);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode56 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode56.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) 'a', 0, 10, (int) (byte) 100, (int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (short) -1, (int) '#', (int) (byte) 0, (int) (byte) 100, 0, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode21);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (byte) 1, (int) (byte) -1, (int) '#', (int) (short) 10, (int) (short) 10, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 100, (int) (byte) 1, (int) (short) -1, 10, (int) (byte) 1, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration26.setPreferencesConfig("hi!", fileType28);
        lwjgl3ApplicationConfiguration26.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration26.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration26.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration26.setDecorated(false);
        lwjgl3ApplicationConfiguration26.setResizable(false);
        lwjgl3ApplicationConfiguration26.useOpenGL3(true, 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration26.useVsync(true);
        com.badlogic.gdx.graphics.Color color56 = null;
        lwjgl3ApplicationConfiguration26.setInitialBackgroundColor(color56);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration58.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color61 = null;
        lwjgl3ApplicationConfiguration58.setInitialBackgroundColor(color61);
        com.badlogic.gdx.Graphics.DisplayMode displayMode63 = null;
        lwjgl3ApplicationConfiguration58.setFullscreenMode(displayMode63);
        lwjgl3ApplicationConfiguration58.setInitialVisible(true);
        lwjgl3ApplicationConfiguration58.setWindowedMode(100, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration70 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color71 = null;
        lwjgl3ApplicationConfiguration70.setInitialBackgroundColor(color71);
        lwjgl3ApplicationConfiguration70.setTitle("");
        lwjgl3ApplicationConfiguration70.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode77 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration70.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration58.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode84 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode84);
        com.badlogic.gdx.Graphics.DisplayMode displayMode86 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode86);
        org.junit.Assert.assertTrue("'" + hdpiMode77 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode77.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration17.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration17.setTitle("");
        lwjgl3ApplicationConfiguration17.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, 10);
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType35);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass42 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) 'a', (int) (short) 10, (int) '#', (int) (short) 1, (int) '4', 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 1, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) ' ', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (short) 0, 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (short) 0, (int) (short) 10, 100, (int) '4', (int) (short) 100, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 100, (int) 'a');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color36);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType18);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.setResizable(false);
        lwjgl3ApplicationConfiguration22.setDecorated(false);
        lwjgl3ApplicationConfiguration22.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration22.disableAudio(false);
        lwjgl3ApplicationConfiguration22.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color35);
        lwjgl3ApplicationConfiguration34.setTitle("");
        lwjgl3ApplicationConfiguration34.setResizable(true);
        lwjgl3ApplicationConfiguration34.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration43.setInitialBackgroundColor(color44);
        lwjgl3ApplicationConfiguration43.setTitle("");
        lwjgl3ApplicationConfiguration43.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode50);
        com.badlogic.gdx.graphics.Color color55 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color55);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color59 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color59);
        org.junit.Assert.assertTrue("'" + hdpiMode50 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode50.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType26);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) 'a');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) 'a', 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 0, 0, (int) (byte) -1, (int) (byte) 100, 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode34);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType39);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) '4', (int) (byte) -1, 0, (int) (short) 1, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode34);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode36);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass40 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration9.setPreferencesConfig("hi!", fileType11);
        lwjgl3ApplicationConfiguration9.useVsync(true);
        lwjgl3ApplicationConfiguration9.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration17.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration17.setTitle("");
        lwjgl3ApplicationConfiguration17.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration17.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration29.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration29.setTitle("");
        lwjgl3ApplicationConfiguration29.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (byte) 10, (int) ' ', (-1), (int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType50 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType50);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass54 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (byte) 100, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) ' ', 0, 10, (int) (short) -1, (-1), (int) (short) 0);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 0, (int) (byte) 10, (int) (short) 0, 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (short) -1, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.setResizable(false);
        lwjgl3ApplicationConfiguration14.useVsync(false);
        lwjgl3ApplicationConfiguration14.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration14.useOpenGL3(true, (int) (short) 1, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration28.setPreferencesConfig("hi!", fileType30);
        lwjgl3ApplicationConfiguration28.useVsync(true);
        lwjgl3ApplicationConfiguration28.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color37);
        lwjgl3ApplicationConfiguration36.setTitle("");
        lwjgl3ApplicationConfiguration36.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration36.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3ApplicationConfiguration48.setInitialBackgroundColor(color49);
        lwjgl3ApplicationConfiguration48.setTitle("");
        lwjgl3ApplicationConfiguration48.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color63 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color63);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType24);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) 'a', 1, (int) ' ', 10, (int) (byte) 100, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, 10, (int) 'a', (int) 'a', (int) (byte) 10, (int) (byte) 100, 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (short) 100, (int) 'a', (int) (short) 1, (int) (byte) 1, 0, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration16.setTitle("");
        lwjgl3ApplicationConfiguration16.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, (int) (short) 10, (int) (byte) 10, (int) 'a', (int) (byte) 0, (int) (short) 1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (short) -1, 100, 0, (int) (byte) 100, (int) (short) 0, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType8);
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType11);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, (int) (byte) 1, (int) (short) -1, (int) (short) -1, 10, (int) (byte) -1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) ' ', (int) ' ');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) '#', 100, (int) 'a', (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) (short) 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) '4');
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (short) 1, (int) ' ', (int) (byte) 0, 100, (int) '4', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (short) 0, (int) (byte) -1, (int) (byte) 10, (int) (short) 100, 10, (int) ' ');
        com.badlogic.gdx.Files.FileType fileType45 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType45);
        com.badlogic.gdx.Files.FileType fileType48 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType48);
        java.lang.Class<?> wildcardClass50 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', 0);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType32);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener36);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener34);
        java.lang.Class<?> wildcardClass36 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (short) 100, (int) (byte) -1, (int) ' ', (int) (byte) 100, 10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType15);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) ' ', (int) (short) 100);
        java.lang.Class<?> wildcardClass34 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (short) 0, 1);
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) 'a', (int) (byte) -1, 0, (int) (short) -1, (int) (byte) 1, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType23);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, (int) '#', (int) (short) 10, (int) (byte) 1, 1, 0, 1);
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration29.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration29.setTitle("");
        lwjgl3ApplicationConfiguration29.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration29.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration29.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode50);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType54 = null;
        lwjgl3ApplicationConfiguration52.setPreferencesConfig("hi!", fileType54);
        lwjgl3ApplicationConfiguration52.useVsync(true);
        lwjgl3ApplicationConfiguration52.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color61 = null;
        lwjgl3ApplicationConfiguration60.setInitialBackgroundColor(color61);
        lwjgl3ApplicationConfiguration60.setTitle("");
        lwjgl3ApplicationConfiguration60.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode67 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration60.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration72 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color73 = null;
        lwjgl3ApplicationConfiguration72.setInitialBackgroundColor(color73);
        lwjgl3ApplicationConfiguration72.setTitle("");
        lwjgl3ApplicationConfiguration72.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode79 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration72.setHdpiMode(hdpiMode79);
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode79);
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode79);
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode79);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode79);
        com.badlogic.gdx.Graphics.DisplayMode displayMode85 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode85);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode50 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode50.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode67 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode67.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode79 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode79.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType25);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, 0);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) '4', (int) '4', (int) (short) 1, (int) (short) 100, (int) '4', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener32);
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType35);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color37);
        java.lang.Class<?> wildcardClass39 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration15.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration15.setTitle("");
        lwjgl3ApplicationConfiguration15.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration15.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3ApplicationConfiguration15.setWindowListener(lwjgl3WindowListener28);
        lwjgl3ApplicationConfiguration15.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration15.setWindowListener(lwjgl3WindowListener32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration38.setInitialBackgroundColor(color39);
        lwjgl3ApplicationConfiguration38.setTitle("");
        lwjgl3ApplicationConfiguration38.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration34.setWindowPosition((int) (short) 0, (int) (byte) -1);
        lwjgl3ApplicationConfiguration34.setDecorated(true);
        lwjgl3ApplicationConfiguration34.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode55 = null;
        lwjgl3ApplicationConfiguration34.setFullscreenMode(displayMode55);
        lwjgl3ApplicationConfiguration34.setWindowPosition((int) (short) 1, (int) 'a');
        lwjgl3ApplicationConfiguration34.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration62.setResizable(false);
        lwjgl3ApplicationConfiguration62.setDecorated(false);
        lwjgl3ApplicationConfiguration62.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration62.disableAudio(false);
        lwjgl3ApplicationConfiguration62.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration74 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color75 = null;
        lwjgl3ApplicationConfiguration74.setInitialBackgroundColor(color75);
        lwjgl3ApplicationConfiguration74.setTitle("");
        lwjgl3ApplicationConfiguration74.setResizable(true);
        lwjgl3ApplicationConfiguration74.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration83 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color84 = null;
        lwjgl3ApplicationConfiguration83.setInitialBackgroundColor(color84);
        lwjgl3ApplicationConfiguration83.setTitle("");
        lwjgl3ApplicationConfiguration83.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode90 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration83.setHdpiMode(hdpiMode90);
        lwjgl3ApplicationConfiguration74.setHdpiMode(hdpiMode90);
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode90);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode90);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode90);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode90);
        com.badlogic.gdx.Graphics.DisplayMode displayMode97 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode97);
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode90 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode90.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration8.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration8.setTitle("");
        lwjgl3ApplicationConfiguration8.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode15);
        lwjgl3ApplicationConfiguration8.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration20.setTitle("");
        lwjgl3ApplicationConfiguration20.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration31.setResizable(false);
        lwjgl3ApplicationConfiguration31.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color37);
        lwjgl3ApplicationConfiguration36.setTitle("");
        lwjgl3ApplicationConfiguration36.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode43);
        com.badlogic.gdx.Graphics.DisplayMode displayMode47 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode47);
        com.badlogic.gdx.Graphics.DisplayMode displayMode49 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode49);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) (byte) 100, 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setResizable(true);
        lwjgl3ApplicationConfiguration12.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration21.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration21.setTitle("");
        lwjgl3ApplicationConfiguration21.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode28);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass40 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode28 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode28.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.Files.FileType fileType5 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType5);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        java.lang.Class<?> wildcardClass13 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener33);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration10.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration10.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration10.setInitialVisible(true);
        lwjgl3ApplicationConfiguration10.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration19.setFullscreenMode(displayMode22);
        lwjgl3ApplicationConfiguration19.setWindowPosition((int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration19.disableAudio(true);
        lwjgl3ApplicationConfiguration19.setWindowedMode((int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration19.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration34.setPreferencesConfig("hi!", fileType36);
        lwjgl3ApplicationConfiguration34.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration46.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color51 = null;
        lwjgl3ApplicationConfiguration50.setInitialBackgroundColor(color51);
        lwjgl3ApplicationConfiguration50.setTitle("");
        lwjgl3ApplicationConfiguration50.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode57 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode57);
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode57);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode57);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType63 = null;
        lwjgl3ApplicationConfiguration61.setPreferencesConfig("hi!", fileType63);
        lwjgl3ApplicationConfiguration61.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration61.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration61.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration61.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode88 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration10.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode96 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode96);
        org.junit.Assert.assertTrue("'" + hdpiMode57 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode57.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode88 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode88.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) '4', (int) '4', (int) (short) 1, (int) (short) 100, (int) '4', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (short) -1, (int) '4', (int) '4', 100, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) 'a');
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) ' ', (int) (byte) 10, 10, 0, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (short) 100, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color28);
        lwjgl3ApplicationConfiguration27.setTitle("");
        lwjgl3ApplicationConfiguration27.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode34 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode34);
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode34);
        lwjgl3ApplicationConfiguration23.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener40 = null;
        lwjgl3ApplicationConfiguration23.setWindowListener(lwjgl3WindowListener40);
        com.badlogic.gdx.Graphics.DisplayMode displayMode42 = null;
        lwjgl3ApplicationConfiguration23.setFullscreenMode(displayMode42);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType46 = null;
        lwjgl3ApplicationConfiguration44.setPreferencesConfig("hi!", fileType46);
        lwjgl3ApplicationConfiguration44.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration44.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration44.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration44.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode60 = null;
        lwjgl3ApplicationConfiguration44.setFullscreenMode(displayMode60);
        lwjgl3ApplicationConfiguration44.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration64.setResizable(false);
        lwjgl3ApplicationConfiguration64.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration69 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration69.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration73 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color74 = null;
        lwjgl3ApplicationConfiguration73.setInitialBackgroundColor(color74);
        lwjgl3ApplicationConfiguration73.setTitle("");
        lwjgl3ApplicationConfiguration73.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode80 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration73.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration69.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode34 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode34.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode80 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode80.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, (int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (byte) -1, (int) (short) 0, 1, (int) (short) 0, 100, (int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType20);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) ' ', (int) '4');
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration30.setPreferencesConfig("hi!", fileType32);
        lwjgl3ApplicationConfiguration30.useVsync(true);
        lwjgl3ApplicationConfiguration30.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration38.setInitialBackgroundColor(color39);
        lwjgl3ApplicationConfiguration38.setTitle("");
        lwjgl3ApplicationConfiguration38.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration38.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color51 = null;
        lwjgl3ApplicationConfiguration50.setInitialBackgroundColor(color51);
        lwjgl3ApplicationConfiguration50.setTitle("");
        lwjgl3ApplicationConfiguration50.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode57 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode57);
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode57);
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode57);
        com.badlogic.gdx.Graphics.DisplayMode displayMode61 = null;
        lwjgl3ApplicationConfiguration30.setFullscreenMode(displayMode61);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType65 = null;
        lwjgl3ApplicationConfiguration63.setPreferencesConfig("hi!", fileType65);
        lwjgl3ApplicationConfiguration63.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration63.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration63.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration81 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration81.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration85 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color86 = null;
        lwjgl3ApplicationConfiguration85.setInitialBackgroundColor(color86);
        lwjgl3ApplicationConfiguration85.setTitle("");
        lwjgl3ApplicationConfiguration85.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode92 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration85.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration81.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration63.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode57 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode57.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode92 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode92.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, (int) '#', (int) (byte) 10, 100, (int) 'a', (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 1, (int) ' ', 1, (int) (short) -1, (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (short) 0, (int) (byte) 1, (int) (short) 0, 1, (int) (short) -1, 0);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.setResizable(false);
        lwjgl3ApplicationConfiguration11.useVsync(false);
        lwjgl3ApplicationConfiguration11.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration11.setBackBufferConfig((int) 'a', (int) (short) 1, (int) '4', (int) '#', (int) (byte) 0, 10, (int) 'a');
        lwjgl3ApplicationConfiguration11.setBackBufferConfig((int) (short) -1, 10, (int) (byte) 0, (int) (short) -1, (int) (byte) 0, (int) (byte) -1, (int) (short) 1);
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration11.setPreferencesConfig("", fileType36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration38.setInitialBackgroundColor(color39);
        com.badlogic.gdx.Graphics.DisplayMode displayMode41 = null;
        lwjgl3ApplicationConfiguration38.setFullscreenMode(displayMode41);
        lwjgl3ApplicationConfiguration38.setBackBufferConfig(1, 100, (int) 'a', (int) (short) 10, (int) (byte) 10, 10, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType53 = null;
        lwjgl3ApplicationConfiguration51.setPreferencesConfig("hi!", fileType53);
        lwjgl3ApplicationConfiguration51.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration51.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration51.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration51.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode78 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode78);
        org.junit.Assert.assertTrue("'" + hdpiMode78 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode78.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, 10, (int) ' ', (int) (byte) 100, (-1), (int) (short) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', 0);
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) (byte) 100, (-1), (int) 'a', (int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode25);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration8.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration8.setTitle("");
        lwjgl3ApplicationConfiguration8.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode15);
        lwjgl3ApplicationConfiguration8.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration20.setTitle("");
        lwjgl3ApplicationConfiguration20.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration31.setResizable(false);
        lwjgl3ApplicationConfiguration31.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color37);
        lwjgl3ApplicationConfiguration36.setTitle("");
        lwjgl3ApplicationConfiguration36.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode43);
        com.badlogic.gdx.Graphics.DisplayMode displayMode47 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode47);
        com.badlogic.gdx.Graphics.DisplayMode displayMode49 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode49);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) '4', (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 100, 0, (int) (byte) 10, (int) (byte) -1, (int) (short) 100, 0);
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) -1, 10);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (short) 0, (int) '#', (int) (byte) 100, (int) (short) 100, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 0, (int) (short) 10, (int) '#', (int) (short) 10, (int) ' ', (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (byte) 100, (int) (short) 10, (int) (short) 10, 0, (int) (byte) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration7.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration7.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration7.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration7.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.setResizable(false);
        lwjgl3ApplicationConfiguration18.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration18.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration18.setInitialVisible(false);
        lwjgl3ApplicationConfiguration18.useOpenGL3(true, (int) (byte) 10, (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration18.setFullscreenMode(displayMode31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.setResizable(false);
        lwjgl3ApplicationConfiguration33.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration38.setInitialBackgroundColor(color39);
        lwjgl3ApplicationConfiguration38.setTitle("");
        lwjgl3ApplicationConfiguration38.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration7.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType15);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, 0, (int) (short) 0, (int) (short) 100, (int) '#', 100, (int) (short) -1);
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setResizable(false);
        lwjgl3ApplicationConfiguration20.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration29.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration29.setTitle("");
        lwjgl3ApplicationConfiguration29.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) '#');
        com.badlogic.gdx.Files.FileType fileType54 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType54);
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.setResizable(false);
        lwjgl3ApplicationConfiguration14.useVsync(false);
        lwjgl3ApplicationConfiguration14.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration14.useOpenGL3(true, (int) (short) 1, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration28.setPreferencesConfig("hi!", fileType30);
        lwjgl3ApplicationConfiguration28.useVsync(true);
        lwjgl3ApplicationConfiguration28.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color37);
        lwjgl3ApplicationConfiguration36.setTitle("");
        lwjgl3ApplicationConfiguration36.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration36.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3ApplicationConfiguration48.setInitialBackgroundColor(color49);
        lwjgl3ApplicationConfiguration48.setTitle("");
        lwjgl3ApplicationConfiguration48.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, (-1), (int) (byte) 0, 1, 0, (int) (short) 10, 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType20);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType23);
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (byte) -1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType27);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) ' ');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', 1, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode30);
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration13.setTitle("");
        lwjgl3ApplicationConfiguration13.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration13.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration25.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration25.setTitle("");
        lwjgl3ApplicationConfiguration25.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color38);
        com.badlogic.gdx.Files.FileType fileType41 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType41);
        java.lang.Class<?> wildcardClass43 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (byte) 1, 0, (int) (byte) 1, (int) 'a', (int) '4', (int) 'a');
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) '#');
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (short) 100);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType30);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 0, 10);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType27);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) '4', 1, (int) (short) 0, (int) '4', (int) (byte) -1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass7 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType14);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (short) 1, (int) ' ', (int) (byte) 0, 100, (int) '4', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (byte) 100, (int) (byte) 1, (int) '4', (int) (short) 10, 0, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', (int) '#');
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) 'a', (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration17.setFullscreenMode(displayMode20);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration17.setPreferencesConfig("", fileType23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration25.setInitialBackgroundColor(color28);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration25.setFullscreenMode(displayMode30);
        lwjgl3ApplicationConfiguration25.disableAudio(false);
        lwjgl3ApplicationConfiguration25.setWindowPosition((int) ' ', 0);
        lwjgl3ApplicationConfiguration25.setTitle("hi!");
        lwjgl3ApplicationConfiguration25.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color42 = null;
        lwjgl3ApplicationConfiguration41.setInitialBackgroundColor(color42);
        lwjgl3ApplicationConfiguration41.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration41.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration41.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType60 = null;
        lwjgl3ApplicationConfiguration58.setPreferencesConfig("hi!", fileType60);
        lwjgl3ApplicationConfiguration58.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration70 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration70.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration74 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color75 = null;
        lwjgl3ApplicationConfiguration74.setInitialBackgroundColor(color75);
        lwjgl3ApplicationConfiguration74.setTitle("");
        lwjgl3ApplicationConfiguration74.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode81 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration74.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration70.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration58.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode81);
        com.badlogic.gdx.Graphics.DisplayMode displayMode89 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode89);
        com.badlogic.gdx.Files.FileType fileType92 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType92);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + hdpiMode81 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode81.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType8);
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration17.setInitialBackgroundColor(color18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration17.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration17.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration17.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration17.setWindowPosition((int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration17.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration17.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration17.setPreferencesConfig("", fileType35);
        lwjgl3ApplicationConfiguration17.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color40 = null;
        lwjgl3ApplicationConfiguration39.setInitialBackgroundColor(color40);
        lwjgl3ApplicationConfiguration39.setTitle("");
        lwjgl3ApplicationConfiguration39.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration39.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration39.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration39.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration39.setAudioConfig(100, (int) (byte) -1, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType66 = null;
        lwjgl3ApplicationConfiguration64.setPreferencesConfig("hi!", fileType66);
        lwjgl3ApplicationConfiguration64.useVsync(true);
        lwjgl3ApplicationConfiguration64.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration72 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color73 = null;
        lwjgl3ApplicationConfiguration72.setInitialBackgroundColor(color73);
        lwjgl3ApplicationConfiguration72.setTitle("");
        lwjgl3ApplicationConfiguration72.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode79 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration72.setHdpiMode(hdpiMode79);
        lwjgl3ApplicationConfiguration72.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration84 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color85 = null;
        lwjgl3ApplicationConfiguration84.setInitialBackgroundColor(color85);
        lwjgl3ApplicationConfiguration84.setTitle("");
        lwjgl3ApplicationConfiguration84.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode91 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration84.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration72.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration39.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode91);
        com.badlogic.gdx.graphics.Color color98 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color98);
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode79 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode79.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode91 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode91.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration15.setPreferencesConfig("hi!", fileType17);
        lwjgl3ApplicationConfiguration15.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration31.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration31.setTitle("");
        lwjgl3ApplicationConfiguration31.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode38);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType44 = null;
        lwjgl3ApplicationConfiguration42.setPreferencesConfig("hi!", fileType44);
        lwjgl3ApplicationConfiguration42.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration42.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration42.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration42.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode69 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration42.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (byte) 100, (int) (short) 10, (int) (short) 10, 0, (int) ' ', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode69 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode69.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration18.setInitialBackgroundColor(color19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration18.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration18.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration18.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration18.setWindowPosition((int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration18.setInitialBackgroundColor(color31);
        lwjgl3ApplicationConfiguration18.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration18.setPreferencesConfig("", fileType36);
        lwjgl3ApplicationConfiguration18.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3ApplicationConfiguration40.setInitialBackgroundColor(color41);
        lwjgl3ApplicationConfiguration40.setTitle("");
        lwjgl3ApplicationConfiguration40.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration40.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration40.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration40.setAudioConfig(100, (int) (byte) -1, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType67 = null;
        lwjgl3ApplicationConfiguration65.setPreferencesConfig("hi!", fileType67);
        lwjgl3ApplicationConfiguration65.useVsync(true);
        lwjgl3ApplicationConfiguration65.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration73 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color74 = null;
        lwjgl3ApplicationConfiguration73.setInitialBackgroundColor(color74);
        lwjgl3ApplicationConfiguration73.setTitle("");
        lwjgl3ApplicationConfiguration73.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode80 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration73.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration73.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration85 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color86 = null;
        lwjgl3ApplicationConfiguration85.setInitialBackgroundColor(color86);
        lwjgl3ApplicationConfiguration85.setTitle("");
        lwjgl3ApplicationConfiguration85.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode92 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration85.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration73.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration65.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode92);
        org.junit.Assert.assertTrue("'" + hdpiMode47 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode47.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode80 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode80.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode92 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode92.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 10, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration17.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration17.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color34);
        lwjgl3ApplicationConfiguration33.setTitle("");
        lwjgl3ApplicationConfiguration33.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode48 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode48);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 0, 10);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) 'a', (int) (byte) -1, 0, (int) (short) -1, (int) (byte) 1, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) '#');
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color38);
        com.badlogic.gdx.Files.FileType fileType41 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType41);
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        java.lang.Class<?> wildcardClass26 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (byte) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration15.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration15.setTitle("");
        lwjgl3ApplicationConfiguration15.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration15.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration15.setTitle("hi!");
        lwjgl3ApplicationConfiguration15.setTitle("hi!");
        lwjgl3ApplicationConfiguration15.setBackBufferConfig((int) (byte) 1, 10, (int) 'a', (int) 'a', (int) (byte) 10, (int) (byte) 100, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener40 = null;
        lwjgl3ApplicationConfiguration15.setWindowListener(lwjgl3WindowListener40);
        lwjgl3ApplicationConfiguration15.setAudioConfig(100, (int) '#', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener46 = null;
        lwjgl3ApplicationConfiguration15.setWindowListener(lwjgl3WindowListener46);
        lwjgl3ApplicationConfiguration15.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color51 = null;
        lwjgl3ApplicationConfiguration50.setInitialBackgroundColor(color51);
        com.badlogic.gdx.Graphics.DisplayMode displayMode53 = null;
        lwjgl3ApplicationConfiguration50.setFullscreenMode(displayMode53);
        lwjgl3ApplicationConfiguration50.setWindowPosition((int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration50.disableAudio(true);
        lwjgl3ApplicationConfiguration50.setWindowedMode((int) (short) -1, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode63 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode63);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode63);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode63);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode63 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode63.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration13.setTitle("");
        lwjgl3ApplicationConfiguration13.setTitle("");
        lwjgl3ApplicationConfiguration13.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration22.setPreferencesConfig("hi!", fileType24);
        lwjgl3ApplicationConfiguration22.useVsync(true);
        lwjgl3ApplicationConfiguration22.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration30.setInitialBackgroundColor(color31);
        lwjgl3ApplicationConfiguration30.setTitle("");
        lwjgl3ApplicationConfiguration30.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode37);
        lwjgl3ApplicationConfiguration30.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3ApplicationConfiguration42.setInitialBackgroundColor(color43);
        lwjgl3ApplicationConfiguration42.setTitle("");
        lwjgl3ApplicationConfiguration42.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode49 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration42.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode49);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener55 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener55);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) '4', 0, 0, (-1), (int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode37 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode37.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode49 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode49.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType30);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) '#', (int) (short) 0, (int) (byte) 100, 100, (int) (byte) 100, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color33);
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) '4', (-1));
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("hi!", fileType9);
        lwjgl3ApplicationConfiguration7.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration7.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration7.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration7.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode34 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration7.setHdpiMode(hdpiMode34);
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("", fileType37);
        lwjgl3ApplicationConfiguration7.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration41.setResizable(false);
        lwjgl3ApplicationConfiguration41.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration46.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color51 = null;
        lwjgl3ApplicationConfiguration50.setInitialBackgroundColor(color51);
        lwjgl3ApplicationConfiguration50.setTitle("");
        lwjgl3ApplicationConfiguration50.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode57 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode57);
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode57);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode57);
        lwjgl3ApplicationConfiguration7.setHdpiMode(hdpiMode57);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode57);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) 'a');
        com.badlogic.gdx.graphics.Color color69 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color69);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode34 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode34.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode57 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode57.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 0);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (short) 1);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration28.setPreferencesConfig("hi!", fileType30);
        lwjgl3ApplicationConfiguration28.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration28.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration28.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration28.disableAudio(false);
        lwjgl3ApplicationConfiguration28.disableAudio(true);
        lwjgl3ApplicationConfiguration28.setAudioConfig((-1), (int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration28.setAudioConfig((int) '#', (int) (short) -1, 100);
        com.badlogic.gdx.graphics.Color color54 = null;
        lwjgl3ApplicationConfiguration28.setInitialBackgroundColor(color54);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration56.setResizable(false);
        lwjgl3ApplicationConfiguration56.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color62 = null;
        lwjgl3ApplicationConfiguration61.setInitialBackgroundColor(color62);
        lwjgl3ApplicationConfiguration61.setTitle("");
        lwjgl3ApplicationConfiguration61.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode68 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration56.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + hdpiMode68 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode68.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration22.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration22.setTitle("");
        lwjgl3ApplicationConfiguration22.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType24);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode28);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) '4', (int) '4', (int) (short) 1, (int) (short) 100, (int) '4', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType28);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.Files.FileType fileType5 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType5);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 100, 0);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration13.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration13.setWindowPosition((int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration13.disableAudio(true);
        lwjgl3ApplicationConfiguration13.setWindowedMode((int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration13.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration28.setPreferencesConfig("hi!", fileType30);
        lwjgl3ApplicationConfiguration28.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration40.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color45 = null;
        lwjgl3ApplicationConfiguration44.setInitialBackgroundColor(color45);
        lwjgl3ApplicationConfiguration44.setTitle("");
        lwjgl3ApplicationConfiguration44.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode51 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode51);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType57 = null;
        lwjgl3ApplicationConfiguration55.setPreferencesConfig("hi!", fileType57);
        lwjgl3ApplicationConfiguration55.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration55.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration55.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration55.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode82 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration55.setHdpiMode(hdpiMode82);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode82);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode82);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode82);
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + hdpiMode51 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode51.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode82 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode82.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, 1, (int) '4', (int) '#', (int) 'a', 10, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType33);
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (short) 0, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode24);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) ' ', 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType8);
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 1);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) '4');
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType33);
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 10, (int) (byte) 10);
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) (byte) 10, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) (byte) 1, 10, 0, 1, (int) '4', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 10, (int) '#', (int) (short) 10);
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) '4', (int) (byte) 0, (int) 'a', (int) (byte) 0, (int) (byte) 100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType43 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType43);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration8.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration8.setTitle("");
        lwjgl3ApplicationConfiguration8.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode15);
        lwjgl3ApplicationConfiguration8.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration20.setTitle("");
        lwjgl3ApplicationConfiguration20.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType23);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) '4', (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (short) 0, (int) (short) 10, 100, (int) '4', (int) (short) 100, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 100, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (short) 0, (int) (short) 10, 100, (int) '4', (int) (short) 100, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 100, (int) 'a');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, 0, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color39);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', 0);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass36 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) 'a', (int) '4', 0, (int) '4', (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) (short) 100, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener31);
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration22.setPreferencesConfig("hi!", fileType24);
        lwjgl3ApplicationConfiguration22.useVsync(true);
        lwjgl3ApplicationConfiguration22.setTitle("hi!");
        lwjgl3ApplicationConfiguration22.setWindowPosition((int) ' ', 1);
        lwjgl3ApplicationConfiguration22.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration22.setFullscreenMode(displayMode35);
        lwjgl3ApplicationConfiguration22.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration22.setPreferencesConfig("", fileType40);
        lwjgl3ApplicationConfiguration22.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode44 = null;
        lwjgl3ApplicationConfiguration22.setFullscreenMode(displayMode44);
        lwjgl3ApplicationConfiguration22.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3ApplicationConfiguration48.setInitialBackgroundColor(color49);
        lwjgl3ApplicationConfiguration48.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode59 = null;
        lwjgl3ApplicationConfiguration48.setFullscreenMode(displayMode59);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration61.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color66 = null;
        lwjgl3ApplicationConfiguration65.setInitialBackgroundColor(color66);
        lwjgl3ApplicationConfiguration65.setTitle("");
        lwjgl3ApplicationConfiguration65.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode72 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration65.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode72 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode72.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, 1, (int) '4', (int) '#', (int) 'a', 10, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode26);
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) '#', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, (int) (short) -1, 0);
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 10, (int) (short) -1, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (short) 100, (int) (byte) 10, 100, (int) (byte) 100, 100, (int) '4');
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) ' ', (int) (short) 100, (int) (short) 0, (int) '#', 0, (int) (short) 100);
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType14);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) '4', (int) 'a');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) '#', (int) (short) 1, 100, (int) (short) 100, 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1), (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (byte) 100, (-1));
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType40);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 1, (int) (short) 1);
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', 10, (int) ' ', (int) (short) 1, 10, (int) (byte) 1, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode26);
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, 10);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color37);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', 0);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 1);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.setDecorated(true);
        lwjgl3ApplicationConfiguration19.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration19.setPreferencesConfig("", fileType27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration19.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration19.setWindowedMode((int) (byte) 1, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration34.setPreferencesConfig("hi!", fileType36);
        lwjgl3ApplicationConfiguration34.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration34.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration34.useVsync(true);
        lwjgl3ApplicationConfiguration34.setInitialVisible(false);
        lwjgl3ApplicationConfiguration34.setDecorated(false);
        lwjgl3ApplicationConfiguration34.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration58.setResizable(false);
        lwjgl3ApplicationConfiguration58.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration63.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration67 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color68 = null;
        lwjgl3ApplicationConfiguration67.setInitialBackgroundColor(color68);
        lwjgl3ApplicationConfiguration67.setTitle("");
        lwjgl3ApplicationConfiguration67.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode74 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration67.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration63.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration58.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode74);
        org.junit.Assert.assertTrue("'" + hdpiMode74 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode74.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 100, (int) (byte) 1, (int) (short) -1, 10, (int) (byte) 1, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) (short) -1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, (int) (short) 1, (int) (byte) 1, (int) '4', 10, 0, (int) (byte) 10);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType39);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (short) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass45 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType23);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.setResizable(false);
        lwjgl3ApplicationConfiguration9.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration9.setWindowListener(lwjgl3WindowListener14);
        lwjgl3ApplicationConfiguration9.setResizable(true);
        lwjgl3ApplicationConfiguration9.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration9.setInitialBackgroundColor(color20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration22.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration22.setTitle("");
        lwjgl3ApplicationConfiguration22.setTitle("");
        lwjgl3ApplicationConfiguration22.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration31.setPreferencesConfig("hi!", fileType33);
        lwjgl3ApplicationConfiguration31.useVsync(true);
        lwjgl3ApplicationConfiguration31.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color40 = null;
        lwjgl3ApplicationConfiguration39.setInitialBackgroundColor(color40);
        lwjgl3ApplicationConfiguration39.setTitle("");
        lwjgl3ApplicationConfiguration39.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration39.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration39.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color52 = null;
        lwjgl3ApplicationConfiguration51.setInitialBackgroundColor(color52);
        lwjgl3ApplicationConfiguration51.setTitle("");
        lwjgl3ApplicationConfiguration51.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode58 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration39.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color70 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color70);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode58 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode58.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) (short) 0, (int) 'a');
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode26);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration15.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration15.setInitialVisible(true);
        lwjgl3ApplicationConfiguration15.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration24.setInitialBackgroundColor(color25);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration24.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration24.setWindowPosition((int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration24.disableAudio(true);
        lwjgl3ApplicationConfiguration24.setWindowedMode((int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration24.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType41 = null;
        lwjgl3ApplicationConfiguration39.setPreferencesConfig("hi!", fileType41);
        lwjgl3ApplicationConfiguration39.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration51.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color56 = null;
        lwjgl3ApplicationConfiguration55.setInitialBackgroundColor(color56);
        lwjgl3ApplicationConfiguration55.setTitle("");
        lwjgl3ApplicationConfiguration55.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode62 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration55.setHdpiMode(hdpiMode62);
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode62);
        lwjgl3ApplicationConfiguration39.setHdpiMode(hdpiMode62);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration66 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType68 = null;
        lwjgl3ApplicationConfiguration66.setPreferencesConfig("hi!", fileType68);
        lwjgl3ApplicationConfiguration66.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration66.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration66.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration66.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode93 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration66.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration39.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode93);
        org.junit.Assert.assertTrue("'" + hdpiMode62 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode62.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode93 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode93.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) ' ');
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType24);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 0, 0, (int) (byte) -1, (int) (byte) 100, 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener34);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) 'a');
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType28);
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (short) 0, (int) '#', (int) 'a', 10, (int) (byte) 0, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (short) 100, (int) (byte) 10, 1, (-1), 0, 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) -1, 0);
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType15);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (-1), (int) (short) -1, (int) (short) -1, 100, (int) (short) 100, (int) ' ');
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType31);
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType19);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, 0, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType40);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType22);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType27);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', 1);
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (byte) 0, 10, (int) (short) 100, (-1), (-1), 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) '#');
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 10, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color34);
        java.lang.Class<?> wildcardClass36 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 0, (int) (short) 10, (int) '#', (int) (short) 10, (int) ' ', (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener43 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener43);
        java.lang.Class<?> wildcardClass45 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration5.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration5.setTitle("");
        lwjgl3ApplicationConfiguration5.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration5.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType21);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) (short) 10, 10);
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType29);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType34);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass38 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType31);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, 10, (int) ' ', (int) (byte) 100, (-1), (int) (short) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType9);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.setResizable(false);
        lwjgl3ApplicationConfiguration18.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration18.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration18.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color28);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration27.setFullscreenMode(displayMode30);
        lwjgl3ApplicationConfiguration27.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration34.setPreferencesConfig("hi!", fileType36);
        lwjgl3ApplicationConfiguration34.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration34.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration34.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration34.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode61 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode61);
        com.badlogic.gdx.Files.FileType fileType64 = null;
        lwjgl3ApplicationConfiguration34.setPreferencesConfig("", fileType64);
        lwjgl3ApplicationConfiguration34.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration68.setResizable(false);
        lwjgl3ApplicationConfiguration68.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration73 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration73.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration77 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color78 = null;
        lwjgl3ApplicationConfiguration77.setInitialBackgroundColor(color78);
        lwjgl3ApplicationConfiguration77.setTitle("");
        lwjgl3ApplicationConfiguration77.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode84 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration77.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration73.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration68.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode84);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-1), (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode61 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode61.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode84 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode84.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (short) 100, (int) (short) 1, (int) (byte) 100, (int) (byte) 10, 1, (int) ' ');
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType27);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (byte) -1, (int) (short) 0, 1, (int) (short) 0, 100, (int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType20);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) ' ', (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration26.setResizable(false);
        lwjgl3ApplicationConfiguration26.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration26.setWindowListener(lwjgl3WindowListener31);
        lwjgl3ApplicationConfiguration26.setInitialVisible(false);
        lwjgl3ApplicationConfiguration26.disableAudio(false);
        lwjgl3ApplicationConfiguration26.disableAudio(true);
        lwjgl3ApplicationConfiguration26.useOpenGL3(true, (int) (short) 100, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration43.setInitialBackgroundColor(color44);
        lwjgl3ApplicationConfiguration43.setTitle("");
        lwjgl3ApplicationConfiguration43.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration43.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration43.setTitle("hi!");
        lwjgl3ApplicationConfiguration43.setTitle("hi!");
        lwjgl3ApplicationConfiguration43.setBackBufferConfig((int) (byte) 1, 10, (int) 'a', (int) 'a', (int) (byte) 10, (int) (byte) 100, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener68 = null;
        lwjgl3ApplicationConfiguration43.setWindowListener(lwjgl3WindowListener68);
        lwjgl3ApplicationConfiguration43.setAudioConfig(100, (int) '#', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration74 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color75 = null;
        lwjgl3ApplicationConfiguration74.setInitialBackgroundColor(color75);
        lwjgl3ApplicationConfiguration74.setTitle("");
        lwjgl3ApplicationConfiguration74.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode81 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration74.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + hdpiMode50 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode50.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode81 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode81.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 1);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType20);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration25.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration25.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration25.setFullscreenMode(displayMode30);
        lwjgl3ApplicationConfiguration25.setWindowPosition(100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration25.setWindowPosition((int) (short) 100, (int) (byte) 1);
        lwjgl3ApplicationConfiguration25.setAudioConfig(100, (int) (short) -1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode42 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode42);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode42);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode42 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode42.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (byte) -1, (int) (short) 0, 1, (int) (short) 0, 100, (int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType20);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) ' ', (int) '4');
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType17);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (short) 1, (int) (byte) -1, (int) (short) 10, (int) ' ', (int) (byte) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) 'a');
        java.lang.Class<?> wildcardClass31 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 0, (int) (byte) -1);
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode14);
        java.lang.Class<?> wildcardClass16 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType30);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) 'a', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1), (int) ' ');
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setResizable(false);
        lwjgl3ApplicationConfiguration20.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration29.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration29.setTitle("");
        lwjgl3ApplicationConfiguration29.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (byte) 100, 1, (int) (byte) 10, (int) 'a', (int) (short) 10, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color57 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color57);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) '4', (int) (byte) 0, 100, (int) (short) 10, (int) (byte) 1, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode67 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode67);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, 1, (int) '4', (int) '#', (int) 'a', 10, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, 10);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) '4');
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType20);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener35);
        com.badlogic.gdx.Files.FileType fileType38 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType38);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType16);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) '#', (int) (short) 10, (int) (byte) 10, (int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration14.setPreferencesConfig("hi!", fileType16);
        lwjgl3ApplicationConfiguration14.useVsync(true);
        lwjgl3ApplicationConfiguration14.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration22.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration22.setTitle("");
        lwjgl3ApplicationConfiguration22.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration22.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color35);
        lwjgl3ApplicationConfiguration34.setTitle("");
        lwjgl3ApplicationConfiguration34.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode41 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode41);
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode41);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode41);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode41);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener48 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener48);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode54 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode54);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode41 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode41.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', 0);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration18.setInitialBackgroundColor(color19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration18.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration18.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration25.setPreferencesConfig("hi!", fileType27);
        lwjgl3ApplicationConfiguration25.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration25.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration25.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration25.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode52);
        com.badlogic.gdx.Files.FileType fileType55 = null;
        lwjgl3ApplicationConfiguration25.setPreferencesConfig("", fileType55);
        lwjgl3ApplicationConfiguration25.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration59.setResizable(false);
        lwjgl3ApplicationConfiguration59.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration64.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color69 = null;
        lwjgl3ApplicationConfiguration68.setInitialBackgroundColor(color69);
        lwjgl3ApplicationConfiguration68.setTitle("");
        lwjgl3ApplicationConfiguration68.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode75 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration68.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode75);
        com.badlogic.gdx.Files.FileType fileType83 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType83);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) 'a', (int) (short) 0, (int) (short) 100, (int) (short) -1, (-1), 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode95 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode95);
        java.lang.Class<?> wildcardClass97 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode52 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode52.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode75 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode75.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration8.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration8.setTitle("");
        lwjgl3ApplicationConfiguration8.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode15);
        lwjgl3ApplicationConfiguration8.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration20.setTitle("");
        lwjgl3ApplicationConfiguration20.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration31.setResizable(false);
        lwjgl3ApplicationConfiguration31.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color37);
        lwjgl3ApplicationConfiguration36.setTitle("");
        lwjgl3ApplicationConfiguration36.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode43);
        com.badlogic.gdx.Graphics.DisplayMode displayMode47 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode47);
        com.badlogic.gdx.Graphics.DisplayMode displayMode49 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode49);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) (byte) 100, 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass57 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration8.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration8.setTitle("");
        lwjgl3ApplicationConfiguration8.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode15);
        lwjgl3ApplicationConfiguration8.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration20.setTitle("");
        lwjgl3ApplicationConfiguration20.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType34);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType39);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration36.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3ApplicationConfiguration40.setInitialBackgroundColor(color41);
        lwjgl3ApplicationConfiguration40.setTitle("");
        lwjgl3ApplicationConfiguration40.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration36.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener53 = null;
        lwjgl3ApplicationConfiguration36.setWindowListener(lwjgl3WindowListener53);
        com.badlogic.gdx.Graphics.DisplayMode displayMode55 = null;
        lwjgl3ApplicationConfiguration36.setFullscreenMode(displayMode55);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType59 = null;
        lwjgl3ApplicationConfiguration57.setPreferencesConfig("hi!", fileType59);
        lwjgl3ApplicationConfiguration57.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration57.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration57.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration57.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode73 = null;
        lwjgl3ApplicationConfiguration57.setFullscreenMode(displayMode73);
        lwjgl3ApplicationConfiguration57.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration77 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration77.setResizable(false);
        lwjgl3ApplicationConfiguration77.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration82 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration82.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration86 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color87 = null;
        lwjgl3ApplicationConfiguration86.setInitialBackgroundColor(color87);
        lwjgl3ApplicationConfiguration86.setTitle("");
        lwjgl3ApplicationConfiguration86.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode93 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration86.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration82.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration77.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration57.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode93);
        org.junit.Assert.assertTrue("'" + hdpiMode47 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode47.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode93 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode93.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 1, (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) (short) 10, (int) (byte) 10, (-1), (int) (short) -1, (int) (byte) 10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 0, (int) (byte) 10, (int) (short) 0, 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (short) -1, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) '4', (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (short) 10, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType22);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass31 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (-1));
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType24);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration9.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration9.setTitle("");
        lwjgl3ApplicationConfiguration9.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.setResizable(false);
        lwjgl3ApplicationConfiguration19.useVsync(false);
        lwjgl3ApplicationConfiguration19.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration19.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration19.disableAudio(false);
        lwjgl3ApplicationConfiguration19.setTitle("");
        lwjgl3ApplicationConfiguration19.useOpenGL3(true, (int) (short) 1, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType41 = null;
        lwjgl3ApplicationConfiguration39.setPreferencesConfig("hi!", fileType41);
        lwjgl3ApplicationConfiguration39.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration39.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration39.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration57.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color62 = null;
        lwjgl3ApplicationConfiguration61.setInitialBackgroundColor(color62);
        lwjgl3ApplicationConfiguration61.setTitle("");
        lwjgl3ApplicationConfiguration61.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode68 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration57.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration39.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType79 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType79);
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode68 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode68.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (byte) -1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration29.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration29.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration29.setFullscreenMode(displayMode34);
        lwjgl3ApplicationConfiguration29.setWindowPosition(100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration29.setWindowPosition((int) (short) 100, (int) (byte) 1);
        lwjgl3ApplicationConfiguration29.setAudioConfig(100, (int) (short) -1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode46);
        java.lang.Class<?> wildcardClass49 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, (int) (short) 10, (int) (short) 1, (int) '#', (int) (short) 100, 10, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType29);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType34);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (byte) 0, (int) (byte) -1, (int) (short) 10, (int) (short) 100, 1, (-1));
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 100, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), 0);
        java.lang.Class<?> wildcardClass53 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType29);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, (int) (byte) 100, (int) (short) 1, (int) 'a', 0, (int) '#', (int) 'a');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass43 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType17);
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType18);
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) '#', 10, (int) '4', 10, (-1));
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 0, (int) (short) 100);
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) (short) -1, 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 0, (int) (short) 10, (int) '#', (int) (short) 10, (int) ' ', (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode45 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode45);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) '4', (int) (byte) 0, (int) 'a', (int) (byte) 0, (int) (byte) 100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, 0, 1);
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (byte) -1, (int) (byte) -1, 0, (int) (byte) -1, (int) (byte) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass31 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, (int) '4');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType21);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType15);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType12);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) -1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, 100);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) (short) 0, 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration35.setInitialBackgroundColor(color36);
        lwjgl3ApplicationConfiguration35.setTitle("");
        lwjgl3ApplicationConfiguration35.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode42 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode42);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener44 = null;
        lwjgl3ApplicationConfiguration35.setWindowListener(lwjgl3WindowListener44);
        lwjgl3ApplicationConfiguration35.setInitialVisible(false);
        lwjgl3ApplicationConfiguration35.setInitialVisible(false);
        lwjgl3ApplicationConfiguration35.setWindowedMode((-1), (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration53 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType55 = null;
        lwjgl3ApplicationConfiguration53.setPreferencesConfig("hi!", fileType55);
        lwjgl3ApplicationConfiguration53.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration53.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration53.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration53.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode69 = null;
        lwjgl3ApplicationConfiguration53.setFullscreenMode(displayMode69);
        lwjgl3ApplicationConfiguration53.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration73 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration73.setResizable(false);
        lwjgl3ApplicationConfiguration73.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration78 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration78.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration82 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color83 = null;
        lwjgl3ApplicationConfiguration82.setInitialBackgroundColor(color83);
        lwjgl3ApplicationConfiguration82.setTitle("");
        lwjgl3ApplicationConfiguration82.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode89 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration82.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration78.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration73.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration53.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode89);
        java.lang.Class<?> wildcardClass96 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode42 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode42.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode89 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode89.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration17.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration17.setTitle("");
        lwjgl3ApplicationConfiguration17.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode34);
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (short) 0, (int) '#', (int) (byte) 0, (int) '4', 0, 0);
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType28);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode39);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType25);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) (byte) 10, (int) (byte) -1, 10, (int) (byte) 1, (-1), (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 1, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, 1, (int) (short) 0, (int) '4', (-1), (int) (byte) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (-1));
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode21);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration13.setTitle("");
        lwjgl3ApplicationConfiguration13.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration13.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration25.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration25.setTitle("");
        lwjgl3ApplicationConfiguration25.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color38);
        com.badlogic.gdx.Files.FileType fileType41 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType41);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (byte) 1, 1);
        com.badlogic.gdx.graphics.Color color47 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color47);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration23.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration23.setTitle("");
        lwjgl3ApplicationConfiguration23.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode30);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode30);
        lwjgl3ApplicationConfiguration19.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color37);
        lwjgl3ApplicationConfiguration36.setTitle("");
        lwjgl3ApplicationConfiguration36.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration36.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3ApplicationConfiguration48.setInitialBackgroundColor(color49);
        lwjgl3ApplicationConfiguration48.setTitle("");
        lwjgl3ApplicationConfiguration48.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode66 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode66);
        com.badlogic.gdx.Files.FileType fileType69 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType69);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass73 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode30 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode30.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) '#', 1);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), 0);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener32);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) 'a', 100, 10, (int) (short) 0, (int) 'a', (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration31.setPreferencesConfig("hi!", fileType33);
        lwjgl3ApplicationConfiguration31.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration31.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration31.useVsync(true);
        lwjgl3ApplicationConfiguration31.setInitialVisible(false);
        lwjgl3ApplicationConfiguration31.setDecorated(false);
        lwjgl3ApplicationConfiguration31.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration55.setResizable(false);
        lwjgl3ApplicationConfiguration55.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration60.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color65 = null;
        lwjgl3ApplicationConfiguration64.setInitialBackgroundColor(color65);
        lwjgl3ApplicationConfiguration64.setTitle("");
        lwjgl3ApplicationConfiguration64.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode71 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration55.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) '#', 1, (int) (byte) 1, (int) (short) 1, 0, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode71 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode71.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration17.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration17.setTitle("");
        lwjgl3ApplicationConfiguration17.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode24);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode33);
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType36);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) 'a', (int) (short) 10, (int) '#', (int) (short) 1, (int) '4', 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 1, (int) (byte) 10, (int) (short) 0, 1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) 'a');
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener31);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (short) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (short) -1, 0);
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode21);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, 0, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color39);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener37);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (short) 1, (int) ' ', (int) (byte) 0, 100, (int) '4', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass34 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType22);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '4', 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, (int) 'a');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration18.setInitialBackgroundColor(color19);
        lwjgl3ApplicationConfiguration18.setTitle("");
        lwjgl3ApplicationConfiguration18.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration18.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration18.setInitialVisible(false);
        lwjgl3ApplicationConfiguration18.setInitialVisible(false);
        lwjgl3ApplicationConfiguration18.setWindowedMode((-1), (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType38 = null;
        lwjgl3ApplicationConfiguration36.setPreferencesConfig("hi!", fileType38);
        lwjgl3ApplicationConfiguration36.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration36.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration36.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration36.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode52 = null;
        lwjgl3ApplicationConfiguration36.setFullscreenMode(displayMode52);
        lwjgl3ApplicationConfiguration36.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration56.setResizable(false);
        lwjgl3ApplicationConfiguration56.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration61.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color66 = null;
        lwjgl3ApplicationConfiguration65.setInitialBackgroundColor(color66);
        lwjgl3ApplicationConfiguration65.setTitle("");
        lwjgl3ApplicationConfiguration65.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode72 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration65.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration56.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode72);
        java.lang.Class<?> wildcardClass79 = hdpiMode72.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode25 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode25.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode72 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode72.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType23);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) '4', (int) 'a');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, (-1), (int) ' ', (int) (short) 100, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, 0, 0, (-1), (int) '#', 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', 1, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, 0, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener36);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color38);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (byte) -1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (short) 0, (int) '#', (int) 'a', 10, (int) (byte) 0, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (byte) 100, (int) ' ', (int) '4', (int) ' ', (int) (byte) 100, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration30.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration30.setTitle("");
        lwjgl3ApplicationConfiguration30.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration37.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener40 = null;
        lwjgl3ApplicationConfiguration37.setWindowListener(lwjgl3WindowListener40);
        com.badlogic.gdx.Graphics.DisplayMode displayMode42 = null;
        lwjgl3ApplicationConfiguration37.setFullscreenMode(displayMode42);
        lwjgl3ApplicationConfiguration37.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener46 = null;
        lwjgl3ApplicationConfiguration37.setWindowListener(lwjgl3WindowListener46);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration48.setResizable(false);
        lwjgl3ApplicationConfiguration48.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener53 = null;
        lwjgl3ApplicationConfiguration48.setWindowListener(lwjgl3WindowListener53);
        lwjgl3ApplicationConfiguration48.setInitialVisible(false);
        lwjgl3ApplicationConfiguration48.useOpenGL3(true, (int) (byte) 10, (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode61 = null;
        lwjgl3ApplicationConfiguration48.setFullscreenMode(displayMode61);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration63.setResizable(false);
        lwjgl3ApplicationConfiguration63.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color69 = null;
        lwjgl3ApplicationConfiguration68.setInitialBackgroundColor(color69);
        lwjgl3ApplicationConfiguration68.setTitle("");
        lwjgl3ApplicationConfiguration68.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode75 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration68.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration63.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode75);
        org.junit.Assert.assertTrue("'" + hdpiMode75 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode75.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration8.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration8.setInitialBackgroundColor(color11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration8.disableAudio(false);
        lwjgl3ApplicationConfiguration8.setWindowPosition((int) ' ', 0);
        lwjgl3ApplicationConfiguration8.setTitle("hi!");
        lwjgl3ApplicationConfiguration8.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration24.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration24.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration24.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration24.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType43 = null;
        lwjgl3ApplicationConfiguration41.setPreferencesConfig("hi!", fileType43);
        lwjgl3ApplicationConfiguration41.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration53 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration53.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color58 = null;
        lwjgl3ApplicationConfiguration57.setInitialBackgroundColor(color58);
        lwjgl3ApplicationConfiguration57.setTitle("");
        lwjgl3ApplicationConfiguration57.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode64 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration57.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration53.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener78 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener78);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass83 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode64 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode64.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration4.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration4.setTitle("");
        lwjgl3ApplicationConfiguration4.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration4.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode36);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (short) -1, (-1), 0, (int) (byte) 1, (int) ' ', (int) ' ');
        com.badlogic.gdx.graphics.Color color48 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color48);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType7);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration17.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration17.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color34);
        lwjgl3ApplicationConfiguration33.setTitle("");
        lwjgl3ApplicationConfiguration33.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color48 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color48);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, 0, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (byte) 0, (int) (byte) -1, (int) (short) 0, (int) (short) 0, (int) '4', 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) '#', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration26.setPreferencesConfig("hi!", fileType28);
        lwjgl3ApplicationConfiguration26.useVsync(true);
        lwjgl3ApplicationConfiguration26.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color35);
        lwjgl3ApplicationConfiguration34.setTitle("");
        lwjgl3ApplicationConfiguration34.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode41 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode41);
        lwjgl3ApplicationConfiguration34.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color47 = null;
        lwjgl3ApplicationConfiguration46.setInitialBackgroundColor(color47);
        lwjgl3ApplicationConfiguration46.setTitle("");
        lwjgl3ApplicationConfiguration46.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode53);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration57.setResizable(false);
        lwjgl3ApplicationConfiguration57.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color63 = null;
        lwjgl3ApplicationConfiguration62.setInitialBackgroundColor(color63);
        lwjgl3ApplicationConfiguration62.setTitle("");
        lwjgl3ApplicationConfiguration62.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode69 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration57.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode69);
        java.lang.Class<?> wildcardClass74 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode41 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode41.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode53 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode53.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode69 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode69.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType8);
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType11);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 0, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (short) 10);
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.setResizable(false);
        lwjgl3ApplicationConfiguration30.useVsync(false);
        lwjgl3ApplicationConfiguration30.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration30.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration30.disableAudio(false);
        lwjgl3ApplicationConfiguration30.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode46 = null;
        lwjgl3ApplicationConfiguration30.setFullscreenMode(displayMode46);
        lwjgl3ApplicationConfiguration30.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener50 = null;
        lwjgl3ApplicationConfiguration30.setWindowListener(lwjgl3WindowListener50);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType54 = null;
        lwjgl3ApplicationConfiguration52.setPreferencesConfig("hi!", fileType54);
        lwjgl3ApplicationConfiguration52.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration64.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color69 = null;
        lwjgl3ApplicationConfiguration68.setInitialBackgroundColor(color69);
        lwjgl3ApplicationConfiguration68.setTitle("");
        lwjgl3ApplicationConfiguration68.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode75 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration68.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) 'a', 100, (int) (byte) -1, 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode75 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode75.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, 10, 0, (int) '4', 0, 0, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) '#');
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) 'a', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color34);
        lwjgl3ApplicationConfiguration33.setTitle("");
        lwjgl3ApplicationConfiguration33.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration33.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration33.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode54 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode54);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType58 = null;
        lwjgl3ApplicationConfiguration56.setPreferencesConfig("hi!", fileType58);
        lwjgl3ApplicationConfiguration56.useVsync(true);
        lwjgl3ApplicationConfiguration56.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color65 = null;
        lwjgl3ApplicationConfiguration64.setInitialBackgroundColor(color65);
        lwjgl3ApplicationConfiguration64.setTitle("");
        lwjgl3ApplicationConfiguration64.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode71 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration64.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration76 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color77 = null;
        lwjgl3ApplicationConfiguration76.setInitialBackgroundColor(color77);
        lwjgl3ApplicationConfiguration76.setTitle("");
        lwjgl3ApplicationConfiguration76.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode83 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration76.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration56.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) '#');
        com.badlogic.gdx.Files.FileType fileType93 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType93);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode54 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode54.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode71 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode71.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode83 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode83.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration28.setResizable(false);
        lwjgl3ApplicationConfiguration28.useVsync(false);
        lwjgl3ApplicationConfiguration28.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration28.setBackBufferConfig((int) 'a', (int) (short) 1, (int) '4', (int) '#', (int) (byte) 0, 10, (int) 'a');
        lwjgl3ApplicationConfiguration28.setBackBufferConfig((int) (short) -1, 10, (int) (byte) 0, (int) (short) -1, (int) (byte) 0, (int) (byte) -1, (int) (short) 1);
        com.badlogic.gdx.Files.FileType fileType53 = null;
        lwjgl3ApplicationConfiguration28.setPreferencesConfig("", fileType53);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color56 = null;
        lwjgl3ApplicationConfiguration55.setInitialBackgroundColor(color56);
        com.badlogic.gdx.Graphics.DisplayMode displayMode58 = null;
        lwjgl3ApplicationConfiguration55.setFullscreenMode(displayMode58);
        lwjgl3ApplicationConfiguration55.setBackBufferConfig(1, 100, (int) 'a', (int) (short) 10, (int) (byte) 10, 10, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType70 = null;
        lwjgl3ApplicationConfiguration68.setPreferencesConfig("hi!", fileType70);
        lwjgl3ApplicationConfiguration68.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration68.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration68.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration68.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode95 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration68.setHdpiMode(hdpiMode95);
        lwjgl3ApplicationConfiguration55.setHdpiMode(hdpiMode95);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode95);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode95);
        org.junit.Assert.assertTrue("'" + hdpiMode95 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode95.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType13);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) '4', (int) (byte) 0, (int) 'a', (int) (byte) 0, (int) (byte) 100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) '#', 0, (int) (short) 1, (int) (byte) 100, (int) (byte) -1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }
}

