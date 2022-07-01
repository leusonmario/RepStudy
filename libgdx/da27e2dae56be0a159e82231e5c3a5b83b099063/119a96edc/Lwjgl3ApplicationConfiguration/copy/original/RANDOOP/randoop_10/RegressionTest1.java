import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (byte) 0, (-1), 0, 1, (-1), (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
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
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass23 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
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
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType26);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, (int) (short) 0, (int) (short) 1, (int) '#', (int) (short) 1, (int) (short) -1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass38 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
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
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener28);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType7);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (short) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
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
        java.lang.Class<?> wildcardClass26 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (-1));
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener92 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener92);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener94 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener94);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode61 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode61.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode84 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode84.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, 10, 0);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 100, (int) 'a');
        java.lang.Class<?> wildcardClass62 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (byte) 10, (int) (short) 100, (int) '#', 100, (int) (byte) 100, (-1));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (-1), (int) (byte) 1, 10, 1, (int) '4', (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 1, (int) (short) -1, 10, (int) 'a', (int) (short) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass44 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 1, (int) ' ', 1, (int) (short) -1, (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (short) 0, (int) (byte) 1, (int) (short) 0, 1, (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass26 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, 0);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
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
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType21);
        java.lang.Class<?> wildcardClass23 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
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
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
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
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 0);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', (int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) ' ');
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (short) -1, 100, (int) (byte) -1, 10, 1, (int) '4');
        java.lang.Class<?> wildcardClass26 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass14 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (-1));
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
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
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (byte) -1, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType21);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType8);
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType11);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
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
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 10);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, 100);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
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
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType29);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
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
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
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
        java.lang.Class<?> wildcardClass63 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode54 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode54.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
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
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType19);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration14.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration14.setTitle("");
        lwjgl3ApplicationConfiguration14.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode21);
        lwjgl3ApplicationConfiguration14.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration14.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode35 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration37.setPreferencesConfig("hi!", fileType39);
        lwjgl3ApplicationConfiguration37.useVsync(true);
        lwjgl3ApplicationConfiguration37.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color46 = null;
        lwjgl3ApplicationConfiguration45.setInitialBackgroundColor(color46);
        lwjgl3ApplicationConfiguration45.setTitle("");
        lwjgl3ApplicationConfiguration45.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration45.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration45.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color58 = null;
        lwjgl3ApplicationConfiguration57.setInitialBackgroundColor(color58);
        lwjgl3ApplicationConfiguration57.setTitle("");
        lwjgl3ApplicationConfiguration57.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode64 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration57.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration45.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode64);
        java.lang.Class<?> wildcardClass70 = hdpiMode64.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode35 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode35.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode52 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode52.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode64 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode64.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) (short) 0, 0);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
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
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType34);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (byte) 10, 100, 1, 0, (int) (short) 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode42 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode42);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode37 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode37.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode49 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode49.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', 0, 10, (int) (byte) 10, (int) (short) 1, 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass26 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
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
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType46 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType46);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) 'a', 10, (int) (byte) 1, (int) (byte) 10, (int) (byte) 100, 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        java.lang.Class<?> wildcardClass11 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
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
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode38);
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode40);
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
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
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 1, (int) (short) 10, (int) (byte) 10, (int) 'a', (int) (byte) 10, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration26.setInitialBackgroundColor(color27);
        lwjgl3ApplicationConfiguration26.setTitle("");
        lwjgl3ApplicationConfiguration26.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode33);
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode33);
        lwjgl3ApplicationConfiguration22.setWindowPosition((int) (short) 0, (int) (byte) -1);
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
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode58);
        org.junit.Assert.assertTrue("'" + hdpiMode33 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode33.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode58 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode58.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
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
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 10, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
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
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener55 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener55);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        java.lang.Class<?> wildcardClass11 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
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
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode40 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode40);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
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
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
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
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (-1), (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 10, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
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
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (byte) 0, (-1), (int) (short) -1, (int) (short) -1, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener35);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (short) -1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) 10, (int) (short) 10, 100, (int) '4', (int) '#', (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) '4', (-1), 10, 10, (int) (short) 100, 1);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass48 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) 'a');
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType21);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (short) 10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass10 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) '#', 0, (int) (byte) 1, 0, (int) 'a', (-1));
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode28);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
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
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass7 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 1, (int) ' ', 1, (int) (short) -1, (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (short) 0, (int) (byte) 1, (int) (short) 0, 1, (int) (short) -1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
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
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
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
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) (short) 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration11.setTitle("");
        lwjgl3ApplicationConfiguration11.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration11.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration11.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration11.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color35);
        lwjgl3ApplicationConfiguration34.setTitle("");
        lwjgl3ApplicationConfiguration34.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode41 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode41);
        lwjgl3ApplicationConfiguration34.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration34.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass61 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode41 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode41.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
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
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener33);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
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
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
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
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 10, (int) (short) -1, (int) (short) 100, (int) (short) 100, (int) (byte) 0, (int) 'a');
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType29);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType8);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
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
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (byte) 1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
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
        com.badlogic.gdx.Files.FileType fileType41 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType41);
        java.lang.Class<?> wildcardClass43 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
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
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
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
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (byte) 0, (-1), 0, 1, (-1), (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration32.setPreferencesConfig("hi!", fileType34);
        lwjgl3ApplicationConfiguration32.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration32.setWindowPosition(0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration32.setWindowPosition((int) (byte) 1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration46.setResizable(false);
        lwjgl3ApplicationConfiguration46.useVsync(false);
        lwjgl3ApplicationConfiguration46.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration46.useOpenGL3(true, (int) (short) 1, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode58 = null;
        lwjgl3ApplicationConfiguration46.setFullscreenMode(displayMode58);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType62 = null;
        lwjgl3ApplicationConfiguration60.setPreferencesConfig("hi!", fileType62);
        lwjgl3ApplicationConfiguration60.useVsync(true);
        lwjgl3ApplicationConfiguration60.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color69 = null;
        lwjgl3ApplicationConfiguration68.setInitialBackgroundColor(color69);
        lwjgl3ApplicationConfiguration68.setTitle("");
        lwjgl3ApplicationConfiguration68.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode75 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration68.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration68.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration80 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color81 = null;
        lwjgl3ApplicationConfiguration80.setInitialBackgroundColor(color81);
        lwjgl3ApplicationConfiguration80.setTitle("");
        lwjgl3ApplicationConfiguration80.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode87 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration80.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration68.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode87);
        java.lang.Class<?> wildcardClass94 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode75 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode75.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode87 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode87.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
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
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType18);
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration35.setInitialBackgroundColor(color36);
        lwjgl3ApplicationConfiguration35.setTitle("");
        lwjgl3ApplicationConfiguration35.setTitle("");
        lwjgl3ApplicationConfiguration35.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType46 = null;
        lwjgl3ApplicationConfiguration44.setPreferencesConfig("hi!", fileType46);
        lwjgl3ApplicationConfiguration44.useVsync(true);
        lwjgl3ApplicationConfiguration44.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color53 = null;
        lwjgl3ApplicationConfiguration52.setInitialBackgroundColor(color53);
        lwjgl3ApplicationConfiguration52.setTitle("");
        lwjgl3ApplicationConfiguration52.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode59 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode59);
        lwjgl3ApplicationConfiguration52.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color65 = null;
        lwjgl3ApplicationConfiguration64.setInitialBackgroundColor(color65);
        lwjgl3ApplicationConfiguration64.setTitle("");
        lwjgl3ApplicationConfiguration64.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode71 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode71);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener77 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener77);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode59 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode59.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode71 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode71.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener32);
        java.lang.Class<?> wildcardClass34 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
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
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass39 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        java.lang.Class<?> wildcardClass14 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (-1), (int) (short) 0, 10, (int) (short) 0, (int) ' ', (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration29.setPreferencesConfig("hi!", fileType31);
        lwjgl3ApplicationConfiguration29.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration29.setPreferencesConfig("", fileType36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.setResizable(false);
        lwjgl3ApplicationConfiguration38.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener43 = null;
        lwjgl3ApplicationConfiguration38.setWindowListener(lwjgl3WindowListener43);
        lwjgl3ApplicationConfiguration38.setResizable(true);
        lwjgl3ApplicationConfiguration38.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3ApplicationConfiguration38.setInitialBackgroundColor(color49);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color52 = null;
        lwjgl3ApplicationConfiguration51.setInitialBackgroundColor(color52);
        lwjgl3ApplicationConfiguration51.setTitle("");
        lwjgl3ApplicationConfiguration51.setTitle("");
        lwjgl3ApplicationConfiguration51.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType62 = null;
        lwjgl3ApplicationConfiguration60.setPreferencesConfig("hi!", fileType62);
        lwjgl3ApplicationConfiguration60.useVsync(true);
        lwjgl3ApplicationConfiguration60.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color69 = null;
        lwjgl3ApplicationConfiguration68.setInitialBackgroundColor(color69);
        lwjgl3ApplicationConfiguration68.setTitle("");
        lwjgl3ApplicationConfiguration68.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode75 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration68.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration68.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration80 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color81 = null;
        lwjgl3ApplicationConfiguration80.setInitialBackgroundColor(color81);
        lwjgl3ApplicationConfiguration80.setTitle("");
        lwjgl3ApplicationConfiguration80.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode87 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration80.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration68.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + hdpiMode75 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode75.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode87 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode87.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
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
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (-1));
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        com.badlogic.gdx.Files.FileType fileType51 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType51);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) ' ', (int) ' ', 0, (int) (byte) 1, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
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
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
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
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener35);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (short) -1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
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
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass11 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
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
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) '#', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration31.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration31.setTitle("");
        lwjgl3ApplicationConfiguration31.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass47 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType17);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) '#');
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertTrue("'" + hdpiMode37 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode37.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode49 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode49.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
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
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (byte) 1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
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
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
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
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, 1);
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 0);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) 'a');
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass7 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
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
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration18.setPreferencesConfig("hi!", fileType20);
        lwjgl3ApplicationConfiguration18.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration18.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration18.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration18.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration18.setFullscreenMode(displayMode34);
        lwjgl3ApplicationConfiguration18.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.setResizable(false);
        lwjgl3ApplicationConfiguration38.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration43.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color48 = null;
        lwjgl3ApplicationConfiguration47.setInitialBackgroundColor(color48);
        lwjgl3ApplicationConfiguration47.setTitle("");
        lwjgl3ApplicationConfiguration47.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode54 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode54);
        com.badlogic.gdx.Files.FileType fileType61 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType61);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener63 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener63);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode54 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode54.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType16);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, 0);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', 0, (-1));
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType10);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, 1, (int) '4');
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) -1, (int) ' ', (int) ' ', (int) (short) 1, (int) (short) 100, (int) 'a');
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
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
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) (short) 1, (int) '4', (int) '#', (int) (byte) 0, 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (short) 1);
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType36);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) (short) 1, (int) '4', (int) '#', (int) (byte) 0, 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (int) (byte) 1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode10 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) -1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (short) 100);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '4');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color33);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode35);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.setResizable(false);
        lwjgl3ApplicationConfiguration19.setDecorated(false);
        lwjgl3ApplicationConfiguration19.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration19.disableAudio(false);
        lwjgl3ApplicationConfiguration19.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration31.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration31.setTitle("");
        lwjgl3ApplicationConfiguration31.setResizable(true);
        lwjgl3ApplicationConfiguration31.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3ApplicationConfiguration40.setInitialBackgroundColor(color41);
        lwjgl3ApplicationConfiguration40.setTitle("");
        lwjgl3ApplicationConfiguration40.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode47);
        java.lang.Class<?> wildcardClass52 = hdpiMode47.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode47 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode47.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) (byte) 100, (-1), (int) 'a', (int) (byte) 1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.setResizable(false);
        lwjgl3ApplicationConfiguration22.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration22.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration22.setResizable(true);
        lwjgl3ApplicationConfiguration22.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3ApplicationConfiguration22.setInitialBackgroundColor(color33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration35.setInitialBackgroundColor(color36);
        lwjgl3ApplicationConfiguration35.setTitle("");
        lwjgl3ApplicationConfiguration35.setTitle("");
        lwjgl3ApplicationConfiguration35.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType46 = null;
        lwjgl3ApplicationConfiguration44.setPreferencesConfig("hi!", fileType46);
        lwjgl3ApplicationConfiguration44.useVsync(true);
        lwjgl3ApplicationConfiguration44.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color53 = null;
        lwjgl3ApplicationConfiguration52.setInitialBackgroundColor(color53);
        lwjgl3ApplicationConfiguration52.setTitle("");
        lwjgl3ApplicationConfiguration52.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode59 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode59);
        lwjgl3ApplicationConfiguration52.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color65 = null;
        lwjgl3ApplicationConfiguration64.setInitialBackgroundColor(color65);
        lwjgl3ApplicationConfiguration64.setTitle("");
        lwjgl3ApplicationConfiguration64.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode71 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode71);
        com.badlogic.gdx.Files.FileType fileType79 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType79);
        org.junit.Assert.assertTrue("'" + hdpiMode59 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode59.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode71 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode71.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (short) 100);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass39 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode30);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
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
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color38);
        java.lang.Class<?> wildcardClass40 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode32);
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType35);
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
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
        java.lang.Class<?> wildcardClass43 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 1, (int) (short) 1, 1, (int) (short) 0, 0, (int) ' ');
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (short) 0, (int) (short) 10, 100, (int) '4', (int) (short) 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
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
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration28.setResizable(false);
        lwjgl3ApplicationConfiguration28.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color34);
        lwjgl3ApplicationConfiguration33.setTitle("");
        lwjgl3ApplicationConfiguration33.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode40);
        com.badlogic.gdx.Files.FileType fileType45 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType45);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass51 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-1));
        java.lang.Class<?> wildcardClass23 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (short) -1, 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration32.setPreferencesConfig("hi!", fileType34);
        lwjgl3ApplicationConfiguration32.useVsync(true);
        lwjgl3ApplicationConfiguration32.setTitle("hi!");
        lwjgl3ApplicationConfiguration32.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3ApplicationConfiguration32.setWindowListener(lwjgl3WindowListener42);
        lwjgl3ApplicationConfiguration32.setWindowPosition((int) (byte) 0, (int) 'a');
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
        lwjgl3ApplicationConfiguration47.setWindowPosition((int) (short) 0, (int) (byte) -1);
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
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode58 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode58.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode71 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode71.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode83 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode83.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 100, (int) ' ', 0, (int) '4', (int) (byte) 100, (int) '#');
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
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
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType27);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode33);
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) (short) 100, (int) ' ', (int) (byte) -1, 10, (int) (byte) -1, (int) '4');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration28.setInitialBackgroundColor(color29);
        lwjgl3ApplicationConfiguration28.setTitle("");
        lwjgl3ApplicationConfiguration28.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode35 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode35);
        lwjgl3ApplicationConfiguration28.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration28.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode49 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode49);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType53 = null;
        lwjgl3ApplicationConfiguration51.setPreferencesConfig("hi!", fileType53);
        lwjgl3ApplicationConfiguration51.useVsync(true);
        lwjgl3ApplicationConfiguration51.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color60 = null;
        lwjgl3ApplicationConfiguration59.setInitialBackgroundColor(color60);
        lwjgl3ApplicationConfiguration59.setTitle("");
        lwjgl3ApplicationConfiguration59.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode66 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration59.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration71 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color72 = null;
        lwjgl3ApplicationConfiguration71.setInitialBackgroundColor(color72);
        lwjgl3ApplicationConfiguration71.setTitle("");
        lwjgl3ApplicationConfiguration71.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode78 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration71.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode78);
        com.badlogic.gdx.Graphics.DisplayMode displayMode84 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode84);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertTrue("'" + hdpiMode35 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode35.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode49 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode49.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode66 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode66.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode78 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode78.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 0, (int) (byte) 10, (int) (short) 0, 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (short) -1, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.setResizable(false);
        lwjgl3ApplicationConfiguration15.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration15.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration15.setInitialVisible(false);
        lwjgl3ApplicationConfiguration15.disableAudio(false);
        lwjgl3ApplicationConfiguration15.useVsync(false);
        lwjgl3ApplicationConfiguration15.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration15.disableAudio(false);
        lwjgl3ApplicationConfiguration15.setTitle("hi!");
        lwjgl3ApplicationConfiguration15.useOpenGL3(true, (int) '#', 100);
        lwjgl3ApplicationConfiguration15.setDecorated(true);
        lwjgl3ApplicationConfiguration15.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration44.setResizable(false);
        lwjgl3ApplicationConfiguration44.setDecorated(false);
        lwjgl3ApplicationConfiguration44.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration44.disableAudio(false);
        lwjgl3ApplicationConfiguration44.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color57 = null;
        lwjgl3ApplicationConfiguration56.setInitialBackgroundColor(color57);
        lwjgl3ApplicationConfiguration56.setTitle("");
        lwjgl3ApplicationConfiguration56.setResizable(true);
        lwjgl3ApplicationConfiguration56.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color66 = null;
        lwjgl3ApplicationConfiguration65.setInitialBackgroundColor(color66);
        lwjgl3ApplicationConfiguration65.setTitle("");
        lwjgl3ApplicationConfiguration65.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode72 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration65.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration56.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration44.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode72);
        org.junit.Assert.assertTrue("'" + hdpiMode72 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode72.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration31.setResizable(false);
        lwjgl3ApplicationConfiguration31.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration31.setWindowListener(lwjgl3WindowListener36);
        lwjgl3ApplicationConfiguration31.setInitialVisible(false);
        lwjgl3ApplicationConfiguration31.disableAudio(false);
        lwjgl3ApplicationConfiguration31.useVsync(false);
        lwjgl3ApplicationConfiguration31.disableAudio(true);
        lwjgl3ApplicationConfiguration31.setBackBufferConfig((int) (short) -1, 10, (int) ' ', (int) (byte) 100, (-1), (int) (short) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener54 = null;
        lwjgl3ApplicationConfiguration31.setWindowListener(lwjgl3WindowListener54);
        lwjgl3ApplicationConfiguration31.setWindowedMode(1, (int) (short) -1);
        lwjgl3ApplicationConfiguration31.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener61 = null;
        lwjgl3ApplicationConfiguration31.setWindowListener(lwjgl3WindowListener61);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration63.setResizable(false);
        lwjgl3ApplicationConfiguration63.useVsync(false);
        lwjgl3ApplicationConfiguration63.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration70 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color71 = null;
        lwjgl3ApplicationConfiguration70.setInitialBackgroundColor(color71);
        lwjgl3ApplicationConfiguration70.setTitle("");
        lwjgl3ApplicationConfiguration70.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode77 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration70.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration70.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration70.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode91 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration70.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration63.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener98 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener98);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode77 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode77.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode91 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode91.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
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
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color30);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration27.setFullscreenMode(displayMode32);
        lwjgl3ApplicationConfiguration27.disableAudio(false);
        lwjgl3ApplicationConfiguration27.setWindowPosition((int) ' ', 0);
        lwjgl3ApplicationConfiguration27.setTitle("hi!");
        lwjgl3ApplicationConfiguration27.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration43.setInitialBackgroundColor(color44);
        lwjgl3ApplicationConfiguration43.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration43.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration43.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType62 = null;
        lwjgl3ApplicationConfiguration60.setPreferencesConfig("hi!", fileType62);
        lwjgl3ApplicationConfiguration60.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration72 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration72.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration76 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color77 = null;
        lwjgl3ApplicationConfiguration76.setInitialBackgroundColor(color77);
        lwjgl3ApplicationConfiguration76.setTitle("");
        lwjgl3ApplicationConfiguration76.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode83 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration76.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration72.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode83);
        java.lang.Class<?> wildcardClass90 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode83 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode83.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
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
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
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
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, 10, (int) 'a');
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (short) 10, 1, (-1), (int) 'a', (int) '#', (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) ' ');
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        java.lang.Class<?> wildcardClass11 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) (short) 0, 1);
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) ' ', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color35);
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
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
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType16);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
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
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.setResizable(false);
        lwjgl3ApplicationConfiguration19.setDecorated(false);
        lwjgl3ApplicationConfiguration19.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration19.disableAudio(false);
        lwjgl3ApplicationConfiguration19.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration31.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration31.setTitle("");
        lwjgl3ApplicationConfiguration31.setResizable(true);
        lwjgl3ApplicationConfiguration31.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3ApplicationConfiguration40.setInitialBackgroundColor(color41);
        lwjgl3ApplicationConfiguration40.setTitle("");
        lwjgl3ApplicationConfiguration40.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode47);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener52 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener52);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode47 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode47.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
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
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode86 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode86.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration11.setPreferencesConfig("hi!", fileType13);
        lwjgl3ApplicationConfiguration11.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration11.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration11.useVsync(true);
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
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode48 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode48);
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType12);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
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
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        java.lang.Class<?> wildcardClass12 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (-1));
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
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
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.setResizable(false);
        lwjgl3ApplicationConfiguration18.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration23.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration23.setTitle("");
        lwjgl3ApplicationConfiguration23.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode30);
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode30);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode30);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color34);
        org.junit.Assert.assertTrue("'" + hdpiMode30 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode30.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
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
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration24.setPreferencesConfig("hi!", fileType26);
        lwjgl3ApplicationConfiguration24.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration24.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration24.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration24.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode51 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode51);
        com.badlogic.gdx.Graphics.DisplayMode displayMode54 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode54);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 1, (int) (short) -1, 10, (int) (byte) 10, (int) (byte) 0, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode51 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode51.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode30);
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
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
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 10, (int) (short) -1, (int) (short) 100, (int) (short) 100, (int) (byte) 0, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
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
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color48 = null;
        lwjgl3ApplicationConfiguration47.setInitialBackgroundColor(color48);
        lwjgl3ApplicationConfiguration47.setTitle("");
        lwjgl3ApplicationConfiguration47.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode54 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration47.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration47.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode68 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode54 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode54.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode68 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode68.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
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
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
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
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass31 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
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
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (-1));
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', 0);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
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
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.setResizable(false);
        lwjgl3ApplicationConfiguration18.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration23.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration23.setTitle("");
        lwjgl3ApplicationConfiguration23.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode30);
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode30);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode30);
        java.lang.Class<?> wildcardClass34 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode30 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode30.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType13);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration25.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration25.setTitle("");
        lwjgl3ApplicationConfiguration25.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration25.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration25.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration25.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3ApplicationConfiguration48.setInitialBackgroundColor(color49);
        lwjgl3ApplicationConfiguration48.setTitle("");
        lwjgl3ApplicationConfiguration48.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration48.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration48.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode69 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode69);
        java.lang.Class<?> wildcardClass73 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode69 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode69.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
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
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener33);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) ' ');
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) '#', (-1));
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
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
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 10, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (short) -1);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + hdpiMode57 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode57.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode88 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode88.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
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
        lwjgl3ApplicationConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass60 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode51 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode51.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration26.setInitialBackgroundColor(color27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration26.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration26.setWindowPosition((int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration26.disableAudio(true);
        lwjgl3ApplicationConfiguration26.setWindowedMode((int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration26.useVsync(true);
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType70 = null;
        lwjgl3ApplicationConfiguration68.setPreferencesConfig("hi!", fileType70);
        lwjgl3ApplicationConfiguration68.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration68.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration68.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration68.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode95 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration68.setHdpiMode(hdpiMode95);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode95);
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode95);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode95);
        org.junit.Assert.assertTrue("'" + hdpiMode64 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode64.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode95 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode95.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (byte) 0, 10, (int) (short) 100, (-1), (-1), 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 10, 1, (int) (byte) -1, (int) ' ', (int) '#', 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', 1, (int) ' ', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass26 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode30);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
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
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType20);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
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
        lwjgl3ApplicationConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass23 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
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
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, (int) '4', (int) (short) 0, (int) '4', 1, (int) (short) 100, 1);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', 1);
        java.lang.Class<?> wildcardClass16 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
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
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 1);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) '4', (-1), 1, (int) (short) 100, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
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
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType20);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) 'a', (int) (byte) 100, (int) (byte) -1, (int) (short) 10, (int) (short) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
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
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 10, (int) (byte) 0);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (byte) 10, (int) (short) 100, (int) '#', 100, (int) (byte) 100, (-1));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (-1), (int) (byte) 1, 10, 1, (int) '4', (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 1, (int) (short) -1, 10, (int) 'a', (int) (short) 0, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3ApplicationConfiguration40.setInitialBackgroundColor(color41);
        lwjgl3ApplicationConfiguration40.setTitle("");
        lwjgl3ApplicationConfiguration40.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode47);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener49 = null;
        lwjgl3ApplicationConfiguration40.setWindowListener(lwjgl3WindowListener49);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color52 = null;
        lwjgl3ApplicationConfiguration51.setInitialBackgroundColor(color52);
        lwjgl3ApplicationConfiguration51.setTitle("");
        lwjgl3ApplicationConfiguration51.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode58 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration51.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration51.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration51.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration74 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color75 = null;
        lwjgl3ApplicationConfiguration74.setInitialBackgroundColor(color75);
        lwjgl3ApplicationConfiguration74.setTitle("");
        lwjgl3ApplicationConfiguration74.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode81 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration74.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration74.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration74.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode95 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration74.setHdpiMode(hdpiMode95);
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode95);
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode95);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode95);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode47 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode47.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode58 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode58.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode81 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode81.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode95 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode95.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), 1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
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
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode30);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 0, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener39);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, 10, 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
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
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
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
        java.lang.Class<?> wildcardClass31 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
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
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, 1, 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) 'a', (int) (short) -1, 1, (int) (byte) 1, (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
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
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
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
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', 10);
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType9);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, 0, (int) (byte) 1, (int) '4', 10, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
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
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration31.setPreferencesConfig("hi!", fileType33);
        lwjgl3ApplicationConfiguration31.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration31.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration31.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration31.useOpenGL3(true, (int) (byte) 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration31.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 0);
        com.badlogic.gdx.graphics.Color color53 = null;
        lwjgl3ApplicationConfiguration31.setInitialBackgroundColor(color53);
        lwjgl3ApplicationConfiguration31.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color58 = null;
        lwjgl3ApplicationConfiguration57.setInitialBackgroundColor(color58);
        lwjgl3ApplicationConfiguration57.setTitle("");
        lwjgl3ApplicationConfiguration57.setTitle("");
        lwjgl3ApplicationConfiguration57.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration66 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType68 = null;
        lwjgl3ApplicationConfiguration66.setPreferencesConfig("hi!", fileType68);
        lwjgl3ApplicationConfiguration66.useVsync(true);
        lwjgl3ApplicationConfiguration66.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration74 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color75 = null;
        lwjgl3ApplicationConfiguration74.setInitialBackgroundColor(color75);
        lwjgl3ApplicationConfiguration74.setTitle("");
        lwjgl3ApplicationConfiguration74.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode81 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration74.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration74.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration86 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color87 = null;
        lwjgl3ApplicationConfiguration86.setInitialBackgroundColor(color87);
        lwjgl3ApplicationConfiguration86.setTitle("");
        lwjgl3ApplicationConfiguration86.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode93 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration86.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration74.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration66.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration57.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode93);
        org.junit.Assert.assertTrue("'" + hdpiMode81 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode81.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode93 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode93.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType12);
        java.lang.Class<?> wildcardClass14 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (-1), 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType23);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
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
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) '4', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener28);
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
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
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
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
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration30.setInitialBackgroundColor(color31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration30.setFullscreenMode(displayMode33);
        lwjgl3ApplicationConfiguration30.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3ApplicationConfiguration37.setInitialBackgroundColor(color38);
        lwjgl3ApplicationConfiguration37.setTitle("");
        lwjgl3ApplicationConfiguration37.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration37.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration37.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode58 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener64 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener64);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) '#', (int) (short) 10, (int) (short) -1, (int) '#', (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode58 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode58.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
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
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, 10, (int) '#');
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass10 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
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
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType16);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) ' ', 100, 1, (int) (short) 100, 100, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode26);
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType29);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType17);
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration23.setPreferencesConfig("hi!", fileType25);
        lwjgl3ApplicationConfiguration23.useVsync(true);
        lwjgl3ApplicationConfiguration23.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration31.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration31.setTitle("");
        lwjgl3ApplicationConfiguration31.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration31.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration43.setInitialBackgroundColor(color44);
        lwjgl3ApplicationConfiguration43.setTitle("");
        lwjgl3ApplicationConfiguration43.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode50);
        java.lang.Class<?> wildcardClass55 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode50 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode50.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.setResizable(false);
        lwjgl3ApplicationConfiguration22.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration22.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration22.setInitialVisible(false);
        lwjgl3ApplicationConfiguration22.useOpenGL3(true, (int) (byte) 10, (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration22.setFullscreenMode(displayMode35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration37.setResizable(false);
        lwjgl3ApplicationConfiguration37.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3ApplicationConfiguration42.setInitialBackgroundColor(color43);
        lwjgl3ApplicationConfiguration42.setTitle("");
        lwjgl3ApplicationConfiguration42.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode49 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration42.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, 100, (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode49 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode49.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) (short) 1, (int) '4', (int) '#', (int) (byte) 0, 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (short) 10, (int) (byte) 1, (int) (short) -1, (int) (short) 100, (int) '#', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration28.setResizable(false);
        lwjgl3ApplicationConfiguration28.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color34);
        lwjgl3ApplicationConfiguration33.setTitle("");
        lwjgl3ApplicationConfiguration33.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (short) 1, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color48 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color48);
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) '4', (int) '4', (int) (short) 1, (int) (short) 100, (int) '4', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass23 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
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
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType9);
        java.lang.Class<?> wildcardClass11 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (byte) 10, (int) (byte) 0, (int) (byte) 100, (int) (short) -1, (int) '4', (int) (byte) 1);
        java.lang.Class<?> wildcardClass41 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
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
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType46 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType46);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) 'a', 10, (int) (byte) 1, (int) (byte) 10, (int) (byte) 100, 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode60 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode60);
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
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
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType28);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration11.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration11.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color19);
        lwjgl3ApplicationConfiguration11.setWindowPosition((int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration11.setWindowedMode((int) (short) 100, 1);
        lwjgl3ApplicationConfiguration11.setWindowedMode((int) (byte) 0, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration32.setPreferencesConfig("hi!", fileType34);
        lwjgl3ApplicationConfiguration32.useVsync(true);
        lwjgl3ApplicationConfiguration32.setTitle("hi!");
        lwjgl3ApplicationConfiguration32.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3ApplicationConfiguration32.setWindowListener(lwjgl3WindowListener42);
        lwjgl3ApplicationConfiguration32.setWindowPosition((int) (byte) 0, (int) 'a');
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
        lwjgl3ApplicationConfiguration47.setWindowPosition((int) (short) 0, (int) (byte) -1);
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
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass92 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode58 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode58.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode71 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode71.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode83 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode83.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
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
        com.badlogic.gdx.Files.FileType fileType47 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType47);
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode41 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode41.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
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
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) '4', (int) (byte) 1, 10, (int) (short) 1, (int) (short) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (short) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
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
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration25.setPreferencesConfig("hi!", fileType27);
        lwjgl3ApplicationConfiguration25.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration25.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration25.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration25.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration25.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color56 = null;
        lwjgl3ApplicationConfiguration25.setInitialBackgroundColor(color56);
        lwjgl3ApplicationConfiguration25.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color61 = null;
        lwjgl3ApplicationConfiguration60.setInitialBackgroundColor(color61);
        lwjgl3ApplicationConfiguration60.setTitle("");
        lwjgl3ApplicationConfiguration60.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode67 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + hdpiMode52 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode52.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode67 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode67.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', 0, (-1));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType14);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType20);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
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
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
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
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener36);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
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
        java.lang.Class<?> wildcardClass31 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
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
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (byte) -1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (byte) 0);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration38.setPreferencesConfig("hi!", fileType40);
        lwjgl3ApplicationConfiguration38.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration38.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType51 = null;
        lwjgl3ApplicationConfiguration49.setPreferencesConfig("hi!", fileType51);
        lwjgl3ApplicationConfiguration49.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration49.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration49.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration67 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration67.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration71 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color72 = null;
        lwjgl3ApplicationConfiguration71.setInitialBackgroundColor(color72);
        lwjgl3ApplicationConfiguration71.setTitle("");
        lwjgl3ApplicationConfiguration71.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode78 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration71.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration67.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode78);
        org.junit.Assert.assertTrue("'" + hdpiMode78 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode78.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType8);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
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
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (-1), (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, (int) (short) 1, (int) (byte) 100, (int) (short) 100, (int) 'a', (int) '4', 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass16 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
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
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration24.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration24.setTitle("");
        lwjgl3ApplicationConfiguration24.setResizable(true);
        lwjgl3ApplicationConfiguration24.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color34);
        lwjgl3ApplicationConfiguration33.setTitle("");
        lwjgl3ApplicationConfiguration33.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode40);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration43.setResizable(false);
        lwjgl3ApplicationConfiguration43.useVsync(false);
        lwjgl3ApplicationConfiguration43.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration43.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration43.disableAudio(false);
        lwjgl3ApplicationConfiguration43.setTitle("");
        lwjgl3ApplicationConfiguration43.useOpenGL3(true, (int) (short) 1, (int) (byte) 1);
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
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode92);
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode92 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode92.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode60 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode60);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode54 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode54.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener96 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener96);
        org.junit.Assert.assertTrue("'" + hdpiMode57 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode57.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode88 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode88.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) 10, (int) (short) 10, 100, (int) '4', (int) '#', (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration23.setPreferencesConfig("hi!", fileType25);
        lwjgl3ApplicationConfiguration23.useVsync(true);
        lwjgl3ApplicationConfiguration23.setTitle("hi!");
        lwjgl3ApplicationConfiguration23.setWindowPosition((int) ' ', 1);
        lwjgl3ApplicationConfiguration23.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3ApplicationConfiguration23.setFullscreenMode(displayMode36);
        lwjgl3ApplicationConfiguration23.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType41 = null;
        lwjgl3ApplicationConfiguration23.setPreferencesConfig("", fileType41);
        lwjgl3ApplicationConfiguration23.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode45 = null;
        lwjgl3ApplicationConfiguration23.setFullscreenMode(displayMode45);
        lwjgl3ApplicationConfiguration23.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color50 = null;
        lwjgl3ApplicationConfiguration49.setInitialBackgroundColor(color50);
        lwjgl3ApplicationConfiguration49.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode60 = null;
        lwjgl3ApplicationConfiguration49.setFullscreenMode(displayMode60);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration62.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration66 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color67 = null;
        lwjgl3ApplicationConfiguration66.setInitialBackgroundColor(color67);
        lwjgl3ApplicationConfiguration66.setTitle("");
        lwjgl3ApplicationConfiguration66.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode73 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration66.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + hdpiMode73 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode73.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
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
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass54 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType7);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
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
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass13 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) '#', 0);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType30);
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) ' ', 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType8);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
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
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, 1, (-1));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 10, (-1), 10, 100, (int) (short) -1, 10);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) (short) -1, (int) 'a');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass45 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        com.badlogic.gdx.Files.FileType fileType51 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType51);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', 100);
        java.lang.Class<?> wildcardClass58 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) -1);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
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
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode86 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode86.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
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
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (byte) 1, (-1), 1, (-1), 0, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
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
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType26);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
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
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
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
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (short) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) '#', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration31.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration31.setTitle("");
        lwjgl3ApplicationConfiguration31.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode43);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 1, (int) ' ', 1, (int) (short) -1, (int) '4');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, (int) (byte) -1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 100, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration62.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color65 = null;
        lwjgl3ApplicationConfiguration62.setInitialBackgroundColor(color65);
        com.badlogic.gdx.Graphics.DisplayMode displayMode67 = null;
        lwjgl3ApplicationConfiguration62.setFullscreenMode(displayMode67);
        lwjgl3ApplicationConfiguration62.setInitialVisible(true);
        lwjgl3ApplicationConfiguration62.setWindowedMode(100, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration74 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color75 = null;
        lwjgl3ApplicationConfiguration74.setInitialBackgroundColor(color75);
        lwjgl3ApplicationConfiguration74.setTitle("");
        lwjgl3ApplicationConfiguration74.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode81 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration74.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode81);
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode81 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode81.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass7 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (short) 10, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) '#');
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 1, (int) ' ', 1, (int) (short) -1, (int) '4');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) (byte) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (short) 0, (-1), 1, (int) ' ', (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration31.setResizable(false);
        lwjgl3ApplicationConfiguration31.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration31.setWindowListener(lwjgl3WindowListener36);
        lwjgl3ApplicationConfiguration31.setInitialVisible(false);
        lwjgl3ApplicationConfiguration31.disableAudio(false);
        lwjgl3ApplicationConfiguration31.useVsync(false);
        lwjgl3ApplicationConfiguration31.disableAudio(true);
        lwjgl3ApplicationConfiguration31.setBackBufferConfig((int) (short) -1, 10, (int) ' ', (int) (byte) 100, (-1), (int) (short) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener54 = null;
        lwjgl3ApplicationConfiguration31.setWindowListener(lwjgl3WindowListener54);
        lwjgl3ApplicationConfiguration31.setWindowedMode(1, (int) (short) -1);
        lwjgl3ApplicationConfiguration31.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener61 = null;
        lwjgl3ApplicationConfiguration31.setWindowListener(lwjgl3WindowListener61);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration63.setResizable(false);
        lwjgl3ApplicationConfiguration63.useVsync(false);
        lwjgl3ApplicationConfiguration63.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration70 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color71 = null;
        lwjgl3ApplicationConfiguration70.setInitialBackgroundColor(color71);
        lwjgl3ApplicationConfiguration70.setTitle("");
        lwjgl3ApplicationConfiguration70.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode77 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration70.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration70.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration70.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode91 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration70.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration63.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode77 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode77.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode91 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode91.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType57 = null;
        lwjgl3ApplicationConfiguration55.setPreferencesConfig("hi!", fileType57);
        lwjgl3ApplicationConfiguration55.useVsync(true);
        lwjgl3ApplicationConfiguration55.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color64 = null;
        lwjgl3ApplicationConfiguration63.setInitialBackgroundColor(color64);
        lwjgl3ApplicationConfiguration63.setTitle("");
        lwjgl3ApplicationConfiguration63.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode70 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration63.setHdpiMode(hdpiMode70);
        lwjgl3ApplicationConfiguration63.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration75 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color76 = null;
        lwjgl3ApplicationConfiguration75.setInitialBackgroundColor(color76);
        lwjgl3ApplicationConfiguration75.setTitle("");
        lwjgl3ApplicationConfiguration75.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode82 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration75.setHdpiMode(hdpiMode82);
        lwjgl3ApplicationConfiguration63.setHdpiMode(hdpiMode82);
        lwjgl3ApplicationConfiguration55.setHdpiMode(hdpiMode82);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode82);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener87 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener87);
        org.junit.Assert.assertTrue("'" + hdpiMode15 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode15.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode70 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode70.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode82 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode82.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) '4', (int) 'a');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
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
        lwjgl3ApplicationConfiguration29.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration54.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color57 = null;
        lwjgl3ApplicationConfiguration54.setInitialBackgroundColor(color57);
        com.badlogic.gdx.Graphics.DisplayMode displayMode59 = null;
        lwjgl3ApplicationConfiguration54.setFullscreenMode(displayMode59);
        lwjgl3ApplicationConfiguration54.setInitialVisible(true);
        lwjgl3ApplicationConfiguration54.setWindowedMode(100, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration66 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color67 = null;
        lwjgl3ApplicationConfiguration66.setInitialBackgroundColor(color67);
        lwjgl3ApplicationConfiguration66.setTitle("");
        lwjgl3ApplicationConfiguration66.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode73 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration66.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration54.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode73);
        java.lang.Class<?> wildcardClass78 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode50 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode50.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode73 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode73.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 0, (int) (byte) 10, (int) (short) 0, 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (short) -1, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration19.setTitle("");
        lwjgl3ApplicationConfiguration19.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3ApplicationConfiguration19.setWindowListener(lwjgl3WindowListener28);
        lwjgl3ApplicationConfiguration19.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration19.setWindowListener(lwjgl3WindowListener32);
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration19.setPreferencesConfig("", fileType35);
        lwjgl3ApplicationConfiguration19.useVsync(true);
        lwjgl3ApplicationConfiguration19.disableAudio(true);
        lwjgl3ApplicationConfiguration19.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration43.setResizable(false);
        lwjgl3ApplicationConfiguration43.setDecorated(false);
        lwjgl3ApplicationConfiguration43.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration43.setTitle("hi!");
        lwjgl3ApplicationConfiguration43.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode55 = null;
        lwjgl3ApplicationConfiguration43.setFullscreenMode(displayMode55);
        com.badlogic.gdx.Files.FileType fileType58 = null;
        lwjgl3ApplicationConfiguration43.setPreferencesConfig("", fileType58);
        lwjgl3ApplicationConfiguration43.disableAudio(false);
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
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode90);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode90);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode90);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener97 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener97);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode90 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode90.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), 1);
        java.lang.Class<?> wildcardClass12 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (short) 0, (int) '#', (int) 'a', 10, (int) (byte) 0, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration22.setPreferencesConfig("hi!", fileType24);
        lwjgl3ApplicationConfiguration22.useVsync(true);
        lwjgl3ApplicationConfiguration22.setTitle("hi!");
        lwjgl3ApplicationConfiguration22.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration22.setWindowListener(lwjgl3WindowListener32);
        lwjgl3ApplicationConfiguration22.setWindowPosition((int) (byte) 0, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration37.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color42 = null;
        lwjgl3ApplicationConfiguration41.setInitialBackgroundColor(color42);
        lwjgl3ApplicationConfiguration41.setTitle("");
        lwjgl3ApplicationConfiguration41.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode48 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode48);
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode48);
        lwjgl3ApplicationConfiguration37.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color55 = null;
        lwjgl3ApplicationConfiguration54.setInitialBackgroundColor(color55);
        lwjgl3ApplicationConfiguration54.setTitle("");
        lwjgl3ApplicationConfiguration54.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode61 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration54.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration54.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration66 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color67 = null;
        lwjgl3ApplicationConfiguration66.setInitialBackgroundColor(color67);
        lwjgl3ApplicationConfiguration66.setTitle("");
        lwjgl3ApplicationConfiguration66.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode73 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration66.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration54.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode73);
        org.junit.Assert.assertTrue("'" + hdpiMode48 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode48.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode61 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode61.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode73 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode73.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 0, (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) 'a');
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType19);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 10);
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType15);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 0, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, (int) ' ');
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
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
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType21);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
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
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, 1, 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, (int) (short) 0, 1, 1, 0, (int) '#', (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, 0);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.setResizable(false);
        lwjgl3ApplicationConfiguration24.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration24.setWindowListener(lwjgl3WindowListener29);
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration24.setPreferencesConfig("", fileType32);
        lwjgl3ApplicationConfiguration24.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration24.setDecorated(false);
        lwjgl3ApplicationConfiguration24.setWindowedMode(1, (int) (short) 10);
        com.badlogic.gdx.graphics.Color color47 = null;
        lwjgl3ApplicationConfiguration24.setInitialBackgroundColor(color47);
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
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode56 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode56.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode68 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode68.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (-1), 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) (byte) -1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration25.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration25.setTitle("");
        lwjgl3ApplicationConfiguration25.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration25.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration25.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration25.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3ApplicationConfiguration48.setInitialBackgroundColor(color49);
        lwjgl3ApplicationConfiguration48.setTitle("");
        lwjgl3ApplicationConfiguration48.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration48.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration48.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode69 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode69);
        com.badlogic.gdx.Graphics.DisplayMode displayMode73 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode73);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener75 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener75);
        java.lang.Class<?> wildcardClass77 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode69 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode69.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 10);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType9);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) 'a', 1, (int) (short) 100, (int) (short) 10, (int) (byte) 1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode50 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode50.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode67 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode67.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode79 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode79.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
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
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass40 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) 10, (int) (short) 10, 100, (int) '4', (int) '#', (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color7);
        java.lang.Class<?> wildcardClass9 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (byte) 10);
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
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
        com.badlogic.gdx.Files.FileType fileType83 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType83);
        java.lang.Class<?> wildcardClass85 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode77 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode77.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
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
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 100, (int) '4');
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
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
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) (short) 10);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
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
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType29);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) 0, (int) (byte) 10, (-1), 0, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
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
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode33);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (short) 10, (int) (byte) 10, (int) (short) 1, 0, (int) '#', (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color36);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3ApplicationConfiguration33.setFullscreenMode(displayMode38);
        lwjgl3ApplicationConfiguration33.disableAudio(false);
        lwjgl3ApplicationConfiguration33.setWindowPosition((int) ' ', 0);
        lwjgl3ApplicationConfiguration33.setTitle("hi!");
        lwjgl3ApplicationConfiguration33.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color50 = null;
        lwjgl3ApplicationConfiguration49.setInitialBackgroundColor(color50);
        lwjgl3ApplicationConfiguration49.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration49.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration49.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration66 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType68 = null;
        lwjgl3ApplicationConfiguration66.setPreferencesConfig("hi!", fileType68);
        lwjgl3ApplicationConfiguration66.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
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
        lwjgl3ApplicationConfiguration66.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode89);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode89 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode89.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, 0, (int) ' ', (int) (byte) 10, (int) '4', (int) (short) 1, 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass40 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
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
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
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
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass9 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) ' ', (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType13);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 10);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) '4');
        java.lang.Class<?> wildcardClass31 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, (int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration26.setInitialBackgroundColor(color27);
        lwjgl3ApplicationConfiguration26.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3ApplicationConfiguration26.setFullscreenMode(displayMode37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration39.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration43.setInitialBackgroundColor(color44);
        lwjgl3ApplicationConfiguration43.setTitle("");
        lwjgl3ApplicationConfiguration43.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration39.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass57 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode50 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode50.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
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
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 100, (int) 'a', (int) (short) 10, (int) (byte) 10, 10, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("hi!", fileType15);
        lwjgl3ApplicationConfiguration13.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration13.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration13.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration13.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode40);
        com.badlogic.gdx.Files.FileType fileType44 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType44);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
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
        java.lang.Class<?> wildcardClass55 = hdpiMode49.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode37 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode37.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode49 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode49.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
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
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
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
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (-1), (int) (short) 0, 10, (int) (short) 0, (int) ' ', (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (byte) 10, (int) (byte) 0, (int) (byte) -1, (int) (byte) 0, 0, (int) '4');
        com.badlogic.gdx.Files.FileType fileType38 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType38);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass42 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (byte) -1, (int) (short) 0, 1, (int) (short) 0, 100, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.setResizable(false);
        lwjgl3ApplicationConfiguration17.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration17.setWindowListener(lwjgl3WindowListener22);
        lwjgl3ApplicationConfiguration17.setInitialVisible(false);
        lwjgl3ApplicationConfiguration17.disableAudio(false);
        lwjgl3ApplicationConfiguration17.useVsync(false);
        lwjgl3ApplicationConfiguration17.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration17.setWindowedMode((int) (short) 0, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3ApplicationConfiguration17.setFullscreenMode(displayMode37);
        lwjgl3ApplicationConfiguration17.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType43 = null;
        lwjgl3ApplicationConfiguration41.setPreferencesConfig("hi!", fileType43);
        lwjgl3ApplicationConfiguration41.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration41.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration41.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration41.setDecorated(false);
        lwjgl3ApplicationConfiguration41.setResizable(false);
        lwjgl3ApplicationConfiguration41.useOpenGL3(true, 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration41.useVsync(true);
        com.badlogic.gdx.graphics.Color color71 = null;
        lwjgl3ApplicationConfiguration41.setInitialBackgroundColor(color71);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration73 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration73.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color76 = null;
        lwjgl3ApplicationConfiguration73.setInitialBackgroundColor(color76);
        com.badlogic.gdx.Graphics.DisplayMode displayMode78 = null;
        lwjgl3ApplicationConfiguration73.setFullscreenMode(displayMode78);
        lwjgl3ApplicationConfiguration73.setInitialVisible(true);
        lwjgl3ApplicationConfiguration73.setWindowedMode(100, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration85 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color86 = null;
        lwjgl3ApplicationConfiguration85.setInitialBackgroundColor(color86);
        lwjgl3ApplicationConfiguration85.setTitle("");
        lwjgl3ApplicationConfiguration85.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode92 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration85.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration73.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode92);
        com.badlogic.gdx.Graphics.DisplayMode displayMode98 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode98);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode92 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode92.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass36 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
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
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, 10, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener36);
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
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
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType26);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType31);
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType34);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType32);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
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
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
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
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType45 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType45);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType24);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
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
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
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
        java.lang.Class<?> wildcardClass59 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (int) '4', (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 10, (int) (short) 10, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode38);
        com.badlogic.gdx.Files.FileType fileType41 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType41);
        java.lang.Class<?> wildcardClass43 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) ' ', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass81 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode41 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode41.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode53 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode53.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode69 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode69.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
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
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration24.setPreferencesConfig("hi!", fileType26);
        lwjgl3ApplicationConfiguration24.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration24.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration24.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration24.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode51 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode51);
        com.badlogic.gdx.Graphics.DisplayMode displayMode54 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode54);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 1, (int) (short) -1, 10, (int) (byte) 10, (int) (byte) 0, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color64 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color64);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode51 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode51.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) '4', (int) '4', (int) (short) 1, (int) (short) 100, (int) '4', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, 100);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
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
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) (short) 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType36);
        java.lang.Class<?> wildcardClass38 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.Files.FileType fileType5 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType5);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode28);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode65 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode65);
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, (-1), (-1), (int) (short) 100, (int) (short) -1, (int) 'a', 10);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
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
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration15.setPreferencesConfig("hi!", fileType17);
        lwjgl3ApplicationConfiguration15.useVsync(true);
        lwjgl3ApplicationConfiguration15.setTitle("hi!");
        lwjgl3ApplicationConfiguration15.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration15.setWindowListener(lwjgl3WindowListener25);
        lwjgl3ApplicationConfiguration15.setWindowPosition((int) (byte) 0, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color35);
        lwjgl3ApplicationConfiguration34.setTitle("");
        lwjgl3ApplicationConfiguration34.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode41 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode41);
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode41);
        lwjgl3ApplicationConfiguration30.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color48 = null;
        lwjgl3ApplicationConfiguration47.setInitialBackgroundColor(color48);
        lwjgl3ApplicationConfiguration47.setTitle("");
        lwjgl3ApplicationConfiguration47.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode54 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration47.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color60 = null;
        lwjgl3ApplicationConfiguration59.setInitialBackgroundColor(color60);
        lwjgl3ApplicationConfiguration59.setTitle("");
        lwjgl3ApplicationConfiguration59.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode66 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass76 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode41 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode41.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode54 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode54.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode66 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode66.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration7.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration7.setTitle("");
        lwjgl3ApplicationConfiguration7.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration7.setHdpiMode(hdpiMode14);
        lwjgl3ApplicationConfiguration7.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        lwjgl3ApplicationConfiguration7.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration7.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode28);
        java.lang.Class<?> wildcardClass31 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode14 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode14.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode28 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode28.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, 0, 10, 1, (int) (byte) 1, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode7);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
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
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
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
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration25.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration25.setTitle("");
        lwjgl3ApplicationConfiguration25.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration25.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3ApplicationConfiguration37.setInitialBackgroundColor(color38);
        lwjgl3ApplicationConfiguration37.setTitle("");
        lwjgl3ApplicationConfiguration37.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration37.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode44);
        java.lang.Class<?> wildcardClass48 = hdpiMode44.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
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
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener38 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener38);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) '4', (int) (byte) -1, (int) (short) 1, (int) 'a', (-1), (int) (short) -1);
        com.badlogic.gdx.graphics.Color color58 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color58);
        com.badlogic.gdx.graphics.Color color60 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color60);
        java.lang.Class<?> wildcardClass62 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 0);
        java.lang.Class<?> wildcardClass8 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
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
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass34 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
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
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) '#');
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) ' ', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
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
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType26);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener37);
        java.lang.Class<?> wildcardClass39 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) '4', (int) 'a');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, (-1), (int) ' ', (int) (short) 100, (int) (short) 100, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
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
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode39);
        java.lang.Class<?> wildcardClass41 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
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
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) (short) 1, (int) 'a', 100, (int) (byte) -1, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
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
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (-1), 0);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType25);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
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
        java.lang.Class<?> wildcardClass45 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode34 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode34);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
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
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType12);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration20.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration20.disableAudio(false);
        lwjgl3ApplicationConfiguration20.setWindowPosition((int) ' ', 0);
        lwjgl3ApplicationConfiguration20.setTitle("hi!");
        lwjgl3ApplicationConfiguration20.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color37);
        lwjgl3ApplicationConfiguration36.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration36.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration36.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration53 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType55 = null;
        lwjgl3ApplicationConfiguration53.setPreferencesConfig("hi!", fileType55);
        lwjgl3ApplicationConfiguration53.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration65.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration69 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color70 = null;
        lwjgl3ApplicationConfiguration69.setInitialBackgroundColor(color70);
        lwjgl3ApplicationConfiguration69.setTitle("");
        lwjgl3ApplicationConfiguration69.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode76 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration69.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration65.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration53.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode76);
        java.lang.Class<?> wildcardClass83 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode76 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode76.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
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
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType20);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, 1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
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
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType20);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType23);
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) (short) 1, (int) '4', (int) '#', (int) (byte) 0, 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, 10, (int) (byte) 0, (int) (short) -1, (int) (byte) 0, (int) (byte) -1, (int) (short) 1);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (short) 10, (int) (byte) 10, (int) (short) 1, 0, (int) '#', (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (-1));
        lwjgl3ApplicationConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + hdpiMode36 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode36.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
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
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, 0);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass5 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType25);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
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
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (short) 10, (int) (byte) 0, (int) 'a', 10, 0);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
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
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
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
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (short) 10, (int) (byte) 0, (int) 'a', 10, 0);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode33 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode33);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration9.setInitialBackgroundColor(color10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration9.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration9.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration9.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration9.setWindowPosition((int) 'a', (int) (short) 1);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration9.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration9.setWindowedMode((int) (short) 100, 1);
        lwjgl3ApplicationConfiguration9.setWindowedMode((int) (byte) 0, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration30.setPreferencesConfig("hi!", fileType32);
        lwjgl3ApplicationConfiguration30.useVsync(true);
        lwjgl3ApplicationConfiguration30.setTitle("hi!");
        lwjgl3ApplicationConfiguration30.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener40 = null;
        lwjgl3ApplicationConfiguration30.setWindowListener(lwjgl3WindowListener40);
        lwjgl3ApplicationConfiguration30.setWindowPosition((int) (byte) 0, (int) 'a');
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
        lwjgl3ApplicationConfiguration45.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color63 = null;
        lwjgl3ApplicationConfiguration62.setInitialBackgroundColor(color63);
        lwjgl3ApplicationConfiguration62.setTitle("");
        lwjgl3ApplicationConfiguration62.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode69 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration62.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration74 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color75 = null;
        lwjgl3ApplicationConfiguration74.setInitialBackgroundColor(color75);
        lwjgl3ApplicationConfiguration74.setTitle("");
        lwjgl3ApplicationConfiguration74.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode81 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration74.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration45.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration9.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + hdpiMode56 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode56.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode69 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode69.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode81 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode81.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
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
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass49 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
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
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType16);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass26 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType12);
        java.lang.Class<?> wildcardClass14 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
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
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode28 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode28.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
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
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener48 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener48);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (int) '4', (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color22);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color37);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3ApplicationConfiguration36.setFullscreenMode(displayMode39);
        lwjgl3ApplicationConfiguration36.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType48 = null;
        lwjgl3ApplicationConfiguration46.setPreferencesConfig("hi!", fileType48);
        lwjgl3ApplicationConfiguration46.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration46.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration46.useVsync(true);
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
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode75);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode75);
        com.badlogic.gdx.Files.FileType fileType82 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType82);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode75 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode75.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 100, (-1));
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, (-1), (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.setDecorated(true);
        lwjgl3ApplicationConfiguration13.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("hi!", fileType21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration13.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.setResizable(false);
        lwjgl3ApplicationConfiguration25.useVsync(false);
        lwjgl3ApplicationConfiguration25.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration25.useOpenGL3(true, (int) (short) 1, 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3ApplicationConfiguration25.setFullscreenMode(displayMode37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType41 = null;
        lwjgl3ApplicationConfiguration39.setPreferencesConfig("hi!", fileType41);
        lwjgl3ApplicationConfiguration39.useVsync(true);
        lwjgl3ApplicationConfiguration39.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color48 = null;
        lwjgl3ApplicationConfiguration47.setInitialBackgroundColor(color48);
        lwjgl3ApplicationConfiguration47.setTitle("");
        lwjgl3ApplicationConfiguration47.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode54 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration47.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color60 = null;
        lwjgl3ApplicationConfiguration59.setInitialBackgroundColor(color60);
        lwjgl3ApplicationConfiguration59.setTitle("");
        lwjgl3ApplicationConfiguration59.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode66 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration39.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode66);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode66);
        java.lang.Class<?> wildcardClass73 = hdpiMode66.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode54 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode54.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode66 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode66.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
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
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) 'a');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        com.badlogic.gdx.Files.FileType fileType5 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType8);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
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
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) '4');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
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
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) '#', (int) (short) 0, 100, (int) (short) 0, (int) (byte) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, 100, (int) (byte) -1, (int) '#', (int) 'a', (int) (byte) 0, 10);
        java.lang.Class<?> wildcardClass34 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
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
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, 100);
        java.lang.Class<?> wildcardClass31 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.setResizable(false);
        lwjgl3ApplicationConfiguration17.useVsync(false);
        lwjgl3ApplicationConfiguration17.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration17.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration17.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration31.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration31.setTitle("");
        lwjgl3ApplicationConfiguration31.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode38);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener40 = null;
        lwjgl3ApplicationConfiguration31.setWindowListener(lwjgl3WindowListener40);
        lwjgl3ApplicationConfiguration31.setInitialVisible(false);
        lwjgl3ApplicationConfiguration31.setInitialVisible(false);
        lwjgl3ApplicationConfiguration31.setWindowedMode((-1), (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType51 = null;
        lwjgl3ApplicationConfiguration49.setPreferencesConfig("hi!", fileType51);
        lwjgl3ApplicationConfiguration49.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration49.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration49.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration49.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode65 = null;
        lwjgl3ApplicationConfiguration49.setFullscreenMode(displayMode65);
        lwjgl3ApplicationConfiguration49.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration69 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration69.setResizable(false);
        lwjgl3ApplicationConfiguration69.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration74 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration74.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration78 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color79 = null;
        lwjgl3ApplicationConfiguration78.setInitialBackgroundColor(color79);
        lwjgl3ApplicationConfiguration78.setTitle("");
        lwjgl3ApplicationConfiguration78.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode85 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration78.setHdpiMode(hdpiMode85);
        lwjgl3ApplicationConfiguration74.setHdpiMode(hdpiMode85);
        lwjgl3ApplicationConfiguration69.setHdpiMode(hdpiMode85);
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode85);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode85);
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode85);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode85);
        java.lang.Class<?> wildcardClass93 = hdpiMode85.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode85 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode85.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
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
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener61 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener61);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass66 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
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
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
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
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
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
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (-1), (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (-1), (int) (short) 1);
        java.lang.Class<?> wildcardClass39 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode7 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode7.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
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
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.graphics.Color color1 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '4', (int) (short) 10);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
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
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType36);
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType2);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 1, (int) ' ', (int) (short) 10, (int) (byte) -1, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
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
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '4', 10);
        java.lang.Class<?> wildcardClass39 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        java.lang.Class<?> wildcardClass9 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

